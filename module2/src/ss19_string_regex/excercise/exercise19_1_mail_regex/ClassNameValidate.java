package ss19_string_regex.excercise.exercise19_1_mail_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidate {
    public static Pattern pattern;
    public Matcher matcher;
    private static final String CLASS_NAME_REGEX =   "[ACP]\\d{4}[GHIKLM]";

    public ClassNameValidate() {
        pattern=Pattern.compile(CLASS_NAME_REGEX);
    }

    public boolean ClassNameValidateCheck(String regex){
        matcher=pattern.matcher(regex);
        return  matcher.matches();
    }

}
