package exam.revision.chapter_6_inheritance.part_1_inheritance;

/**
 * Interviewer Interface
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 13/10/2014
 * @project JavaExamProject
 */
public interface Interviewer extends Trainable {

    /**
     * Interfaces
     *
     * - Interfaces are abstract classes taken to extremes.
     * - An interface can define only abstract methods and constraints
     * - All members of an interface are implicitly public, final and static.
     * - All methods of an interface are implicitly public.
     * - A class can implement multiple interfaces, but only extend one other class.
     * - An interface can only define constants. Once it's assigned, you can't change the value of a constant.
     * - An interface can extend multiple interfaces.
     * - An interface can not implement any other class, only another interface.
     * - An interface uses the keyword, extends to implement an interface.
     */

    void conductInterview();

    void reviewCandidate(String candidateName);

}
