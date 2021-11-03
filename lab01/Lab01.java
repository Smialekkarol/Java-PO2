
public class Lab01
{
    static int CalculateFi(int p,int q)
    {
        return (p-1)*(q-1);
    }

    static int Euclid(int a,int b)
    {
        int temp;
        while(b != 0)
        {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    static int extEuclid(int a , int b)
    {
        int x0 = 1,x = 0;
        int b0 = b,q,temp;
        while(b != 0)
        {
            q = Math.abs(a/b);
            temp = x;
            x = x0 - q*x;
            x0 = temp;
            temp = a % b;
            a =b;
            b = temp;
        }
        if(x0<0)
        x0=x0+b0;
        return x0;
    }
    static int powMod(int x , int y , int p)
    {
        int res = 1;
        x = x % p;
        if(x ==0)
            return 0;
        while(y>0)
        {
            if(y%2!=0)
            res =(res*x)%p;
            y = y/2;
            x = (x*x)% p;
        }
        return res;
             
    }

    public static void main(String args[])
    {
        int n, p = 397, q = 103,fi,e = 3;
        n = p * q;
        fi = CalculateFi(p,q);
         
        String word = new String(args[0]);
        
        String finished = new String( );
        char tab[]=new char[word.length()];
        int encr[]=new int[word.length()];
        
         tab= word.toCharArray();

        
       while(Euclid(e,fi)!= 1)
       {
           e+=2;
       }

       for(int i = 0 ; i< tab.length ;i++)
       {
           encr[i]=powMod(tab[i],e,n);
       }
       System.out.println("n = "+n);
         System.out.println("e = "+e);

        System.out.println("d = "+extEuclid(e,fi));
        System.out.print("Message given = ");
        for(int i = 0 ; i< tab.length ;i++)
        {
            System.out.print(tab[i]);
        }
        System.out.println();
         
        System.out.println("Encoded Message =");
        for(int i = 0 ; i< word.length() ;i++)
        {
            System.out.print( encr[i]);
        }
        System.out.print("Decoded Message (int)= ");
        for(int i = 0 ; i< word.length() ;i++)
        {
            System.out.print(powMod(encr[i],extEuclid(e,fi),n)+" ");
            
        }
        System.out.println();
        System.out.print("Decoded Message = ");
        for(int i = 0 ; i< word.length() ;i++)
        {
            System.out.print((char)powMod(encr[i],extEuclid(e,fi),n));
            finished +=powMod(encr[i],extEuclid(e,fi),n);
        }
        System.out.println();
        
    }
  

}
