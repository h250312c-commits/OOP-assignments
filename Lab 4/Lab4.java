/** Runs inheritance, constructor-order, and composition examples. */
public class Lab4 {
    /** Runs each Lab 4 demonstration. */
    public static void main(String[] args) {
        System.out.println("1-2. Person, Student, and Teacher");
        Person person = new Person("Alex", 40);
        Student student = new Student("Jordan", 20, "Software Engineering");
        Teacher teacher = new Teacher("Morgan", 35, "Object-Oriented Programming");

        System.out.println("Base Person display:");
        person.display();

        System.out.println("\nStudent display (overriding with super.display()):");
        student.display();

        System.out.println("\nTeacher display (overriding with super.display()):");
        teacher.display();

        System.out.println("\n3. Vehicle constructor order");
        ElectricCar electricCar = new ElectricCar("EV-1", 4, 80);
        System.out.printf("Created %s with %d doors and a %d kWh battery.%n",
                electricCar.getModel(), electricCar.getDoors(), electricCar.getBatteryCapacityKwh());

        System.out.println("\n4. Why Dog() fails when Animal only has Animal(String)");
        System.out.println("Incorrect example (compile error):");
        System.out.println("  class Dog extends Animal { Dog() { } }");
        System.out.println("Java inserts super(), but Animal has no zero-argument constructor.");
        System.out.println("Correct example: Dog(String name) { super(name); }");
        Dog dog = new Dog("Rex");
        System.out.println("Dog name: " + dog.getName());

        System.out.println("\n5. Stack using composition");
        System.out.println("An ArrayList subclass would expose operations that bypass LIFO order:");
        System.out.println("  badStack.add(0, \"out of order\");");
        System.out.println("  badStack.remove(0);  badStack.clear();");
        System.out.println("Composition exposes stack operations without those ArrayList methods.");
        Stack<String> stack = new Stack<>();
        stack.push("first");
        stack.push("second");
        System.out.println("Stack contents, bottom to top: " + stack.snapshot());
        System.out.println("Top item: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Remaining size: " + stack.size());
        System.out.println("Popped: " + stack.pop());
        try {
            stack.pop();
        } catch (IllegalStateException exception) {
            System.out.println("Pop from empty stack correctly rejected: " + exception.getMessage());
        }
    }
}
