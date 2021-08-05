public class PlayingCat {
    public static boolean isCatPLaying(boolean summer, int temperature){
        if (summer){
            if (temperature >= 25 && temperature <=45){
                return true;
            }else{
                return false;
            }
        }else{
            if(temperature >= 25 &&temperature <=35){
                return true;
            }else{
                return false;
            }
        }
    }
}
