public class Main {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        calc.setFirstNumber(25.0);
        calc.setSecondNumber(25.0);
        System.out.println("First number= "+calc.getFirstNumber());
        System.out.println("Second number= "+calc.getSecondNumber());
        System.out.println("Addition= "+calc.getAdditionResult());
        System.out.println("Subtraction= "+calc.getSubtractionResult());
        System.out.println("Multiplication= "+calc.getMultiplicationResult());
        System.out.println("Division= "+calc.getDivisionResult());
    }
}
