package javaapplication4;

import java.util.ArrayList;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;
import jdk.nashorn.internal.parser.TokenType;
import sun.net.ProgressSource;

public class JavaApplication4
{
    
    public static void main(String[] args)
    {
        boolean ort = false;
        ArrayList<Account> Accountssss = new ArrayList<>();
    
        Scanner POG = new Scanner(System.in);
        
         Account dog = new Account();
        dog.SetName("Dog");
        dog.setAccNum(11);
        dog.FirstDeposit(100);
        dog.Setstrtdt(2,2016);
        dog.CelcIn();
        
        Account cat = new Account();
        cat.SetName("Cat");
        cat.setAccNum(23);
        cat.FirstDeposit(80000);
        cat.Setstrtdt(8,1980);
        cat.CelcIn();
        
        Account fish = new Account();
        fish.SetName("Fish");
        fish.setAccNum(67);
        fish.FirstDeposit(700);
        fish.Setstrtdt(1,1999);
        fish.CelcIn();
        
        Account mongoose = new Account();
        mongoose.SetName("Mongoose");
        mongoose.setAccNum(67);
        mongoose.FirstDeposit(598123.66);
        mongoose.Setstrtdt(4,2006);
        mongoose.CelcIn();
        
        Account orca = new Account();
        orca.SetName("Orca");
        orca.setAccNum(89);
        orca.FirstDeposit(786.33);
        orca.Setstrtdt(3,2015);
        orca.CelcIn();
        
        Accountssss.add(dog);
        Accountssss.add(cat);
        Accountssss.add(fish);
        Accountssss.add(mongoose);
        Accountssss.add(orca);
        
       
        
        while(!ort == true)
        {
        System.out.print("\nHello! Welcome to The beefy private bank.");
        
        System.out.println("\nDo you have an account with us currently or is this your first time.\n"
                + "Press one if you have and account."
                + "\nPress two if you haven't made an account and wish to make your first deposit."
                + "\nPress three to Sign out."
                + "\n\nPress four to view bank stats. ");
        
          int hug = POG.nextInt();
          
            switch (hug) {
                case 1:
                    Directory(true,Accountssss);
                    break;
                case 2:
                    NewAcc(Accountssss);
                    break;
                case 3:
                    System.out.println("Thank you for visiting Beefy Private Bank. Have a good day.");
                    ort = true;
                    break;
                
//           if(hug == 1)
//          {
//              Directory(true,Accountssss);
//          }
//          else if(hug == 2)
//          {
//              NewAcc(Accountssss);
//          }
//          else if (hug == 3)
//          {
//              System.out.println("Thank you for visiting Beefy Private Bank. Have a good day.");
//              ort = true;
//          }
//          else if (hug ==4)
//          {
//              BankStats(Accountssss);
//          }
                case 4:
                    BankStats(Accountssss);
                    break;
                default:
                    break;
            }
        }
        
    }
    
    
    public static void Directory(boolean guf, ArrayList<Account> dog)
    {
        int j = 0;
        Scanner Mike = new Scanner(System.in);
        boolean huf = guf;
        if(huf == true)
        {
            System.out.println("Hello! which account would you like to access.");
            for(Account d : dog)
            {   j++;
                System.out.println(d.GITNAME());
                System.out.println("Press "+ j+" for " + d.GITNAME());
            }
            System.out.println("");
            int flio = Mike.nextInt();
            
            
            if (dog.contains(dog.get(flio-1)))
            {
            AccMng(dog.get(flio -1).GITNAME(), dog.get(flio - 1));
            }else
            {
                System.out.println("IT seems that we dont have that. Would you like to make a new account?");
                String hij = Mike.next();
                if (hij.equalsIgnoreCase("Yes"))
                {
                    NewAcc(dog);
                }else
                {
                    return;
                }
                
            }
//                   if(flio.equalsIgnoreCase("Dog"))
//            {
//                AccMng(flio, dog.get(0));
//                
//            } else if (flio.equalsIgnoreCase("Cat"))
//            {
//                AccMng(flio, dog.get(1));
//            }else if (flio.equalsIgnoreCase("Fish"))
//            {
//                AccMng(flio, dog.get(2));
//            }else if (flio.equalsIgnoreCase("Mongoose"))
//            {
//                AccMng(flio, dog.get(3));
//            }else if (flio.equalsIgnoreCase("Orca"))
//            {
//                AccMng(flio, dog.get(4));
//            }
//            else
//            {
//                System.out.println("That is not a valid account.");
//                System.out.println("Would you like to make a new account called " +flio + "?");
//                String hoj = Mike.next();
//                
//                if (hoj.equalsIgnoreCase("Yes"))
//                {
//                    NewAcc(dog);
//                }
//                else
//                {
//                    System.out.println("You will now be returned to the main menu.");
//                    return;
//                }
//            }
//            
//        
        } 


        else
        {
            return;
        }
        
   }
    
    public static void AccMng(String jug, Account lot)
    {
        Scanner ko = new Scanner(System.in);
        boolean jo = true;
        double FU = 0.0;
         String huew = " ";
        System.out.println("Hello there " + jug);
        do
        {
        System.out.println("\nWhat would you like to do with your account? (Type what is inside the parenthesis next to the action to do it)"
                + "\nWould you like to Deposit (Deposit) ,Withdraw (withdraw) ,View balance (Balance)"
                + "\nView Balance History (BalHistory),See your first deposit (FirstDeposit) ,View your interest (Interest)"
                + "\nSee if you are active (active) ,date opened (dtOpened) ,Change your name (chngName) or sign-out (Sign-out).");
        String chose = ko.next();
        
    if(chose.equalsIgnoreCase("Deposit"))
    {System.out.println("How much would you like to deposit?");
       FU = ko.nextDouble();
       
       lot.Deposit(FU);
    
       System.out.println("\nWould you like to look at your options again or do you want to sign-out?");
        huew = ko.next();
        if (huew.equalsIgnoreCase("Sign-out"))
        {
            jo=false;
        }else if(huew.equalsIgnoreCase("options") )
        {
            jo = true;
        }
        else
        {
            System.out.println("Returning you to the main menu.");
            jo=false;
    }
    
    }else if(chose.equalsIgnoreCase("Withdraw"))
    {
     System.out.println("How much would you like to Withdraw?");
       FU = ko.nextDouble();
       
       lot.Withdraw(FU);   
       
       System.out.println("\nWould you like to look at your options again or do you want to sign-out?");
        huew = ko.next();
        if (huew.equalsIgnoreCase("Sign-out"))
        {
            jo=false;
        }else if(huew.equalsIgnoreCase("options") )
        {
            jo = true;
        }
        else
        {
            System.out.println("Returning you to the main menu.");
            jo=false;
    }
    }else if(chose.equalsIgnoreCase("Balance"))
    {
        lot.ViewBal();
        
         System.out.println("\nWould you like to look at your options again or do you want to sign-out?");
        huew = ko.next();
        if (huew.equalsIgnoreCase("Sign-out"))
        {
            jo=false;
        }else if(huew.equalsIgnoreCase("options") )
        {
            jo = true;
        }
        else
        {
            System.out.println("Returning you to the main menu.");
            jo=false;
    }
    }else if(chose.equalsIgnoreCase("BalHistory"))
    {
        lot.CheckBalHistory();
        
        
         System.out.println("\nWould you like to look at your options again or do you want to sign-out?");
        huew = ko.next();
        if (huew.equalsIgnoreCase("Sign-out"))
        {
            jo=false;
        }else if(huew.equalsIgnoreCase("options") )
        {
            jo = true;
        }
        else
        {
            System.out.println("Returning you to the main menu.");
            jo=false;
    }
    }else if(chose.equalsIgnoreCase("Active"))
    {
        lot.Active();
        
         System.out.println("\nWould you like to look at your options again or do you want to sign-out?");
        huew = ko.next();
        if (huew.equalsIgnoreCase("Sign-out"))
        {
            jo=false;
        }else if(huew.equalsIgnoreCase("options") )
        {
            jo = true;
        }
        else
        {
            System.out.println("Returning you to the main menu.");
            jo=false;
    }
    }else if(chose.equalsIgnoreCase("dtOpened"))
    {
     lot.Getstrtdt();
     
     System.out.println("\nWould you like to look at your options again or do you want to sign-out?");
        huew = ko.next();
        if (huew.equalsIgnoreCase("Sign-out"))
        {
            jo=false;
        }else if(huew.equalsIgnoreCase("options") )
        {
            jo = true;
        }
        else
        {
            System.out.println("Returning you to the main menu.");
            jo=false;
    }
    }else if(chose.equalsIgnoreCase("FirstDeposit"))
    {
        lot.GetFirstDep();
        
         System.out.println("\nWould you like to look at your options again or do you want to sign-out?");
        huew = ko.next();
        if (huew.equalsIgnoreCase("Sign-out"))
        {
            jo=false;
        }else if(huew.equalsIgnoreCase("options") )
        {
            jo = true;
        }
        else
        {
            System.out.println("Returning you to the main menu.");
            jo=false;
    }
    }else if(chose.equalsIgnoreCase("Interest"))
    {
       lot.CalcInterest();
        
       System.out.println("\nWould you like to look at your options again or do you want to sign-out?");
        huew = ko.next();
        if (huew.equalsIgnoreCase("Sign-out"))
        {
            jo=false;
        }else if(huew.equalsIgnoreCase("options") )
        {
            jo = true;
        }
        else
        {
            System.out.println("Returning you to the main menu.");
            jo=false;
        }
    }
    
    else if(chose.equalsIgnoreCase("ChngName"))
    {
        System.out.println("What would you like to change your name to?");
         huew = ko.next();
        lot.SetName(huew);
        
        System.out.println("\nWould you like to look at your options again or do you want to sign-out?");
        huew = ko.next();
        if (huew.equalsIgnoreCase("sign-out"))
        {
            jo=false;
        }else if(huew.equalsIgnoreCase("options") )
        {
            jo = true;
        }
        else
        {
            System.out.println("Returning you to the main menu.");
            jo=false;
    }
    }else if (chose.equalsIgnoreCase("Sign-out"))
    {
        jo=false;
    }
    }while(jo == true);
        }
    
    public static void NewAcc(ArrayList<Account> k)
    {
        boolean pl = true;
        double mongo = 0.0;
        int janitor = 0;
        
        Scanner NOOB = new Scanner(System.in);
        do
        {
        System.out.println("How many accounts would you like to open?");
        janitor = NOOB.nextInt();
        
        int start = k.size();
        for ( int i = 0; i < janitor; i++)
        {
            System.out.println("When are you making this account?(month)");
            int io = NOOB.nextInt();
            System.out.println("(Year?)");
            int oi = NOOB.nextInt();
           System.out.println("What do you want the name of your account to be?");
           String juh = NOOB.next();
           System.out.println("How much would you like your first deposit to be in this account?");
           mongo = NOOB.nextDouble();
           k.add(new Account());
           k.get(start+i).SetName(juh);
           k.get(start+i).Setstrtdt(io, oi);
           k.get(start+i).FirstDeposit(mongo);
            System.out.println("You made the new account " + juh+ " which is holding "+mongo+ " dollars!");
            k.get(start + i).setAccNum(i * start+87);
            System.out.println("Your account number is "+ k.get(start + i).gitAccnum()+". Made in "+k.get(start+i).gitstrtdt());
            k.get(start+i).CelcIn();
       
        }
        System.out.println("\nWould you like to make more acounts or do you want to go back to the main menu?"
                + "\nPress one to make more accounts."
                + "\nPress two to go back to main menu.");
        
        int kil = NOOB.nextInt();
         if (kil == 1)
         {
             pl = true;
         }else if (kil == 2 )
         {
             pl = false;
         }else 
         {
             System.out.println("OKE BYE");
             pl = false;
         }
        }while(pl == true);
         
        
        
        
    }
    
    public static void BankStats(ArrayList<Account> k)
    {
        double totbal = 0.0;
        double totInt = 0.0;
        int accnum = 0;
         for(Account d : k)
            {   
                accnum++;
                System.out.println(d.GITNAME()+"'s initial deposit was "+ d.GitFirstDep()+" made on "+ d.gitstrtdt() +". their Account number is "+d.gitAccnum());//ADD INTEREST SUCH AS d.GitNAME's interest paid out was d.git interest.
                totbal = totbal + d.ViewBel();
                System.out.println(d.GITNAME()+"'s account number is "+d.gitAccnum());
                System.out.println(d.GITNAME() + "'s accont interest is " + d.gitIn());
                totInt = totInt + d.gitIn();
                System.out.println("");
            }
         
         System.out.println("\n\nThe total amount of accounts is "+accnum+". \nThe total amount held within all of their balances is "+totbal);
         System.out.println("The total amount of interest given out is " + totInt);
        
    }
}
