package com.geektech;

public class Singapore extends Country implements Printable {

    private String nationalFood;


    public Singapore(String continent, int population, String nameOfCountry, String nationalFood) {
        super(continent, population, nameOfCountry);
        this.nationalFood = nationalFood;
    }

    public String getNationalFood() {
        return nationalFood;
    }


    public void setNationalFood(String nationalFood) {
        this.nationalFood = nationalFood;
    }

    @Override
    public void print() {
        System.out.println("The name of the country:" + getNameOfCountry() + "\nContinent:" + getContinent() + "\nPopulation:" + getPopulation() + " million of people " +
                "\nNational food:" + getNationalFood());
    }

    @Override
    public void nationalFlag() {
        System.out.println("\uD83C\uDDF8\uD83C\uDDEC");

    }
}
