/**
 * Hamburger.java - Contains the information for a Hamburger.
 * 
 * @author Justin Watts
 * @version 23-NOV-2014
 */
public class Hamburger extends Sandwich
{
    public Hamburger(String _size, int _numToppings, String _toppings, String _condiments)
    {
        super("Hamburger", _size, _numToppings, _toppings, _condiments, 2.0);
    }
}