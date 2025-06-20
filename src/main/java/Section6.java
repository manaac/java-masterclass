//import keyword lets us use classes from other people's code.
// In this case, Java provides a library of code, which includes the Scanner class in a library called java.util.

import java.util.Scanner;

public class Section6 {
    public static void main(String[] args) {
        //the switch statement that lets us test if a variable matches
        //a particular value and will then execute one or more lines of code if the check is true.

        //a switch is good to use if we're actually testing the same variable, and we want to test
        //different values for that variable

        //We can only use half of the primitives, byte, short, int, and char,
        //and their corresponding wrappers. We can use String and a type called enum.
        //But, importantly, note that the primitive types of boolean, long, float, and double cannot be used.

        //concept to the switch statement, called fall through. Once a switch case label matches the switch
        //variable, no more cases are checked. Any code after the case label where
        //there was a match found will be executed until a break statement
        //or the end of the switch statement occurs. Without a break statement, execution will continue
        //to fall through any case-labels declared below the matching one and execute each case's code.

        //traditional switch statement
//        switch (value) {
//            case x:
//                // code for value == x
//                break;
//            case y:
//                // code for value == y
//                break;
//            default:
//                // code for value not equal to x or y

//        boolean switchValue2 = true;
//        switch (switchValue2) { // Incompatible types. Found: 'boolean', required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'
//            case true:
//            break;
//        }

        int switchValue_traditional = 2;
        switch (switchValue_traditional) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;  // fall through: if this break; statement is commented, and if switchValue = 2, java will execute all the code
            // until next break is found without even checking the case value
            case 3:
            case 4:
            case 5:
                System.out.println("value was a 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue_traditional);
                break;
            default: // default block is optional
                System.out.println("value was not 1 or 2 or 3 or 4 or 5");
                break; // this is optional
        }

        int switchValue = 2;
        switch (switchValue) {
            case 1 ->
                    System.out.println("value was 1");//colon after each case label has been replaced with the arrow token
            case 2 -> System.out.println("value was 2");//There are no breaks in the enhanced switch statement
            //Fall through, which we examined at the end of the last video, never occurs in the enhanced switch statement.
            case 3, 4,
                 5 -> {//multiple case labels we had, case 3, case 4, and case 5, with a comma-delimited list of the values.
                System.out.println("value was a 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("value was not 1 or 2 or 3 or 4 or 5"); // default block is optional
        }

        String month = "JUN";
        System.out.println("Month: " + month + " is " + calculateQuarter_traditional(month) + " quarter");
        System.out.println("Month: " + month + " is " + calculateQuarter(month) + " quarter");

        char phonetic_alphabet = 'D';
        switch (phonetic_alphabet) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("letter " + phonetic_alphabet + " not found");
        }

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        printDayOfWeekWithIF(0);
        printDayOfWeekWithIF(1);
        printDayOfWeekWithIF(2);
        printDayOfWeekWithIF(3);
        printDayOfWeekWithIF(4);
        printDayOfWeekWithIF(5);
        printDayOfWeekWithIF(6);
        printDayOfWeekWithIF(7);

        //looping statements in Java. These statements will continue to execute
        //a block of code repetitively, until a condition, or some set of conditions is met.

        //The for loop is probably the most common
        //It includes set up to initialize variables, check a loop expression, and update code, which often
        // includes incrementing an iteration variable.
        //The while loop might seem simpler, because it will just continue to execute code, until its loop expression becomes false.
        //And the do while loop, is like the while loop, except that it will always execute the code once,
        // regardless of whether the loop condition is true or false, and then continue looping until that expression is false.

        //These parts are all optional and consist of the following:
        //The initialization section declares or sets state, usually declaring and initializing a
        // loop variable, before the loop begins processing.
        //The expression section, once it becomes false, will end the loop processing.
        //The increment section is executed after the expression is tested and is generally the place
        // where the loop variable is incremented
//        for(init; expression; increment){
//            //block of statements
//        }
        //when for loop gets executed, below is the flow
        //1. initialize the variable (counter =1)
        //2. check the expression (counter <=5)
        //3. if expression is true, execute the block of statements (System.out.println(counter);)
        //4. increment/iterate (counter++)
        //when it executes 2nd time
        //1. check the expression (counter <=5)
        //2. if expression is true, execute the block of statements (System.out.println(counter);)
        //3. increment/iterate (counter++)

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double interestRate = 2; interestRate <= 5; interestRate++) {
            System.out.println("10000 at " + interestRate + "% interest rate is " + calculateInterest(10000, interestRate));
        }

        // I, is short for the iteration variable,
        //and you'll see the lowercase letter I, used in many loops
        //You'll also see lowercase J, and K, used quite a lot as well, especially
        //when there a multiple loops in the code

        //A break statement transfers control out of an enclosing statement.
        //in a for loop, generally requires you use an if statement, testing some
        //condition on which to break out of the loop which is different than the loop expression.
        //So, the break statement can be used,to break out of a loop,
        // in this case, before the declared loop expression ever evaluates too false.
        for (double i = 7.5; i <= 10; i += 0.25) {
            if (i > 8.5) {
                break;
            }
            System.out.println("100 at " + i + "% interest rate is " + calculateInterest(100, i));
        }

        //a prime number, is only divisible by itself, and one.
        for (int i = 0; i <= 50; i++) {
            if (i == 0) {
                System.out.print("prime numbers between 1 and 50 are ");
            }
            System.out.print((isPrime(i) ? i + " " : ""));
        }

        System.out.println(" ");
        int primeNumberCounter = 0;
        for (int i = 10; i < 50; i++) { //here we can add the counter logic to expression as (i < 50 && primeNumberCounter < 3)
            if (primeNumberCounter == 3) {
                System.out.println("found 3 prime numbers..exiting loop");
                break;
            }
            if (isPrime(i)) {
                System.out.println(i);
                primeNumberCounter++;
            }
        }

        int counter = 1;
        int sum = 0;
        for (int i = 1; (i <= 1000 && counter <= 5); i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("found a match " + i);
                sum += i;
                counter++;
            }
        }
        System.out.println("sum of numbers that can be divided by 3 and 5 first 5 numbers is " + sum);

        //But what if you want to loop until a certain expression evaluates to true or false,
        //instead of looping a given number of times? For this situation, Java has two flavours
        //of something called the while loop
        //For example, you may not know how
        //many times you want to loop ahead of time. What you need to do in that case is continue
        //looping until some condition is met. This is where the while statement becomes very useful.

//        while(expression){
//            //block of statements
//        }

        //init is done outside the while loop and iteration/increment is done inside the block of statements
        //in for loop, we do init, expression, increment is same line
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        //you will probably see while loops used this way, and the condition
        //tested elsewhere, also within the loop code block
        System.out.println("while loop");
        int j = 1;
        while (true) {
            if (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
        }


        //The difference between the while
        //loop and the do while loop is that the do while loop will always execute the loop code block at
        //least once.

//        do{
//            //block of statements
//        } while (expression);

        System.out.println("do-while loop");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

        System.out.println("do-while loop another example");
        k = 1;
        boolean isReady = false;
        do {
            if (k > 5) {
                break;
            }
            System.out.println(k);
            k++;
            isReady = (k > 0);
        } while (isReady);

        //The continue statement, in its simplest form, will stop executing the current iteration of a block of
        //code in a loop, and start a new iteration.
        System.out.println("continue demo");
        int ii = 0;
        while (ii <= 50) {
            ii += 5;
            if (ii % 25 == 0) {
                continue; //When it starts a new iteration, any code below the continue statement is skipped
            }
            System.out.print(ii + "_");
        }

        System.out.println(" ");
        int inputNumber = 5;
        while (inputNumber <= 20) {
            if (isEvenNumber(inputNumber)) {
                System.out.println("even number are " + inputNumber);
            }
            inputNumber++;
        }

        System.out.println("other way of doing while using continue");
        inputNumber = 4;
        while (inputNumber <= 20) {
            inputNumber++;
            if (!isEvenNumber(inputNumber)) {
                continue;
            }
            System.out.println("even number are " + inputNumber);
        }

        System.out.println("another other way of doing while using continue");
        inputNumber = 4;
        int evenNumberCount = 0;
        int oddNumberCount = 0;
        while (inputNumber <= 20) {
            if (evenNumberCount == 5) {
//                System.out.println("total even numbers are " + evenNumberCount);
//                System.out.println("total odd numbers are " + oddNumberCount);
                break;
            }
            inputNumber++;
            if (!isEvenNumber(inputNumber)) {
                oddNumberCount++;
                continue;
            }
            System.out.println("even number are " + inputNumber);
            evenNumberCount++;
        }
        System.out.println("total even numbers are " + evenNumberCount);
        System.out.println("total odd numbers are " + oddNumberCount);

        System.out.println("sum of digits of 125 " + sumDigits(125));
        System.out.println("sum of digits of -125 " + sumDigits(-125));
        System.out.println("sum of digits of 1000 " + sumDigits(1000));
        System.out.println("sum of digits of 1234 " + sumDigits(1234));
        System.out.println("sum of digits of 4 " + sumDigits(4));

        //The continue and break statements both interrupt normal loop processing.
        //The continue statement starts a new iteration but continues to iterate through the loop.
        //The break statement exits the loop at the point it's executed, and no longer completes any code in the loop,
        // and won't continue iterating any longer.

        //A local variable is called local because it is available for use by the code block in which it was declared.
        //It is also available to code blocks that are contained by a declaring block.

        //a method block can declare local
        //variables, and any flow statements contained in the method block will
        //have access to the method's local variables.
        //This is also true for the method parameters.
        //Any code in the method and any nested blocks have access to the parameters.
        //There's no limit to how deep you can nest code blocks

        //switch statement is the only different access for local variable
        //A variable declared in one case label code block can be accessed in another case label code block, but only if
        //that block is after the declaration and initialization of the variable.
        int numberTest = 5;
        switch (numberTest) {
            case 1:
                int iii = 0;
                iii = 10;
                System.out.println(iii);
                break;
            case 2:
                iii = numberTest;
                System.out.println(iii);
                break;
            default:
                iii = 1000;
                System.out.println(iii);
        }

        System.out.println("number 1234 is" + (isPalindrome(1234) ? "" : " not") + " a palindrome");
        System.out.println("number 1234321 is" + (isPalindrome(1234321) ? "" : "not") + " a palindrome");
        System.out.println("number -222 is" + (isPalindrome(-222) ? "" : "not") + " a palindrome");
        System.out.println("number 4 is" + (isPalindrome(4) ? "" : "not") + " a palindrome");

        System.out.println("sumFirstAndLastDigit(252) " + sumFirstAndLastDigit(252));
        System.out.println("sumFirstAndLastDigit(257) " + sumFirstAndLastDigit(257));
        System.out.println("sumFirstAndLastDigit(0) " + sumFirstAndLastDigit(0));
        System.out.println("sumFirstAndLastDigit(5) " + sumFirstAndLastDigit(5));
        System.out.println("sumFirstAndLastDigit(-1) " + sumFirstAndLastDigit(-1));

        System.out.println("getEvenDigitSum(123456789) " + getEvenDigitSum(123456789));
        System.out.println("getEvenDigitSum(252) " + getEvenDigitSum(252));
        System.out.println("getEvenDigitSum(-1) " + getEvenDigitSum(-1));
        System.out.println("getEvenDigitSum(1234) " + getEvenDigitSum(1234));
        System.out.println("getEvenDigitSum(12345) " + getEvenDigitSum(12345));

        //A class can be described as: a custom data type. a special code block that contains methods.
        //A class is like an empty form. It describes information or placeholders for data that'll be filled in, when that form is given to a unique individual.
        //A class defines the blueprint (like a form).
        //An object is a filled-out copy of that form — with its own values.
        //The empty form, the class is the template for the data to be collected.
        //The populated form, the object may be completely different each time because of the values used to fill in the data.
        //An object is called an instance of a particular class.
        //We can use the term object or instance interchangeably.

        //The most common way to  create an object is to use the new keyword.
        //The new keyword creates an instance of a class, and you can optionally pass data when creating that instance to set up data on that object.

        String s = "hello";
        String m = new String("hello");

        System.out.println(s.toUpperCase());

        //When you create an object, Java stores it in memory.
        //You don’t deal with the object directly — you use a reference variable that points to the memory location of that object.
        //"Hello" is a String object created in memory.
        //The reference variable s holds the address (reference) of where the String object is stored.
        //Now you can use s to access or manipulate that object.

        //In Java, a class defines a new data type — one that you create yourself.
        //Just like int, double, or boolean are data types, you can create your own custom data type using a class.
        //for example
        class Person {
            String name;
            int age;
        }
        //Here, Person becomes a custom data type, just like int.
        //You can now declare variables of type Person:
        Person p1; // p1 is a variable of type Person
        //Inside a class, you can define variables that describe the properties of an object. These are called:
        //Fields
        //Attributes
        //Instance variables (technical term)

        //In Java, there are two types of fields you can define in a class:
        //1. Instance Fields (without the static keyword)
        //2. Static Fields (with the static keyword)

        //1. Instance Fields (Non-static)
        //These belong to each object of the class.
        //Every object has its own copy of these fields.
        //Created without the static keyword.
        class Dog {
            String name;  // instance field
            int age;      // instance field
        }
        Dog d1 = new Dog();
        d1.name = "Buddy";
        d1.age = 5;

        Dog d2 = new Dog();
        d2.name = "Rocky";
        d2.age = 3;
        //d1 and d2 are different dogs, and each has its own name and age.
        //Until the class is instantiated and an object created, the instance field has no place in memory.

        //2. Static Fields
        //These belong to the class itself, not to any specific object.
        //There is only one copy shared across all objects.
        //Declared using the static keyword.
        class Dog1 {
            static String species = "Canine";  // static field
        }
        System.out.println(Dog1.species); // Canine
        //You don’t need to create an object to access a static field — you use the class name.
        //In our form analogy, this would be a field that is pre-populated on the form
        //and would not change for any of the copied forms.
        //Integer.MAX_VALUE static field

        //Field Type        Keyword     Belongs To      Accessed With       Copies
        //Instance Field    (none)      Each object     object.fieldName    One per object
        //Static Field      static      Class (shared)  ClassName.fieldName One total

        //static methods and instance methods in Java — they follow the same idea as static vs. instance fields.
        //Method Type       Keyword         Belongs To
        //Static Method     static          Class
        //Instance Method   (no keyword)    Each Object

        //1. Instance Methods (Non-static)
        //Belong to an object of the class.
        //Can access instance fields and other instance methods.
        //You need to create an object to call them.
        class Car {
            String color; // instance field

            void displayColor() { // instance method
                System.out.println("Color: " + color);
            }
        }
        Car car1 = new Car();
        car1.color = "Red";
        car1.displayColor(); // prints: Color: Red
        //displayColor() works on car1, and it uses that object’s color.

        //2. Static Methods
        //Belong to the class itself.
        //Can be called without creating an object.
        //Cannot directly access instance fields or instance methods.
        class MathUtils {
            static int square(int x) {
                return x * x;
            }
        }
        int result = MathUtils.square(5); // 25
        //You don’t need to create a MathUtils object. You just call the method using the class name.

        class Hello {
            String message = "Hi"; // instance field

            static void greet() {  // static method
                System.out.println("Hello from static method");
                // System.out.println(message); ❌ Can't access instance field
            }

            void showMessage() {   // instance method
                System.out.println(message); // ✅ Can access instance field
            }
        }

        //When we read data in from either a file or from user input, it's common for the data
        //to be initially stored as a String, which we'll need to convert to a numeric value.

//        String currentYear = "2025";
        int currentYear = 2025;
        String userDateOfBirth = "1986";

//        System.out.println("Age = " + (currentYear - userDateOfBirth)); //Operator '-' cannot be applied to 'java. lang. String', 'java. lang. String'
        System.out.println("Age = " + (currentYear + userDateOfBirth)); //ths compiles, but concatenates 2 strings as Age = 20251986
        //Since String to Int is so common, Java provides  ways to parse a string into a number.
        // This is done using the wrapper classes we've seen before. Integer.parseInt(String)
        int userDateOfBirthInt = Integer.parseInt(userDateOfBirth);
        System.out.println("Age = " + (currentYear - userDateOfBirthInt));

        String userAgeWithPartialYear = "22.5";
        double userAgeWithPartialYearInt = Double.parseDouble(userAgeWithPartialYear);
        System.out.println("The user says he is " + userAgeWithPartialYearInt);

        //When reading data from the console, we have some different options.
        //Feature           System.in       System.console()        Command-line Args   Scanner
        //Input Type        Byte stream     High-level text         Startup only        High-level input
        //Works in IDE?     ✅ Yes          ❌ No (often null)      ✅ Yes             ✅ Yes
        //Requires wrapping ✅ Yes          ❌ No                   ❌ No              ❌ No
        //Read interactively✅ Yes          ✅ Yes                  ❌ No              ✅ Yes
        //Reads password?   ❌ No           ✅ Yes (hidden)         ❌ No              ❌ No
        //Easy to use       ❌ No           ✅ Medium               ✅ Easy            ✅✅✅ Easiest

//        System.out.println(getInputFromConsole(currentYear));
        // java src/main/java/Section6.java

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

        //Normally, System.console() would return an object that is a wrapper to System.in, but now, I get this exception
        //An exception is an error that happens in code. Some types of errors can be predicted and named.
        //NullPointerException is an example of a named Java exception:

        //An exception is caught first by creating a code block around the code that gets the error.
        //This is done with the try statement code block.
        try {
            //statements that might get errors
        } catch (Exception e) {//The declaration includes the type of the exception and a variable name.
            //code to handle the exception
        }

//        System.out.println("sumOfFiveIntegerDigits started");
//        sumOfFiveIntegerDigits();
//        System.out.println("sumOfFiveDoubleDigits started");
//        sumOfFiveDoubleDigits();
//        System.out.println("minMaxChallenge started");
//        minMaxChallenge();
//        System.out.println("inputThenPrintSumAndAverage started");
//        inputThenPrintSumAndAverage();
        System.out.println("getBucketCount started");
        int bucketsNeeded = getBucketCount(2.75, 3.25, 2.5, 1);
        System.out.println(bucketsNeeded);

    }


    //Prior to the enhanced statement, if you wanted
    //the switch statement to return a value, you wrapped it in a method that returned the value.
    public static String calculateQuarter_traditional(String month) {
        switch (month) {
            case "JAN":
            case "FEB":
            case "MAR":
                return "1st";//I'm not using a break,  but instead I'm using a return statement. This works like a break since the
            //code will exit out of both the switch statement and the method at this point. There's no chance to fall through
            case "APR":
            case "MAY":
            case "JUN":
                return "2nd";
            case "JUL":
            case "AUG":
            case "SEP":
                return "3rd";
            case "OCT":
            case "NOV":
            case "DEC":
                return "4th";
        }
        return "bad";
    }

    public static String calculateQuarter(String month) {
        return switch (month) {//Notice that this code has the return keyword before the switch keyword.
            case "JAN", "FEB", "MAR" -> "1st";
            case "APR", "MAY", "JUN" -> {
                String quarterName = "2nd";
                yield quarterName;//in a code block, yield keyword is needed to return the value
            }
            case "JUL", "AUG", "SEP" -> {
                yield "3rd";
            }
            case "OCT", "NOV", "DEC" -> "4th";
            default -> "bad"; // a default label is required under most conditions (except for enum)
        };
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println("day " + day + " stands for " + dayOfWeek);
    }

    public static void printDayOfWeekWithIF(int day) {
        String dayOfWeek = "Invalid day";
        if (day == 0) {
            dayOfWeek = "Sunday";
        } else if (day == 1) {
            dayOfWeek = "Monday";
        } else if (day == 2) {
            dayOfWeek = "Tuesday";
        } else if (day == 3) {
            dayOfWeek = "Wednesday";
        } else if (day == 4) {
            dayOfWeek = "Thursday";
        } else if (day == 5) {
            dayOfWeek = "Friday";
        } else if (day == 6) {
            dayOfWeek = "Saturday";
        }
        System.out.println("day " + day + " stands for " + dayOfWeek);
    }

    public static void printNumberInWord(int number) {
        String numberInReadable;
        switch (number) {
            case 0 -> numberInReadable = "ZERO";
            case 1 -> numberInReadable = "ONE";
            case 2 -> numberInReadable = "TWO";
            case 3 -> numberInReadable = "THREE";
            case 4 -> numberInReadable = "FOUR";
            case 5 -> numberInReadable = "FIVE";
            case 6 -> numberInReadable = "SIX";
            case 7 -> numberInReadable = "SEVEN";
            case 8 -> numberInReadable = "EIGHT";
            case 9 -> numberInReadable = "NINE";
            default -> numberInReadable = "OTHER";
        }
        System.out.println(numberInReadable);
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year >= 9999) {
            return false;
        } else return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

//        if (isLeapYear(year) && month == 2) {
//            month = 21;
//        } else if ( month == 2) {
//            month = 22;
//        }

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
//            case 21 -> 29;
//            case 22 -> 28;
            default -> -1;
        };
    }

    public static double calculateInterest(double amount, double rate) {
        return amount * (rate / 100);
    }

    public static boolean isPrime(int number) {
        if (number <= 2) {
            return (number == 2);
        }
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOdd(int number) {
        return number <= 0 ? false : ((number % 2) != 0 ? true : false);
    }

    public static int sumOdd(int start, int end) {
        if (end < start || (end <= 0 || start < 0)) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static int sumDigits(int number) {
        int sum = 0;
//        if (number < 0) {
//            return -1;
//        }
//        while(number > 0) {
//            sum = sum + number % 10;
//            number /= 10;
//        }
//        return sum;
        do {
            if (number < 0) {
                return -1;
            }
            sum += number % 10;
            number /= 10;
        } while (number > 0);
        return sum;
    }

    public static boolean isPalindrome(int number) {
        int newNumber = 0;
        int original = number;

        while (number != 0) {
            newNumber = newNumber * 10 + number % 10;
//            System.out.println(newNumber);
            number /= 10;
        }
        return original == newNumber;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        while (number >= 10) {
            number /= 10;  // divide with 10 until there is 1 digit left (< 10) to get first digit.  This is also equivalent to number = number / 10.
        }
        int firstDigit = number;
//        int reverseNumber = 0;
//        while (number != 0) {
//            reverseNumber = reverseNumber * 10 + number % 10;
//            number /= 10;
//        }
//        int firstDigit = reverseNumber % 10;
        return firstDigit + lastDigit;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
//        for (int i = number; i > 0; i /= 10) {
//            int lastDigit = i % 10;
//            if (lastDigit % 2 == 0) {
//                sum += lastDigit;
//            }
//        }
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 <= 9 || number1 > 99) || (number2 <= 9 || number2 > 99)) {
            return false;
        }
//        int firstLeftDigit = number1 / 10;
//        int firstRightDigit = number1 % 10;
//        int secondLeftDigit = number2 / 10;
//        int secondRightDigit = number2 % 10;
//
//        boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;
//        boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit == secondRightDigit;
//
//        return firstShared || secondShared;
        return number1 % 10 == number2 % 10 || number1 % 10 == number2 / 10 || number2 % 10 == number1 / 10 || number1 / 10 == number2 / 10;
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi. what is your name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course");

        String dateOfBirth = System.console().readLine("What year were you born ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
//        String name = System.console().readLine("Hi. what is your name? ");
        System.out.println("Hi. what is your name? ");
        //The Scanner class is described as a simple text scanner, which can parse primitive types and strings
        //To use the Scanner class, we have to create an instance of Scanner.
        //This means we're creating an object of type Scanner. We'll use the keyword, new, to do it.
        //We can optionally pass arguments in those parentheses, as we saw with methods.
        //ClassName variableName = new ClassName();
        //ClassName variableName = new ClassName(argument1, argument2);
        //System.out dumps text to the console.
        //System.in, on the other hand, is the opposite.
        //It allows you to type input into the console, which then gets returned back to the program.
        Scanner scanner = new Scanner(System.in);
        //For reading input from a file, but pass a File object, as an argument, in the parentheses.
        //File is another class provided by Java, for reading and writing files.
//        Scanner scanner1 = new Scanner(new File("path_to_file"));


        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course");

//        String dateOfBirth = System.console().readLine("What year were you born ");
        String dateOfBirth;
        int dateOfBirthInt = 0;

        System.out.println("What year were you born ");
        do {
            System.out.println("Enter a year of birth>= " + (currentYear - 125) + " and <= " + currentYear);
            dateOfBirth = scanner.nextLine();
            try {
                dateOfBirthInt = Integer.parseInt(dateOfBirth);
            } catch (NumberFormatException badUserData) {//the reason you create a variable in the parentheses of the
                // catch phrase is if you wanted to access information about the exception
                System.out.println("Characters not allowed!! Try again");
            }
        } while (!checkYear(dateOfBirthInt, currentYear));
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static boolean checkYear(int dateOfBirth, int currentYear) {
        return (dateOfBirth <= currentYear) && (dateOfBirth >= currentYear - 125);
    }

    public static void sumOfFiveIntegerDigits() {
        Scanner scanner = new Scanner(System.in);
        int sumDigits = 0;
        int userInputCounter = 1;
        do {
            System.out.println("Enter integer number #" + userInputCounter);
            String value = scanner.nextLine();
            try {
                sumDigits = sumDigits + Integer.parseInt(value);
                userInputCounter++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }

        } while (userInputCounter <= 5);
        System.out.println("Sum of 5 user input integer numbers " + sumDigits);
    }

    public static void sumOfFiveDoubleDigits() {
        Scanner scanner = new Scanner(System.in);
        double sumDigits = 0;
        int userInputCounter = 1;
        do {
            System.out.println("Enter double number #" + userInputCounter);
            String value = scanner.nextLine();
            try {
                sumDigits = sumDigits + Double.parseDouble(value);
                userInputCounter++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }

        } while (userInputCounter <= 5);
        System.out.println("Sum of 5 user input double numbers " + sumDigits);
    }

    public static void minMaxChallenge() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int minNum = 0;
        int maxNum = 0;
        do {
            System.out.println("enter a number, or any character to exit");
            String value = scanner.nextLine();
            int valueInInteger;
            try {
                valueInInteger = Integer.parseInt(value);
                if (counter == 0 || valueInInteger < minNum) {
                    minNum = valueInInteger;
                }
                if (counter == 0 || valueInInteger > maxNum) {
                    maxNum = valueInInteger;
                }
                counter++;
            } catch (NumberFormatException e) {
                break;
            }
        } while (true);
        if (counter > 0) {
            System.out.println("Min number is " + minNum);
            System.out.println("Max number is " + maxNum);
        } else {
            System.out.println("No data entered");
        }
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int counter = 1;
        int valueInt;
        do {
            try {
                System.out.println("enter a number, or any character to exit");
                String value = scanner.nextLine();
                valueInt = Integer.parseInt(value);
                sum = sum + valueInt;
                if (counter == 1) {
                    average = sum;
                } else {
                    average = sum / counter;
                }

            } catch (NumberFormatException e) {
                break;
            }

            counter++;
        } while (true);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = (width * height);
        double numberOfBuckets = Math.ceil(area / areaPerBucket);
        int numberOfBucketsInt = (int) numberOfBuckets;
        return numberOfBucketsInt - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }


}

