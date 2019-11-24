package day38.example.finalModifier.three;


import day38.example.finalModifier.two.MyUnchangeableVariable;

public class Ex4 {

    public static void main(String[] args) {
        System.out.println("My course is: " + MyUnchangeableVariable.COURSE_NAME);

        System.out.println(MyUnchangeableVariable.AMAZON_URL);

        String todaysDeals = "gp/goldbox?ref_=nav_cs_gb_azl";
        String bestSellers = "gp/bestsellers/?ref_=nav_cs_bestsellers";

        System.out.println("Testing Today's Deals");
        System.out.println(MyUnchangeableVariable.AMAZON_URL + todaysDeals);
        System.out.println("Testing successful");

        System.out.println("Testing Best Sellers");
        System.out.println(MyUnchangeableVariable.AMAZON_URL + bestSellers);
        System.out.println("Testing successful");





    }
}
