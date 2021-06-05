package com.geektech;

public class Main {

    public static void main(String[] args) {
        creatObject("Singapore");
        System.out.println("------------------------");
        creatObject("Liechtenstein");
        System.out.println("------------------------");
        Main.creatObject("Cuba");


    }

    public static Country creatObject(String className) {

        switch (className) {
            case "Singapore":
                Singapore singapore = new Singapore("Asia", 5781110, "Singapore", "Satay");
                singapore.print();
                singapore.nationalFlag();

                return singapore;

            case "Liechtenstein":
                Liechtenstein liechtenstein = new Liechtenstein("Europe", 38423, "Liechtenstein", "Vaduz");
                liechtenstein.print();
                liechtenstein.nationalFlag();

                return liechtenstein;

            case "Cuba":
                Cuba cuba = new Cuba("North-America", 11061886, "Cuba", "Peso");
                cuba.print();
                cuba.nationalFlag();

                return cuba;
        }
        return null;
    }
}

