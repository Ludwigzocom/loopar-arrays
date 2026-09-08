import java.util.Scanner;

public class forloop {



    public static void main(String[] args) {


        for (int i = 0; i < 11; i++) {

            if (i == 4) {
                System.out.println("skipping batch... " + i);
                continue;
            }


            System.out.println("Batch number " + i + " processing...");


            if (i == 8) {
                System.out.println("batch number " + i + " is corrupt!!!");
                break;
            }


        }



    }
}
