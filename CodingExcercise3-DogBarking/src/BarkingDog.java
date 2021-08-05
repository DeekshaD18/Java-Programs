public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if (barking == false){
            return false;
        } else if(barking == true){
            if(hourOfDay < 8 && hourOfDay >= 0){
                return true;
            }else if(hourOfDay <= 23 && hourOfDay > 22) {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }

    }
}
