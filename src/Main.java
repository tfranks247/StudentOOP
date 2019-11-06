import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Student Tony = new Student("Tony", 123, new ArrayList<>(Arrays.asList(new Courses("Mathing", "a class on math", 89.00),
                new Courses ("adulting", "a course on life lessons", 60.00 ))));

        Student Beth = new Student ("Beth", 8, new ArrayList<>(Arrays.asList(new Courses("Physics", "Don't Even Try", 65.50),
        new Courses("Bio", "difficult", 70.00))));

        Student Mike = new Student ("Mike", 6788, new ArrayList<>(Arrays.asList(new Courses("Social Studies", "Try", 85.50),
                new Courses("Geo", "difficult", 70.00))));

        Student Bill = new Student ("Bill", 788, new ArrayList<>(Arrays.asList(new Courses("Physics", "Don't Try", 55.50),
                new Courses("Music", "difficult", 70.00))));

        Student Bob = new Student ("Bob", 6768, new ArrayList<>(Arrays.asList(new Courses("PE", "Don't Even Try", 65.00),
                new Courses("Bio", "difficult", 70.00))));

        Collections.addAll(students, Tony, Beth, Bill, Mike, Bob);


        for (Student s : students) {
            System.out.println(s.displayText());
        }

    }
}
