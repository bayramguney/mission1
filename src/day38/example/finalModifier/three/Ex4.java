package day38.example.finalModifier.three;

import two.Constants;

public class Ex4 {

    public static void main(String[] args) {
        System.out.println("My course is: " + Constants.courseName);

        System.out.println(Constants.amazonURL);

        String todaysDeals = "gp/goldbox?ref_=nav_cs_gb_azl";
        String bestSellers = "gp/bestsellers/?ref_=nav_cs_bestsellers";

        System.out.println("Testing Today's Deals");
        System.out.println(Constants.amazonURL + todaysDeals);
        System.out.println("Testing successful");

        System.out.println("Testing Best Sellers");
        System.out.println(Constants.amazonURL + bestSellers);
        System.out.println("Testing successful");





    }
}
