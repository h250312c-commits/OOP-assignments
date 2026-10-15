/** Person whose address may be absent. */
public class Person {
    private final String name;
    private final Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    /** Demonstrates Person functionality with composition. */
    public static void main(String[] args) {
        System.out.println("Testing Person:");
        Person p = new Person("Angella", new Address("Harare"));
        System.out.println("Name: " + p.getName());
        System.out.println("City: " + (p.getAddress() != null ? p.getAddress().getCity() : "None"));
    }
}
