public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);

    }

    public static void printConversion(double KilometersPerHour){
        if (KilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else {
            System.out.println(KilometersPerHour + " km/h = "+ toMilesPerHour(KilometersPerHour) + " mi/h");
        }
    }
}
