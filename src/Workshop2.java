import java.util.Scanner;

public class Workshop2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int successServers = 0;

        System.out.println("Hur många servrar består klustret av?:");
        int totalServers = scanner.nextInt();

        for (int i = 1; i <= totalServers; i++) {
            if (i == 13) {
                System.out.println("Server [" + i + "] är korrupt!!!");
                System.out.println("Termineting program");
                break;
            }
            if (i % 3 == 0) {
                System.out.println("Server [" + i + "] Ligger nere");
                System.out.println("Patchas INTE!!!");
                continue;
            }

            System.out.println("Server [" + i + "] Har blivit patchad!");
            successServers++;


        }
        System.out.println("Totala servrar som uppdaterades: " +successServers);

    }


}
