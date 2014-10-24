package exam.revision.chapter_3_methods.part_2_object_lifecycle;

/**
 * Passing Objects and Primitives to Methods
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 24/10/2014
 * @project JavaExamProject
 */
public class PassingVariablesToMethods {

    /*

        * Object references and primitives behave in a different manner when they're passed to a method because of the
          differences in how these two data types are internally stored by Java.


          Passing Primitives

          * The value of a primitive data type is copied and passed on to a method.
          * It's okay to define a method parameter with the same name as an instance variable (or object field).
          * Within a method, a method parameter takes precedence over an object field.
          * To access instance variables from within a method, we need to prefix the variable name with the keyword 'this'.

            Exam Tip: When you pass a primitive variable to a method, its value remains the same after the execution of
             the method. The value doesn't change, regardless of whether the method reassigns the primitive to another
             variable or modifies it.


           Passing object references to methods

           * When a method reassigns the object reference passed to it to another variable

                Object instanceObj;

                public void methodOne(Object object) {
                    instancesObj = object;
                {

           * When a method modifies the state of the object reference passed to it.

                // changing an objects state, we are changing a value on the object, "myValue" would be output if we called
                // this method on the object at a later time in the program execution..
                public void methodTwo(Object object) {
                    object.setValue("myValue");
                }


            Exam Tip: With object references, always ensure to check whether or not the values of the object(s) have been
             changed. You can swap object references, without changing the values stored within the object.

     */

}
