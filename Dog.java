package OOP.AnimalsEx;

import java.util.Date;
import java.util.Scanner;

public class Dog extends Animal {
    String breed;
    public Dog() {
    }

    public Dog(String id, String source, Date dateOfBirth, String color, String breed) {
        super(id, source, dateOfBirth, color);
        this.breed = breed;
    }

    public void enterDogInfo() {
        enterAnimalInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Breed: ");
        this.breed = scanner.nextLine();
    }

    public void displayAnimalInfo() {
        super.displayAnimalInfo();
        System.out.println("Breed: " + breed);
    }

    public void makeSound() {
        System.out.println("Go go");
    }
}
