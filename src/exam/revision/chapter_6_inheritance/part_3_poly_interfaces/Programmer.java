package exam.revision.chapter_6_inheritance.part_3_poly_interfaces;

/**
 * Programmer Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 14/10/2014
 * @project JavaExamProject
 */
public class Programmer extends Employee{

    @Override
    public void deliverMobileApp() {
        System.out.println("Programmer - Deliver Mobile App");
    }

}
