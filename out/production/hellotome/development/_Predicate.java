package development;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("3411543145"));
        System.out.println(isPhoneNumberValid("9154587456"));
        System.out.println("with predicate");
        System.out.println(isPhoneNumberValidPredicate.test("3411543145"));
        System.out.println(isPhoneNumberValidPredicate.test("9154587456"));

        System.out.println("the number is valid and conatins 3" + isPhoneNumberValidPredicate.and(containsNumber3).test("3518451535"));
    }
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("91") && phoneNumber.length() == 10;
    }
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumer ->
            phoneNumer.startsWith("91") && phoneNumer.length()==10;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
}
