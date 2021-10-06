package com.company;

public class Wheel {
    private String TireType;
    private boolean isPuncture;

    Wheel(String rubberType, boolean isPuncture) {
        this.setTireType("Summer");
        this.setPuncture(false);
    }

    public String getTireType() {
        return TireType;
    }

    public void setTireType(String rubberType) {
        this.TireType = rubberType;
    }

    public boolean isPuncture() {
        return isPuncture;
    }

    public void setPuncture(boolean puncture) {
        this.isPuncture = puncture;
    }
}
