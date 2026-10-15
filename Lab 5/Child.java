/** Parent specialization used to contrast field hiding with method overriding. */
public class Child extends Parent {
    /** Child-specific field that hides the parent's field of the same name. */
    public String description = "Child field";

    /** Returns the child-specific identification text. */
    @Override
    public String identify() {
        return "Child method";
    }
}
