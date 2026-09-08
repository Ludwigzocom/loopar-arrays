import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Workshop1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean serverStatus = false;
        boolean menuStatus = true;
        int totalCrash = 0;


        System.out.println("Welcome to the consoleapp");
        System.out.println("1. Server status | 2. Boot the server | 3. Stress test. | 4. Exit");


        while (menuStatus) {
            System.out.println("Enter input:");
            String input = scanner.nextLine();


            switch (input) {

                case "1":
                    if (serverStatus) {
                        System.out.println("Server is online!");
                        System.out.println("Total Crashes: " + totalCrash);

                    }

                    if (!serverStatus) {
                        System.out.println("Server is offline!");
                        System.out.println("Total Crashes: " + totalCrash);
                    }
                    break;
                case "2":

                    if (serverStatus) {
                        System.out.println("Server is online!");


                    }

                    if (!serverStatus) {
                        System.out.println("Server is offline!");
                        System.out.println("Starting server...");
                        serverStatus = true;

                    }

                    break;

                case "3":

                    if (!serverStatus) {
                        System.out.println("Server is offline...");
                        System.out.println("needs to be started first...");
                    }


                    if (serverStatus) {
                        System.out.println("Running stresstest....");
                        System.out.println("Turning off system...");
                        totalCrash++;
                        serverStatus = false;
                    }



                    break;
                case "4":

                    System.out.println("Turning off our program...");
                    menuStatus = false;


                    break;


                default:
                    System.out.println("Command not regocnized...");
                    break;


            }


        }


    }


}
