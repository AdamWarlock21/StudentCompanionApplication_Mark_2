package ac.za.cput.Factory;

import ac.za.cput.Domain.Student;
import ac.za.cput.Util.Misc;

public class StudentFactory {

    public static Student getStudent(String firstName, String lastName, int age) {
        return new Student.Builder().age(age)
                .studentFirstName(firstName)
                .studentLastName(lastName)
                .studentId(Misc.generateId())
                .build();
    }
}