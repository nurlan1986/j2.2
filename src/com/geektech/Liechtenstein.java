package com.geektech;

public class Liechtenstein extends Country implements Printable {

    private String capital;

    public Liechtenstein(String continent, int population, String nameOfCountry, String capital) {
        super(continent, population, nameOfCountry);
        this.capital = capital;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public void print() {
        System.out.println("The name of the country:" + getNameOfCountry() + "\nContinent:" + getContinent() + "\nPopulation:" + getPopulation() + " thousands of people " +
                "\nThe capital of Liechtenstein:" + getCapital());
    }

    @Override
    public void nationalFlag() {
        System.out.println("\uD83C\uDDF1\uD83C\uDDEE");

    }
}