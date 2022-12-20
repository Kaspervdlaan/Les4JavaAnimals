package nl.novi.javaprogrammeren.overerving;

public class Dog extends Pets {
    public Dog(String name, String sex, String nameOwner, String foodBrand, String species){
        super(name,sex,nameOwner,foodBrand,species);
    }

    @Override
    public void sound() {
        System.out.println("Woof");
    }

    @Override
    public void food() {
        System.out.println("Dogfood");
    }
}
