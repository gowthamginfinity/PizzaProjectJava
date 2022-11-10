package PizzaProject;

import java.util.*;

class varities {

    public void classicVariety() {
        System.out.println("_______________________________________________________________");
        System.out.println("Here are your varieties");
        String Varieties[] = { "  1. Tomchi  ", "  2. Caponito   " };

        for (String names : Varieties) {
            System.out.println(names);
        }
    }

    public void premiumVariety() {
        System.out.println("_______________________________________________________________");
        System.out.println("Here are your varieties");
        String Varieties[] = { "  1. Red Indian  ", "  2. Party Lovers   " };

        for (String names : Varieties) {
            System.out.println(names);
        }
    }

    public void supremeVariety() {
        System.out.println("_______________________________________________________________");
        System.out.println("Here are your varieties");
        String Varieties[] = { "  1. American Heat  ", "  2. Re-Union   " };

        for (String names : Varieties) {
            System.out.println(names);
        }
    }

}

class AllVarieties {
    ArrayList lisT = new ArrayList();
    public AllVarieties(ArrayList Al){
        this.lisT = Al;
    }
    int Number;
    varities V1 = new varities();
    addablessExecution  ADE = new addablessExecution(lisT);
   
    public void classicvarities() {
        V1.classicVariety();

        System.out.println("please select your varieties according to Serial Number");
        Boolean flag = true;
        while (flag) {
            System.out.print("Enter the Valid Number : ");
            Scanner sc = new Scanner(System.in);
            Number = sc.nextInt();
            switch (Number) {
                case 1:
                    System.out.println();
                    System.out.println("You have selected Tomchi");
                    lisT.add("Tomchi");
                    //System.out.println(lisT);
                    ADE.tomchiAddablessExecution();
                    flag = false;
                    break;
                case 2:
                    System.out.println();
                    System.out.println("You have selected Caponito");
                    lisT.add("Caponito");
                    ADE.caponitoAddablessExecution();
                
                    flag = false;
                    break;
                default:
                    System.out.println("You have entered the wrong serial number");
            }
        }
        System.out.println(lisT);
    }

    public void premiumvarities() {
        V1.premiumVariety();

        System.out.println("please select your varieties according to Serial Number");
        Boolean flag = true;
        while (flag) {
            System.out.print("Enter the Valid Number : ");
            Scanner sc = new Scanner(System.in);
            Number = sc.nextInt();
            switch (Number) {
                case 1:
                    System.out.println();
                    System.out.println("You have selected Red Indian");
                    lisT.add("Red-Indian");
                    ADE.redindianAddablessExecution();

                    flag = false;
                    break;
                case 2:
                    System.out.println();
                    System.out.println("You have selected Party Lovers");
                    lisT.add("Party-Lovers");
                    ADE.partyloversAddablessExecution();
             
                    flag = false;
                    break;
                default:
                    System.out.println("You have entered the wrong serial number");
            }
           
        }
        System.out.println(lisT);
    }

    public void supremevarities() {
        V1.supremeVariety();

        System.out.println("please select your varieties according to Serial Number");
        Boolean flag = true;
        while (flag) {
            System.out.print("Enter the Valid Number : ");
            Scanner sc = new Scanner(System.in);
            Number = sc.nextInt();
            switch (Number) {
                case 1:
                    System.out.println();
                    System.out.println("You have selected American Heat");
                    lisT.add("American-Heat");
                    ADE.americanheatAddablessExecution();
               
                    flag = false;
                    break;
                case 2:
                    System.out.println();
                    System.out.println("You have selected Re-Union");
                    lisT.add("Re-Union");
                    ADE.reunionAddablessExecution();
                  
                    flag = false;
                    break;
                default:
                    System.out.println("You have entered the wrong serial number");
            }
        }
        System.out.println(lisT);
    }
}