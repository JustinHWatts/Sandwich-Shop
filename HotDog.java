/**
 * HotDog.java - Contains the information for a Hot Dog.
 * 
 * @author Justin Watts
 * @version 23-NOV-2014
 */
public class HotDog extends Sandwich
{
    public HotDog(String _size, int _numToppings, String _toppings, String _condiments)
    {
        super("Hot Dog", _size, _numToppings, _toppings, _condiments, 1.5);
    }
}