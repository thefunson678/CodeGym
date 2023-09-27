package tongOnTap.regex.regexDungClassMethod;

public class ClassNeedRegex {
    public static RegexClassMethod regClass;
    public static void main(String[] args) {
        regClass = new RegexClassMethod();
        String number = "35" ;
        System.out.println(regClass.methoRegex(number));
    }
}
