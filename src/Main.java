import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        System.out.println("Välkommen till min meny");
        System.out.println("Ange 1 för att skriva hej i konsolen \n" +
                "Ange 2 för att avsluta programmet...");




        while (isRunning) {
            String svar = scanner.nextLine();

            switch (svar) {
                case "1":
                    System.out.println("Hej!!!!!");
                    break;
                case "2":
                    System.out.println("Turning off menu....");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Du angav fel menyval");
                    break;

            }

        }


    }

}
