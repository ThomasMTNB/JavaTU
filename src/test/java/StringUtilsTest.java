import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    @DisplayName("Should concatenate 2 strings")
    void concat() {
        assertEquals("papa", StringUtils.concat("pa", "pa"));
    }

    // prefix

    @Test
    @DisplayName("Should return true if str2 is prefix of str1")
    void isPrefixSimple(){
        assertTrue(StringUtils.isPrefix("change", "cha"));
    }

    @Test
    @DisplayName("Should return true if any string is prefix of the other")
    void isPrefixAnyString(){
        assertTrue(StringUtils.isPrefix("cha", "change"));
    }

    @Test
    @DisplayName("Should return true even if casing is not the same")
    void isPrefixDifferentCasing(){
        assertTrue(StringUtils.isPrefix("change", "Cha"));
        assertTrue(StringUtils.isPrefix("change", "CHA"));
        assertTrue(StringUtils.isPrefix("Cha", "change"));
        assertTrue(StringUtils.isPrefix("CHA", "change"));
    }

    @Test
    @DisplayName("Should return true if string 1 and 2 are anagrams.")
    void isAnagramSimple(){
        assertTrue(StringUtils.isAnagram("gramme", "gramme"), "equal strings should work");
        assertTrue(StringUtils.isAnagram("gramme", "mmagre"), "gramme and mmagre should work");
    }

    @Test
    @DisplayName("Should return true even if casing is different")
    void isAnagramDifferentCasing(){
        assertTrue(StringUtils.isAnagram("gramme", "GRamme"));
        assertTrue(StringUtils.isAnagram("GRAMmE", "gmmAre"));
    }

    @Test
    @DisplayName("Should return true even if both string are null")
    void isAnagramEmpty(){
        assertTrue(StringUtils.isAnagram("", ""));
    }

    @Test
    @DisplayName("Should return true while ignoring spaces")
    void isAnagramSpaces(){
        assertTrue(StringUtils.isAnagram("", "     "));
        assertTrue(StringUtils.isAnagram("GRAS ME", "SE MAGR "));
    }
    @Test
    @DisplayName("Should return false if not anagrams.")
    void isAnagramFalse(){
        assertFalse(StringUtils.isAnagram("", "asbdasdsa"));
        assertFalse(StringUtils.isAnagram("banani", "banana"));
        assertFalse(StringUtils.isAnagram("Camion", "chevre"));
    }

    // Reversed string


    @Test
    @DisplayName("Should reverse a string")
    void reverseString() {
        assertEquals("reversed", StringUtils.reverseString("desrever"));
    }

    @Test
    @DisplayName("Should reverse a string ignoring casing")
    void reverseStringDifferentCasing() {
        assertEquals("reversed", StringUtils.reverseString("deSRever"));
    }

    @Test
    @DisplayName("Should return empty string if empty given")
    void reverseStringEmpty() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    @DisplayName("Should return false when not reversed")
    void reverseStringFalse(){
        assertNotEquals("reversed", "deSReverdeSReverdeSReverdeSReverdeSReverdeSReverdeSRever");
    }



    // palindrome check
    @Test
    @DisplayName("Should return true with kayak")
    void isPalindromeKayak(){
        boolean result=StringUtils.isPalindrom("kayak");
        assertTrue(result);
    }

    @Test
    @DisplayName("Should return false with bonjour")
    void isPalindromeBonjour(){
        boolean result=StringUtils.isPalindrom("bonjour");
        assertFalse(result);
    }

    @Test
    @DisplayName("Should return true with empty string")
    void isPalidndromeChaineVide(){
        boolean result=StringUtils.isPalindrom("");
        assertTrue(result);
    }

    @Test
    @DisplayName("Should return true with KAyaK")
    void isPalindromeKAYak(){
        boolean result=StringUtils.isPalindrom("KAyaK");
        assertTrue(result);
    }

    @Test
    @DisplayName("Should return true with string containing spaces")
    void isPalindromeWithSpaces(){
        boolean result=StringUtils.isPalindrom("Engage le jeu que je le gagne");
        assertTrue(result);
    }

    @Test
    @DisplayName("Should return true with string containing spaces")
    void isPalindromeFalse(){
        boolean result=StringUtils.isPalindrom("Engage leeeee jeu que je le gagne");
        assertFalse(result);
    }


    // reverseInt

    @Test
    @DisplayName("Should reverse an int")
    void reverseIntSimplePositive() {
        assertEquals(142, StringUtils.reverseInt(241));
    }

    @Test
    @DisplayName("Should reverse an int even if negative")
    void reverseIntSimpleNegative() {
        assertEquals(-142, StringUtils.reverseInt(-241));
    }

    @Test
    @DisplayName("Should return 0 if 0 given")
    void reverseIntNull() {
        assertEquals(0, StringUtils.reverseInt(0));
        assertEquals(0, StringUtils.reverseInt(00000));
    }

    @Test
    @DisplayName("Should return XXX if XXX000000 given")
    void reverseIntZerosAtEnd() {
        assertEquals(123, StringUtils.reverseInt(32100000));
        assertEquals(123, StringUtils.reverseInt(3210));
    }

    @Test
    @DisplayName("Should return -XXX if -XXX000000 given")
    void reverseIntZerosAtEndNegative() {
        assertEquals(-123, StringUtils.reverseInt(-32100000));
        assertEquals(-123, StringUtils.reverseInt(-3210));
    }


    // capitalize


    @Test
    @DisplayName("Should capitalize all words")
    void capitalizeSimple() {
        assertEquals("Je Suis Dans La Joie", StringUtils.capitalze("je suis dans la joie"));
    }

    @Test
    @DisplayName("Should capitalize all words even if UPPER CASE")
    void capitalizeUpperCase() {
        assertEquals("Je Suis Dans La Joie", StringUtils.capitalze("JE SUIS DANS LA JOIE"));
    }

    @Test
    @DisplayName("Should capitalize all words ignoring special chars")
    void capitalizeSpecialChars() {
        assertEquals("J'etais Dans La Joie", StringUtils.capitalze("J'ETAIS Dans La Joie"));
    }

    @Test
    @DisplayName("Double space should be ignored")
    void capitalizeDoubleSpace() {
        assertEquals("J'etais Dans La Joie", StringUtils.capitalze("J'ETAIS Dans La Joie"));
    }

    @Test
    @DisplayName("Should return charArray where one char out of two is capitalized, ignoring special chars (numbers accepted)")
    void alternate() {
    }

    @Test
    @DisplayName("Should return an end coordinate depending on set of instructions (top bottom right left)")
    void direction(){
        assertEquals(Arrays.toString(new int[] {114, 0}), Arrays.toString(StringUtils.direction(new String[] {"droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite", "droite"})));
    }
}