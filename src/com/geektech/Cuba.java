package com.geektech;

public class Cuba extends Country implements Printable {

    private String currency;

    public Cuba(String continent, int population, String nameOfCountry, String currency) {

        super(continent, population, nameOfCountry);
        this.currency = currency;
    }

    public String getCurrency() {

        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public void print() {
        System.out.println("The name of the country:" + getNameOfCountry() + "\nContinent:" + getContinent() + "\nPopulation:" + getPopulation() + " million of people " +
                "\nNational currency:" + getCurrency());
    }

    @Override
    public void nationalFlag() {
        System.out.println("\uD83C\uDDE8\uD83C\uDDFA");
    }
}