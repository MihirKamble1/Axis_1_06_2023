package selenium;
import java.util.*;

class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listAnimals() {
        for (Animal animal : animals) {
            animal.showInfo();
            System.out.println();
        }
    }

    public void interactWithAnimals() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Enter the name of an animal (or 'quit' to exit): ");
            input = scanner.nextLine();
            boolean found = false;
            for (Animal animal : animals) {
                if (animal.getClass().getSimpleName().equalsIgnoreCase(input)) {
                    animal.makeSound();
                    found = true;
                    break;
                }
            }
            if (!found && !input.equals("quit")) {
                System.out.println("Animal not found in the zoo!");
            }
        }
        scanner.close();
    }
}

class ZooSimulation {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion lion = new Lion("King", 3);
        Tiger tiger = new Tiger("Jay", 3);
        Elephant elephant = new Elephant("Matkasur", 10);

        zoo.addAnimal(lion);
        zoo.addAnimal(tiger);
        zoo.addAnimal(elephant);

        zoo.listAnimals();

        zoo.interactWithAnimals();
    }
}