import java.util.Scanner;

public class SurvivalMode implements Gamestart{
    @Override
    public void start() {
        Scanner s = new Scanner(System.in);

        try { //DAY 1 
            System.out.println("   _____                  _            _   __  __           _      \r\n" + //
                                "  / ____|                (_)          | | |  \\/  |         | |     \r\n" + //
                                " | (___  _   _ _ ____   _____   ____ _| | | \\  / | ___   __| | ___ \r\n" + //
                                "  \\___ \\| | | | '__\\ \\ / / \\ \\ / / _` | | | |\\/| |/ _ \\ / _` |/ _ \\\r\n" + //
                                "  ____) | |_| | |   \\ V /| |\\ V / (_| | | | |  | | (_) | (_| |  __/\r\n" + //
                                " |_____/ \\__,_|_|    \\_/ |_| \\_/ \\__,_|_| |_|  |_|\\___/ \\__,_|\\___|\r\n" + //
                                "                                                                   \r\n" + //
                                "                                                                   ");
            System.out.println("Starting...");
            Thread.sleep(2000);
            System.out.println("\u001B[33mBreaking News! A Zombie Apocalypse is currently happening in Rosewood City!");
            Thread.sleep(2000);
            System.out.println("You look outside and your neighborhood is filled with zombies.");
            Thread.sleep(2000);
            System.out.println("You must gather resources and craft weapons to survive");
            Thread.sleep(2000);
            System.out.println("DAY 1");
            Thread.sleep(2000);
            System.out.println("\u001B[32mPress 1 or 2 to Choose an Action");
            System.out.println("1 - Search for Resources");
            System.out.println("2 - Rest");
            System.out.print("Acion : ");

            int choice = s.nextInt();

            if (choice == 1) { //DAY 1 : GATHER RESOURCES ROUTE
                System.out.println("\u001B[33mYou Gathered: Bottled Water, Canned Food (2x), Knife, Bandages (2x), School Bag");
                Thread.sleep(2000);
                System.out.println("You Equipped the School Bag.");
                Thread.sleep(2000);
                System.out.println("Your Inventory has expanded. Bottled Water, Bandages, and Canned Food added to invetory!");
                Thread.sleep(2000);
                System.out.println("You Equip the knife.");
                Thread.sleep(2000);
                System.out.println("You lack food. But you remembered that there is a convinience store near you.");
                Thread.sleep(2000);
                System.out.println("\u001B[32mPress 1 or 2 to Choose an Action");
                System.out.println("1 - Go outside");
                System.out.println("2 - Rest");
                System.out.print("Acion : ");


                choice = s.nextInt();

                if (choice == 1) { ////DAY 1 : GO OUTSIDE ROUTE, CONVINIENCE STORE

                    System.out.println("\u001B[33mYou run outside, the zombies are chasing you. But you are faster");
                    Thread.sleep(2000);
                    System.out.println("You finally enter the convinience store and Barricaded the Entrance");
                    Thread.sleep(2000);
                    System.out.println("\u001B[32mPress 1 or 2 to Choose an Action");
                    System.out.println("1 - Gather Resources");
                    System.out.println("2 - Rest");
                    System.out.print("Acion : ");


                    choice = s.nextInt();

                    if (choice == 1) { //DAY 1 : CONVINIENCE STORE ROUTE

                        System.out.println("\u001B[33mYou rush to find the Canned Food Section");
                        Thread.sleep(2000);
                        System.out.println("A Zombie is eating a person, blocking the way");
                        Thread.sleep(2000);
                        System.out.println("\u001B[32mPress 1 or 2 to Choose an Action");
                        System.out.println("1 - Kill it");
                        System.out.println("2 - Sneak around it");
                        System.out.print("Acion : ");
    
                        
                        choice = s.nextInt();

                        if (choice == 1) { //DAY 1 : CONVINIENCE STORE ROUTE, KILL ZOMBIE ROUTE

                            System.out.println("\u001B[33mYou Kill the Zombie Silently wtih your knife");
                            Thread.sleep(2000);
                            System.out.println("You reach the Canned Food Section");
                            Thread.sleep(2000);
                            System.out.println("You Gathered: Canned Food (35x), Bottled Water (25x)");
                            System.out.println("Suddenly you hear gunshots outside the entrance");
                            Thread.sleep(2000);
                            System.out.println("You investigate and its the Military");
                            Thread.sleep(2000);
                            System.out.println("\n\u001B[32mYou are saved");
        
        
                        } else if (choice==2) { //DAY 1 : CONVINIENCE STORE ROUTE, SNEAK AROUND IT ROUTE
        
                            System.out.println("\u001B[33mYou sneak around the zombie");
                            Thread.sleep(2000);
                            System.out.println("You reach the Canned Food Section");
                            Thread.sleep(2000);
                            System.out.println("You Gathered: Canned Food (35x), Bottled Water (25x)");
                            Thread.sleep(2000);
                            System.out.println("Suddenly you hear gunshots outside the entrance");
                            Thread.sleep(2000);
                            System.out.println("You investigate and its the Military");
                            Thread.sleep(2000);
                            System.out.println("\n\u001B[33mYou are saved");
                            
                        } else {
        
                            System.out.print("\u001B[31mInvalid Input. Restarting...");
                            start();
        
                        }
    
                    } else if (choice==2) { //DAY 1 : CONVINIENCE STORE, REST ROUTE
    
                        System.out.println("\u001B[33mYou lay down at the side, exhausted from running, you rest");
                            Thread.sleep(2000);
                            System.out.println("In the Middle of the Night, A Zombie bites your neck while you were asleep");
                            Thread.sleep(2000);
                            System.out.println("You struggle to breathe...");
                            Thread.sleep(2500);
                            System.out.println("\u001B[31mYou Died");
                        
                    } else {
    
                        System.out.print("\u001B[31mInvalid Input. Restarting...");
                        start();
    
                    }

                } else if (choice==2) { //DAY 1 : GATHER RESOURCES, REST ROUTE - DEATH

                    System.out.println("\u001B[33mYou lay down at your couch");
                        Thread.sleep(2000);
                        System.out.println("In the Middle of the Night, A Zombie bites your neck while you were asleep");
                        Thread.sleep(2000);
                        System.out.println("You struggle to breathe...");
                        Thread.sleep(2500);
                        System.out.println("\u001B[31mYou Died");
                    
                } else {

                    System.out.print("\u001B[31mInvalid Input. Restarting...");
                    start();

                }

            //THE LINE OF CODE BELOW ARE DAY 2 ROUTE

            } else if(choice==2){ // DAY 2 ROUTE

                System.out.println("\u001B[33mDAY 2");
                Thread.sleep(2000);
                System.out.println("You Rest And Wake up");
                Thread.sleep(2000);
                System.out.println("The Neighborhood is still filled with Zombies");
                Thread.sleep(2000);
                System.out.println("You are starving");
                Thread.sleep(2500);
                System.out.println("\u001B[32mPress 1 or 2 to Choose an Action");
                System.out.println("1 - Eat Canned Food");
                System.out.println("2 - Go outside to find food");
                System.out.print("Acion : ");

                choice = s.nextInt();

                    if (choice == 1) { //DAY 2 - EAT CANNED FOOD ROUTE

                        System.out.println("\u001B[33mYou eat the canned food, All stats are maxed out");
                        Thread.sleep(2000);
                        System.out.println("You lack food. But you remembered that there is a convinience stores near you.");
                        Thread.sleep(2000);
                        System.out.println("\u001B[32mPress 1 or 2 to Choose an Action");
                        System.out.println("1 - Go Outside");
                        System.out.println("2 - Rest");
                        System.out.print("Acion : ");
    
    
                        choice = s.nextInt();

                        if (choice == 1) { ////DAY 2 : GO OUTSIDE ROUTE

                            System.out.println("\u001B[33mYou run outside, the zombies are chasing you. But you are faster");
                            Thread.sleep(2000);
                            System.out.println("You Finally Enter Convinience Store and Barricaded the Entrance");
                            Thread.sleep(2000);
                            System.out.println("\u001B[32mPress 1 or 2 to Choose an Action");
                            System.out.println("1 - Gather Resources");
                            System.out.println("2 - Rest");
                            System.out.print("Acion : ");
        
        
                            choice = s.nextInt();
        
                            if (choice == 1) { //DAY 2 : CONVINIENCE STORE ROUTE
        
                                System.out.println("\u001B[33mYou rush to find the Canned Food Section");
                                Thread.sleep(2000);
                                System.out.println("A Zombie is eating a person, blocking the way");
                                Thread.sleep(2000);
                                System.out.println("\u001B[32mPress 1 or 2 to Choose an Action");
                                System.out.println("1 - Kill it");
                                System.out.println("2 - Sneak around it");
                                System.out.print("Acion : ");
            
                                
                                choice = s.nextInt();
        
                                if (choice == 1) { //DAY 2 : CONVINIENCE STORE ROUTE, KILL ZOMBIE ROUTE
        
                                    System.out.println("\u001B[33mYou Kill the Zombie Silently");
                                    Thread.sleep(2000);
                                    System.out.println("You reach the Canned Food Section");
                                    Thread.sleep(2000);
                                    System.out.println("You Gathered: Canned Food (35x), Bottled Water (25x)");
                                    Thread.sleep(2000);
                                    System.out.println("Suddenly you hear gunshots outside the entrance");
                                    Thread.sleep(2000);
                                    System.out.println("You investigate and its the Military");
                                    Thread.sleep(2000);
                                    System.out.println("\n\u001B[32mYou are saved");
                
                
                                } else if (choice==2) { //DAY 2 : CONVINIENCE STORE ROUTE, SNEAK AROUND IT ROUTE
                
                                    System.out.println("\u001B[33mYou sneak around the zombie");
                                    Thread.sleep(2000);
                                    System.out.println("You reach the Canned Food Section");
                                    Thread.sleep(2000);
                                    System.out.println("You Gathered: Canned Food (35x), Bottled Water (25x)");
                                    Thread.sleep(2000);
                                    System.out.println("Suddenly you hear gunshots outside the entrance");
                                    Thread.sleep(2000);
                                    System.out.println("You investigate and its the Military");
                                    Thread.sleep(2000);
                                    System.out.println("\n\u001B[32mYou are saved");
                                    
                                } else {
                
                                    System.out.print("\u001B[31mInvalid Input. Restarting...");
                                    start();
                
                                }
            
                            } else if (choice==2) { //DAY 2 : CONVINIENCE STORE, REST ROUTE
            
                                System.out.println("\u001B[33mYou lay down at the side, exhausted from running, you rest");
                                    Thread.sleep(2000);
                                    System.out.println("In the Middle of the Night, A Zombie bites your neck while you were asleep");
                                    Thread.sleep(2000);
                                    System.out.println("You struggle to breathe...");
                                    Thread.sleep(2500);
                                    System.out.println("\u001B[31mYou Died");
                                
                            } else {
            
                                System.out.print("\u001B[31mInvalid Input. Restarting...");
                                start();
            
                            }
        
                        } else if (choice==2) { //DAY 2 : HOUSE REST ROUTE, DEATH ROUTE
        
                            System.out.println("\u001B[33mYou lay down at the side, exhausted from running, you rest");
                                Thread.sleep(2000);
                                System.out.println("In the Middle of the Night, A Zombie bites your neck while you were asleep");
                                Thread.sleep(2000);
                                System.out.println("You struggle to breathe...");
                                Thread.sleep(2500);
                                System.out.println("\u001B[31mYou Died");
                            
                        } else {
        
                            System.out.print("\u001B[31mInvalid Input. Restarting...");
                            start();
        
                        }
    
                    } else if (choice==2) { //DAY 2 - GO OUTSIDE TO FIND FOOD

                    System.out.println("\u001B[33mYou run outside, the zombies are chasing you. But you are faster");
                    Thread.sleep(2000);
                    System.out.println("You Finally Enter Convinience Store and Barricaded the Entrance");
                    Thread.sleep(2000);
                    System.out.println("\u001B[32mPress 1 or 2 to Choose an Action");
                    System.out.println("1 - Gather Resources");
                    System.out.println("2 - Rest");
                    System.out.print("Acion : ");


                    choice = s.nextInt();

                    if (choice == 1) { //DAY 2 : CONVINIENCE STORE ROUTE

                        System.out.println("\u001B[33mYou rush to find the Canned Food Section");
                        Thread.sleep(2000);
                        System.out.println("A Zombie is eating a person, blocking the way");
                        Thread.sleep(2000);
                        System.out.println("\u001B[32mPress 1 or 2 to Choose an Action");
                        System.out.println("1 - Kill it");
                        System.out.println("2 - Sneak around it");
                        System.out.print("Acion : ");
    
                        
                        choice = s.nextInt();

                        if (choice == 1) { //DAY 2 : CONVINIENCE STORE ROUTE, KILL ZOMBIE ROUTE

                            System.out.println("\u001B[33mYou Kill the Zombie Silently");
                            Thread.sleep(2000);
                            System.out.println("You reach the Canned Food Section");
                            Thread.sleep(2000);
                            System.out.println("You Gathered: Canned Food (35x), Bottled Water (25x)");
                            Thread.sleep(2000);
                            System.out.println("Suddenly you hear gunshots outside the entrance");
                            Thread.sleep(2000);
                            System.out.println("You investigate and its the Military");
                            Thread.sleep(2000);
                            System.out.println("\n\u001B[32mYou are saved");
        
        
                        } else if (choice==2) { //DAY 2 : CONVINIENCE STORE ROUTE, SNEAK AROUND IT ROUTE
        
                            System.out.println("\u001B[33mYou sneak around the zombie");
                            Thread.sleep(2000);
                            System.out.println("You reach the Canned Food Section");
                            Thread.sleep(2000);
                            System.out.println("You Gathered: Canned Food (35x), Bottled Water (25x)");
                            Thread.sleep(2000);
                            System.out.println("Suddenly you hear gunshots outside the entrance");
                            Thread.sleep(2000);
                            System.out.println("You investigate and its the Military");
                            Thread.sleep(2000);
                            System.out.println("\n\u001B[32mYou are saved");
                            
                        } else {
        
                            System.out.print("\u001B[31mInvalid Input. Restarting...");
                            start();
        
                        }
    
                    } else if (choice==2) { //DAY 2 : EAT CANNED FOOD, REST ROUTE
    
                        System.out.println("\u001B[33mYou lay down at your couch and rest");
                            Thread.sleep(2000);
                            System.out.println("In the Middle of the Night, A Zombie bites your neck while you were asleep");
                            Thread.sleep(2000);
                            System.out.println("You struggle to breathe...");
                            Thread.sleep(2500);
                            System.out.println("\u001B[31mYou Died");
                        
                    } else {
    
                        System.out.print("\u001B[31mInvalid Input. Restarting...");
                        start();
    
                    }
                        
                    } else {
    
                        System.out.print("\u001B[31mInvalid Input. Restarting...");
                        start();
    
                    }
                
            } else {
                
                System.out.print("\u001B[31mInvalid Input. Restarting...");
                start();
            }
            Thread.sleep(2000);
            System.out.println("\u001B[0mThank you for playing!");
        } catch (InterruptedException e) {
            System.out.println("\u001B[31mInvalid Input. Restarting...");
            start();
        }
    }
}