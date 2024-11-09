package csYa_ronny;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        for (int i = 0; i < str1.length(); i++){
            char check = str1.charAt(i);
            if (str2.indexOf(check) == -1)
                return false;
            else
                str2 = str2.substring(0,str2.indexOf(check)) + str2.substring(str2.indexOf(check)+1);
        }
        return true;
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