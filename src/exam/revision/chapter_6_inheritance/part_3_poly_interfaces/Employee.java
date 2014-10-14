package exam.revision.chapter_6_inheritance.part_3_poly_interfaces;

/**
 * Employee Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 14/10/2014
 * @project JavaExamProject
 */
public class Employee implements MobileAppExpert {

    @Override
    public void deliverMobileApp() {
        System.out.println("Employee - Deliver Mobile App");
    }

}
