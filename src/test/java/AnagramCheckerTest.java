import csYa_ronny.AnagramChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramCheckerTest {

    @Test
    public void testAreAnagrams() {
        // בדיקות עם תוצאות צפויות עבור השיטה
        assertTrue(AnagramChecker.areAnagrams("listen", "silent"));
        assertTrue(AnagramChecker.areAnagrams("triangle", "integral"));
        assertFalse(AnagramChecker.areAnagrams("apple", "pale"));
        assertFalse(AnagramChecker.areAnagrams("hello", "world"));
        assertTrue(AnagramChecker.areAnagrams("anagram", "nagaram"));
    }
}

