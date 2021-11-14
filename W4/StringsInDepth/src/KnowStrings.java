//ref: W4 String Builder Assignment
//Author Name: Carlos Hernandez
// November 14 2021
// This program samples the different efficiencies of concating through StringBuilder, concatination, and adding ints
package W4.StringsInDepth.src;

public class KnowStrings {
    public static void main(String[] args) throws Exception {
        testStandardIntTest(1000000000000L);
        testStandardString(1000);
        testAdvancedString(10000);
        
        System.out.println("\nThis shows the efficiency and how fast String Builder is compared to regular string concatenation and adding ints."
        + "\nThis shows that String Builder is much faster than normal string concatenation and even trades blows with adding integers in java."
        + "\nIf we want the fastest type of application we want to use String Builder, according to our tests.");
    }

    private static void testStandardIntTest(long repeatCount) {
        long startTime = System.currentTimeMillis();
        long initialValue = 1000;
        long addValue = 10;
        for(long index = 0; index < 10000; index++) {
            initialValue = initialValue + addValue;
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed Time adding numbers = " + elapsedTime + "milliseconds");
    }

    private static void testStandardString (int repeatCount) {
        long startTime = System.currentTimeMillis();
        String initialString = "Hello";
        String addString = "Glad to meet you";

        for(long index = 0; index < 10000; index++) {
            initialString = initialString + addString;
        }

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed Time adding strings = " + elapsedTime + "milliseconds");
    }

    private static void testAdvancedString (int repeatCount) {
        long startTime = System.currentTimeMillis();
        String initialString = "Hello";
        String addString = "Glad to meet you";

        StringBuilder sb = new StringBuilder();
        sb.append(initialString);
        for(int index = 0; index < 10000; index++) {
            sb.append(addString);
        }

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed Time adding strings using String Builder = " + elapsedTime + "milliseconds");
    }
}
