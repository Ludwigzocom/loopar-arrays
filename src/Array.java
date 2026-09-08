public class Array {


    public static void main(String[] args){


//
//        String[] bilar = {"bmw","volvo","volkswagen","audi"};
//
//        System.out.println(bilar[1]);
//
//
//        String[] dagar = new String[10];
//
//        dagar[3] = "Torsdag";
//
//        dagar[3] = "Måndag";
//        System.out.println(dagar[3]);
//
//        for (int i = 0; i < bilar.length; i++) {
//            System.out.println( i+"." +bilar[i]);
//        }
//
//        for(String bil : bilar){
//            System.out.println("Mina favoir bilar: "+ bil);
//        }
//

            int doesContain = 0;

        String[] fruits = {"Bananer", "apple", "orange", "kiwi", "blueberry" };

        for (String fruit : fruits){

            if(fruit.contains("e")){
                doesContain++;
            }


        }
        System.out.println("Arrayen Fruit innehåller frukter med antal E : " + doesContain);




    }


}
