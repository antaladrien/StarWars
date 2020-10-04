package com.antaladrien;

public class AnakinSkywalker extends Jedi implements Sith {
    public AnakinSkywalker() {
        super(150, true);
    }

    @Override
    public boolean megteremtiAzEgyensulyt() {
        return this.ero > 1000 ? true : false;
    }

    @Override
    public void engeddElAHaragod() {
        this.ero += (Math.random() * 10);
    }

    @Override
    public String toString() {
        return "AnakinSkywalker " + super.toString();
    }
}
