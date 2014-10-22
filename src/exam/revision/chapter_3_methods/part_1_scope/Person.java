package exam.revision.chapter_3_methods.part_1_scope;

/**
 * Person Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 22/10/2014
 * @project JavaExamProject
 */
public class Person {

    static String CLASS_NAME = ".Person()";

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
