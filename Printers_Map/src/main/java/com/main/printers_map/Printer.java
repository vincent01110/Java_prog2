package com.main.printers_map;

import java.util.Objects;

public class Printer {
    private String name;
    private String area;
    private String toner;
    private int x;
    private int y;

    public Printer() {
    }

    public Printer(String name, String area, String toner) {
        this.name = name;
        this.area = area;
        this.toner = toner;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    public String getToner() {
        return toner;
    }
    public void setToner(String toner) {
        this.toner = toner;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Printer printer = (Printer) o;
        return name.equals(printer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + ";" + area + ";" + toner;
    }
}
