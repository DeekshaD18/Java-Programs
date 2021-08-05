public class numberToWords {
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }else{
            int length = (int)(String.valueOf(number).length());
            return length;
        }
    }
    public static int reverse(int num){
        int reverse = 0;
        int remainder = 0;
        int number = num;
        while(Math.abs(number) > 0) {
            remainder = Math.abs(number) % 10;
            reverse *= 10;
            reverse += remainder;
            number /= 10;
        }
        if(num < 0){
            reverse = -1*reverse;
        }
        return reverse;
    }
    public static void numberToWords(int number){
        int lastDigit = 0;
        int length = getDigitCount(number);
        if(number < 0){
            System.out.println("Invalid Value");
        }else{
            int reverse = reverse(number);
            for(int i = 1; i<= length; i++){
                 lastDigit = reverse %10;
                 reverse /= 10;
                 switch (lastDigit) {
                     case 0:
                         System.out.println("Zero");
                         break;
                     case 1:
                         System.out.println("One");
                         break;
                     case 2:
                         System.out.println("Two");
                         break;
                     case 3:
                         System.out.println("Three");
                         break;
                     case 4:
                         System.out.println("Four");
                         break;
                     case 5:
                         System.out.println("Five");
                         break;
                     case 6:
                         System.out.println("Six");
                         break;
                     case 7:
                         System.out.println("Seven");
                         break;
                     case 8:
                         System.out.println("Eight");
                         break;
                     case 9:
                         System.out.println("Nine");
                         break;
                 }
            }
        }
    }
}
