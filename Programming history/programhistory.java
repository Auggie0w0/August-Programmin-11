import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner; // for the interactive input

/* TABLE OF CONTENTS
----------------------------
 words = the search string to see if it is equal to the searchword which is the target words to be searched throughout the array
 word = the target word that is the parameter for the word searching methode
 searchword = gives which word the target word is, and it will go through the process of the targetword method being word
 targetword = is the methode to run through the for loop of all the words in the array
 phrases = is the array
 wordFound = is the new array to make a list of where all the found target words are and how many there are

 ----------------------------*/

public class programhistory {
    public satic

    void(String[] args) {
        Scanner scanner = new Scanner ( System.in ); // to use scanner!

        ArrayList<String> phrases = new ArrayList<> ( );
        // creating the ArrayList of the phrases
        phrases.add ( "Programmable devices have existed at least as far back as 1206 AD, when the automata of Al-Jazari were programmable, via pegs and cams, to play various rhythms and drum patterns;[3] and the 1801 Jacquard loom could produce entirely different weaves by changing the \"program\" - a series of pasteboard cards with holes punched in them.\n" );
        phrases.add ( "However, the first computer program is generally dated to 1843, when mathematician Ada Lovelace published an algorithm to calculate a sequence of Bernoulli numbers, intended to be carried out by Charles Babbage's Analytical Engine.[4]\n" );
        phrases.add ( "Data and instructions were once stored on external punched cards, which were kept in order and arranged in program decks.\n" );
        phrases.add ( "In the 1880s Herman Hollerith invented the concept of storing data in machine-readable form.[5] Later a control panel (plugboard) added to his 1906 Type I Tabulator allowed it to be programmed for different jobs, and by the late 1940s, unit record equipment such as the IBM 602 and IBM 604, were programmed by control panels in a similar way; as were the first electronic computers. However, with the concept of the stored-program computers introduced in 1949, both programs and data were stored and manipulated in the same way in computer memory.\n" );
        phrases.add ( "Machine code was the language of early programs, written in the instruction set of the particular machine, often in binary notation. Assembly languages were soon developed that let the programmer specify instruction in a text format, (e.g., ADD X, TOTAL), with abbreviations for each operation code and meaningful names for specifying addresses. However, because an assembly language is little more than a different notation for a machine language, any two machines with different instruction sets also have different assembly languages.\n" );
        phrases.add ( "Wired control panel for an IBM 402 Accounting Machine.\n" );
        phrases.add ( "High-level languages allow the programmer to write programs in terms that are syntactically richer, and more capable of abstracting the code, making it targetable to varying machine instruction sets via compilation declarations and heuristics. They harness the power of computers to make programming easier[6] by allowing programmers to specify calculations by entering a formula using infix notation (e.g., Y = X*2 + 5*X + 9) for example. FORTRAN, the first widely used high-level language to have a functional implementation which permitted the abstraction of reusable blocks of code, came out in 1957[7] and many other languages were soon developed - in particular, COBOL aimed at commercial data processing, and Lisp for computer research.\n" );
        phrases.add ( "Programs were mostly still entered using punched cards or paper tape. See computer programming in the punch card era. By the late 1960s, data storage devices and computer terminals became inexpensive enough that programs could be created by typing directly into the computers. Text editors were developed that allowed changes and corrections to be made much more easily than with punched cards.\n" );

        //which word you want to search for? Enter bellow kind of thingy
        System.out.print ( "Enter the keyword to search for: " );
        String searchword = scanner.next ( );

        //Number of words found and their index
        ArrayList<Integer> wordFound = targetword ( phrases, searchword );

        if ( wordFound.isEmpty ( ) ) { //the word is not in the array
            System.out.println ( "The word '" + searchword + "' does not exist in the texts of program history" )
        } else { // if it does exist
            int occurrences = wordFound.size ( ); // how many
            System.out.println ( "The word '" + searchword + "' was found " + occurrences + " times!" );

            for ( Integer index : result.getIndices ( ) ) {
                System.out.println ( "Index " + index );
            }
        }
        scanner.close // make sure it's closed
    }

}
    // To set the parameters of this methode: the phrases Array (it is better because of redability and testability to put in the declaration of the satic field and add it as a method in another public satic void) and the word for the target word to search in the texts
    public static ArrayList<Integer> targetword(ArrayList<String> phrases, String word) {
        //search for the words and put them in the new array called indices
        Array<string> indices = new  ArrayList<>();

        //count occurrences and the isndices
        for ( int i = 0; i < phrase.size ( ); i++ ) {
            //the input string for going thru the entire array list
            String words = text.get ( i );

            //check if the word equates to the searched target word
            if ( words.equals ( word ) ) {
                indices.add; // add the equal words to the list for their index
            }
        }
        return indices;
    }
}

//class SearchResult {
//    private ArrayList<Integer> indices;
//    private int occurrences;
//
//    public SearchResult(ArrayList<Integer> indices, int occurrences) {
//        this.indices = indices;
//        this.occurrences = occurrences;
//    }
//
//    public ArrayList<Integer> getIndices() {
//        return indices;
//    }
//
//    public int getOccurrences() {
//        return occurrences;
//    }
//}
