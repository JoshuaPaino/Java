import java.util.Scanner;
public class UserInput {

    public static void main(String[] args) {

        //float Value
        System.out.print("Enter the temperature in Fahrenheit: ");
        Scanner tempInput = new Scanner(System.in);
        float temperature = tempInput.nextFloat();
        System.out.println("The input temperature is: " + temperature);
      

    }
}
