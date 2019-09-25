import java.util.Scanner;
import account.Account;
public class AccountTest 
{
    public static void main(String[] args)
    {
        Account withdraw = new Account(500);
        Scanner withdamount = new Scanner(System.in);
        
        System.out.println("Please enter the amount you want to withdraw");
        System.out.println();
        
        withdraw.setAccountBalance(700);
        
       float collect= withdamount.nextFloat();
       
       withdraw.accountActivity(collect);
    }
    
}
