public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3){
        if(num1 >= 13 && num1 <= 19){
            return true;
        }else if(num2 >= 13 && num2 <= 19){
            return true;
        }else if(num3 >= 13 && num3 <=19){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isTeen(int age){
        if (age>=13 && age<=19){
            return true;
        }else{
            return false;
        }
    }
}
