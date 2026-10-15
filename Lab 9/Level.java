/** Three urgency levels used to select advice in the enum example. */
public enum Level {
    LOW,
    MEDIUM,
    HIGH;

    public static void main(String[] args) {
        System.out.println("Available levels:");
        for (Level level : Level.values()) {
            System.out.println("- " + level);
        }
    }
}
