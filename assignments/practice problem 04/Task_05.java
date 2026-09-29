class Wallet
{
    double balance;
    String lastWithdraw_Mode;
    Wallet()
    {
        balance= 0;
    }
    Wallet(double amount)
    {
        balance= amount;
    }
    void withdraw(double amount)
    {
        balance= balance - amount;
    }
    void withdraw(double amount,  String mode)
    {
        lastWithdraw_Mode= mode;
        balance= balance - amount;
    }
    double addBonus(Wallet a, double amount)
    {
        return balance= balance + amount;
    }
     void swap(Wallet a, Wallet b)
     {
         Wallet temp;
         temp= a;
         a= b;
         b= temp;
     }



}
public class Task_05 
{
    public static void main(String[] args)
    {
        Wallet a = new Wallet(55.0);
        Wallet b = new Wallet(44.0);

        a.withdraw(34.00, "ATM");
        System.out.println(a.lastWithdraw_Mode);
        
        a.withdraw(3.00, "ONLINE");
        System.out.println(a.lastWithdraw_Mode);

        System.out.println(a.addBonus(a, 100.0));

        System.out.println(a + " " + b +" ");
        a.swap(a, b);
        System.out.println(a + " " + b +" ");
        // could not swap a and b




    }
    
}
