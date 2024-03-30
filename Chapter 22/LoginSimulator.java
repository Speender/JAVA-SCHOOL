import java.util.*;

public class LoginSimulator
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        //declarattions
        String user1 = new String("joy");
        String pass1 = new String("sun");
        String user2 = new String("gates");
        String pass2 = new String("monopoly");
        String user3 = new String("jobs");
        String pass3 = new String("apple");
        String user4 = new String("root");
        String pass4 = new String("secret");
        String user = "", pass = "";
        //input process and output in a block of code
        do 
        {   
            //input
            System.out.print("User Name: ");
            user = scan.nextLine();
            System.out.print("Password: ");
            pass = scan.nextLine();

            //process
            if (user.equals(user1) && pass.equals(pass1))
            /*condition to read if the user entered the same user and password that are already declared*/
                System.out.println("You have logged in with priority 4");
            else if (user.equals(user2) && pass.equals(pass2))
                System.out.println("You have logged in with priority 1");
            else if (user.equals(user3) && pass.equals(pass3))
                System.out.println("You have logged in with priority 3");
            else if (user.equals(user4) && pass.equals(pass4))
                System.out.println("You have logged in with priority 5");
            else
                System.out.println("LogIn failed");
        } while (!user.equals("quit") && !pass.equals("exit"));//if the user inputs the quit as user and exit as password the looping will end otherwise it will continue
        System.out.println("System shutting down...\nBye");
        

    }
}