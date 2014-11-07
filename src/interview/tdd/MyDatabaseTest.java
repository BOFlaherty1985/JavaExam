package interview.tdd;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.fail;

/**
 * My database Test
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 06/11/2014
 * @project JavaExamProject
 */
public class MyDatabaseTest {

    @Test
    public void testObjectExists() {

        MyDatabase.findById("12");

        MyDatabase myDatabase = new MyDatabase() {

          public String myStringValue() {  // and example of a seam, this enables us to change the objects behaviour within
              // the test case without modifying the original code base.
            return "Testing Value #2";
          }

        };

        myDatabase.setTypeOfDatabase("DB2");

        assertTrue(myDatabase.myStringValue().equals("Testing Value #2"));
        assertTrue(MyDatabase.objectExists("12"));

        // Custom assertion
        assertValidTypeOfDatabase(myDatabase.getTypeOfDatabase());

    }

    private void assertValidTypeOfDatabase(String typeOfDatabase) {

        if(typeOfDatabase.isEmpty() || typeOfDatabase.equals("DB2")) {
            fail("not a valid type of database");
        }

    }

}
