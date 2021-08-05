public class MeterConversion {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(2,8));
        System.out.println(calcFeetAndInchesToCentimeters(100));

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inch){
        if ((feet < 0) || (inch < 0 || inch >12)){
            return -1;
        }else{
            return (((feet*12.0)+inch)*2.54);
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inch){
        if (inch < 0){
            System.out.println("Invalid Value");
            return -1;
        }else{
            double ft = (int)(inch/12);
            double remainingInches = (int)inch%12;
            return calcFeetAndInchesToCentimeters(ft,remainingInches);
        }
    }
}
