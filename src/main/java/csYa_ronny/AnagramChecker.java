package csYa_ronny;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        // TODO: Implement the logic to check if str1 and str2 are anagrams
        return false;  // Return false by default
    }

    public static void main(String[] args) {
        // דוגמאות לשימוש בשיטה areAnagrams
        String word1 = "listen";
        String word2 = "silent";
        String word3 = "apple";
        String word4 = "pale";

        System.out.println("Are \"" + word1 + "\" and \"" + word2 + "\" anagrams? " + areAnagrams(word1, word2));
        System.out.println("Are \"" + word3 + "\" and \"" + word4 + "\" anagrams? " + areAnagrams(word3, word4));
    }
}