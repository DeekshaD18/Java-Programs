public class MinutesToDaysAndYears {
    public static final String INVALID_VALUE_MESSAGE = "Invalid Input";
    public static void printYearsAndDays(int minutes){
        if(minutes < 0){
            System.out.println(INVALID_VALUE_MESSAGE);
        }else{
            int days = minutes/(60*24);
            int years = days/365;
            int remainingDays = days%365;
            System.out.println(minutes+"min = "+years+"y + "+remainingDays+"d.");
        }
    }
}
