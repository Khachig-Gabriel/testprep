package conditionals;

public class ConditionalExercises {
    public static void main(String[] args) {
        //Calculator
        int operand1 = (int) (Math.random() * 10);
        int operand2 = (int) (Math.random() * 10);
        String operator;
        if (args.length > 0) {
            operator = args[0];
        } else {
            operator = "add";
        }

        double result = calculator(operand1, operand2, operator);

        int value = (int) (Math.random() * 100);
        System.out.println("The generated number is " + value);

        if (value >= 0 && value <10) {
            System.out.println("It is a digit");
        } else if (value >= 10 && value < 100) {
            if (value % 2 == 0) {
                System.out.println("It is a two-digit odd number");
            } else {
                System.out.println("It is a two-digit even number");
            }
        } else {
                System.out.println("out of bounds");
            }
    }

    public static boolean isOdd(int number) {
        return number % 2 == 0;
    }

    public static double calculator(double operand1, double operand2, String operator) {
        switch (operator) {
            case "add":
                return operand1 + operand2;
            case "subtract":
                return operand1 - operand2;
            case "multiply":
                return operand1 * operand2;
            case "divide":
                return operand1 % operand2;
            default:
                return -1;
        }
    }

}

