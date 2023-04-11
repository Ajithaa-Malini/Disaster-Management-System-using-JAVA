
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ponth
 */
public class zonecheck extends DisasterManagement implements Records{
    public String check;
    public int range;
    public int ranking;
    public String placee;
   
    zonecheck()
    {
        placee=super.getPlace();
        check=super.getZone();
    }
    public void checkZone()
    {
        Scanner in=new Scanner(System.in);
       // if("seismic".equals(zone))
    //    {
            System.out.println("ENTER ZONE RANGE(2 to 4):");
            range=in.nextInt();
            switch (range) {
                case 2 -> System.out.println(" RANKING:"+1);
                case 3 -> System.out.println(" RANKING="+2);
                case 4 -> System.out.println(" RANKING="+3);
                case 5 -> System.out.println(" RANKING="+4);
                default -> {
                }
      //      }
        }
    }
    
}
