package org.javaCourse.enums;

public enum Temp {
    LOW(10),
    MEDIUM(60),
    HIGH(100);
private int i;
    Temp(int i) {
        this.i=i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
