package model;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    // principiul dry pt ca se foloseste aceeasi functie in Lion si Zebra
    @Override
    public void eat(String zooKeeper) {
        System.out.println("Leul cu numele " + super.getName() +
                " in varsta de " + super.getAge() +
                " a fost hranit de " + zooKeeper);
    }
}
