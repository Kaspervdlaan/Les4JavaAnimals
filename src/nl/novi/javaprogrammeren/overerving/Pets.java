package nl.novi.javaprogrammeren.overerving;

public abstract class Pets extends Animal {

    String nameOwner;
    String foodBrand;
    String species;

    public Pets(String name, String sex, String nameOwner, String foodBrand, String species) {
        super(name, sex);
        this.nameOwner = nameOwner;
        this.foodBrand = foodBrand;
        this.species = species;
    }


}
