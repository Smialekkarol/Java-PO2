import java.util.ArrayList;

public class Bank {
    final static double EURO = 4.6;
    final static double USD = 3.95;
    final static double PLN = 1.0;
    static int count;

    private ArrayList<Account> AccountList ;

    Bank()
    {
        count++;
        AccountList = new ArrayList<Account>();

    }

    public void addAccount(Account account) 
    {
        AccountList.add(account);
        int n = (100+ (int) (Math.random() * ((999- 100) + 1)));
        String N = ""+ count+n;
         
        account.setNumber(N);
    }

    public void printAccounts() 
    {
        for(var n :AccountList)
        {
            n.print();;
        }
    }

    public Account findAccount(String nmbr) {

        for(var n :AccountList)
        {
            if (n.getNumber()==nmbr)
            return n;


        } 
        System.out.println("Could not find given account");
        return null;
    }

    public void transferToDifferentCurrency(String number, String string) {
        for(var n :AccountList)
        {double balance=0;
            if (n.getNumber()==number)
            {
                
                if(n.getCurrency() == "EURO")
                {
                      balance = n.getBalance() * EURO;
                    
                }
                if(n.getCurrency() == "USD")
                {
                      balance = n.getBalance() * USD;

                }
                if(string == "EURO")
                {n.setBalance(balance / EURO);
                n.setCurrency("EURO");}
                if(string == "USD")
                {n.setBalance(balance / USD);
                    n.setCurrency("USD");}
            }
            else System.out.println("Could not find given account");

        } 
    }

    public void transfer(String number, String number2, int i) {
        for(var n :AccountList)
        {   
            if (n.getNumber()==number)
            for(var x :AccountList)
                if(x.getNumber()==number2)
                {
                    double val= 4.6;
                    if(x.getCurrency()=="USD")
                    val = 3.95;
                    x.addBalance(i/val);
                    n.minBalance(i);
                }
        }
    }

    public void transfer(String number, String number2, int i, Bank bank2) 
    {
        for(var n :AccountList)
        {
           

            if (n.getNumber()==number)
            for(var x :bank2.AccountList)
                if(x.getNumber()==number2)
                {  
                    x.addBalance(i);
                    n.minBalance(i);
                }
        }

    }

  
    
}
