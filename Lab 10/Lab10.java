import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lab10 {
    private static final Path LINES_FILE = Path.of("five-lines.txt");
    private static final Path LEARNERS_FILE = Path.of("learners.csv");

    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            saveAndReadFiveLines(scanner);
        }
        printFileStatistics(LINES_FILE);
        demonstratePredicateAndRemoveIf();
        printAboveAverageStudents();
        writeLearnerReports(LEARNERS_FILE);
    }

    private static void saveAndReadFiveLines(Scanner scanner) throws IOException {
        List<String> lines = new ArrayList<>();
        System.out.println("Enter five lines:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "> ");
            if (!scanner.hasNextLine()) {
                throw new IllegalArgumentException("Expected five lines of input.");
            }
            lines.add(scanner.nextLine());
        }

        Files.write(LINES_FILE, lines, StandardCharsets.UTF_8);
        System.out.println("\nLines read back from " + LINES_FILE + ":");
        for (String line : Files.readAllLines(LINES_FILE, StandardCharsets.UTF_8)) {
            System.out.println(line);
        }
    }

    private static void printFileStatistics(Path file) throws IOException {
        String text = Files.readString(file, StandardCharsets.UTF_8);
        long lineCount = Files.readAllLines(file, StandardCharsets.UTF_8).size();
        long wordCount = text.isBlank()
                ? 0
                : text.trim().split("\\s+").length;

        System.out.println("\n3. File statistics for " + file);
        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Characters (including line separators): " + text.length());
    }

    private static void demonstratePredicateAndRemoveIf() {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Predicate<Integer> isEven = number -> number % 2 == 0;
        numbers.removeIf(isEven);

        System.out.println("\n2. Remove even numbers with Predicate and removeIf");
        System.out.println(numbers);
    }

    private static void printAboveAverageStudents() {
        List<Student> students = List.of(
                new Student("Zara", 88),
                new Student("Amir", 95),
                new Student("Bea", 72),
                new Student("Liam", 64),
                new Student("Mia", 81));
        double average = students.stream()
                .mapToInt(Student::marks)
                .average()
                .orElse(0);

        List<String> aboveAverageNames = students.stream()
                .filter(student -> student.marks() > average)
                .map(Student::name)
                .sorted()
                .toList();

        System.out.println("\n4. Students above class average");
        System.out.printf("Class average: %.2f%n", average);
        System.out.println("Names: " + aboveAverageNames);
    }

    private static void writeLearnerReports(Path file) throws IOException {
        List<Learner> learners = readLearners(file);
        Map<String, List<Learner>> learnersByBand = learners.stream()
                .collect(Collectors.groupingBy(
                        Learner::gradeBand,
                        Collectors.collectingAndThen(Collectors.toList(), group -> group.stream()
                                .sorted(Comparator.comparing(Learner::name))
                                .toList())));

        for (String band : List.of("A", "B", "C")) {
            List<Learner> group = learnersByBand.getOrDefault(band, List.of());
            Path report = Path.of("learners-" + band + ".txt");
            List<String> lines = new ArrayList<>();
            lines.add("Grade " + band + " learners");
            for (Learner learner : group) {
                lines.add(learner.name() + ", " + learner.marks());
            }
            Files.write(report, lines, StandardCharsets.UTF_8);
            System.out.printf("%nGrade %s report: %s (%d learners)%n", band, report, group.size());
        }
    }

    private static List<Learner> readLearners(Path file) throws IOException {
        List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
        if (lines.isEmpty() || !lines.get(0).trim().equalsIgnoreCase("name,marks")) {
            throw new IllegalArgumentException("Expected CSV header: name,marks");
        }

        List<Learner> learners = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i).trim();
            if (line.isEmpty()) {
                continue;
            }
            String[] fields = line.split(",", -1);
            if (fields.length != 2) {
                throw new IllegalArgumentException("Invalid CSV row at line " + (i + 1) + ": " + line);
            }
            try {
                learners.add(new Learner(fields[0].trim(), Integer.parseInt(fields[1].trim())));
            } catch (NumberFormatException exception) {
                throw new IllegalArgumentException("Invalid marks at CSV line " + (i + 1), exception);
            }
        }
        return learners;
    }
}
