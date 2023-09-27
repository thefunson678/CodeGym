package tongOnTap.regex;

public class RegexTrongClass {
    //   số nguyên dương
    public static final String REGEX_POSITIVE_INTEGER2 = "^[0-9]+[.?[0-9]]*";
    public static void main(String[] args) {
        String number = ".6";
        System.out.println(number.matches(REGEX_POSITIVE_INTEGER2));
        System.out.println(Double.parseDouble(number));
    }
}
