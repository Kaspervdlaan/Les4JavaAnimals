package nl.novi.javaprogrammeren.overerving;

public abstract class Wild extends Animal {
    int lastFed;
    String heritage;

    String nameClosure;

    public Wild(String name, String sex, int lastFed, String heritage, String nameClosure) {
        super(name, sex);
        this.lastFed = lastFed;
        this.heritage = heritage;
        this.nameClosure = nameClosure;
    }

    public abstract void sound();
    public abstract void food();

}
