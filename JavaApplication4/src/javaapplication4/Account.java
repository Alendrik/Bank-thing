package javaapplication4;

import java.util.ArrayList;

class Account 
{
 
    
    private double Balance = 0.0;
    private String Psswrd = " ";
    private String Name = " j";
    private boolean Active = true;
    private double FirstDep = 0.0;
    private int AccNum = 0;
    private int yrstrtdt = 0;
    private int monstrtdt = 0;
    private int[] strtdt = {0,0};
    private int currmondt = 1;
    private int curryrsdt = 2017;
     private double rate = 0.10; 
     private double Interest = 0.0;
//    private int [] currdt = {0,0};
    private ArrayList<String> Withdrawals = new ArrayList<>();
    private ArrayList<String> Deposits    = new ArrayList<>();    

public void SetName(String gose)
{
    this.Name = gose;
}

public void GetName()
{
    System.out.println(this.Name);
}

public String GITNAME()
{
    return this.Name;
}

public void ViewBal()
{
    System.out.println("Your balance is "+this.Balance);   
}

public double ViewBel()
{
    return this.Balance;   
}

public void Setstrtdt(int u,int o)
{
    
    
    this.monstrtdt = u;
    this.yrstrtdt = o;
    
    this.strtdt[0]=u;
    this.strtdt[1]=o;

//    currdt = strtdt;
}

//public void IncDate(int inc,int[] date)  
//{
//    date[0] += inc;
//    if(date[0] > 12) 
//    {
//        date[1] += date[0] / 12;
//        date[0] %= 12;
//    }
//
//}

public void Getstrtdt()
{
    System.out.println(this.strtdt.toString());
}

public String gitstrtdt()
{
    String flpp = String.valueOf(this.strtdt[0]+", ");
    String dlpp = String.valueOf(this.strtdt[1]);
    
    return flpp+dlpp;
    
}

public int dT()
{
    return 1;
}

public void Deposit(double Dog)
{
    String mud = String.valueOf(Dog);
    Deposits.add(mud);
    this.Balance += Dog;
    System.out.println("You have added " + Dog + " dollars to your account balance!");
    //maybe put in a way to confim wether this deposit was legitimate.
    
    System.out.println("Your new Balance is " + this.Balance+ " dollars.\n");
//    IncDate(1, currdt);
    System.out.println("Date has gone up by 1 month.");
}

public void Active()
{
    if(this.Active == true)
    {
        System.out.println("Your account is currently open and active");
    }
    else if (this.Active == false)
    {
        System.out.println("Your account is currently closed and inactive.");
    }
}

public void FirstDeposit( double DUG)
{
    String mud = String.valueOf(DUG);
    this.Balance =+ DUG;
   this.FirstDep += DUG;
}

public void GetFirstDep()
{
    System.out.println(this.FirstDep);
}

public double GitFirstDep()
{
    
    return this.FirstDep;
}

public void Status ()
{//NAme
     System.out.println("\nYour name is "+this.Name);
     //BAlance
    System.out.println("\nYour balance is "+this.Balance); 
    //First dep
    System.out.println("\nYour first deposit was " + this.FirstDep);
    //Bal History
     System.out.println("You have made a total of " + Withdrawals.size() + " withdrawals and a total of " + Deposits.size() + " deposits.\n");
   
    System.out.println("The withdrawals: ");
    for(String i : Withdrawals)
    {
        System.out.println(i);
    }
    System.out.println("(The most recent transactions will be at listed first.)\n");
   
    System.out.println("The deposits: ");
    
    for(String i : Deposits)
    {
        System.out.println(i);
    }
     System.out.println("(The most recent transactions will be at listed first.)\n");
     
     //
    
}

public void setAccNum(int l)
{
    this.AccNum = l;
}

public void getAccNum()
{
    System.out.println(this.AccNum);
}

public int gitAccnum()
{
   return this.AccNum;
}


public void Withdraw(double Fog)
{
    String mud = String.valueOf(Fog);
    Withdrawals.add(mud);
    this.Balance -= Fog;
    System.out.println("You have withdrawn " +  Fog + " dollars from your account balance!");
    //maybe put in a way to confirm wether this withdrawal was legitimate.
    
    System.out.println("Your new account balance is " +this.Balance+ " dollars.\n");
//    IncDate(1, currdt);
    System.out.println("Date has gone up by 1 month.");
    
}



public void CheckBalHistory()
{
    System.out.println("You have made a total of " + Withdrawals.size() + " withdrawals and a total of " + Deposits.size() + " deposits.\n");
   
    System.out.println("The withdrawals: ");
    for(String i : Withdrawals)
    {
        System.out.println(i);
    }
    System.out.println("(The most recent transactions will be at listed first.)\n");
   
    System.out.println("The deposits: ");
    
    for(String i : Deposits)
    {
        System.out.println(i);
    }
     System.out.println("(The most recent transactions will be at listed first.)\n");
    
    
}

public double gitIn()
{
    
    return this.Interest;
}

public void getIn()
{
    
}

    public void CalcInterest() 
    {
        double u = this.rate /12;
        System.out.println("Your Balance is" +this.Balance);
        double tolp = this.curryrsdt - this.yrstrtdt;
//double tolp = this.curryrsdt - 2016;
        double golp = tolp * 12;
        double monlp = this.currmondt - this.monstrtdt;
        
        if (monlp < 0)
        {
           monlp= monlp * -1;
        }
        else if(monlp == 0)
        {
            double GONGERMINE =  monlp + golp;
       
            
       double hyaT = (this.Balance * GONGERMINE * u);
        System.out.println("Your Interst from balance is " + hyaT);
        this.Interest = hyaT;
             return;
        }
        
        
        
       double GONGER =  monlp + golp;
       
       double hyaT = (this.Balance * GONGER * u);
        System.out.println("Your Interst from balance is " + hyaT);
        this.Interest = hyaT;
        
    }
    
    public void CelcIn()
    {
        double u = this.rate /12;
       
        double tolp = this.curryrsdt - this.yrstrtdt;
//double tolp = this.curryrsdt - 2016;
        double golp = tolp * 12;
        double monlp = this.currmondt - this.monstrtdt;
        
        if (monlp < 0)
        {
           monlp= monlp * -1;
        }
        else if(monlp == 0)
        {
            double GONGERMINE =  monlp + golp;
       
            
       double hyaT = (this.Balance * GONGERMINE * u);
        
        this.Interest = hyaT;
             return;
        }
        
        
        
       double GONGER =  monlp + golp;
       
       double hyaT = (this.Balance * GONGER * u);
       
        this.Interest = hyaT;
        
    }
    
    public void SetPsswrd(String ps)
    {
        this.Psswrd = ps;
    }
    
    public String GetPsswrd()
    {
        return this.Psswrd;
    }
    
    
    
    



    }
