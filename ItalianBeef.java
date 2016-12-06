/**
 * ItalianBeef.java - Contains the information for an Italian Beef.
 * 
 * @author Justin Watts
 * @version 23-NOV-2014
 */
public class ItalianBeef extends Sandwich
{
    private String type;
    
    public ItalianBeef(String _size, int _numToppings, String _toppings, String _condiments, String _type)
    {
        super("Italian Beef", _size, _numToppings, _toppings, _condiments, 4.0);
        this.type = _type;
    }
    
    public String toString()
    {
        return super.size + " " + this.type + " " + super.foodType + "\nwith: " + super.toppings + " and "
            + super.condiments + "\nprice: $" + super.calculatePrice();
    }
}