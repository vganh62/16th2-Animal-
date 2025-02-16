package OOP.AnimalsEx;

public class Cat extends Animal {
    public Cat(String id, String source, String dateOfBirth, String color) {
        super(id, source, dateOfBirth, color);
    }

    public void enterCatInfo() {
        enterAnimalInfo();
    }

    public void makeSound() {
        System.out.println("Meow meow");
    }
}
