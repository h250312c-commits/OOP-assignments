/** Parent type for the field-hiding and method-overriding example. */
public class Parent {
    /** Field intentionally hidden by the child class. */
    public String description = "Parent field";

    /** Returns the parent's identification text. */
    public String identify() {
        return "Parent method";
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("Field: " + parent.description);
        System.out.println("Method: " + parent.identify());
    }
}
