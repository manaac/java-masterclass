public class Section3 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

//        A class is a building block for object-oriented programming and allows us to build custom data types.

//        What is a statement? It's a complete command to be executed. It can include one or more expressions.

//        text specified in double quotes, is called a string literal

//        A keyword is any one of a number of reserved words that have a predefined meaning in the Java language

//        variables are a way to store information in your computer.  Variables that we define in a program, can be accessed by a name we give them,
//        and the computer does the hard work of figuring out where they get stored in the computers random access memory, or ram.
//        A variable, as the name suggests, can be changed, in other words, its contents are variable.
//        So what we have to do is tell the computer what type of information we want to store in the variable, and then give the variable a name.

//        A declaration statement is used to define a variable by indicating the data type and the name, then optionally to set the variable to a value

//        what is an expression? An expression is a coding construct that evaluates to a single value.
//        the expression is the code segment that is on the right side of the equals sign in an assignment or declaration statement.
//        This code can be a simple literal value, like the number 5, or it can be a complex mathematical equation using multiple literal values and mathematical operators.

//      Primitive data types (8 of them) are the most basic data types — they’re not objects, and they hold simple, raw values directly in memory.
//      Wrapper classes are object representations of the primitive data types
//      A wrapper class provides simple operations, as well as some basic information about the primitive data type, which cannot be stored on the primitive itself.
//      below 4 are used to store whole numbers, numbers without a fractional or decimal component,
//      “decimal” refers to base-10 — the number system that uses digits 0 through 9 and a decimal point (.) to separate the whole and fractional parts.
//      both 5 and 3.14 are decimal number
        System.out.println("DataType " + Byte.TYPE + " range is from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + " and its size is " + Byte.SIZE + " bits");
        System.out.println("DataType " + Short.TYPE + " range is from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE + " and its size is " + Short.SIZE + " bits");
        //Java assumes integer literals are of type int by default
        System.out.println("DataType " + Integer.TYPE + " range is from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + " and its size is " + Integer.SIZE + " bits");
        System.out.println("DataType " + Long.TYPE + " range is from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE + " and its size is " + Long.SIZE + " bits");

//      Below 2 situations are also known as integer wraparounds.
//      The maximum value, when it overflows, wraps around to the minimum value and just continues processing without an error.
//      The minimum value, when it underflows, wraps around to the maximum value and continues processing.
//      Overflow happens when a value exceeds the maximum limit that an integer type can hold.
        int myIntValue = Integer.MAX_VALUE + 1;
        System.out.println("overflow integer value is " + myIntValue);

        //Underflow happens when a value goes below the minimum limit of the integer.
        myIntValue = Integer.MIN_VALUE - 1;
        System.out.println("underflow integer value is " + myIntValue);

//      The Java compiler doesn't attempt to evaluate the expression to determine its value, so it does not give you an error.
//      If you assign a numeric literal value to a data type that is outside of the range, the compiler does give you an error.
        //myIntValue=2147483648;
        //System.out.println("myIntValue is"+ myIntValue);

        //You can put the underscore anywhere you might want a comma
        myIntValue = 2_147_483_647;
        System.out.println("myIntValue is " + myIntValue);

        long myLongValue = 2_147_483_647;
        System.out.println("myLongValue is " + myLongValue);

        //Java assumes integer literals are of type int by default
        //myLongValue = 2_147_483_648;
        //short myShortValue = 32_768;

        //A numeric literal that exceeds integer max value must use the L suffix.
        myLongValue = 2_147_483_648L;
        System.out.println("myLongValue is " + myLongValue);

        //to declare and initialize the variables on the same line
        byte myByteMinValue = Byte.MIN_VALUE, myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("myByteMinValue is " + myByteMinValue + " and myByteMaxValue is " + myByteMaxValue);
        short myShortMinValue = Short.MIN_VALUE;
        int myIntMaxValue = Integer.MAX_VALUE;
        System.out.println("myShortMinValue is " + myShortMinValue + " and myIntMaxValue is " + myIntMaxValue);
        //short myShortMinValue1 = Short.MIN_VALUE, int myIntMaxValue1 = Integer.MAX_VALUE;

//      below 2 are Constant Expression and hence will compile, the third is using an variable (myByteMinValue).
//      the compiler doesn’t assume or evaluate it at compile time. It promotes it to int, and the result is int
//      If your calculation uses literal values, Java can figure out the end result at compile time.
        byte myNewByteValue = Byte.MIN_VALUE / 2;
        System.out.println("myNewByteValue is " + myNewByteValue);
        myNewByteValue = -128 / 2;
        System.out.println("myNewByteValue is " + myNewByteValue);
//      myNewByteValue = -1281/2;
//      The Java compiler does not attempt to evaluate the value in a variable when it's used in a calculation, so it doesn't know if the value fits and throws an error.
//      Java can make assumptions about literal values that it can't make about expressions with variables
//      myNewByteValue = myByteMinValue/2;

        //Casting means to treat or convert a number, from one data type to another
        myNewByteValue = (byte) (myByteMinValue / 2);
        System.out.println("myNewByteValue is " + myNewByteValue);

        //Floating-point numbers are also known as real numbers.
        //There are two primitive types in Java for expressing floating-point numbers, the float and the double
        //The double is Java's default type for any decimal or real number
        //Java uses double by default because most floating-point calculations need higher precision
        System.out.println("DataType " + Float.TYPE + " range is from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE + " and its size is " + Float.SIZE + " bits");
        System.out.println("DataType " + Double.TYPE + " range is from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE + " and its size is " + Double.SIZE + " bits");

//      you can see that Java doesn't like trying to put a double into a float variable type.
//      In this case, the literal value that we've typed in, 5.25, is being interpreted as a double
        //float myFloatValue = 5.25;
        float myFloatValue = (float) 5.25;
        System.out.println("myFloatValue is " + myFloatValue);
        myFloatValue = 5.25f;
        System.out.println("myFloatValue is " + myFloatValue);

        //because doubles are the default in Java, the suffix d or D is optional to use
        double myDoubleValue = 5.25;
        System.out.println("myDoubleValue is " + myDoubleValue);

        //To be more precise with calculations, like division, you'd want to use a floating-point number
        myIntValue = 5 / 3;
        System.out.println("myIntValue is " + myIntValue);
        //for float, the number is printed with 7 decimal places in the output.
        myFloatValue = 5f / 3f;
        System.out.println("myFloatValue is " + myFloatValue);
        myFloatValue = 3.123456789101112131415161718f;
        System.out.println("myFloatValue is " + myFloatValue);
        //For a double, the number is printed with 16 decimal places in the output. and it is clear that a double will more accurately represent numbers like these.
        myDoubleValue = 5d / 3d;
        System.out.println("myDoubleValue is " + myDoubleValue);
        myDoubleValue = 3.123456789101112131415161718d;
        System.out.println("myDoubleValue is " + myDoubleValue);
        //We don't need the 'D' suffix, remembering that Java will automatically look at a decimal number and assume it's a double.
        myDoubleValue = 5.0 / 3.0;
        System.out.println("myDoubleValue is " + myDoubleValue);
        //note that the operand is what is to the left, or the right of the divided by sign
        //As long as one of the operands is a double, your result will be a double.
        myDoubleValue = 5.0 / 3;
        System.out.println("myDoubleValue is " + myDoubleValue);
        //java: incompatible types: possible lossy conversion from double to float
        //myFloatValue=5.0/3f;
        myFloatValue = 5 / 3f;
        System.out.println("myFloatValue is " + myFloatValue);

        double myWeightInPound = 200d;
        double myWeightInKilo = myWeightInPound * 0.45359237d;
        System.out.println("myWeightInKilo is " + myWeightInKilo);

        double anotherNumber = 3_000_123.45_678_90d;
        System.out.println("anotherNumber is " + anotherNumber);

        //In general, float and double are great for general floating-point operations.
        //But neither should be used when absolutely precise calculations are required.
        //This is due to a limitation with how floating-point numbers are stored and not a Java problem, as such.
        //Java has a class called BigDecimal that overcomes this.
        //I mentioned earlier in the course that a class is a kind of a custom data type and Java comes with a whole library of helpful classes.

        //f you're going to be using a char, you can literally only store a single character in a single char variable.
        char myChar = 'D';
        System.out.println("myChar is " + myChar);
        //java: unclosed character literal
        //myChar = 'AA';
        //A char occupies two bytes of memory, or 16 bits.
        //The reason it's not just a single byte is that a char is stored as a 2 byte number, similar to the short.
        //This number gets mapped to a single character by Java.
        //When you print a char, you will see the mapped character, and not the representative number.
        System.out.println("DataType " + Character.TYPE + " range is from " + Character.MIN_VALUE + " to " + Character.MAX_VALUE + " and its size is " + Character.SIZE + " bits");
        //In some instances, characters aren't represented on the keyboard,
        //or you may have reasons to use special characters in other languages.
        //To do this, Java supports a unicode value for characters, which you can use to set a char value.
        //Unicode is an international encoding standard for use with different languages and scripts
        //by which each letter, digit, or symbol is assigned a unique numeric value that
        //applies across different platforms and programs
        //https://symbl.cc/
        myChar = '\uFFFF';
        System.out.println("myChar is " + myChar);
        myChar = '\u0044';
        System.out.println("myChar is " + myChar);
        //you can assign a numeric literal to a char variable
        myChar = 68;
        System.out.println("myChar is " + myChar);
//      There are three ways to assign a value to a char. Each of these methods represents storing the letter capital D in memory.
//      So we've seen that we can assign the actual character D in single quotes,
//      we can assign a unicode value using the unicode notation,
//      and we can even assign an integer value as we've shown
        System.out.println('A' + 'B');
        System.out.println('A');
        System.out.println("sdfsfsfsa" + 'A');

        //In Java terms, we've got a boolean primitive type, and it can be set to two values only. Either true or false
        System.out.println("DataType " + Boolean.TYPE + " its values are " + Boolean.TRUE + " and " + Boolean.FALSE);
        boolean myBooleanTrueValue = true;
        System.out.println("myBooleanTrueValue is " + myBooleanTrueValue);
        boolean myBooleanFalseValue = false;
        System.out.println("myBooleanFalseValue is " + myBooleanFalseValue);
//      boolean myBooleanValue = xxxx;
//      boolean myBooleanValue = "xxxx";
//      Developers will often use the word, is/has, as a prefix for a boolean variable name. This creates a name that seems to ask a question

//        the string is a data type in Java which is not a primitive type and it's actually a class but it enjoys a bit of favoritism in Java to make it easier
//        to use than a regular class
//        a string is a class that contains a sequence of characters if you recall in the case of the Char primitive type
//        it can contain only a single character either a regular character or a Unicode character
//        a string on the other hand can contain a whole set of characters in fact a large number of characters
//        it's technically only limited by the amount of memory space or Heap space in your computer which turns out to be the max underscore value of an INT

//        A String can hold up to about Integer.MAX_VALUE (≈ 2,147,483,647) 2.14 billion characters, but in practice it’s much less due to memory limits.

        String myStringValue = "Hello World";
        System.out.println("myStringValue is " + myStringValue);
        myStringValue = myStringValue + " how are you";
        System.out.println("myStringValue is " + myStringValue);
//      you can also use Unicode characters with strings
        System.out.println("i want \u0024100 please");

//      we're using a text data type a string in this case and a string treats the text or digits in the double quotes as text and only text
//        in general when you type something inside double quotes Java by default interprets that to be a string literal
        String numberString = "123.45";
        numberString = numberString + "1.55";
        System.out.println("numberString is " + numberString);

//        however the plus symbol is an operator which can mean addition if used for numbers
//        but it also means concatenation when applied to a string.
//        a string plus anything else gives us a string as a result concatenating anything after the
//        string as text to the initial string so keeping that in mind Java is smart enough here to say
        int numberInt = 123;
        String numberString2 = "45";
        System.out.println("concatenated value is " + (numberInt + numberString2));

        double numberDouble = 123.45;
        numberString2 = numberDouble + numberString2;
        System.out.println("concatenated value is " + numberString2);

//        The String are immutable what does that mean immutable means that you can't change a string
//        after it's created so in the case of the code we've written the value 123.45 is technically not
//        appended to the current contents of numberString2instead a new string is created automatically by
//        Java. the new string consists of the previous value of last string plus a textual representation of
//        the double value 123.45 the net result is that our variable last string has the concatenated
//        value. however Java created a new string in the process and the old one will get discarded from
//        memory automatically now don't worry if that makes no sense at this time it will later in the course

//        Java provides the StringBuilder class in its library to address the inefficiency of the immutable String

//        the string is so intrinsic to the Java language it can be used like a ninth primitive type but it's
//        not a primitive type at all, it's a class. from your point of view you, can treat the string like a ninth
//        primitive type by directly assigning a string literal to it and using the plus operators with it.

//        what are operators? Operators in Java are special symbols that perform specific operations on one, two, or three operands, and then return a result.
//        An operand is a term used to describe any object that is manipulated by an operator.

//        What's an expression? An expression is formed by combining variables, literals, method return values, which we haven't covered yet, a
//        What's an expression? An expression is formed by combining variables, literals, method return values, which we haven't covered yet, a
//        nd operators. They are a way of forming and combining those values to produce a result.

        int result1 = 5;
        int result2 = 5;
        System.out.println(result1 + result2); //addition operator
        char myChar2 = 'A';
        char myChar3 = 'B';
//        You might remember that we said chars are stored as 2 byte numbers in memory.
//        When you use the addition operator with chars, it is these numbers in memory that get added together.
//        The character values don't get concatenated.
//        The decimal values for 'A' and 'B' are 65 and 66, respectively.
        System.out.println(myChar2 + myChar3); //131
        System.out.println("" + myChar2 + myChar3); //AB
        System.out.println(myChar3 / myChar2); //1
//      Because the char is stored as a whole number literal, all the operations are applicable to a char.

        System.out.println(result1 - result2); //subtraction operator
        System.out.println(result1 * result2); //multiplication operator
        System.out.println(result1 / result2); //division operator
        System.out.println(result1 % result2); //modulus or modulo or mod or remainder operator
        System.out.println(5 % 3);

        //post-fix increment operator
        int mm = 1;
        mm++;
        System.out.println("post-fix increment operator is " + mm);
        //compound assignment operator with + sign
        int nn = 1;
        nn += 1;
        System.out.println("compound assignment operator is " + nn);

        //post-fix decrement operator
        int mmm = 1;
        mmm--;
        System.out.println("post-fix increment operator is " + mmm);
        //compound assignment operator with - sign
        int nnn = 1;
        nnn -= 1;
        System.out.println("compound assignment operator is " + nnn);

//      x -= y is really x = (data type of x) (x-y)
//      an implicit cast is done using this operator, so no error occurs, but unexpected result may happen
        mm = 5;
        mm -= 1.5;
        System.out.println(mm); //3

        //java: incompatible types: possible lossy conversion from double to int
//        mm = 5;
//        mm = mm - 1.5;
//        System.out.println(mm);

        {
            double number = 5;
            number -= 1.5;
            System.out.println(number); //3.5
        }

        {
            double number = 5;
            number *= 1.5;
            System.out.println(number); //7.5
        }

        {
            double number = 5;
            number /= 1.5;
            System.out.println(number); //3.3333333333333335
        }


    }
}
