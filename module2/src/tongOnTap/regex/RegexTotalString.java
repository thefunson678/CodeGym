package tongOnTap.regex;

public class RegexTotalString {
    //   KH-XXXX
    public static final String REGEX_CUSTOMER_ID = "^KH-[\\d]{4}$";
    //   DV-XXXX
    public static final String REGEX_SERVICE_ID = "^DV-[\\d]{4}$";
    //   Tên
    public static final String REGEX_NAME = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
    //   Số điện thoại
//   090xxxxxxx hoặc 091xxxxxxx hoặc (84)+90xxxxxxx hoặc (84)+91xxxxxxx
    public static final String REGEX_PHONE = "^(090|091|\\(84\\)\\+90|\\(84\\)\\+91)[\\d]{7}$";
    //   public static final String REGEX_PHONE = "^(090|091|[(]84[)][+]90|[(]84[)][+]91)[\\d]{7}$";
//   CMND 9 số và 12 số
    public static final String REGEX_ID_NUMBER = "^([\\d]{9}|[\\d]{12})$";
    //   Email
//   public static final String REGEX_EMAIL = "^[\\w.]+@[\\w&&[^_]]+([.][\\w&&[^_]]+){1,2}$";
    public static final String REGEX_EMAIL = "^[\\w.]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+){1,2}$";
    //   số dương
    public static final String REGEX_POSITIVE_NUMBER = "^([1-9][\\d]*(\\.[\\d]*)?)|(0\\.[\\d]+)$";
    //   số nguyên dương
    public static final String REGEX_POSITIVE_INTEGER = "^[1-9][\\d]*$";

    /*
    . So khớp với bất kỳ ký tự đơn nào
    ^ So khớp phần đầu của chuỗi hay dòng
    $ So khớp phần cuối của chuỗi hay dòng
    (…) So khớp với các ‘nhóm’ ký tự bên trong
    […] So khớp với bất kỳ ký tự đơn nào trong dấu ngoặc vuông
    [^…] So khớp với bất kỳ ký tự đơn nào ngoại trừ các ký tự trong dấu ngoặc vuông
    [m-n] So khớp từ ký tự m đến ký tự n theo thứ tự trong ASCII
    XY So khớp với ‘X theo sau là Y’, ví dụ: [a-e][i-u]
    X|Y So khớp với X hoặc Y
    \d So khớp với ký tự là chữ số, viết tắt của [0-9]
    \D So khớp với ký tự không phải là chữ số, viết tắt của [^0-9]
    \s So khớp với bất kỳ ký tự trống nào (dấu cách, tab, xuống dòng), viết tắt của [\t\n\x0B\f\r]
    \S So khớp với bất kỳ ký tự không phải ký tự trống, viết tắt của [^\s]
    \w So khớp bất kỳ ký tự chữ nào (chữ cái và chữ số), viết tắt của [a-zA-Z0-9]
    \W So khớp bất kỳ ký tự nào không phải chữ cái và chữ số, viết tắt của [^\w]
    \b Ranh giới của một từ
    \B Không phải là ranh giới của một từ
    \A So khớp phần đầu của đầu vào
    \G So khớp phần cuối của đầu vào
    X* So khớp với 0 hoặc nhiều sự xuất hiện của X, viết gọn cho X{0,}
    X+ So khớp với 1 hoặc nhiều sự xuất hiện X,  viết gọn cho X{1,}
    X? So khớp 0 hoặc 1 sự xuất hiện của X, viết gọn cho X{0,1}
    X{n} So khớp chính xác n lần sự xuất hiện của X
    X{n,} So khớp n hoặc nhiều hơn số lần xuất hiện của X
    X{n,m} So khớp với ít nhất n và nhiều nhất m lần xuất hiện của X
     */
}
