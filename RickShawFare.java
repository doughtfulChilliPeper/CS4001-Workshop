
/**
 * Write a description of class RickShawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class RickShawFare
{
    public static void main(String[] args){
    Scanner raw= new Scanner(System.in);
   
    {
        System.out.println("Enter the Distance");
        int dis= raw.nextInt();
        System.out.println("Enter the Time"); 
        double tim= raw.nextDouble();
        int baseFare=20;
        int chargeKm=10;
        int chargeTm=10;
        float nightcharge=5.5f;
        double fair;
        int dist=10;
        
        System.out.println("Enter day or night?(yes/no)");
        String day=raw.next().toLowerCase();
        
        System.out.println("Enter if local or not?(yes/no)");
        String people=raw.next().toLowerCase();
        fair=baseFare+(dis*chargeKm)+(chargeTm*tim);
       
        
        double charge= day.equals("yes") ? (fair+nightcharge):fair;
        double total= people.equals("yes") ? (charge-dist):charge;
        System.out.println("total fair="+total);
        raw.close();
        
    } 
    }
}