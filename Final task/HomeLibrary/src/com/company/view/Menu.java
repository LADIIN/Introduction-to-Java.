package com.company.view;

import com.company.model.Book;
import com.company.model.Catalog;
import com.company.model.User;
import com.company.utils.*;

import java.util.ArrayList;

public class Menu {

    public static User showAuthorizationMenu() {
        boolean isExit = false;
        User user = null;

        System.out.println("\nWelcome to Home Library!\n");

        while (!isExit && user == null) {
            System.out.println("\n[1] Log In\t[2] Sign Up\t[0] Exit\n\nEnter:");
            int choice = InputManager.inputInteger();

            switch (choice) {
                case 0:
                    isExit = true;
                    break;
                case 1:
                    user = showLoginMenu();
                    break;
                case 2:
                    user = showRegisterMenu();
                    break;
                default:
                    System.out.println("\nThere is no such actions.");
            }
        }

        return user;
    }

    public static User showLoginMenu() {
        System.out.println("\nLogin:");
        String login = InputManager.inputStringLine();

        System.out.println("\nPassword:");
        String password = InputManager.inputStringLine();

        User user = UserManager.logIntoUserAccount(login, password);

        if (user == null) {
            System.out.println("\nIncorrect login or password.");
            return null;
        }

        System.out.println("\nYou successfully logged.");

        return user;
    }

    public static User showRegisterMenu() {
        System.out.println("\nEnter username:");
        String username = InputManager.inputStringLine();

        System.out.println("\nEnter login: ");
        String login = InputManager.inputLogin();

        System.out.println("\nEnter password: ");
        String password = InputManager.inputStringLine();

        System.out.println("\nEnter email:");
        String email = InputManager.inputEmail();

        User user = new User(username, login, password, email, AccessLevel.USER);
        UserManager.addUser(user);
        FileManager.writeUserData(user);

        System.out.println("\nYou successfully registered.\n");

        return user;
    }

    public static void showActionMenu(User user) {
        if (user != null) {
            if (user.getAccessLevel() == AccessLevel.ADMIN) {
                showAdminMenu();
            } else {
                showUserMenu();
            }
        }
        System.out.println("\nApplication was closed.");
    }

    public static void showUserMenu() {
        boolean isExit = false;
        int choice;

        while (!isExit) {
            System.out.println("""                    
                    \nMenu:
                    [1] Look books
                    [2] Search book
                    [0] Exit

                    Enter:\s""");

            choice = InputManager.inputInteger();

            switch (choice) {
                case 0:
                    isExit = true;
                    break;
                case 1:
                    CatalogManager.lookBooks(Catalog.getBooks());
                    break;
                case 2:
                    showSearchMenu();
                    break;
                default:
                    System.out.println("\nThere is no such actions.");
            }
        }
    }

    public static void showAdminMenu() {
        boolean isExit = false;
        int choice;

        while (!isExit) {
            System.out.println("""
                    \nMenu:
                    [1] Look books
                    [2] Search book
                    [3] Add book
                    [4] Delete book
                    [0] Exit

                    Enter:\s""");

            choice = InputManager.inputInteger();

            switch (choice) {
                case 0:
                    isExit = true;
                    break;
                case 1:
                    CatalogManager.lookBooks(Catalog.getBooks());
                    break;
                case 2:
                    showSearchMenu();
                    break;
                case 3:
                    CatalogManager.addBook(Catalog.getBooks());
                    break;
                case 4:
                    showDeleteMenu();
                    break;
                default:
                    System.out.println("\nThere is no such actions.");
            }

        }
    }

    public static void showSearchMenu() {
        boolean isExit = false;
        String request;
        ArrayList<Book> result = null;
        int choice;
        boolean isResult = false;

        while (!isExit) {
            System.out.println("""
                    \nSearch by:
                    [1] Title
                    [2] Author
                    [3] Genre
                    [0] Back
                                        
                    Enter:\s""");

            choice = InputManager.inputInteger();

            switch (choice) {
                case 0:
                    isExit = true;
                    break;
                case 1:
                    System.out.println("\nEnter title:");
                    request = InputManager.inputStringLine();

                    result = CatalogManager.searchBooksByTitle(Catalog.getBooks(), request);
                    break;
                case 2:
                    System.out.println("\nEnter author:");
                    request = InputManager.inputStringLine();

                    result = CatalogManager.searchBooksByAuthor(Catalog.getBooks(), request);
                    isResult = true;
                    break;
                case 3:
                    System.out.println("\nEnter genre:");
                    request = InputManager.inputStringLine();

                    result = CatalogManager.searchBooksByGenre(Catalog.getBooks(), request);
                    isResult = true;
                    break;
                default:
                    System.out.println("\nThere is no such action.");
            }
            if (isResult) {
                System.out.println("\nSearch result:");

                if (!result.isEmpty()) {
                    CatalogManager.lookBooks(result);
                } else {
                    System.out.println("\nThere are no such books.");
                }
                isResult = false;
            }
        }
    }

    public static void showDeleteMenu() {
        System.out.println("\nEnter book title: ");
        String title = InputManager.inputStringLine();

        System.out.println("\nEnter author: ");
        String author = InputManager.inputStringLine();

        Book book = Catalog.getBook(title, author);

        if (book != null) {
            System.out.println("\nAre your sure to delete this book?" + book + "\n[1] Yes \t[2] No\n\nEnter:");
            int choice = InputManager.inputInteger();

            if (choice == 1) {
                CatalogManager.deleteBook(Catalog.getBooks(), book);
                FileManager.rewriteBooksData(Catalog.getBooks());

                System.out.println("\nBook was deleted.");
            } else {
                System.out.println("\nDeleting was canceled.");
            }
        } else {
            System.out.println("\nThere is no such book.");
        }
    }
}
