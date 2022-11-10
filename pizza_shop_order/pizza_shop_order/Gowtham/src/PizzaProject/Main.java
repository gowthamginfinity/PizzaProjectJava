package PizzaProject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList lisT = new ArrayList();
        Welcome w1 = new Welcome(lisT);
        w1.selectCuisine();
       
        System.out.println(lisT);

    }
}
