import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner userInput = new Scanner(System.in);
        String request = ("Please input your name: ");
        System.out.print(request);
        String input = userInput.nextLine();
        userInput.close();
        System.out.println(input);
        
        if(input.equalsIgnoreCase("Alice")){
            System.out.format("Welcome %s, I hope you have a good day! \n", input);
        }
        else if(input.equalsIgnoreCase("Bob")){
            System.out.format("Welcome %s, I hope you have a good day!\n", input);
        }
        else{
            System.out.format("Access denied for %s\n", input);
        }
        
        
    }
}
