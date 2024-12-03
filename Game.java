import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws Exception {

        StoryMode storymode = new StoryMode();
        SurvivalMode survivalmode = new SurvivalMode();

        Scanner s = new Scanner(System.in);
        
        System.out.println("Zombie Game");
        System.out.print("Enter your name : ");
        String name = s.nextLine();
        
            try {
        
            System.out.println("Press 1 or 2 to select a gamemode");
            System.out.println("Press 1 - Story Mode");
            System.out.println("Press 2 - Survival Mode");
            System.out.print("decision : ");
            int gamemodedecision = s.nextInt();

            if(gamemodedecision==1){

                System.out.println("Playing Story Mode as " + name + " ...");
                Thread.sleep(1000);
                storymode.start();

            }

            else if(gamemodedecision==2){

                System.out.println("Playing Survival Mode as " + name + " ...");
                Thread.sleep(1000);
                survivalmode.start();
                

            } else {

                System.out.println("Invalid input. Restarting...");
                Thread.sleep(1000);
                Game.main(args);

            }
            } catch (InputMismatchException e) {
               System.out.println("Invalid input. Restarting...");
               Thread.sleep(1000);
                Game.main(args);
            
        }
    }
}