public class Factors {
    public static void printFactors(int number){
        if (number <= 0){
            System.out.println("Invalid value");;
        }else{
            for(int i=1;i<=number;i++){
                if(number%i==0){
                    System.out.println(i);
                }

            }
        }
    }
}
