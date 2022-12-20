package nl.novi.javaprogrammeren.overerving;

public class Cat extends Pets {

    String inOrOut;

    public Cat(String name, String sex, String nameOwner, String foodBrand, String species, String inOrOut) {
        super(name,sex,nameOwner,foodBrand,species);
        this.inOrOut = inOrOut;
    }

    @Override
    public void sound() {
        System.out.println("miauw");
    }

    @Override
    public void food() {
        System.out.println("Catfood");
    }
}
