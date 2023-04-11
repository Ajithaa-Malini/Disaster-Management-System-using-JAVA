/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ponth
 */
import java.util.*;
public class DisasterManagement implements Records{
    static{
        System.out.println("\t\tDISASTER MANAGEMENT AND RESCUE SERVICE\t\t");
    }
    public String disasterName;
    public String place;
    public String disasterType;
    public int fatalityRate;
    public int rescueRate;
    public String zone;
    @Override
    public void getDetails()
    {
       Scanner in=new Scanner(System.in);
       System.out.println("ENTER DISASTER NAME:");
       disasterName=in.next();
       System.out.println("ENTER PLACE OF DISASTER:");
       place=in.next();
       System.out.println("ENTER DISASTER TYPE:");
       disasterType=in.next();
       System.out.println("ENTER FATALITY RATE:");
       fatalityRate=in.nextInt();
       System.out.println("ENTER RESCUE RATE:");
       rescueRate=in.nextInt();
       System.out.println("ENTER ZONE OF INCIDENT:");
       zone=in.next();
    }

    /**
     *@Override
     */
    
    @Override
    public void display()
    {
        System.out.println("DISASTER NAME:"+disasterName);
        System.out.println("PLACE:"+place);
        System.out.println("DISASTER TYPE:"+disasterType);
        System.out.println("FATALITY RATE:"+fatalityRate+"%");
        System.out.println("RESCUE RATE"+rescueRate+"%");
        System.out.println("ZONE::"+zone);
        
    }
    @Override
    public String getZone()
    {
        return zone;
    }
    @Override
    public String getPlace()
    {
        return place;
    }
}
