public class SumOfOdd {
    public static boolean isOdd(int n){
        if (n <= 0){
            return false;
        }
        if(n%2!=0){
            return true;
        }else{
            return false;
        }
    }
    public static int sumOdd(int start, int stop){
        int sum = 0;
        if(start < 0 || stop < 0 || start > stop){
            return -1;
        }else if (stop >= start) {
            for (int i = start; i <= stop; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        }
        return sum;
    }
}
