package nl.novi.javaprogrammeren.overerving;

public abstract class Animal {

    String name;
    String sex;

    public Animal(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void move() {
        System.out.println("Animal moves 2 meter");
    }
    public abstract void sound();
    public abstract void food();
    public void sleep() {
        System.out.println("Sleeping for 8 hours");
    }

}
