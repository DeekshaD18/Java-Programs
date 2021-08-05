public class NumberOfDaysInAMonth {
    public static boolean isLeapYear(int year){
        if (year > 9999 || year <= 0){
            return false;
        }else
        {
            if (year%4==0){
                if(year%100==0){
                    if(year%400==0){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    return true;
                }
            }else
                return false;
        }
    }
    public static int getDaysInMonth(int month, int year){
        int days = 0;
        if (month > 12 || month <= 0 || year > 9999 || year < 0){
            return -1;
        }else{
            switch (month){
                case 1:
                    days = 31;
                    break;
                case 2:
                    if (isLeapYear(year)){
                        days = 29;
                        break;
                    }else{
                        days = 28;
                        break;
                    }
                case 3:
                    days = 31;
                    break;
                case 4:
                    days = 30;
                    break;
                case 5:
                    days = 31;
                    break;
                case 6:
                    days = 30;
                    break;
                case 7:
                    days = 31;
                    break;
                case 8:
                    days = 31;
                    break;
                case 9:
                    days = 30;
                    break;
                case 10:
                    days = 31;
                    break;
                case 11:
                    days = 30;
                    break;
                case 12:
                    days = 31;
                    break;
                default:
                    days = -1;
                    break;
            }
        }
        return days;
    }
}
