public class LastDigitChecker {
    public static boolean isValid(int number){
        if(number >= 10 && number <=1000){
            return true;
        }else{
            return false;
        }
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(!isValid(num1)|| !isValid(num2) || !isValid(num3)){
            return false;
        }else {
            int lastDigitNum1 = num1%10;
            int lastDigitNum2 = num2%10;
            int lastDigitNum3 = num3%10;
            if((lastDigitNum1 == lastDigitNum2) || (lastDigitNum2 == lastDigitNum3) || (lastDigitNum3 == lastDigitNum1)){
                return true;
            }else{
                return false;
            }
        }
    }
}
