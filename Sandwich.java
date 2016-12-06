/**
 * Sandwich.java - Contains the basic information of a sandwich.
 * 
 * @author Justin Watts
 * @version 23-NOV-2014
 */
public abstract class Sandwich
{
    protected String foodType;
    protected String size;
    protected int numToppings;
    protected String toppings;
    protected String condiments;
    protected double price;
    
    final double HOTDOG_TOPPING = 0.3;
    final double HAMBURGER_TOPPING = 0.5;
    final double ITALIAN_TOPPING = 0.75;
    final double HOTDOG_INCREASE = 1.0;
    final double HAMBURGER_INCREASE = 2.0;
    final double ITALIAN_INCREASE = 1.5;
    
    public Sandwich(String _foodType, String _size, int _numToppings, String _toppings, String _condiments, double _price)
    {
        this.foodType = _foodType;
        
        if (this.foodType.equals("Hot Dog"))
        {
            if (_size.equals("regular") || _size.equals("foot long"))
                this.size = _size;
            else
                this.size = "regular";
        }
        else if (this.foodType.equals("Hamburger"))
        {
            if (_size.equals("1 patty") || _size.equals("2 patty") || _size.equals("3 patty"))
                this.size = _size;
            else
                this.size = "1 patty";
        }
        else if (this.foodType.equals("Italian Beef"))
        {
            if (_size.equals("regular") || _size.equals("big"))
                this.size = _size;
            else
                this.size = "regular";
        }
        
        if (_numToppings >= 0)
            this.numToppings = _numToppings;
        else
            this.numToppings = 0;
        
        if (_toppings.equals(""))
            this.toppings = "no toppings";
        else
            this.toppings = _toppings;
        
        if (_condiments.equals(""))
            this.condiments = "no condiments";
        else
            this.condiments = _condiments;
        
        this.price = _price;
    }

    public double calculatePrice()
    {
        if (this.foodType.equals("Hot Dog"))
        {
            this.price += HOTDOG_TOPPING * this.numToppings;
            if (this.size.equals("foot long"))
                this.price += HOTDOG_INCREASE;
        }
        else if (this.foodType.equals("Hamburger"))
        {
            this.price += HAMBURGER_TOPPING * this.numToppings;
            switch (this.size)
            {
                case "3 patty":
                    this.price += HAMBURGER_INCREASE * 2;
                    break;
                case "2 patty":
                    this.price += HAMBURGER_INCREASE;
                default:
                    this.price += 0;
            }
        }
        else if (this.foodType.equals("Italian Beef"))
        {
            this.price += ITALIAN_TOPPING * this.numToppings;
            if (this.size.equals("big"))
                this.price += ITALIAN_INCREASE;
        }
        
        return this.price;
    }
    
    public double getPrice()
    {
        return this.price;
    }
    
    public String toString()
    {
        return this.size + " " + this.foodType + "\nwith: " + this.toppings + " and " + this.condiments
            + "\nprice: $" + this.calculatePrice();
    }
}