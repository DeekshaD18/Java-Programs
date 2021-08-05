public class getLargestPrime {
    public static int getLargestPrime(int number){
        int largestPrime = 0;
        if(number <= 1){
            return -1;
        }else
        {
            for(int i = 1; i<number;i++){
                System.out.println(i);
                if(number%i == 0){
                    for(int j = 1; j<=i;j++ ){
                        System.out.println(j);
                        if (i%j != 0){
                            largestPrime = i;
                            System.out.println(largestPrime);

                        }
                    }
                }if(largestPrime == 0){
                    largestPrime = number;
                }
            }

            return largestPrime;
        }

    }
}
