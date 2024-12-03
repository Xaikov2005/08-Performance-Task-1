import java.util.Scanner;

public class StoryMode implements Gamestart{
    @Override
    public void start() {
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("   _____ _                     __  __           _      \n" +
                   "  / ____| |                   |  \\/  |         | |     \n" +
                   " | (___ | |_ ___  _ __ _   _  | \\  / | ___   __| | ___ \n" +
                   "  \\___ \\| __/ _ \\| '__| | | | | |\\/| |/ _ \\ / _` |/ _ \\\n" +
                   "  ____) | || (_) | |  | |_| | | |  | | (_) | (_| |  __/\n" +
                   " |_____/ \\__\\___/|_|   \\__, | |_|  |_|\\___/ \\__,_|\\___|\n" +
                   "                        __/ |                          \n" +
                   "                       |___/                           ");

                                
            System.out.println("Starting...");
            Thread.sleep(2000);
            System.out.println("\u001B[33mA Horde of Zombies are chasing You, Your Partner, and Child");
            Thread.sleep(2000);
            System.out.println("While Running, you shoot to try and slow the zombies down. You kill a few.");
            Thread.sleep(2000);
            System.out.println("A Zombie ambushes you from your left, accidentally dropping your gun. It pins you to a wall.");
            Thread.sleep(2000);
            System.out.println("\u001B[32mPress 1 or 2 to Choose an Action");
            System.out.println("1 - Fight Back");
            System.out.println("2 - Sacrifice");
            System.out.print("Acion : ");

            int choice = s.nextInt();

            if (choice == 1) {
                System.out.println("\u001B[33mYou fight the zombie back and kill it with a knife. But it was able to bite you.");
                Thread.sleep(2000);
                System.out.println("You catch up to your partner and Child. Zombies still chasing you");
                Thread.sleep(2000);
                System.out.println("Finally reaching the rooftop, A helicopter waiting for you.");
                Thread.sleep(2000);
                System.out.println("Multiple zombies are at the door. But you realize you are bitten");
                Thread.sleep(2000);
                System.out.println("\u001B[32mPress 1 or 2 to Choose an Action");
                System.out.println("1 - Go to Rescue");
                System.out.println("2 - Sacrifice");
                System.out.print("Acion : ");


                choice = s.nextInt();

                if (choice == 1) {

                    System.out.println("\u001B[33mYou, Your Partner, and Your Child were able to escape.");
                    Thread.sleep(2000);
                    System.out.println("The pilot told you that they have a cure at the destination");
                    Thread.sleep(2000);
                    System.out.println("\n\u001B[36mYou Unlocked The Good Ending");

                } else if (choice==2) {

                    System.out.println("\u001B[33mGOO!!" + " You screamed. Telling your partner to keep running and leave you behind");
                    Thread.sleep(2000);
                    System.out.println("The Door breaks. You scream in agony as you get bitten by the zombiess. The remaining zombies from the horde eat you.");
                    Thread.sleep(2000);
                    System.out.println("\u001B[31mYou Died");
                    Thread.sleep(2000);
                    System.out.println("\u001B[33mBut Your partner and Child were able to escape");
                    Thread.sleep(2500);
                    System.out.println("\nYou Unlocked the Bittersweet Ending");
                    
                } else {

                    System.out.print("\u001B[31mInvalid Input. Restarting Story...");
                    start();

                }
            } else if(choice==2){

                System.out.println("\u001B[33mGOO!!" + " You screamed. Telling your partner to keep running and leave you behind");
                    Thread.sleep(2000);
                    System.out.println("You scream in agony as you get bitten by the zombiess. The remaining zombies from the horde eat you.");
                    Thread.sleep(2000);
                    System.out.println("\u001B[31mYou Died");
                    Thread.sleep(2000);
                    System.out.println("\u001B[33mBut Your partner and Child were able to escape");
                    Thread.sleep(2500);
                    System.out.println("\nYou Unlocked the Bittersweet Ending");
                
            } else {
                
                System.out.println("\u001B[31mYou Died");
            }
            Thread.sleep(2000);
            System.out.println("\u001B[0mThank you for playing!");
        } catch (InterruptedException e) {
            System.out.println("\u001B[31mInvalid Input. Restarting...");
            start();
        }
    }
}