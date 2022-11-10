package PizzaProject;

import java.util.*;



class addabless {
    public void tomchiaddabless() {
        System.out.println("_______________________________________________________________");
        System.out.println("Here are your Ingredients of TOMCHI");
        String Ingredients[] = { "  1. Tomato  ", "  2. Onion   ", "  3. Chilly&Cheese  " };

        for (String sizes : Ingredients) {
            System.out.println(sizes);
        }

    }

    public void caponitoaddabless() {
        System.out.println("_______________________________________________________________");
        System.out.println("Here are your Ingredients of CAPONITO");
        String Ingredients[] = { "  1. Capsicum  ", "  2. Onion   ", "  3. Tomato&Cheese  " };

        for (String sizes : Ingredients) {
            System.out.println(sizes);
        }

    }

    public void redindianaddabless() {
        System.out.println("_______________________________________________________________");
        System.out.println("Here are your Ingredients of Red-Indian");
        String Ingredients[] = { "  1. Cheese  ", "  2. Paneer   ", "  3. Chilly  " };

        for (String sizes : Ingredients) {
            System.out.println(sizes);
        }

    }

    public void partyloversaddabless() {
        System.out.println("_______________________________________________________________");
        System.out.println("Here are your Ingredients of Party-Lovers");
        String Ingredients[] = { "  1. Cheese  ", "  2. SweetCorn   ", "  3. Capsicum  ", "  4. Tomato " };

        for (String sizes : Ingredients) {
            System.out.println(sizes);
        }

    }

    public void americanheataddabless() {
        System.out.println("_______________________________________________________________");
        System.out.println("Here are your Ingredients of AmericanHeat");
        String Ingredients[] = { "  1. Cheese  ", "  2. Capsicum   ", "  3. BabyCorn  " };

        for (String sizes : Ingredients) {
            System.out.println(sizes);
        }

    }

    public void reunionaddabless() {
        System.out.println("_______________________________________________________________");
        System.out.println("Here are your Ingredients of Re-Union");
        String Ingredients[] = { "  1. Cheese  ", "  2. Spinach   ", "  3. Capsicum  ", "  4. BabyCorn  ",
                "  5. Olives  " };

        for (String sizes : Ingredients) {
            System.out.println(sizes);
        }

    }

}

class addablessExecution {
    public addablessExecution(ArrayList Al){
        this.lisT = Al;
    }
    ArrayList lisT = new ArrayList();
    addabless AD = new addabless();
    Scanner sc = new Scanner(System.in);

    public void tomchiAddablessExecution() {
        AD.tomchiaddabless();
        System.out.print("Enter how many ingredients should add: ");
        String Str[] = new String[sc.nextInt()];
        System.out.println();
        sc.nextLine();
        System.out.print("Enter your ingredients seperate it by ','s : ");
        for (int i = 0; i < Str.length; i++) {
            Str[i] = sc.nextLine();
        }
        System.out.print("The selected ingredients are : ");
        for (String names : Str) {
            System.out.print(names);
        }
        

    }

    public void caponitoAddablessExecution() {
        AD.caponitoaddabless();
        System.out.print("Enter how many ingredients should add: ");
        String Str[] = new String[sc.nextInt()];
        System.out.println();
        sc.nextLine();
        System.out.print("Enter your ingredients seperate it by ','s : ");
        for (int i = 0; i < Str.length; i++) {
            Str[i] = sc.nextLine();
        }
        System.out.print("The selected ingredients are : ");
        for (String string : Str) {
            System.out.print(string);
        }

    }

    public void redindianAddablessExecution() {
        AD.redindianaddabless();
        System.out.print("Enter how many ingredients should add: ");
        String Str[] = new String[sc.nextInt()];
        System.out.println();
        sc.nextLine();
        System.out.print("Enter your ingredients seperate it by ','s : ");
        for (int i = 0; i < Str.length; i++) {
            Str[i] = sc.nextLine();
        }
        System.out.print("The selected ingredients are : ");
        for (String string : Str) {
            System.out.print(string);
        }

    }

    public void partyloversAddablessExecution() {
        AD.partyloversaddabless();
        System.out.print("Enter how many ingredients should add: ");
        String Str[] = new String[sc.nextInt()];
        System.out.println();
        sc.nextLine();
        System.out.print("Enter your ingredients seperate it by ','s : ");
        for (int i = 0; i < Str.length; i++) {
            Str[i] = sc.nextLine();
        }
        System.out.print("The selected ingredients are : ");
        for (String string : Str) {
            System.out.print(string);
        }

    }

    public void americanheatAddablessExecution() {
        AD.americanheataddabless();
        System.out.print("Enter how many ingredients should add: ");
        String Str[] = new String[sc.nextInt()];
        System.out.println();
        sc.nextLine();
        System.out.print("Enter your ingredients seperate it by ','s : ");
        for (int i = 0; i < Str.length; i++) {
            Str[i] = sc.nextLine();
        }
        System.out.print("The selected ingredients are : ");
        for (String string : Str) {
            System.out.print(string);
        }

    }

    public void reunionAddablessExecution() {
        AD.reunionaddabless();
        System.out.print("Enter how many ingredients should add: ");
        String Str[] = new String[sc.nextInt()];
        System.out.println();
        sc.nextLine();
        System.out.print("Enter your ingredients seperate it by ','s : ");
        for (int i = 0; i < Str.length; i++) {
            Str[i] = sc.nextLine();
        }
        System.out.print("The selected ingredients are : ");
        for (String string : Str) {
            System.out.print(string);
        }


    }
    

}
