package ss19_string_regex.excercise.exercise19_1_mail_regex;

public class ClassNameTest {
    public static ClassNameValidate classNameValidate;
    public static final String VALID_NAME[] = {"C0318G", "A1253H"};
    public static final String INVALID_NAME[] = {"M0318G", "P0323A"};
    public static void main(String[] args) {
        classNameValidate = new ClassNameValidate();
        for (String clasName:VALID_NAME ) {
            boolean isValid = classNameValidate.ClassNameValidateCheck(clasName);
            System.out.println(isValid);
        }
        for (String clasInValidName:INVALID_NAME ) {
            boolean isInValid = classNameValidate.ClassNameValidateCheck(clasInValidName);
            System.out.println(isInValid);
        }
    }
}
