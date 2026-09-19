import java.util.Scanner;
    public class NokiaManual{
        public static void main(String[]args){
            Scanner inputCollector = new Scanner(System.in);
            
            System.out.println("===== NOKIA 5510 USER MANUAL =====");
            System.out.println("1. Phone book ");
            System.out.println("2. Messages"); System.out.println("3. Chat");
            System.out.println("4. Call register");
            System.out.println("5. Tones");
            System.out.println("6. Setting");
            System.out.println("7. Call divert");
            System.out.println("8. Music");
            System.out.println("9. Games");
            System.out.println("10. Calculator");
            System.out.println("11. Reminders");
            System.out.println("12. Clock");
            System.out.println("13. Profiles");
            System.out.println("14. Services");
            System.out.println("15. SIM services");
            System.out.println("\n Select an option:");
            
            int choice = inputCollector.nextInt();

            switch (choice){


case 1 :System.out.println(" === PHONE BOOK ===");
        System.out.println("1. Search");
        System.out.println("2. Service Nos");
        System.out.println("3. Add name");
        System.out.println("4. Add Erase");
        System.out.println("5. Edit");
        System.out.println("6. Add copy");
        System.out.println("7. Assign");
        System.out.println("8. Send");
        System.out.println("9. Options");
        System.out.println("10. Speed");
        System.out.println("11. Voice tags");
                            break;

case 2: System.out.println("\n=== MESSAGES ===");
        System.out.println("1. Write messages");
        System.out.println("2. Inbox");
        System.out.println("3. Outbox");
        System.out.println("4. Picture messages");
        System.out.println("5. Templates");
        System.out.println("6. Smileys");
        System.out.println("7. Messages setting");
        System.out.println("8. Info services");
        System.out.println("9. Voice mailbox number");
        System.out.println("10. Service command editor");
                            break;
case 3: System.out.println("\n === CHAT ===");
                            
                            break;

case 4: System.out.println("\n=== CALL REGISTER ===");
        System.out.println("1. Missed calls");
        System.out.println("2. Received calls");
        System.out.println("3. Dailled numbers");
        System.out.println("4. Erase recent call lists");
        System.out.println("5. Show call duration");
        System.out.println("6. Show call costs");
        System.out.println("7. Call costs setting");
        System.out.println("8. Prepaid credit");
                            
                            break; 

        
case 5: System.out.println("\n=== TONES ===");
        System.out.println("1. Ringing tone");
        System.out.println("2. Ringing volume");
        System.out.println("3. Incoming call alert");
        System.out.println("4. Message alert tone");
        System.out.println("5. Keypad tones");
        System.out.println("6. Warning tones");
        System.out.println("7. Vibrating alert");
        System.out.println("8. Screen saver");

                            break; 

case 6: System.out.println("\n=== SETTINGS ===");
        System.out.println("1. Call settings");
        System.out.println("2. Phone settings");
        System.out.println("3. Security settings");
        System.out.println("4. Restore factory settings");
        
                            break; 

case 7: System.out.println("\n=== CALL DIVERT ===");

                             break; 

case 8: System.out.println("\n=== MUSIC ===");
        System.out.println("1. Music player");
        System.out.println("2. Radio");
        System.out.println("3. Recorder");
        System.out.println("4. Track list");
        
                              break; 

case 9: System.out.println("\n=== GAMES ===");

                              break;

case 10: System.out.println("\n=== CALCULATOR ===");

                            break;

case 11: System.out.println("\n=== REMINDERS ===");

                            break;

case 12:System.out.println("\n=== CLOCK ===");
        System.out.println("1. Alarm Clock");
        System.out.println("2. Clock settings");
        System.out.println("3. Date settings");
        System.out.println("4. Stopwatch");
        System.out.println("5. Countdown");
        System.out.println("6. Auto update of date and time");

                            break;

case 13:    System.out.println("\n=== PROFILES ===");

                            break;

case 14:    System.out.println("\n=== SERVICES ===");
    
                            break;

case 15:    System.out.println("\n=== SIM SERVICES ===");

                            break; 

                        default:

System.out.println("\nInvalid choice. ");

}

}

}
