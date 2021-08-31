package com.company;

// import needed for chapter 2
import java.util.Scanner;

public class Main {

    // When using the java-web-dev-exercises fork
        // had to change things to let it run:
            // go to file-> project structure ->
                // change sdk version to 11
                // change project level language to 11

// Last little bit of Chapter 1
    // here's a shortcut to producing the public static void main
    // type psvm and press enter
    // it should create a line that you see below
    public static void main(String[] args) {

        // prints line to console
        System.out.println("Hello World!!");
        // in javascript we used console.log();
        // in Java, we use System.out.println();

        // Now uncomment the next line and run main
        // System.out.println('Hello World!!');
        // it should produce an error similar to the following:
        // 21:28 java: unclosed character literal
        // Now, remember in JavaScript we could say a string is
        // like this 'Hello string' or "Hello string" and those would
        // both be strings. In Java, we use double quotes("") for string
        // types and single quotes('') for character types. Java is more
        // strictly type, so we do not have the freedom to interchange
        // these anymore.
        // Now comment line 26 back out and make sure main runs without errors.

        // please keep this page handy for naming conventions reference
        // https://education.launchcode.org/java-independent-track/chapters/introduction-and-setup/naming-conventions.html


        // As you move in the book comment and uncomment each function below;
        // chapter2S1();
        // chapter2S2();
        chapter2S3();
    }

// Chapter 2.1 - Data Types
    public static void chapter2S1() {
    /* dynamically typed
         - a variable or parameter can refer to a value of any data type at any time
         - example languages include JavaScript or Python  */

    /* statically typed
         - a variable or parameter needs a type declared before being used or
          initialized
         - once the variable or parameter is declared, the variable or parameter
          cannot refer to a value of a different type
          -example languages include Java or C#  */

        // In JavaScript, we could do the following(can stick the following into a
        // javascript editor and run if you'd like, will not run in IntelliJ):
        // let name = "John";
        // console.log(typeof(name)); // will print string
        // then we could reassign name to a number if we wanted like so:
        // name = 23;
        // console.log(typeof(name)); // will print number

        // In Java, we would need to do the following:
        String name = "John";
        System.out.println(name.getClass()); // outputs class java.lang.String
        Integer age = 23;
        System.out.println(age.getClass()); // outputs class java.lang.Integer
        // can only do .getClass() on non-primitive types
        // otherwise I would probably have used int type for this variable
        // remember, primitive types do not have methods

        /* Primitive Data Types
          int - positive and negative whole numbers ex: 56
          float - positive and negative decimal numbers with up to 7 digits
                - will sacrifice some accuracy, so go with double for decimal numbers
                - example : 3.141593
          double - positive and negative decimal numbers with 15 to 16 digits
                 - better accuracy than a float
                 - example : 3.14159265358979
          char - single unicode character in single quotes; ex: 'a'
          boolean - true or false; not capitalized
        */

        // Brings us to Autoboxing
        /* autoboxing - the compilier is smart enought to convert primitive to
             non-primitive types and go back and forth between the two
             - best practice is to use primitives whenever possible
                - primary exception is when storing value in collections(don't need to
                 worry about now)
              Examples
              primitive data type -> object type
                int -> Integer
                float -> Float
                double -> Double
                char -> Character
                boolean -> Boolean */

        // See more about different primitive and non-primitive data type in
        // Java go to https://education.launchcode.org/java-independent-track/chapters/data-types/data-types.html
        // It also includes information about string methods section 2.1.2.

        // Quick Note:
            // use .equals() when comparing two strings instead of ==
    }

// Chapter 2, section 2 - Java Practice
    public static void chapter2S2() {
        /* This section has a lot of good information for going through the examples
        in java-web-dev-exercises. Please go through it.

           Note:
            Java Packages
            Import Statements
            Declaring Variables
            Collecting Input with Scanner Class

            ***Packages
            packages - encapsulate your code
                     - helps reduce the risks of naming conflicts and bugs
            encapsulation - practice of shielding your code from outside influences

            ***Import Statements
            import - allows us to access the class, methods, and data stored in a
                    different file
                   - able to use a shortened version of the class name
                   - typically imported at the top of your file
                   example:
                    see line 3, we import the java.util.Scanner class, and now we can refer
                    to it as just Scanner

               Can use any available class without having to import it, but you would need
               to use the full name. Available classes include:
                    - All classes you define in the .java and .class files in your current
                      working directory
                    - All classes that get shipped with the software
               java.util.Scanner
                    - java.util is calle the package
                    - Scanner is the class name

            ***Declaring Varaibles
            Must declare variable types when declaring variables
                declare data type and then put the name of the variable
                (data type) (name of variable)
                String name; // in this case we declare a variable named name with a
                    data type of String

            ***Collecting Input
            Using the Scanner class, we can create Scanner Objects which allow
            us to receive input from the user.
            Let's create a scanner */

            Scanner input;
            // this says we have a variable named input that is of type Scanner
            // to set create a new instance of the Scanner Class, so that input
            // becomes a type of Scanner, we do the following
            input = new Scanner(System.in);
            // new keyword provides an instance of a class
            // input is an instance of the Scanner class

            // we need to ask the user for a response, so we will use the following
            System.out.println("Please enter a whole number: ");
            // that will print to the console.
            // to gather the user input, we will want to use input. There are many
            // different methods that can be used depending on what you want the
            // scanner to record. look at table for other scanner methods
            // https://education.launchcode.org/java-independent-track/chapters/data-types/some-java-practice.html#id5

            // In this case, we are asking for a whole number, we would want to
            // use .nextInt()
            // We will also want to store this data for later use, so we need to create a
            // variable to store it
            int someWholeNumber = input.nextInt();
            // someWholeNumber will store the value of what the user inputs in the terminal
            // someWholeNumber is also of data type int, which we declare before naming
            // the variable
            // we set that equal to input.nextInt();
            // input is the specific object that we want to use; nextInt() is a method
            // available to the Scanner class or in this case the Scanner instance named input
            // then we can display the outcome in the console like this:
            System.out.println("The number you chose is " + someWholeNumber);

            // Best Practice is to close your scanner after use:
            input.close();
            // Always remember to do this to avoid unintended access to your program!!!

    }

// Chapter 2, Section 3 - More Data Types
    public static void chapter2S3() {
        /*
        arrays - ordered, fixed-size collection of elements
               - all items should have the same data type
                    can have an array of all strings
                    can have an array of all integers
                    cannot have one with arrays and integers
        In JavaScript, we create arrays like the following
        let emptyArray = [];
        let someArray = ['hello world', 23, 32, "basketball"];
        We could combine different data types.

        In Java, we can only create arrays filled with one data type
        This is how we would create an array with up to 11 integers
        int[] someInts = new int[11];

        the int[] tells Java that someInts is going to store a collection of
        integers instead of a single number. new int[11] says lets create an array
        capable of holding 11 integers. It initializes it as empty until you add
        values to the array.

        to create an array of a different type replace int on both sides of the
        equals sign with which data type you want. For example a string might look
        like this:
        String[] someStrings = new String[5];
        someStrings would be a variable that can hold up to five strings in the array

        You can also initialize an array when declaring it using a literal expression:
        int[] someOtherInts = {3, 4, 7, 23};
        When doing this, the size is implied by the number of elements that are
        given. In this case, the size is 4. Note that curley brackets were used
        instead of square brackets.
        We can access one element by using square brackets and zero based indexing:
        someOtherInts[0]; // would give the integer 3

        NOTE: Arrays CANNOT change size once they are created!!

        We will be introduced to a more flexible way to store data a little later

        */

        // declaring an array of integers
        int[] someInts = new int[5]; // someInts size is 5
        String[] someStrings = new String[3]; // someStrings size is 3
        Double[] someDecimals = new Double[2]; // someDecimals size is 2

        int[] arrayOfInts = {1,4,6,5}; // size of 4
        String[] arrayOfStrings = {"Java", "is", "good", "but", "don't", "like", "arrays"}; // size of 7
        Double[] arrayOfDoubles = {3.145752, 11.542, 1111.52242}; // size of 3

        System.out.println(someInts.toString());
        System.out.println(someStrings.toString());
        System.out.println(someDecimals.toString());

        System.out.println(arrayOfInts.toString());
        System.out.println(arrayOfStrings.toString());
        System.out.println(arrayOfDoubles.toString());




    }

}
