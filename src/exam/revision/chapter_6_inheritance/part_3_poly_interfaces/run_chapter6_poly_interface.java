package exam.revision.chapter_6_inheritance.part_3_poly_interfaces;

/**
 * Description Here
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 14/10/2014
 * @project JavaExamProject
 */
public class run_chapter6_poly_interface {

    public static void main(String[] args) {

        /*

        Polymorphism can also be implemented using interfaces. Whereas polymorphism with classes has a class
        as the super class, polymorphism with interfaces require a class to implement an interface.

        Polymorphism with interfaces always invokes abstract methods from the implemented interface because
        interfaces can define only abstract methods.

        Exam Tip: Watch out for overloaded methods that seem to participate in polymorphism - overloaded methods don't
        participate in polymorphism. Only overridden methods - methods with the same signatures, participate in polymorphism.

        */

        MobileAppExpert expert1 = new Programmer();
        expert1.deliverMobileApp();

        MobileAppExpert expert2 = new Manager();
        expert2.deliverMobileApp();

        /*
            As both Programmer and Manager both extend Employee, we can also use a variable of type Employee to store
            objects of the classes Programmer and Manager. However, as Employee doesn't implement the MobileAppExpert
            interface, you will not be able to call the method deliverMobileApp() - compilation error
        */

        Employee employee_one = new Programmer();
        //employee_one.deliveryMobileApp()  - won't compile

        /*
            However, if we modify Programmer and Manager to only extend Employee, and ensure that the Employee object
            implements the behavior of MobileAppExpert we are able to create objects using the variable type Employee.
        */

        Employee employee_two = new Programmer();
        employee_two.deliverMobileApp();

        Employee employee_three = new Manager();
        employee_three.deliverMobileApp();

    }

}
