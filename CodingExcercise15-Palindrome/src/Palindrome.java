public class Palindrome {
    public static boolean isPalindrome(int number) {
        int remainder = 0;
        int newNum = number;
        int reverse = 0;
        if (number > (-10) && number < 10) {
            return false;
        } else {
            if(number <= -10){
                newNum = Math.abs(number);
            }
            while (newNum > 0) {
                remainder = newNum % 10;
                reverse *= 10;
                reverse += remainder;
                newNum = newNum / 10;
            }
            if (reverse == Math.abs(number)) {
                return true;
            } else {
                return false;
            }
        }
    }
}

