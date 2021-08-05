public class hasSharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if((num1 > 99 || num1 <= 9) || (num2 > 99 || num2 < 10) ){
            return false;
        }
        else{
            int firstDigitOfFirstNum = (num1/10);
            int lastDigitOfFirstNum = (num1%10);
            int firstDigitOfSecondNum= (num2/10);
            int lastDigitOfSecondNum = (num2%10);

            if((firstDigitOfFirstNum == firstDigitOfSecondNum) || (firstDigitOfFirstNum == lastDigitOfSecondNum)){
                return true;
            }else if((lastDigitOfFirstNum == firstDigitOfSecondNum) || (lastDigitOfFirstNum == lastDigitOfSecondNum)){
                return true;
            }else
            {
                return false;
            }
         }
    }
}
