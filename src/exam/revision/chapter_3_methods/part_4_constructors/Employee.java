package exam.revision.chapter_3_methods.part_4_constructors;

/**
 * Employee Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 23/10/2014
 * @project JavaExamProject
 */
public class Employee {

    private String name;
    private int age;

    // user define constructor with no arguments
    public Employee() {
        this("Testing User", 1);
        System.out.println("Constructor with no Parameters called");
        // this("", 1); // a call to another constructor must be defined first, will not compile otherwise.
    }

    // Initializer Block
    {
        System.out.println("Employee:Initializer");
    }

    // user define constructor with two arguments
    public Employee(String employeeName, int employeeAge) {
        name = employeeName;
        age = employeeAge;
        System.out.println("Constructor with Parameters called");
    }

    public void Employee(String employeeName) {
        System.out.println("Constructor defined with a return type, this will not be implicitly called on object creation");
    }

}
