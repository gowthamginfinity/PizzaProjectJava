package PizzaProject;

import java.util.*;



class SubCategories {
    

    public void classicPrices() {
        System.out.println("_______________________________________________________________");
        System.out.println("Here are your Prices for your selected category Classic");
        String Prices[] = { "  1. Regular = Rs. 135  ", "  2. Medium = Rs. 210   ", "  3. Large = Rs.360  " };
        for (String classicPrice : Prices) {
            System.out.println(classicPrice);
        }
    }

    public void premiumPrices() {
        System.out.println("_______________________________________________________________");
        System.out.println("Here are your Prices for your selected category Premium");
        String Prices[] = { "  1. Regular = Rs. 165  ", "  2. Medium = Rs. 240   ", "  3. Large = Rs.395  " };
        for (String premiumPrice : Prices) {
            System.out.println(premiumPrice);
        }

    }

    public void supremePrices() {
        System.out.println("_______________________________________________________________");
        System.out.println("Here are your Prices for your selected category Supreme");
        String Prices[] = { "  1. Regular = Rs. 190  ", "  2. Medium = Rs. 290   ", "  3. Large = Rs.425  " };
        for (String supremePrice : Prices) {
            System.out.println(supremePrice);
        }

    }
}

class AllPrices {
    public int ClassicRegular = 135;
    public int ClassicMedium = 210;
    public int ClassicLarge = 360;
    public int PremiumRegular = 165;
    public int PremiumMedium = 240;
    public int PremiumLarge = 395;
    public int SupremeRegular = 190;
    public int SupremeMedium = 290;
    public int SupremeLarge = 425;

    int priceNumber;
    ArrayList lisT = new ArrayList();
    AllVarieties AV2 = new AllVarieties(lisT);


    public AllPrices(ArrayList Al) {
        this.lisT = Al;
    }

    

    public void classicPrice() {
        SubCategories P1 = new SubCategories();
        P1.classicPrices();

        System.out.println("please select your prices according to Serial Number");
        Boolean flag = true;
        while (flag) {
            System.out.print("Enter the Valid Number : ");
            Scanner sc = new Scanner(System.in);
            priceNumber = sc.nextInt();
            switch (priceNumber) {
                case 1:
                    System.out.println();
                    System.out.println("You have selected Regular of " + ClassicRegular);
                    lisT.add(ClassicRegular);
                    AV2.classicvarities();
                    flag = false;
                    break;
                case 2:
                    System.out.println();
                    System.out.println("You have selected Medium" + ClassicMedium);
                    lisT.add(ClassicMedium);
                    AV2.classicvarities();
                    flag = false;
                    break;
                case 3:
                    System.out.println();
                    System.out.println("You have selected Large" + ClassicLarge);
                    lisT.add(ClassicLarge);
                    AV2.classicvarities();
                    flag = false;
                    break;
                default:
                    System.out.println("You have entered the wrong serial number");
            }
        }
    }

    public void premiumPrice() {
        SubCategories P1 = new SubCategories();
        P1.premiumPrices();

        System.out.println("please select your prices according to Serial Number");
        Boolean flag = true;
        while (flag) {
            System.out.print("Enter the Valid Number : ");
            Scanner sc = new Scanner(System.in);
            priceNumber = sc.nextInt();
            switch (priceNumber) {
                case 1:
                    System.out.println();
                    System.out.println("You have selected Regular of " + PremiumRegular);
                    lisT.add(PremiumRegular);
                    AV2.premiumvarities();
                    flag = false;
                    break;
                case 2:
                    System.out.println();
                    System.out.println("You have selected Medium" + PremiumMedium);
                    lisT.add(PremiumMedium);
                    AV2.premiumvarities();
                    flag = false;
                    break;
                case 3:
                    System.out.println();
                    System.out.println("You have selected Large" + PremiumLarge);
                    lisT.add(PremiumLarge);
                    AV2.premiumvarities();
                    flag = false;
                    break;
                default:
                    System.out.println("You have entered the wrong serial number");
            }
        }
    }

    public void supremePrice() {
        SubCategories P1 = new SubCategories();
        P1.supremePrices();

        System.out.println("please select your prices according to Serial Number");
        Boolean flag = true;
        while (flag) {
            System.out.print("Enter the Valid Number : ");
            Scanner sc = new Scanner(System.in);
            priceNumber = sc.nextInt();
            switch (priceNumber) {
                case 1:
                    System.out.println();
                    System.out.println("You have selected Regular of " + SupremeRegular);
                    lisT.add(SupremeRegular);
                    AV2.supremevarities();
                    flag = false;
                    break;
                case 2:
                    System.out.println();
                    System.out.println("You have selected Medium" + SupremeMedium);
                    lisT.add(SupremeMedium);
                    AV2.supremevarities();
                    flag = false;
                    break;
                case 3:
                    System.out.println();
                    System.out.println("You have selected Large" + SupremeLarge);
                    lisT.add(SupremeLarge);
                    AV2.supremevarities();
                    flag = false;
                    break;
                default:
                    System.out.println("You have entered the wrong serial number");
            }
        }
    }

}
