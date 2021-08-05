public class GCD {
    public static int getGreatestCommonDivisor(int num1, int num2){

        if(num1 < 10 || num2 < 10){
            return -1;
        }else{
            int x = 0;
            int gcd = 0;

            if(num1 > num2){
                x = num1;
            }else{
                x = num2;
            }
            for(int i = 1;i <= x; i++){
                if((num1 % i == 0) && (num2 % i == 0)){
                    if (i > gcd) {
                        gcd = i;
                    }
                }

            }
            return gcd;
        }
    }
}
