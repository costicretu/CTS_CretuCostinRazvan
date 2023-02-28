package main;

import model.*;

public class Main {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper("Gigel");
        Zoo zoo = new Zoo("Gradina Zoo Bucuresti", zooKeeper);

        Lion leu = new Lion("Simba", 20);
        zoo.adaugaAnimal(leu);
        zoo.adaugaAnimal(new Zebra("Marty", 30));

        zoo.feedAllAnimals();

        zoo.adaugaAnimal(new Pisica("Matz", 10));
        zoo.feedAllAnimals();
    }
}
