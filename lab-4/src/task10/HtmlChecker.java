package task10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlChecker {
    public static String removeTags(String str){
        String tags = "(<(/?[^>]+)>)";
        Pattern pattern = Pattern.compile(tags);
        Matcher match = pattern.matcher(str);
        return match.replaceAll(" ");
    }
}
