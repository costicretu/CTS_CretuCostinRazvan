package model;

public class Pisica extends Animal {

    public Pisica(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String zooKeeper) {
        System.out.println("Pisica " + super.getName() +
                " a fost hranita de " + zooKeeper);
    }
}
