public class Methods {

        static int currentBalance = 1000;
        //Creating a method with static
        public static void greet() {
            System.out.println("Hello, Welcome to the SBI Bank....");
        }
        public void deposit(int amount){
            currentBalance =  currentBalance + amount;
            System.out.println(amount + " rupees deposited from your account Successfully...");
        }
        public static void withdrawl(int amount){
            currentBalance =  currentBalance - amount;
            System.out.println("Amount withdrawl Successfully...");
        }
        public int getCurrentBalance(){
            return currentBalance;
        }

        public static void main(String args[]){
            greet();
            System.out.println("Your CurrentBalance is: " + currentBalance);
            Methods m = new Methods();
            m.deposit(800);
            System.out.println("Your CurrentBalance is: " + currentBalance);
            withdrawl(500);
            System.out.println("Your CurrentBalance is: " + currentBalance);
            System.out.println("Thank You!....");
            System.err.print("Visit Again");

    }
}
