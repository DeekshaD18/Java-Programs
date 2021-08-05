public class sum {
    public static int sumFirstAndLastDigit(int number){
        int length = 0;
        int lastDigit= 0;
        double firstDigit = 0;
        int sum = 0;
        if (number < 0){
            return -1;
        }else{
            length = (int) String.valueOf(number).length();
            lastDigit = number%10;
            sum += lastDigit;
            firstDigit = (number / (Math.pow(10.0, (double)(length-1)))) ;
            sum += firstDigit;
        }
        return sum;
    }
}
