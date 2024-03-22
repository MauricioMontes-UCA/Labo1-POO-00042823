import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Operation calculator = new Operation();

        menu(calculator);
    }

    public static void dataInput(Operation object){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first operand: ");
        object.setNum1(input.nextInt());
        System.out.print("Enter the second operand: ");
        object.setNum2(input.nextInt());
    }

    public static void menu(Operation object){
        int option;
        boolean repeat = true;
        Scanner input = new Scanner(System.in);

        while (repeat) {
            System.out.println("What do you want to perform?");
            System.out.println("[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Division");
            System.out.println("[5] Exit menu");
            option = input.nextInt();

            switch (option) {
                case 1:
                    dataInput(object);
                    System.out.println(object.getNum1() + " + " + object.getNum2() + " = " + object.addition());
                    break;
                case 2:
                    dataInput(object);
                    System.out.println(object.getNum1() + " - " + object.getNum2() + " = " + object.subtraction());
                    break;
                case 3:
                    dataInput(object);
                    System.out.println(object.getNum1() + " * " + object.getNum2() + " = " + object.multiplication());
                    break;
                case 4:
                    dataInput(object);
                    System.out.println(object.getNum1() + " / " + object.getNum2() + " = " + object.division());
                    System.out.println("it ain't zero btw, jus to prevent an exception");
                    break;
                case 5:
                    System.out.println("Aight, bye bye (always mew)");
                    repeat = false;
                    break;
                default:
                    System.out.println("You can't follow simple orders, can you?");
            }
            System.out.println("\n");
        }
    }
}