package exam.revision.chapter_6_inheritance.part_3_poly_interfaces;

/**
 * Manager Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 14/10/2014
 * @project JavaExamProject
 */
public class Manager extends Employee {

    @Override
    public void deliverMobileApp() {
        System.out.println("QA Complete");
        System.out.println("code delivered with release notes");
    }

}
