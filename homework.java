import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println("You entered: " + str);

        String[] values = str.split(" ");
        String operator = values[1];
        int num1 = Integer.parseInt(values[0]);
        int num2 = Integer.parseInt(values[2]);
  
        switch(operator){
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid operator");
                break;

        }

    }
}
