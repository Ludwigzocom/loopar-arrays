public class workshop3 {

    public static void main(String[] args){

        String[] logs = {
                "[INFO] User logged in",
                "[WARN] High CPU",
                "[ERROR] DB Connection Failed",
                "[INFO] Job finished",
                "[ERROR] Auth Bypass Attempt",
                "[WARN] Disk space 80%",
                "[ERROR] Timeout"
        };

        int antalWarn = 0;
        int antalInfo = 0;
        int antalError = 0;

        for(String log : logs){

            if(log.contains("INFO")){
                antalInfo++;
            }else if(log.contains("WARN")){
                antalWarn++;
            } else if (log.contains("ERROR")) {
                antalError++;

            }

        }
        System.out.println("--INFORMATION--");
        System.out.println("Antal WARN: " +antalWarn);
        System.out.println("Antal ERROR: " +antalError);
        System.out.println("Antal INFO: " +antalInfo);
        System.out.println("--------------------");

        int threatScore = (antalWarn * 1) + (antalError *5);

        if(threatScore > 10){

            System.out.println("Threat score...");
            System.out.println("WARNING WARNING");
            System.out.println("Threat score is: " +threatScore);
        }else{
            System.out.println("Threatscore:" +threatScore);
        }







    }
}