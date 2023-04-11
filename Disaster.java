/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ponth
 */
class Disaster 
{

   // private static Object records;
   public static void main(String args[])
   {
       DisasterManagement record=new DisasterManagement();
        record.getDetails();
    //    record.checkZone();
        record.display();
        zonecheck c=new zonecheck();
        c.checkZone();
      /*  hillZone h;
        h = new hillZone();*/
       // h.giveRanking();
       // System.out.println("ERROR HERE!");
        
   }
}


