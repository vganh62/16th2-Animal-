package OOP.AnimalsEx;

public class Processor {

    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();

        Dog dog = new Dog("D01", "ABC", "01/02/2024", "Brown", "GGG");
        Cat cat = new Cat("C01", "DEF", "06/01/2024", "Grey");

        animalList.addAnimal(dog);
        animalList.addAnimal(cat);

        animalList.displayAll();
    }
}
