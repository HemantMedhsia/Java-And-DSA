package OOPs;

public class Acess_Modifier {
    public static void main(String[] args) {
        // creating Object.
        BankAccount myAcc = new BankAccount();
        
        // here the user name is changed to default which is accessable within the packagek.
        myAcc.username = "Hemant";
        System.out.println(myAcc.username);

        // here password field is set to the private so it can not acess directly to the main class .
        // we can acess the private field through the method which is defined in the subclass named BankAccount .
        myAcc.setPassword("hemantMedhsia");

        

    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
