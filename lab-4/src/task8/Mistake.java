package task8;

public class Mistake {
    public static boolean checkStringCombination(String evenSymbols, String oddSymbols, String checkString) {
        int i = 0, j = 0, k = 0;
        int evenLength = evenSymbols.length();
        int oddLength = oddSymbols.length();
        int stringLength = checkString.length();
        if (evenLength + oddLength != stringLength){
            return false;
        }
        while (k < stringLength){
            if (i < oddLength && oddSymbols.charAt(i) == checkString.charAt(k)){
                i++;
            } else {
                return false;
            }
            k++;
            if (k == stringLength){
                break;
            }
            if (j < evenLength && evenSymbols.charAt(j) == checkString.charAt(k)){
                j++;
            } else{
                return false;
            }
            k++;
            if (k == stringLength){
                break;
            }
        }
        return i == oddLength && j == evenLength;
    }
}
