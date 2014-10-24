package exam.revision.chapter_3_methods.part_2_object_lifecycle;

/**
 * Office Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 24/10/2014
 * @project JavaExamProject
 */
public class Office {

    public static void main(String[] args) {

        Employee employee = new Employee();
        System.out.println(employee.age);

        employee.modifyVal(employee.age);

        System.out.println(employee.age);

    }

}