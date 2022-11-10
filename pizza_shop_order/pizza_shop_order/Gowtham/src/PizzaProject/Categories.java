package PizzaProject;

import java.util.*;

public class Categories {
    int SerialNo;
    ArrayList lisT = new ArrayList<>();

    public Categories(ArrayList Al){
        this.lisT = Al;
    }
    public void Select() {
        
        System.out.println("_______________________________________________________________");
        System.out.println("Here are your categories");
        String Categories[] = { "  1. Classic  ", "  2. Premium   ", "  3. Supreme  " };

        for (String sizes : Categories) {
            System.out.println(sizes);
        }

        System.out.println("___________________________________________________");
        System.out.println("please select the categories according to Serial Number");
        AllPrices AP1 = new AllPrices(lisT);
        Boolean flag = true;
        while (flag) {
            System.out.print("Enter the Valid Number : ");
            Scanner sc = new Scanner(System.in);
            SerialNo = sc.nextInt();
            switch (SerialNo) {
                case 1:
                    System.out.println();
                    System.out.println("You have selected Classic");
                    lisT.add("Classic");
                    AP1.classicPrice();
                    flag = false;
                    break;
                case 2:
                    System.out.println();
                    System.out.println("You have selected Premium");
                    lisT.add("Premium");
                    AP1.premiumPrice();
                    flag = false;
                    break;
                case 3:
                    System.out.println();
                    System.out.println("You have selected Supreme");
                    lisT.add("Supreme");
                    AP1.supremePrice();
                    flag = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("You have Entered the wrong number");
            }
        }

    }
}


// AL.add("Regular");
// AL1.add("Classic");
// AL.addALL(AL1);