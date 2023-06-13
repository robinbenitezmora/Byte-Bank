public class TestMethos {
 public static void main(String[] args) {
  Account myAccount = new Account();
  myAccount.deposit(200);
  System.out.println(myAccount.balance);

  myAccount.withdraw(100);
  System.out.println(myAccount.balance);

  Account yourAccount = new Account();
  yourAccount.deposit(1000);
  boolean transfered = yourAccount.transfer(400, myAccount);

  if (transfered) {
   System.out.println("Transfer success!");
  } else {
   System.out.println("Transfer was not possible!");
  }

  System.out.println(myAccount.balance);
  System.out.println(yourAccount.balance);
 }
}
