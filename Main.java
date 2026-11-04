import java.util.Scanner;
import  java.util.ArrayList;
import  java.util.List;

// next: s'occuper des DAO

public class Main {


    private static void showAllPlayers(ArrayList<String> players){
        System.out.println("Here are the players:");
        for(String player : players){
            System.out.println(player);
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String player_name;
        ArrayList<String> players = new ArrayList<>(List.of("Ronaldo", "Salah", "Mane", "Firmino"));
        ArrayList<String> myPlayers = new ArrayList<>(List.of("Mane", "Salah", "Firmino"));
        ArrayList<String> managers = new ArrayList<>();
        String myManager;
        String choice;
        Boolean isRunning = true;
        
        
            
        
        
        try {
            while (isRunning) {
                
                System.out.println("--------------OPTIONS----------------");
                System.out.println("1: Show the squad");
                System.out.println("2: Sign a new player");
                System.out.println("3: Sell a player");
                System.out.println("4: Managers");
                System.out.println("5: Quit");
                System.out.println("--------------------------------------");

                System.out.println("Choice:");
                choice = scanner.next();

                switch (choice) {
                    case "1":
                        showAllPlayers(myPlayers);
                        break;
                    case "2":
                        System.out.println("signing a new player!!");
                        break;
                    case "3":
                        System.out.println("selling a player!!");
                        break;
                    case "4":
                        System.out.println("Here are the manager menu!!");
                        break;
                    case "5":
                        System.out.println("You're quiting...");
                        Thread.sleep(2000);
                        isRunning = false;
                        break;
                
                    default:
                        System.out.println("On the default brooo!!");
                        break;
                }

            }
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}