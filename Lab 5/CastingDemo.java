/** Demonstrates dispatch, field hiding, and safe pattern-matching downcasts. */
public class CastingDemo {
    public static void run() {
        System.out.println("\nSuperclass references, dispatch, and safe downcasting");
        Animal animal = new Dog();
        animal.speak();
        System.out.println(animal.type);
        Animal.info();
        System.out.println("The overridden method uses the object's class; fields and "
                + "static methods use the declared type.");

        if (animal instanceof Dog dog) {
            dog.fetch();
        }

        Animal plainAnimal = new Animal();
        if (!(plainAnimal instanceof Dog)) {
            System.out.println("plain is not a Dog; downcast avoided");
        }
    }

    public static void main(String[] args) {
        run();
    }
}
