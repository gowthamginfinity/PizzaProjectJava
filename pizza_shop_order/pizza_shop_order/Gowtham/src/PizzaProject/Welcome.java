package PizzaProject;

import java.util.*;

class Welcome {
    int Number;
    Scanner sc = new Scanner(System.in);
    ArrayList lisT = new ArrayList();

    public Welcome(ArrayList Al) {
    this.lisT=Al;
    }

    public void selectCuisine() {
        System.out.println("-------------Welcome to the Pizza Shop-------------");
        System.out.println();
        System.out.println("-------------(  Here are our Cuisine  )------------");
        System.out.println("___________________________________________________");
        System.out.println();
        String Cuisine[] = { "  1. Regular  ", "  2. Jain   ", "  3. Non-veg  " };
        for (String types : Cuisine) {
            System.out.println(types);
        }
        // ---------------------------------------------------------------------------------------------------------------------------------
        Categories A1 = new Categories(lisT);
        System.out.println("___________________________________________________");
        System.out.println("please select the order according to Serial Number");

        Boolean flag = true;
        while (flag) {
            System.out.print("Enter the Valid Number : ");
            Number = sc.nextInt();
            switch (Number) {
                case 1:
                    System.out.println();
                    System.out.println("You have selected Regular");
                    lisT.add("Regular");
                    
                    A1.Select();   //Calling method for categories
                    flag = false;
                    break;
                case 2:
                    System.out.println();
                    System.out.println("You have selected Jain");
                    lisT.add("Jain");
                    A1.Select();   //Calling method for categories
                    flag = false;
                    break;
                case 3:
                    System.out.println();
                    System.out.println("You have selected Non-Veg");
                    lisT.add("Non-Veg");
                    A1.Select();   //Calling method for categories
                    flag = false;
                    break;
                default:
                    System.out.println("You have entered the wrong serial number");
            }
        }
    }
}
