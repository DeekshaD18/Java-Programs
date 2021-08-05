import java.util.Scanner;

public class inputThenPrintSumAndAverage {
    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        long average = 0L;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        //System.out.println("Enter the numbers: ");
        while(true){
            boolean hasInt = sc.hasNextInt();
            if(hasInt){
                sum += sc.nextInt();
                count++;
                sc.nextLine();
            }else{
                break;
            }
            //sc.nextLine();
        }
        average = sum/count;
        System.out.println("SUM = "+sum+" AVG = "+average);
        sc.close();
    }
}
