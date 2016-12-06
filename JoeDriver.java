/**
 * JoeDriver.java - Test Driver for Joe's Sandwich Shop.
 * 
 * @author Justin Watts
 * @version 23-NOV-2014
 */
public class JoeDriver
{
    public static void main(String[] args)
    {
        /*
        HotDog hotdog = new HotDog("regular", 2, "tomato, onions", "");
        System.out.println(hotdog.toString());
        
        Hamburger hamburger = new Hamburger("2 patty", 4, "cheese, bacon, lettuce, tomato", "ketchup");
        System.out.println(hamburger.toString());
        
        ItalianBeef italianbeef = new ItalianBeef("big", 1, "hot peppers", "", "wet");
        System.out.println(italianbeef.toString());
        */
        
        Sandwich[] sandwiches = {new Hamburger("2 patty", 5, "cheese, lettuce, tomato, onions, pickle", "ketchup"),
            new ItalianBeef("regular", 1, "mild peppers", "", "dry"),
            new HotDog("foot long", 0, "", "ketchup/mustard"),
            new Hamburger("1 patty", 3, "cheese, lettuce, tomato", "")};
        double totalPrice = 0;
        
        System.out.println("Joe's Sandwich Shop\n");
        
        for (Sandwich sandwich : sandwiches)
        {
            System.out.println(sandwich.toString());
            System.out.println();
            totalPrice += sandwich.getPrice();
        }
        
        System.out.print("Order Total: $" + totalPrice);
    }
}