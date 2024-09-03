/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ban;
import java.util.Scanner;
/**
 *
 * @author CL3-PC5
 */
public class Ban {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("[1] - Snacks");
        System.out.println("[2] - Drinks");
     
        
        System.out.println("Enter your choice:");
        int ch1 = input.nextInt();
        
       
            if(ch1==1)
            {
            System.out.println("Snacks");
            System.out.println("[1] - piatos");
            System.out.println("[2] - nova");
            
                System.out.println("Enter your choice:");
                int ch2 = input.nextInt();
               
                    if(ch2==1)
                    {
                    System.out.println("piatos 15.00");
                    int pia,nova;
                    pia = 15;
                    nova = 17;
                    
                    System.out.println("do you want drinks? [1] yes [2] no:");
                    int ch3 = input.nextInt();
                    
                        if(ch3==1)
                        {
                        System.out.println("Drinks");
                        System.out.println("[1] = coke");
                        System.out.println("[2] = water");
                        
                            System.out.println("Enter your choice:");
                            int ch4 = input.nextInt();
                            
                                if(ch4==1)
                                {
                                System.out.println("Coke 12.00");
                                int coke,water;
                                coke = 12;
                                water = 15;
                                
                                int tot;
                                tot = pia + coke;
                                System.out.println("Total is :" + tot);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                                
                                    
                                
                                }
                                
                                if(ch4==2)
                                {
                                System.out.println("water 15.00");
                                int coke,water;
                                coke = 12;
                                water = 15;
                                
                                int tot;
                                tot = pia + water;
                                System.out.println("Total is :" + tot);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                                
                                
                                }
                                
                        }
                          System.out.println("invalid input");
                                int tot;
                                tot = pia;
                                System.out.println("Total is :" + pia);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                        
                    }
                    
                   
                      if(ch2==2)
                    {
                    System.out.println("nova 17.00");
                    int pia,nova;
                    pia = 15;
                    nova = 17;
                    
                    System.out.println("do you want drinks? [1] yes [2] no:");
                    int ch3 = input.nextInt();
                    
                        if(ch3==1)
                        {
                        System.out.println("Drinks");
                        System.out.println("[1] = coke");
                        System.out.println("[2] = water");
                        
                            System.out.println("Enter your choice:");
                            int ch4 = input.nextInt();
                            
                                if(ch4==1)
                                {
                                System.out.println("Coke 12.00");
                                int coke,water;
                                coke = 12;
                                water = 15;
                                
                                int tot;
                                tot = nova + coke;
                                System.out.println("Total is :" + tot);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                                
                                
                                }
                                
                                if(ch4==2)
                                {
                                System.out.println("water 15.00");
                                int coke,water;
                                coke = 12;
                                water = 15;
                                
                                int tot;
                                tot = nova + water;
                                System.out.println("Total is :" + tot);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                                
                                
                                }
                                
                        }
                          System.out.println("invalid input");
                         int tot;
                                tot = nova;
                                System.out.println("Total is :" + nova);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                                    
                                    
                                    
                    }  
                      
                      
                
            } 
                
           
            if(ch1==2)
            {
            System.out.println("Drinks");
            System.out.println("[1] = coke");
            System.out.println("[2] = water");
            
                System.out.println("Enter your choice:");
                int ch2 = input.nextInt();
               
                    if(ch2==1)
                    {
                    System.out.println("Coke 12.00");
                    int coke,water;
                    coke = 12;
                    water = 15;
                    
                    System.out.println("Do you want snacks? [1] yes [2] no:");
                    int ch3 = input.nextInt();
                    
                        if(ch3==1)
                        {
                        System.out.println("Snacks");
                        System.out.println("[1] - piatos");
                        System.out.println("[2] - nova");
                        
                            System.out.println("Enter your choice:");
                            int ch4 = input.nextInt();
                            
                                if(ch4==1)
                                {
                                System.out.println("pia 15.00");
                                int pia,nova;
                                pia = 15;
                                nova = 17;
                                
                                int tot;
                                tot = coke + pia;
                                System.out.println("Total is :" + tot);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                                
                                
                                }
                               
                                if(ch4==2)
                                {
                                System.out.println("nova 17.00");
                                int pia,nova;
                                pia = 15;
                                nova = 17;
                                
                                int tot;
                                tot = coke + nova;
                                System.out.println("Total is :" + tot);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                                
                                
                                }
                                
                        }
                          System.out.println("invalid input");
                         int tot;
                                tot = coke;
                                System.out.println("Total is :" + coke);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                    }
                    
                    
                      if(ch2==2)
                    {
                    System.out.println("water 15.00");
                    int coke,water;
                    coke = 12;
                    water = 15;
                    
                    System.out.println("Do you want snacks? [1] yes [2] no:");
                    int ch3 = input.nextInt();
                    
                        if(ch3==1)
                        {
                        System.out.println("Snacks");
                        System.out.println("[1] - pia");
                        System.out.println("[2] - nova");
                        
                            System.out.println("Enter your choice:");
                            int ch4 = input.nextInt();
                            
                                if(ch4==1)
                                {
                                System.out.println("pia 15.00");
                                int pia,nova;
                                pia = 15;
                                nova = 17;
                                
                                int tot;
                                tot = water + pia;
                                System.out.println("Total is :" + tot);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                                
                                
                                }
                                
                                if(ch4==2)
                                {
                                System.out.println("nova 17.00");
                                int pia,nova;
                                pia = 15;
                                nova = 17;
                                
                                int tot;
                                tot = coke + nova;
                                System.out.println("Total is :" + tot);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                                
                                
                                }
                              
                                System.out.println("invalid input");       
                        }
                        System.out.println("invalid input");
                           int tot;
                                tot = water;
                                System.out.println("Total is :" + water);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);  
                                     
                    }  
                     System.out.println("invalid input");
            }
                 System.out.println("invalid input");
    }
    
}

    

