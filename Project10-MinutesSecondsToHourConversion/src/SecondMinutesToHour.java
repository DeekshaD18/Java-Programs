public class SecondMinutesToHour {
    public static final String INVALID_INPUT_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        System.out.println(getDurationString(61,00));
        System.out.println(getDurationString(2520));
        System.out.println(getDurationString(-21));
    }
    public static String getDurationString(int mins,int seconds){
        if((mins < 0) || (seconds > 59) || (seconds < 0)){
            return INVALID_INPUT_MESSAGE;
        }else{
            int hour = mins/60;
            int remainingMins = mins%60;
            return (hour+"h "+remainingMins+"m "+seconds+"s");
        }
    }
    public static String getDurationString(int seconds){
        if (seconds < 0){
            return INVALID_INPUT_MESSAGE;
        }else{
            int mins = seconds/60;
            int remainingSeconds = seconds%60;
            return getDurationString(mins,remainingSeconds);
        }
    }
}
