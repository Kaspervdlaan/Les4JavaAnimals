package nl.novi.javaprogrammeren.overerving;

public class Lion extends Wild {
    int children;

    public Lion(String name, String sex, int lastFed, String heritage, String nameClosure, int children) {
        super(name, sex, lastFed, heritage, nameClosure);
        this.children = children;
    }


    @Override
    public void sound() {
        System.out.println("rawr");
    }

    @Override
    public void food() {
        System.out.println("antilope");
    }
}
