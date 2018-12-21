public class StringUtils {

    public static String reverse(String str) {
        String result="";
        for (int i=str.length()-1; i>=0; i--) {
            result+= str.charAt(i);
        }
        return result;
    }

    public static Boolean isEqualIgnoreCase(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        return s1.equals(s2);
    }

    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String result = "";
        for (int i = 0; i<numberOfTimeToRepeat; i++){
            result+=stringToBeRepeated;
        }
        return result;
    }

    public static String replaceNthSubstring(String baseString, String stringToRemove, int nthOccurrence) {
        int index = 0;
        int occurrences = 0;
        while ((index = baseString.indexOf(stringToRemove, index)) != -1) {
            ++occurrences;
            if (occurrences == nthOccurrence) {
                baseString = baseString.substring(0, index) + baseString.substring(index + stringToRemove.length());
                break;
            }
            index += stringToRemove.length();
        }
        return baseString;
    }

    public static Integer getIndexOfNthSubstring(String baseString, String subString, Integer nthOccurrence) {
        int pos = baseString.indexOf(subString);
        while (--nthOccurrence > 0 && pos != -1)
            pos = baseString.indexOf(subString, pos + 1);
        return pos;

    }

    public static Integer getNumberOfOccurrences(String baseString, String subString) {
        int count = 0;
        for(int i = 0; i<baseString.length(); i++){
            if(getIndexOfNthSubstring(baseString,subString,i)!=-1){
                count++;
            }
        }
        return count-1;
    }
}
