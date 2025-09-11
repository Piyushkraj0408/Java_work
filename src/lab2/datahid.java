package lab2;

class bankAccount{
    private double balance;
    public double getBalance(){
        return balance;
    }
    public void deposite(double amount){
        if(amount>0)
        balance +=amount;
        else{
            System.out.println("Amount must be positive");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -=amount;
        } else{
            System.out.println("Inavlid withdraw amount");
        }
    }
}
public class datahid {
    public static void main(String[] args){
        bankAccount account = new bankAccount();
        account.deposite(10000);
        System.out.println("Current balance : "+ account.getBalance());
        account.withdraw(500);
        System.out.println("C");
    }
}
