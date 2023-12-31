import java.util.Scanner;
public class Main {
// ------------PROBLEM NUMBER ONE------------------------//
    static int problemOne(String s) {

        // set up the number value of how many vowels there will be
        int vowelCount = 0;

        /* FOR LOOP EXPLANATIONS
        1. The For loops runs through the length of s through each character
        2.Run through all the characters using charAT
        3. If any equaled to a/e/i/o/u, +1 to vowelCount */

        for (int i=0; i <s.length (); i++) {
            char c = s.charAt (i); // c becomes the letter at the i position of each loop
            // fix: be sure to use ' instead of " because they're used for single characters (chars)
            if (c =='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount ++;
            }
        }
        return vowelCount;
    }

// ------------PROBLEM NUMBER TWO------------------------//
    static int problemTwo(String s) {
        // set up the number value of how many consecutive bobs there will be
        int bobCount = 0;

        /* FOR LOOP EXPLANATIONS
        1. The For loops runs through the length of s through each character
        2.Run through all the characters by -2 characters each time to make sure ALL are checked
        3. If any 3 consecutive chars are = to bob (good habit to use equalsIgnoreCase for future references) +1 to bobCount*/
        for (int i = 0; i<s.length () -2;i++) {
            if (s.substring ( i,i+3 ).equalsIgnoreCase ( "bob" )) {
                bobCount++;
            }
        }
        return  bobCount;
    }

// ------------PROBLEM NUMBER THREE------------------------//
    static String problemThree(String s) {
        // the generated string for the longest substring
        String longestSubstring = "";
        // to effectively plug the first character at position 0 to run it through and append characters in alphabetical sequence
        String currentSubstring = s.substring ( 0, 1 );

        /* HOW THE FOR LOOP FOR FINDING OUT THE LONGEST ALPHABETICAL SUBSTRING WORKS:
        ----------------------------------------------------------------------------------
        1. The For loops runs through the length of s through each character
        2. The loop will run two strings so that the current character of s can be compared to the previous
        3. the >= can check their alphabetical orders (size in this case if numerically speaking)
        4. If it is in alphabetical order, the string will be 'appended' to the currentSubstring
        5. If the current does not follow the previous, the else function will be deployed
            a) if the current is longer than longest, update the longestSubstring with the value of currentSubstring
            b) the Current Substring will now be reset because the alphabetical order was broken
        6. The loop will now continue all over again until every code is processed
        commentary: very difficult to comprehend and learn at first */

        for ( int i = 1; i < s.length ( ); i++ ) {
            if ( s.charAt ( i ) >= s.charAt ( i - 1 ) ) { // bigger or equal to the letter before
                currentSubstring += s.charAt ( i );
            } else {
                if ( currentSubstring.length ( ) > longestSubstring.length ( ) ) {
                    longestSubstring = currentSubstring;
                }
                currentSubstring = "" + s.charAt ( i ); // add the letter selected
            }
        }
        if ( currentSubstring.length ( ) > longestSubstring.length ( ) ) {
            longestSubstring = currentSubstring;
        }
        /* if the current substring (of alphabetical characters) are longer than longest substring, replace it with current substring
        keep doing that until it is replaced by the LONGEST currentSubstring and LongestSubstring can no longer be replaced */

        return longestSubstring;
    }

    // For scanner :D
    /* public static void main(String[] args) {
        //create a scanner Object:
        Scanner scanner = new Scanner ( System.in );

        // I deleted the preexisting test string because all the tests will be done in the StringTests.java

        System.out.println ( "The computer will help you find: " +
                "\n ------------------------- " +
                "\n 1. Amount of Vowels " +
                "\n 2. Amount of consecutive 'bob' " +
                "\n 3. Longest alphabetical substring " +
                "\n ------------------------- " +
                "\nPlease type your STRING:");
        String sString = scanner.nextLine ();


         System.out.println ( "\n--------------- \n RESULTS \n---------------" );

        //--------- NUMBER ONE ----------- //
        int vowelCount = problemOne (sString);
        System.out.println ("Vowels Found in '" + sString + "':\t" + vowelCount);

        //--------- NUMBER TWO ----------- //
        int bobCount = problemTwo (sString);
        System.out.println ("Times bob appears in '" + sString + "':\t" + bobCount);

        //--------- NUMBER THREE ----------- //
        String longestSubstring = problemThree (sString);
        System.out.println ("Longest letters in alphabetical order in '" + sString + "':\t" + longestSubstring);

    } */

//-------------------------------------------------------------//
// TESTING//
//-------------------------------------------------------------//

    // TO TEST PROBLEM ONE ------------------
    public static void testProblemOne() {
        System.out.println ( "PROBLEM ONE\n" );

        for (int i = 0; i < StringTests.problemOne.length; i++) { // the for loop will run through every single tester in this .java for question one
            int result = problemOne(StringTests.problemOne[i]); // the int's result to be compared to the result will refer back to the method of problemone and run each of the testers from stringtests.java
            boolean passed = result == StringTests.problemOneExpected[i]; // by using boolean, the results, which in this case is int (as if number of vowels), can be deducted as true or false by matching the expected results or not by assigning the boolean variable as passed
            // i+1 because i starts at 0 (to list which tester), the boolean variable true = passed, false = failed (result = condition ? valueIfTrue : valueIfFalse;)
            System.out.println("Test Case " + (i + 1) + " : " + (passed ? "Passed" : "Failed"));
        }

        System.out.println ( "---------------------------------- \n" );
    }

    // TO TEST PROBLEM TWO ------------------
    public static void testProblemTwo() {
        System.out.println ( "PROBLEM TWO\n" );

        // same explanations as above
        for (int i = 0; i < StringTests.problemTwo.length; i++) {
            int result = problemTwo(StringTests.problemTwo[i]);
            boolean passed = result == StringTests.problemTwoExpected[i];
            System.out.println("Test Case " + (i + 1) + " : " + (passed ? "Passed" : "Failed"));
        }

        System.out.println ( "---------------------------------- \n" );
    }

    // TO TEST PROBLEM THREE ------------------
    public static void testProblemThree() {
        System.out.println ( "PROBLEM THREE\n" );

        // same explanation as above except the result is a String instead of int
        // fix: the result can no longer == (as int), .equal statement have to be used in this case
        for (int i = 0; i < StringTests.problemThree.length; i++) {
            String result = problemThree(StringTests.problemThree[i]);
            boolean passed = result.equalsIgnoreCase (StringTests.problemThreeExpected[i]);
            System.out.println("Test Case " + (i + 1) + " : " + (passed ? "Passed" : "Failed"));
        }

        System.out.println ( "---------------------------------- \n" );
    }

    // This will run the tests using the data from StringTests.
    public static void main(String[] args) {
        testProblemOne();
        testProblemTwo();
        testProblemThree();
    }
}