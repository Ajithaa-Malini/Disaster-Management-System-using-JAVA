
import java.util.Scanner;
import java.lang.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ponth
 */
public class hillZone extends DisasterManagement implements Records
{
   public String Zone;
   public Integer vb;//wind speed
   Scanner in=new Scanner(System.in);
   //constructor
   public hillZone()
   {
       this.Zone="";
   }
    public hillZone(String zone) {
        this.Zone =super.getZone();
        giveRanking();
    }
   
   public final void giveRanking()
   {
       if("hill".equals(Zone))
       {
           System.out.println("ENTER WIND SPEED OF THE HILL REGION"+Zone+":");
           vb=in.nextInt();
           if(vb>=55)
           {
               System.out.println("Its VERY HIGH DAMAGE RISK ZONE"+"A"+"RANKING ="+4);
           }
           else if(vb>=50)
           {
               System.out.println("Its VERY HIGH DAMAGE RISK ZONE"+"B"+"RANKING ="+3.5);
           }
           else if(vb>=47)
           {
               System.out.println("Its HIGH DAMAGE RISK ZONE"+"RANKING ="+2);
           }
           }else if(vb>=44)
           {
               System.out.println("Its MODERATE DAMAGE RISK ZONE"+"A"+"RANKING ="+2);
            }
           else if(vb>=39)
           {
               System.out.println("Its MODERATE DAMAGE RISK ZONE"+"B"+"RANKING ="+1.5);
            }
           else if(vb>=33)
           {
               System.out.println("Its LOW DAMAGE RISK ZONE"+"RANKING ="+1);
            }
   }   }
  
   

