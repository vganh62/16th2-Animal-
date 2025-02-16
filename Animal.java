package OOP.AnimalsEx;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Animal {

    String id;
    String source;
    Date dateOfBirth;
    String color;

    public Animal() {
    }

    public Animal(String id, String source, Date dateOfBirth, String color) {
        this.id = id;
        this.source = source;
        this.dateOfBirth = dateOfBirth;
        this.color = color;
    }

    public void enterAnimalInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        this.id = scanner.nextLine();
        System.out.print("Enter Source: ");
        this.source = scanner.nextLine();
        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        try {
            this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
        } catch (Exception e) {
            this.dateOfBirth = new Date();
        }
        System.out.print("Enter Color: ");
        this.color = scanner.nextLine();
    }

    public void displayAnimalInfo() {
        System.out.println("ID: " + id + ", Source: " + source + ", Date of birth: " + dateOfBirth + ", Color: " + color);
    }

    public void makeSound() {
        System.out.println("Animal sounds");
    }
}
