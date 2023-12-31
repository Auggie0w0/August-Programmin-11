public class StringTests {
    public static String[] problemOne = {"ysqundfruogaxcruaqhieie",
            "wurexc",
            "wiaytixcaigoiaernsi",
            "wdcyxcczoizfaieuoihi",
            "vsiwmbuuoeuizfd",
            "uzdexwiwy",
            "urjuuodceroyaeau",
            "toalhzemaepvidbufioleny",
            "oxfjxup",
            "oitolqwxdmpevzjexfmbise",
            "nlotjiodzrnzbr",
            "njwaaowewlisqmducwwwy",
            "lzxyryxmllshpkt",
            "lluaegmldkhemurk",
            "jifwagsigiokeool",
            "iueuaondjmhoiuxj",
            "ifbzmfmcnubeuidyjltyf",
            "foipguewboiahsem",
            "byxqkwjrqagtfdeqe",
            "aakreisoph",};
    public static int[] problemOneExpected = {10,
            2,
            10,
            9,
            7,
            3,
            10,
            10,
            2,
            7,
            3,
            6,
            0,
            5,
            8,
            9,
            5,
            8,
            3,
            5,
    };
    public static String[] problemTwo = {"ybovtobboboobcboobbobbbob",
            "xoboobobbobmmbobbb",
            "wpoabobbobobobobbbobbboobbkbobobbooboboobobsbobob",
            "obooobobobobolsyog",
            "obooobbobobtobobv",
            "oboboboobobofbnfbobbobbboobpcbobbobob",
            "geibobobbobb",
            "ebobbyobbbkbo",
            "cbobobobjlboobriobf",
            "cbobbdboobobn",
            "boobwbobobobbobbdbobpbvbobobobooboobbobb",
            "boobubovocobbobbojwox",
            "bobobobobobobobobobobobobobob",
            "bobbzobobooboboboobobobbobboboou",
            "bobbobobolbooboboboyzbk",
            "bicyfybobbkobrbobbbobobkbobbbobbbobbp",
            "bbobbooboojboobobbobobobbeto",
            "bbaboobobobbcboob",
            "aurjaoxjax",
            "aoboboboboobobbboboo",};
    public static int[] problemTwoExpected = {3,
            3,
            12,
            3,
            3,
            8,
            3,
            1,
            3,
            2,
            9,
            1,
            14,
            8,
            5,
            7,
            5,
            2,
            0,
            5,
    };
    public static String[] problemThree = {"ixysuoizvwwebyyhp",
            "zyxwvutsrqponmlkjihgfedcba",
            "ztapvefsnx",
            "zhmqbbea",
            "yqpnlilestyiwmmqsqpv",
            "usfuitmwigom",
            "unazbnhjzmjdihl",
            "tunivklq",
            "smpmqblmgaanxmlcvhw",
            "sgsndcjsptchiid",
            "pflvvhfqcmgjhgtrwmitab",
            "pagqqbqnufckbjtauacldroe",
            "opgrtupprfwbxsmwonswv",
            "nkdaqlfvkprute",
            "nhnwhowgjhhkj",
            "ncafxxrullo",
            "matnjjjh",
            "hrgtrpbwtxefzur",
            "dmegjmydadjwsdhckjjrydwj",
            "abcdefghijklmnopqrstuvwxyz"};
    public static String[] problemThreeExpected = {"ixy",
            "z",
            "apv",
            "hmq",
            "esty",
            "fu",
            "hjz",
            "klq",
            "aanx",
            "chii",
            "flvv",
            "agqq",
            "grtu",
            "kpru",
            "hnw",
            "afxx",
            "jjj",
            "efz",
            "egjmy",
            "abcdefghijklmnopqrstuvwxyz",

    };

    // If I wanted to do it here (which I much prefer TT-TT So the scanner is not commented when I hand it in)
    // TO TEST PROBLEM ONE ------------------
        public static void testProblemOne() {
            System.out.println ( "PROBLEM ONE\n" );

            for (int i = 0; i < problemOne.length; i++) { // the for loop will run through every single tester in this .java for question one
                int result = Main.problemOne(problemOne[i]); // the int's result to be compared to the result will refer back to the method of problemone in Main.java and run each of the testers here
                boolean passed = result == problemOneExpected[i]; // by using boolean, the results, which in this case is int (as if number of vowels), can be deducted as true or false by matching the expected results or not by assigning the boolean variable as passed
                // i+1 because i starts at 0 (to list which tester), the boolean variable true = passed, false = failed (result = condition ? valueIfTrue : valueIfFalse;)
                System.out.println("Test Case " + (i + 1) + " : " + (passed ? "Passed" : "Failed"));
            }

            System.out.println ( "---------------------------------- \n" );
        }

    // TO TEST PROBLEM TWO ------------------
        public static void testProblemTwo() {
            System.out.println ( "PROBLEM TWO\n" );

            // same explanations as above
            for (int i = 0; i < problemTwo.length; i++) {
                int result = Main.problemTwo(problemTwo[i]);
                boolean passed = result == problemTwoExpected[i];
                System.out.println("Test Case " + (i + 1) + " : " + (passed ? "Passed" : "Failed"));
            }

            System.out.println ( "---------------------------------- \n" );
        }

    // TO TEST PROBLEM THREE ------------------
        public static void testProblemThree() {
            System.out.println ( "PROBLEM THREE\n" );

            // same explanation as above except the result is a String instead of int
            // fix: the result can no longer == (as int), .equal statement have to be used in this case
            for (int i = 0; i < problemThree.length; i++) {
                String result = Main.problemThree(problemThree[i]);
                boolean passed = result.equalsIgnoreCase (problemThreeExpected[i]);
                System.out.println("Test Case " + (i + 1) + " : " + (passed ? "Passed" : "Failed"));
            }

            System.out.println ( "---------------------------------- \n" );
        }

        // TO CALL UPON THE MAIN.JAVA :)
        public static void main(String[] args) {
            testProblemOne();
            testProblemTwo();
            testProblemThree();
        }
}
