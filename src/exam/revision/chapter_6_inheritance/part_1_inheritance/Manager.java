package exam.revision.chapter_6_inheritance.part_1_inheritance;

/**
 * Manager Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 13/10/2014
 * @project JavaExamProject
 */
public class Manager extends Employee implements Interviewer, Trainable {

    int sizeOfTeam;

    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void reportProjectStatus() {
        System.out.println("Status Reported.");
    }

    @Override
    public void conductInterview() {
        System.out.println("I am now conducting an interview...");
    }

    @Override
    public void reviewCandidate(String candidateName) {
        System.out.println("Review " + candidateName + "'s interview.");
    }

    @Override
    public void attendTraining() {
        System.out.println("Manager - Attending Training...");
    }
}
