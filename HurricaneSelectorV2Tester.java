
/**
 * @purpose: To calculate various properties of hurricanes and print
 * the data using the HurricaneSelectorV2 class.
 *
 * @author Aparna Bhooshanan
 * @version 5-13-21
 */
import java.util.ArrayList;
import java.util.Scanner;
public class HurricaneSelectorV2Tester
{
    public static void main(String[] args)
    {
        ArrayList<HurricaneSelectorV2> hurricanes = new ArrayList<HurricaneSelectorV2>();
            hurricanes.add(new HurricaneSelectorV2 ("Europa", 1999, 344, 85));
            hurricanes.add(new HurricaneSelectorV2 ("Ganymede", 2000, 1000, 101));
            hurricanes.add(new HurricaneSelectorV2 ("Io", 2001, 967, 76));
            hurricanes.add(new HurricaneSelectorV2 ("Callisto", 2002, 954, 86));
            hurricanes.add(new HurricaneSelectorV2 ("Amalthea", 2003, 942, 72));
            hurricanes.add(new HurricaneSelectorV2 ("Himalia", 2004, 923, 89));
            hurricanes.add(new HurricaneSelectorV2 ("Valetudo", 2005, 799, 97));
            hurricanes.add(new HurricaneSelectorV2 ("Adrastea", 924, 881, 91));
            hurricanes.add(new HurricaneSelectorV2 ("Thebe", 2007, 912, 92));
            hurricanes.add(new HurricaneSelectorV2 ("Pasiphae", 2008, 487, 85));
            
        for(HurricaneSelectorV2 i : hurricanes)
        {
            i.calcMph();
            i.findCat();
        }
        
        System.out.println("\t\tHurricanes from 1999-2008");
        System.out.printf("%-10s%-15s%-15s%-20s%-25s", "Year", "Hurricane", "Category", "Pressure (mb)", "Wind Speed (mph)");
        System.out.println();
        
        double catSum = 0;
        double pressSum = 0;
        double mphSum = 0;
        
        int catMin = Integer.MAX_VALUE;
        int catMax = Integer.MIN_VALUE;
        
        int pressMin = Integer.MAX_VALUE;
        int pressMax = Integer.MIN_VALUE;
        
        double mphMin = Double.MAX_VALUE;
        double mphMax = Double.MIN_VALUE;
        
        double catAvg;
        double pressAvg;
        double mphAvg;
        
        for(HurricaneSelectorV2 i : hurricanes)
        {
            System.out.printf("%-10d%-18s%-14d%6d%21.2f", i.getYear(), i.getName(), i.getCat(), i.getPress(), i.getMph());
            System.out.println();
            
            catSum+=i.getCat();
            pressSum+=i.getPress();
            mphSum+=i.getMph();
            
            if(i.getCat()<catMin)
            {catMin = i.getCat();}
            if(i.getCat()>catMax)
            {catMax = i.getCat();}
            if(i.getPress()<pressMin)
            {pressMin = i.getPress();}
            if(i.getPress()>pressMax)
            {pressMax = i.getPress();}
            if(i.getMph()<mphMin)
            {mphMin = i.getMph();}
            if(i.getMph()>mphMax)
            {mphMax = i.getMph();}
        }
                catAvg = catSum/hurricanes.size();
                pressAvg = pressSum/hurricanes.size();
                mphAvg = mphSum/hurricanes.size();
        
        System.out.println("===============================================================================================");
        System.out.printf("     Average:  %16.1f%20.2f%18.2f", catAvg, pressAvg, mphAvg);
        System.out.println();
        System.out.printf("     Minimum:  %14d%19d%21.2f", catMin, pressMin, mphMin);
        System.out.println();
        System.out.printf("     Maximum:  %14d%20d%20.2f", catMax, pressMax, mphMax);
        System.out.println();
        System.out.println();

    }
}
