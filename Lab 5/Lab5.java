public class Lab5 {
    public static void main(String[] args) {
        System.out.println("1. Overloaded print methods");
        OverloadedPrinter printer = new OverloadedPrinter();
        printer.print(42);
        printer.print(3.14);
        printer.print("Hello");
        printer.print(new int[] {1, 2, 3});

        System.out.println("\n2. Animal polymorphism");
        Animal[] animals = {new Cat(), new Cow(), new Duck()};
        for (Animal animal : animals) {
            System.out.println(animal.sound());
        }

        System.out.println("\n3. Mixed employee payroll");
        Employee[] employees = {
                new SalariedEmployee("Ava", 4000),
                new HourlyEmployee("Noah", 25, 80),
                new Intern("Mia", 900)
        };
        double totalPayroll = 0;
        for (Employee employee : employees) {
            double pay = employee.calculatePay();
            System.out.printf("%s: %.2f%n", employee.getName(), pay);
            totalPayroll += pay;
        }
        System.out.printf("Total payroll: %.2f%n", totalPayroll);

        System.out.println("\n4. Fields and methods through a superclass reference");
        Parent reference = new Child();
        System.out.println("Field: " + reference.description);
        System.out.println("Method: " + reference.identify());

        System.out.println("\n5. Payment processing");
        PaymentProcessor processor = new PaymentProcessor();
        Payment[] payments = {
                new CardPayment("1234"),
                new MobileMoneyPayment("+263771234567")
        };
        System.out.println("Using instanceof pattern matching:");
        for (Payment payment : payments) {
            processor.pay(payment);
        }
        System.out.println("Using polymorphic process():");
        for (Payment payment : payments) {
            processor.payPolymorphically(payment);
        }
    }
}
