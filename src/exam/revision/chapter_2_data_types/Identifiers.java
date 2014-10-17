package exam.revision.chapter_2_data_types;

/**
 * Identifiers
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 15/10/2014
 * @project JavaExamProject
 */
public class Identifiers {

    /*
        Valid Identifiers

        * A valid identifier starts with a letter (a-z, upper or lowercase), a currency sign, or an underscore. There
          is no limit to its length.
        * A valid identifier can contain digits, but not in the starting place.
        * A valid identifier can use the underscore and currency sign at any position of the identifier.
        * A valid identifier can't have the same spelling as a Java keyword, such as 'switch' or 'return'.
        * A valid identifier can't use any special characters, including !, @, #, %, ^, &, *, ), }, ', :, ;, ], /, \ or }
     */

    // Valid declarations
    int valid = 1;
    int $_valid = 2;
    int £_valid = 3;
    int _valid = 4;
    int Valid$_£ = 5;

    // Invalid declarations

//    int 1_inValid = 1;
//    int @InValid = 2;
//    int !_242_inValid = 3;
//    int 123445_inValid = 5;
//    int return = 1;

}
