public class FlourPack {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(goal < 0 || bigCount < 0 || smallCount < 0 ){
            return false;
        }else{
            int bigGoal = 5*bigCount;
            int smallGoal = 1*smallCount;
            int bigPack = 0;
            int smallPack = 0;
            int lastPack = 0;
            if(goal>=5){
                smallPack = goal - bigGoal;
                if(smallPack < 0){
                    return false;
                }
                System.out.println(smallPack);
                lastPack = smallPack-smallGoal;
                System.out.println(lastPack);
                if(lastPack <= 0){
                    return true;
                }else
                {
                    return false;
                }
            }else{
                lastPack = goal - smallGoal;
                if(lastPack <= 0){
                    return true;
                }else
                {
                    return false;
                }
            }
        }
    }
}
