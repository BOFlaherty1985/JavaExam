package exam.revision.chapter_1_basics.nonaccessmodifier;

/**
 * Final Nonaccess Modifier
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 21/10/2014
 * @project JavaExamProject
 */
public final class FinalModifier {

     /*
        The Final keyword

        * The keyword final changes the default behavior of a class, variable or method.

        Final Class

        * A class that is marked final cannot be extended by another class. The code will not compile if the class is
          marked as final and another class attempts to extend it.
        * You can not inherit anything from a final class, compilation errors will occur.

        Final Interface

        * An interface cannot be marked as final. An interface is abstract by default and marking it with final will
          prevent your interface from compiling.

          // final interface myInterface() - will not compile

        Final Variable

        * A final variable can't be reassigned a value. It can be assigned a value only once.

      */

        private void variableExample() {

            final String methodName = ".variableExample()";  // variable can not be changed or reassigned

            // methodName = "testing" - will not compile

        }

        /*
            Final Method

            * A final method defined in a base class can't be overridden by a derived class.

        */

        class Person {
            final void sing() {
                System.out.println("la la la la...");
            }
        }

        class Teacher extends Person {
//            void sing() {     - will not compile, method can not be ovverridden.
//                System.out.println("Alpha... Beta... Gamma");
//            }

        }


        public static void main(String[] args) {

            // Can access and set the value of a static variable that is defined in another class
            // Note: This is not the preferred way to obtain the value of a static variable, as it reads that the variable
            // belongs to the created object (staticModifier) whereas the value belongs to the class. ClassName.staticVariable
            // is always preferred.
            StaticModifier staticModifier = new StaticModifier();
            staticModifier.staticValue = 100;
            System.out.println(staticModifier.MAX_VALUE); // static value can be access as it's defined as 'static'

            int value_one = staticModifier.MIN_VALUE + 10;
            System.out.println(value_one);

            System.out.println(staticModifier.staticValue);

        }

}
