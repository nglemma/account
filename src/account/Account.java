package account;
public class Account 
{ 
   private float accountBalance;
   
   public Account(float balance)
   {
       if(balance > 0.0)
           balance = accountBalance;
   }

    public float getAccountBalance() 
    {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) 
    {
        this.accountBalance = accountBalance;
    }
   
   
   public void accountActivity(float debit)
   {
       if(debit > accountBalance)
           System.out.println("Debit amount exceeds account balance");
       accountBalance -= debit;
       System.out.printf("Your New account balance is\n%f\n" , accountBalance );
   }
    
}
