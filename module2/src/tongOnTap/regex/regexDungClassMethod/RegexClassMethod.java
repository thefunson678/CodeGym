package tongOnTap.regex.regexDungClassMethod;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClassMethod {
    Pattern pattern;
    Matcher matcher;

    private static final String REGEX_RULE1 = "^[1-9][\\d]*$";

    public RegexClassMethod() {
        pattern = Pattern.compile(REGEX_RULE1);
    }
    public boolean methoRegex(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
