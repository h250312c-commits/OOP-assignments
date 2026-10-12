public class Lab4 {
    public static void main(String[] args) {
        System.out.println("1-2. Person, Student, and Teacher");
        Person person = new Person("Alex", 40);
        Student student = new Student("Jordan", 20, "Software Engineering");
        Teacher teacher = new Teacher("Morgan", 35, "Object-Oriented Programming");

        person.display();
        student.display();
        System.out.println("Course: " + student.getCourse());
        teacher.display();
        System.out.println("Subject: " + teacher.getSubject());

        System.out.println("\n3. Vehicle constructor order");
        ElectricCar electricCar = new ElectricCar("EV-1", 4, 80);
        System.out.printf("Created %s with %d doors and a %d kWh battery.%n",
                electricCar.getModel(), electricCar.getDoors(), electricCar.getBatteryCapacityKwh());

        System.out.println("\n4. Dog constructor");
        Dog dog = new Dog("Rex");
        System.out.println("Dog name: " + dog.getName());

        System.out.println("\n5. Stack using composition");
        Stack<String> stack = new Stack<>();
        stack.push("first");
        stack.push("second");
        System.out.println("Stack contents, bottom to top: " + stack.snapshot());
        System.out.println("Top item: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Remaining size: " + stack.size());
    }
}
