import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsConverter2Should {
    @ParameterizedTest
    @CsvSource(
            {"1,I",
            "2,II,",
            "3,III",
            "4,IV",
            "5,V",
            "6,VI",
            "7,VII",
            "8,VIII",
            "9,IX",
            "10,X",
            "11,XI",
            "12,XII",
            "13,XIII",
            "14,XIV",
            "15,XV",
            "16,XVI",
            "19,XIX",
            "20,XX",
            "23,XXIII",
            "29,XXIX",
            "31,XXXI",
            "39,XXXIX",
            "40,XL",
            "44,XLIV",
            "49,XLIX",
            "50,L",
            "55,LV",
            "78,LXXVIII",
            "81,LXXXI",
            "94,XCIV",
            "101,CI",
            "128,CXXVIII",
            "527,DXXVII",
            "999,CMXCIX" }
    )
    public void return_ExpectedRomanNumeral_When_Passed_ArabicNumber(int arabic, String expectedRoman) {
        RomanNumeralsConverter2 converter = new RomanNumeralsConverter2();
        String actual = converter.fromArabic(arabic);
        assertEquals(expectedRoman, actual);
    }
}
