package decorator.main;

import decorator.clase.Bilet;
import decorator.clase.Decorator;
import decorator.clase.DecoratorBilet;
import decorator.clase.IBilet;

public class Main {
    public static void main(String[] args) {
        IBilet bilet = new Bilet("Silviu", "Romania", "Spania");
        IBilet bilet2 = new Bilet("Silviu", "Romania", "Germania");
        IBilet bilet3 = new Bilet("Silviu", "Qatar", "Spania");


        bilet.printareBilet();
        bilet2.printareBilet();
        bilet3.printareBilet();

        Decorator decoratorBilet = new DecoratorBilet(bilet);
        Decorator decoratorBilet2 = new DecoratorBilet(bilet2);
        decoratorBilet.printareBilet();
        decoratorBilet2.printareBilet();

    }
}