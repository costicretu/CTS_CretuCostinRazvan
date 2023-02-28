package model;

public class ZooKeeper {
    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        animal.eat(this.name);
    }
}
