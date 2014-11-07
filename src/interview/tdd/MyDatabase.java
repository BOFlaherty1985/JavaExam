package interview.tdd;

/**
 * My Database object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 06/11/2014
 * @project JavaExamProject
 */
public class MyDatabase {

    private String typeOfDatabase;

    public static Object findById(String id) {

        return true;
    }

    public static boolean objectExists(String id) {
        return (findById(id) != null);
    }

    public String myStringValue() {
        return "Testing Value #1";
    }

    public String getTypeOfDatabase() {
        return typeOfDatabase;
    }

    public void setTypeOfDatabase(String typeOfDatabase) {
        this.typeOfDatabase = typeOfDatabase;
    }
}
