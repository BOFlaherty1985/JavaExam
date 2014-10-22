package exam.revision.chapter_3_methods.part_2_object_lifecycle;

/**
 * Exam Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 22/10/2014
 * @project JavaExamProject
 */
public class Exam {

    private String examName;

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examName='" + examName + '\'' +
                '}';
    }

}
