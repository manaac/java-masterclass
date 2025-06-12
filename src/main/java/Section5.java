public class Section5 {
    //this method "main" allows a user to pass a list of values
    //into the code from the command line or terminal. You can see now why the name args is appropriate
    //for this method because it represents command line arguments
    public static void main(String[] args) {

        //https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-3.9 - java has 51 ReservedKeyword (51 character sequences)
        //Java has 16 contextual keywords, which are only keywords in special situations

        //keywords in intellij are highlighter in orange (public, class, static, void) when in dark mode
        //we cannot create a variable name using any of the reserved keywords.
//        int int=5;

        //you can't name a Java identifier as a reserved keyword. An identifier includes variable names,
        //but also class names, method names, and so on.

        //true and false are not keywords, but rather boolean literals
        //null is not a keyword, but rather the null literal

        //Javas Code Units
        //The Expression – An expression computes to a single value.
        //The Statement – Statements are stand alone units of work.
        //And Code Blocks – A code block is a set of zero, one, or more statements, usually grouped
        //together in some way to achieve a single goal.

        //The data type does not form part of an expression, nor does the semi-colon,
        //but everything else on the line typically forms or is part of the expression.
        //The expression component can include variables, values, and operators.

        //A semi-colon is needed to complete a Java line to make it a statement
        int highScore = 30; // highScore = 30 is an expression and the whole line is called statement
        int health = 100;   //health = 100 is an expression and the whole line is called statement
        if ((health > 25) && (highScore > 100)) {//health > 25, highScore >100, (health > 25) && (highScore >100) are 3 expressions
            highScore = highScore - 10; // highScore - 10, highScore = highScore - 10 are 2 expressions
        }

        //Whitespace is any extra spacing, horizontally or vertically, placed around Java source code. It's
        //usually added for human readability purposes. In Java, all these extra spaces are ignored.

        //https://google.github.io/styleguide/javaguide.html - Google Java Style Guide

        //The concept of indenting makes it easier for us to see the logical flow of our code

//        if (condition){
//            // code block will be executed only if condition is true
//        }
//        else {
//            // code block will be executed only if condition is false
//        }

        int score1 = 500;
        if (score1 < 500) {
            System.out.println("your score is lower than 500");
        } else {
            System.out.println("Got here 1");
        }

        //the ELSE block must be last, but is optional
//        if (firstCondition) {
//            // code block will be executed only if firstCondition is true
//        } else if (secondCondition) {
//            // code block will be executed only if firstCondition is false and secondCondition is true
//        }
//        else {
//            // code block will be executed only if all condition above are false
//        }

        //if firstCondition is true, the expression for the "else-if",
        //secondCondition, will not even be evaluated. And as we've already seen,
        //the else block will not be executed too.

        //As soon as it's found something true,
        //it's going to ignore any following "else-if" conditions and the final else, along the way.

        if (score1 < 400 && score1 > 300) {
            System.out.println("your score is lower than 400, but greater than 300");
        } else if (score1 < 400) {
            System.out.println("your score is lower than 400");
        } else {
            System.out.println("Got here 2");
        }

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score 1 is: " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score 2 is: " + finalScore);
        }

        //Methods in Java give us a way to write code once and then reuse that code anywhere in our program.
        //what is method? A method declares executable code that can be invoked, passing a fixed number of values as arguments
        //methods have some benefits:
        //A method is a way of reducing code duplication.
        //A method can be executed many times with potentially different results, by passing
        //data to the method in the form of arguments. Let's look at an example of code duplication.

        //One of the simplest ways to declare a method
        //Because it is using the keyword static, it can be called directly using the class name.
//        public static void methodName(){
//            // method statement form the method body
//        }


        // and the argument will be the value that's passed to the method when we call it
        // technically, a parameter is the definition as shown in the method declaration,

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score 4 is: " + calculateScoreWithReturnType(true, 800, 5, 100));
        System.out.println("Your final score 4 is: " + calculateScoreWithReturnType(true, 10000, 8, 200));

    }

    //        public static void methodName(p1dataType p1, p2dataType p2, {more}){
//            // method statement form the method body
//        }
    //method with no return statement
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score 3 is: " + finalScore);
        }
    }

    //Being able to return a value from a method, lets the calling code have a two-way conversation with the method code.
    //method return type is a declared data type for the data that will be returned from the method
//    public static dataType methodName(p1dataType p1, p2dataType p2, {more}){
//             method statement
//        return value;
//        }
    //So, what's a return statement? Java states that a return statement
    //returns control to the invoker of a method.

    //If a method declares a return type, meaning it's not void, then a return type is required
    //at any exit point from the method block

    //below code will not compile because there is no return statement that cover all the scenarios
//    public static boolean isTooYoung(int age){
//        if(age < 21){
//            return true;
//        }
//    }

    //So in the case of using a return statement in
    //nested code blocks in a method, all possible code segments must result in a value being returned.
    public static boolean isTooYoung1(int age) {
        if (age < 21) {
            return true;
        }
        return false;
    }

    //One common practice is to declare a default return
    //value at the start of a method, and only have a single return statement from a method
    public static boolean isTooYoung2(int age) {
        boolean result = false;
        if (age < 21) {
            result = true;
        }
        return false;
    }

    //The return statement can return with no value from a method
    //which is declared with a void return type.
    //In this case, the return statement is optional,
    //but it may be used to terminate execution of the method at some earlier point than
    //the end of the method block,
    public static void methodDoesSomething(int age) {
        if (age < 21) {
            return;
        }
        //do more stuff
    }

    //You can have multiple methods with the same method name, as long as the method signature (meaning
    //the parameters declared) are different. This will become important later in this
    //section when we cover overloaded methods

    //method with return statement
    public static int calculateScoreWithReturnType(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }

    //Some programming languages will call a method that
    //returns a value, a function, and a method that doesn't return a value, a procedure.

}
