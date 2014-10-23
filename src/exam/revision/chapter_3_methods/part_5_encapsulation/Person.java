package exam.revision.chapter_3_methods.part_5_encapsulation;

/**
 * Description Here
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 23/10/2014
 * @project JavaExamProject
 */
public class Person {

    // firstName is well-encapsulated
    private String firstName;

    // lastName and age are not adhering to the rules of encapsulation and are accessible to the outside world.
    String lastName;
    int age;


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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
