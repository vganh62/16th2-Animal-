package OOP.AnimalsEx;

import java.util.ArrayList;

public class AnimalList {

    ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Adding a dog to the list");
        } else {
            System.out.println("Adding a cat to the list");
        }
        animals.add(animal);
    }

    public void displayAll() {
        for (Animal animal : animals) {
            animal.displayAnimalInfo();
            animal.makeSound();
            System.out.print("...");
        }
    }
}
