public class Section3 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Primitive data types (8 of them) are the most basic data types — they’re not objects, and they hold simple, raw values directly in memory.
        //Wrapper classes are object representations of the primitive data types
        //below 4 are used to store whole numbers, numbers without a fractional or decimal component,
        System.out.println("DataType "+ Byte.TYPE +" range is from "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE +" and its size is "+Byte.SIZE +" bits");
        System.out.println("DataType "+ Short.TYPE +" range is from "+Short.MIN_VALUE+" to "+Short.MAX_VALUE +" and its size is "+Short.SIZE+" bits");
        //Java assumes integer literals are of type int by default
        System.out.println("DataType "+ Integer.TYPE +" range is from "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE +" and its size is "+Integer.SIZE+" bits");
        System.out.println("DataType "+ Long.TYPE +" range is from "+Long.MIN_VALUE+" to "+Long.MAX_VALUE +" and its size is "+Long.SIZE+" bits");

        //Overflow happens when a value exceeds the maximum limit that an integer type can hold.
        int myIntValue = Integer.MAX_VALUE+1;
        System.out.println("overflow value is "+ myIntValue);

        //Underflow happens when a value goes below the minimum limit of the integer.
        myIntValue = Integer.MIN_VALUE-1;
        System.out.println("underflow value is "+ myIntValue);

        //myIntValue=2147483648;
        //System.out.println("myIntValue is"+ myIntValue);

        //You can put the underscore anywhere you might want a comma
        myIntValue = 2_147_483_647;
        System.out.println("myIntValue is "+ myIntValue);

        long myLongValue = 2_147_483_647;
        System.out.println("myLongValue is "+ myLongValue);

        //Java assumes integer literals are of type int by default
        //myLongValue = 2_147_483_648;
        //short myShortValue = 32_768;

        //A numeric literal that exceeds integer max value must use the L suffix.
        myLongValue = 2_147_483_648L;
        System.out.println("myLongValue is "+ myLongValue);

        //to declare and initialize the variables on the same line
        byte myByteMinValue = Byte.MIN_VALUE, myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("myByteMinValue is "+ myByteMinValue + " and myByteMaxValue is "+ myByteMaxValue);
        short myShortMinValue = Short.MIN_VALUE; int myIntMaxValue = Integer.MAX_VALUE;
        System.out.println("myShortMinValue is "+ myShortMinValue+" and myIntMaxValue is "+ myIntMaxValue);
        //short myShortMinValue1 = Short.MIN_VALUE, int myIntMaxValue1 = Integer.MAX_VALUE;

        //below 2 are Constant Expression and hence will compile, the third is using an variable (myByteMinValue). the compiler doesn’t assume or evaluate it at compile time. It promotes it to int, and the result is int
        //If your calculation uses literal values, Java can figure out the end result at compile time.
        byte myNewByteValue = Byte.MIN_VALUE/2;
        System.out.println("myNewByteValue is "+ myNewByteValue);
        myNewByteValue = -128/2;
        System.out.println("myNewByteValue is "+ myNewByteValue);
        //The Java compiler does not attempt to evaluate the value in a variable when it's used in a calculation
        //Java can make assumptions about literal values that it can't make about expressions with variables
        //myNewByteValue = myByteMinValue/2;

        //Casting means to treat or convert a number, from one type to another
        myNewByteValue = (byte) (myByteMinValue/2);
        System.out.println("myNewByteValue is "+ myNewByteValue);

        //Floating-point numbers are also known as real numbers.
        //There are two primitive types in Java for expressing floating-point numbers, the float and the double
        //The double is Java's default type for any decimal or real number
        //Java uses double by default because most floating-point calculations need higher precision
        System.out.println("DataType "+ Float.TYPE +" range is from "+Float.MIN_VALUE+" to "+Float.MAX_VALUE +" and its size is "+Float.SIZE+" bits");
        System.out.println("DataType "+ Double.TYPE +" range is from "+Double.MIN_VALUE+" to "+Double.MAX_VALUE +" and its size is "+Double.SIZE+" bits");

        //you can see that Java doesn't like trying to put a double into a float variable type. In this case, the literal value that we've typed in, 5.25, is being interpreted as a double
        //float myFloatValue = 5.25;
        float myFloatValue = (float) 5.25;
        System.out.println("myFloatValue is "+ myFloatValue);
        myFloatValue = 5.25f;
        System.out.println("myFloatValue is "+ myFloatValue);

        //because doubles are the default in Java, the suffix d or D is optional to use
        double myDoubleValue = 5.25;
        System.out.println("myDoubleValue is "+ myDoubleValue);

        //To be more precise with calculations, like division, you'd want to use a floating-point number
        myIntValue = 5/3;
        System.out.println("myIntValue is "+ myIntValue);
        //for float, the number is printed with 7 decimal places in the output.
        myFloatValue=5f/3f;
        System.out.println("myFloatValue is "+ myFloatValue);
        myFloatValue=3.123456789101112131415161718f;
        System.out.println("myFloatValue is "+ myFloatValue);
        //For a double, the number is printed with 16 decimal places in the output. and it is clear that a double will more accurately represent numbers like these.
        myDoubleValue=5d/3d;
        System.out.println("myDoubleValue is "+ myDoubleValue);
        myDoubleValue=3.123456789101112131415161718d;
        System.out.println("myDoubleValue is "+ myDoubleValue);
        //We don't need the 'D' suffix, remembering that Java will automatically look at a decimal number and assume it's a double.
        myDoubleValue=5.0/3.0;
        System.out.println("myDoubleValue is "+ myDoubleValue);
        //note that the operand is what is to the left, or the right of the divided by sign
        //As long as one of the operands is a double, your result will be a double.
        myDoubleValue=5.0/3;
        System.out.println("myDoubleValue is "+ myDoubleValue);
        //java: incompatible types: possible lossy conversion from double to float
        //myFloatValue=5.0/3f;
        myFloatValue=5/3f;
        System.out.println("myFloatValue is "+ myFloatValue);

        double myWeightInPound = 200d;
        double myWeightInKilo = myWeightInPound*0.45359237d;
        System.out.println("myWeightInKilo is "+ myWeightInKilo);

        double anotherNumber = 3_000_123.45_678_90d;
        System.out.println("anotherNumber is "+ anotherNumber);

        //In general, float and double are great for general floating-point operations.
        //But neither should be used when absolutely precise calculations are required.
        //This is due to a limitation with how floating-point numbers are stored and not a Java problem, as such.
        //Java has a class called BigDecimal that overcomes this.
        //I mentioned earlier in the course that a class is a kind of a custom data type and Java comes with a whole library of helpful classes.

        //f you're going to be using a char, you can literally only store a single character in a single char variable.
        char myChar = 'D';
        System.out.println("myChar is "+ myChar);
        //java: unclosed character literal
        //myChar = 'AA';
        //A char occupies two bytes of memory, or 16 bits.
        //The reason it's not just a single byte is that a char is stored as a 2 byte number, similar to the short.
        //This number gets mapped to a single character by Java.
        //When you print a char, you will see the mapped character, and not the representative number.
        System.out.println("DataType "+ Character.TYPE +" range is from "+Character.MIN_VALUE+" to "+Character.MAX_VALUE +" and its size is "+Character.SIZE+" bits");
        //In some instances, characters aren't represented on the keyboard,
        //or you may have reasons to use special characters in other languages.
        //To do this, Java supports a unicode value for characters, which you can use to set a char value.
        //Unicode is an international encoding standard for use with different languages and scripts
        //by which each letter, digit, or symbol is assigned a unique numeric value that
        //applies across different platforms and programs
        //https://symbl.cc/
        myChar='\uFFFF';
        System.out.println("myChar is "+ myChar);
        myChar='\u0044';
        System.out.println("myChar is "+ myChar);
        //you can assign a numeric literal to a char variable
        myChar=68;
        System.out.println("myChar is "+ myChar);

        //In Java terms, we've got a boolean primitive type, and it can be set to two values only. Either true or false
        System.out.println("DataType "+ Boolean.TYPE +" its values are "+Boolean.TRUE+" and "+Boolean.FALSE);






    }
}
