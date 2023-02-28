package model;

public class Zebra extends Animal {
    public Zebra(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String zooKeeper) {
        System.out.println("Zebra cu numele " + super.getName() +
                " in varsta de " + super.getAge() +
                " a fost hranit de " + zooKeeper);
    }
}
