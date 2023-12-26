package CombinatorPattern;

public class ValidationService {
    public static boolean checkUsername(String username){
        return username.length() > 2 && username.length() < 25;
    }
    public static boolean checkGender(String gender){
        return gender.equals("Male") || gender.equals("Female");
    }
    public static boolean checkAdult(int age){
        return age > 16 ;
    }

    public static boolean check(String username , String gender, int age){
        return checkUsername(username) && checkGender(gender) && checkAdult(age);
    }
}
