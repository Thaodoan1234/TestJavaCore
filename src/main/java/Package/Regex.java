package Package;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String text1 = "";
        Pattern pattern = Pattern.compile("[a-z|A-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,8}\\.[\\w]{2,8})");
        Matcher matcher = pattern.matcher(text1);

        System.out.println("Chuỗi text: \n" + text1);
        while (matcher.find()) {
            System.out.println(text1.substring(matcher.start(), matcher.end()));
        }

    }
}
