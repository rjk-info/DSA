// package MyCode.OPPS;

public class _1Oops {
    public static void main(String[] args) {

        Pen p1 = new Pen();
        p1.setColor("blue"); ;
        System.out.println("Pen color: " + p1.color);

        p1.setTip(5);
        System.out.println("Pen tip: " + p1.tip);

        BankAccount acc1 = new BankAccount();
        acc1.username = "Ranjeet Kumar";
        System.out.println("Username: " + acc1.username);
        acc1.setPassword("12345");
        System.out.println("Password set successfully.");
    }
}

    class BankAccount {
        public String username ;
        private String password ;

        public void setPassword(String pwd){
            password = pwd;
        }
    }

    class Pen {
        String color ;
        int tip ;
        
        void setColor(String newColor) {
            color = newColor;
        }

        void setTip(int newTip) {
            tip = newTip;
        }
    }

    class Student {
        String name;
        int age ;
        float percentage; 

        void calcPercentage(int phy, int chem, int math) {
            percentage = (phy + chem + math) / 3.0f;
        }
    }

