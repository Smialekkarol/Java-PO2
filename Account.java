public class Account  {

    private String Name;
    private String Surname;
    private String AccountNumber;
    private double Saldo;
    private String Currency = "PLN";

    static int NUMBER_OF_CREATED_ACCOUNTS;


    public Account(String name, String surname, String cur) {
        NUMBER_OF_CREATED_ACCOUNTS++;
        this.Name = name;
        this.Surname = surname;
        this.Currency = cur;

    }

    public Account(String name, String surname, double d, String cur) {
        NUMBER_OF_CREATED_ACCOUNTS++;
        this.Name = name;
        this.Surname = surname;
        this.Currency = cur;
        this.Saldo = d;
    }

    public String getOwner()
    {
        return Name+" "+Surname;
    }
    
    public String getAccountBalance()
    {
        return Saldo + Currency;
    }
    public double getBalance()
    {
        return Saldo;
    }

    public void setBalance(double val)
    {
        Saldo = val;
    }

    public void setNumber(String s)
    {
        AccountNumber = s;
    }
    
     
    boolean equals(Account obj)
    {
        if(Name == obj.Name && Surname == obj.Surname && AccountNumber == obj.AccountNumber
        && Saldo == obj.Saldo && Currency == obj.Currency)
        return true;
        else return false;
    }

    public void print()
    {
        System.out.println("Account{ firstName = "+ Name+" LastName = "+Surname+" number = "+ AccountNumber
        +" balance = "+ Saldo+"}");
    }

    public String getNumber() {
        return AccountNumber;
    }

    public void addBalance(double d) {
        this.Saldo +=d;
    }

    public void minBalance(int i) {
        this.Saldo -=i;
    }
    public String getCurrency()
    {
        return Currency;
    }

    public String toString()
    {
        return "Account{ firstName = "+ Name+" LastName = "+Surname+" number = "+ AccountNumber
        +" balance = "+ Saldo+"}";
    }
    public void setCurrency(String d)
    {
        Currency = d;
    }
}
