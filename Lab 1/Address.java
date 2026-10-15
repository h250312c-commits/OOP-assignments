/** Stores the city for a person's address. */
public class Address {
    private final String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    /** Demonstrates Address functionality. */
    public static void main(String[] args) {
        System.out.println("Testing Address:");
        Address address = new Address("Harare");
        System.out.println("City: " + address.getCity());
    }
}
