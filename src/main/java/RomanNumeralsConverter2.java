import java.util.Hashtable;

public class RomanNumeralsConverter2 {

    String[] unitsArray = {"I","II","III","IV","V","VI","VII","VIII","IX"};
    Hashtable<Integer, String> tensHash = generateTensHash();
    Hashtable<Integer, String> hundredsHash = generateHundredsHash();

    public String fromArabic(int arabicNumber) {
        String roman = "";

        //start with the high numbers (100s)
        if(arabicNumber >= 100) {
            int tens = (arabicNumber % 100);
            int hundreds = arabicNumber - tens;
            roman += hundredsHash.get(hundreds);
            //remove the 100's
            arabicNumber -= hundreds;
        }

        //start with the next high numbers (10s)
        if(arabicNumber >= 10) {
            int units = (arabicNumber % 10);
            int tens = arabicNumber - units;
            roman += tensHash.get(tens);
            //remove the 10s
            arabicNumber -= tens;
        }

        //should only be left with units
        if(arabicNumber > 0 && arabicNumber < 10) {
            roman += unitsArray[ arabicNumber -1 ];
        }

        return roman;
    }

    private Hashtable<Integer, String> generateTensHash() {
        Hashtable<Integer, String> romanTens = new Hashtable<Integer, String>();
        romanTens.put(10, "X");
        romanTens.put(20, "XX");
        romanTens.put(30, "XXX");
        romanTens.put(40, "XL");
        romanTens.put(50, "L");
        romanTens.put(60, "LX");
        romanTens.put(70, "LXX");
        romanTens.put(80, "LXXX");
        romanTens.put(90, "XC");

        return romanTens;
    }

    private Hashtable<Integer,String> generateHundredsHash() {
        Hashtable<Integer, String> romanHundreds = new Hashtable<Integer, String>();
        romanHundreds.put(100, "C");
        romanHundreds.put(200, "CC");
        romanHundreds.put(300, "CCC");
        romanHundreds.put(400, "CD");
        romanHundreds.put(500, "D");
        romanHundreds.put(600, "DC");
        romanHundreds.put(700, "DCC");
        romanHundreds.put(800, "DCCC");
        romanHundreds.put(900, "CM");

        return romanHundreds;

    }

    // numbers 1 - 3
    //start with return "I"
    // refactor to method below

//    private String generateNumbersLessThan4(int arabicNumber) {
//        return String.format("%0" + arabicNumber + "d", 0).replace("0", "I");
//    }

    //move to switch statement for no's 1 - 10 - above method no longer needed

    //switch getting unwieldy, use array of 1 - 10 (arabic -1 for index)

    // what about arabic >= 10 - create new hashMap for tens
}
