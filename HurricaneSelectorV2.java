
/**
 * @purpose: To provide instance variables and methods to perform
 * various calculations with objects of the HurricaneSelectorV2 class.
 *
 * @author Aparna Bhooshanan
 * @version 5-13-21
 */
public class HurricaneSelectorV2
{
    //private instance variables
    private String name;
    private int year;
    private int press;
    private int speed;
    private double mph;
    private int cat;
    
    /**
     * constructor for HurricaneSelectorV2 object
     * @param n hurricane name
     * @param yr hurricane year
     * @param prs hurricane pressure
     * @param spd hurricane wind speed (knots)
     */
    HurricaneSelectorV2(String n, int yr, int prs, int spd)
    {
        name = n;
        year = yr;
        press = prs;
        speed = spd;
        mph = 0;
        cat = 0;
    }
    
    /**
     * mutator method to calculate speed in mph
     * no params
     */
    public void calcMph()
    {
        mph = speed*1.151;
    }
    
    /**
     * setter method to set category
     * no params
     */
    public void findCat()
    {
        if(mph>=74&&mph<=95)
        {cat=1;}
        if(mph>=96&&mph<=110)
        {cat=2;}
        if(mph>=111&&mph<=129)
        {cat=3;}
        if(mph>=130&&mph<=156)
        {cat=4;}
        if(mph>=157)
        {cat=5;}
    }
    
    /**
     * getter method to return hurricane name
     * no params
     */
    public String getName()
    {return name;}
    
    /**
     * getter method to return hurricane year
     * no params
     */
    public int getYear()
    {return year;}
    
    /**
     * getter method to return hurricane pressure
     * no params
     */
    public int getPress()
    {return press;}
    
    /**
     * getter method to return hurricane speed (knots)
     * no params
     */
    public int getSpeed()
    {return speed;}
    
    /**
     * getter method to return hurricane speed (mph)
     * no params
     */
    public double getMph()
    {return mph;}
    
    /**
     * getter method to return hurricane category
     * no params
     */
    public int getCat()
    {return cat;}
    
    /**
     * returns object values in String
     * no params
     */
    public String toString()
    {
        String str = (year + "\t" + name + "\t" + press + "\t" + mph + "\t" + cat);
        return str;
    }
}