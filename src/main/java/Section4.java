
//An access modifier allows us to define which parts of our code, or even someone else's code,
// can access a particular element. Right now, we're going to be using
//the public access modifier anytime we create a new class in Java, to give full access.
public class Section4 {
//    The class keyword is used to define a class.
//    The class name will be the text following the keyword, so Section4 in this case.
    public static void main(String[] args) {
//        So, what is a method?
//        A method is a collection of statements, one or more, that perform an operation.
//        We'll be using a special method called the main method, that Java looks for when running a program.
//        It's the entry point for any Java code, and Java looks for this main method to start and run the program.
//        You can also create your own methods, as you'll see later.

//        after main, we've got the left and right parentheses, that are needed for a method declaration

//        The if-then statement is the most basic of all the control flow statements.
//        It tells your program to execute a certain section of code only if a particular test evaluates to true. This is known as conditional logic.
        boolean isAlient = true;
//        The equality operator tests to see if two operands are considered equal and returns a boolean value.
        if(isAlient == true) {
            System.out.println("its not alien 1");
            System.out.println("i am scared 1");
        }

        //By putting a semicolon there, we're closing
        //off that line of code, which means the next line is not dependent on
        //it anymore and will execute regardless of whether the expression is true or false.
        if(isAlient == false); {
            System.out.println("its not alien 2");
            System.out.println("i am scared 2");
        }

        //without the code block,
        //only the line immediately following the if-then statement, is executed.
        //All subsequent lines are not considered to be part of the if-then statement.
        if(isAlient == true)
            System.out.println("its not alien 3");
            System.out.println("i am scared 3");

        int topScore = 100;
        if(topScore == 100) {
            System.out.println("you got highest score 1");
        }
        if(topScore > 100) {
            System.out.println("you got highest score 2");
        }
        if(topScore >= 100) {
            System.out.println("you got highest score 3");
        }
        if(topScore < 100) {
            System.out.println("you got highest score 4");
        }
        if(topScore <= 100) {
            System.out.println("you got highest score 5");
        }

        int secondTopScore = 60;
        //the two ampersands put together like this is called the logical and operator.
        //This ensures that both operands to the left and right of the logical and operator, are true.
        //There's also a single ampersand that we can use which is called a bitwise and operator
        //logical and operator, or two ampersands, required both sides, both conditions, to evaluate to true
        if (topScore > secondTopScore && topScore <= 100) {
            System.out.println("greater than secondTopScore AND less than equal to 100");
        }

        //logic or operator
        if (topScore > secondTopScore || topScore <= 101) {
            System.out.println("either or both of the conditions are true");
        }

        //the if statement requires a boolean , but the expression "thirdTopScore equals sixty", returns the value sixty which is an int.
//        int thirdTopScore = 60;
//        if(thirdTopScore = 60){
//            System.out.println("this is error because we are using assignment operator");
//        }

        int thirdTopScore = 60;
        if(thirdTopScore == 60){
            System.out.println("this is correct because we are using equal to operator");
        }

        //it's assigning the value true to "isCar", and then returning the boolean value, true.
        boolean isCar = false;
        if(isCar = true){
            System.out.println("this is not supposed to happen");
        }

        if(isCar == true){
            System.out.println("this block will execute as isCar became true as part of if(isCar = true)");
        }

        if(isCar){
            System.out.println("this block will execute as isCar became true as part of if(isCar = true)");
        }

        if(isCar != false){
            System.out.println("this block will execute");
        }

        //The exclamation mark or "not" operator, is also known as the logical complement operator.
        //It can be used with a boolean variable to test for the opposite value.
        if(!isCar){
            System.out.println("this block will not execute");
        }

        //ternary operator.
        //The ternary operator has three operands. The only operator currently in Java that
        //does have three. Officially, Java calls it the conditional operator.
        //The structure of this operator is: operand1 ? operand2 : operand3
        //What this operator does is test if operand1 is true, and if it is, it will return operand2, otherwise it returns operand3.

        String makeOfCar = "Honda";
        boolean isDomestic = (makeOfCar == "Honda") ? false : true;
        if(isDomestic){
            System.out.println("this block will not execute as isDomestic is false");
        }

        String s = (isDomestic) ? "this car is domestic" : "this car is not domestic";
        System.out.println(s);

        int ageOfClient = 18;
        String ageText = (ageOfClient > 18 ) ? "major" : "minor";
        System.out.println("ageText is " + ageText);

        //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html - Summary of Operators
        //https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html - Java Operator Precedence Table

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d; // if we did not give parenthesis () in addition, multiplication would have performed first and resulting 8020.00
        System.out.println("myValuesTotal is " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder is " + theRemainder);
        boolean variable6 = (theRemainder == 0) ? true : false;
        System.out.println("variable6 is " + variable6);
        if(!variable6){
            System.out.println("got some remainder");
        }








    }
}
