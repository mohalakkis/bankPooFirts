//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account cco1 = new Account();
        cco1.accoutNumber = 1025.13;
        cco1.balace = 1000;
        cco1.accountOwner = "Mohamed";

        Account coo2 = new Account();
        coo2.accoutNumber = 1045.13;
        coo2.balace = 9000;
        coo2.accountOwner = "teste";

        System.out.println(cco1.accoutNumber);
        System.out.println(cco1.accountOwner);
        System.out.println(cco1.balace);

        System.out.println(coo2.accoutNumber);
        System.out.println(coo2.accountOwner);
        System.out.println(coo2.balace);

    }
}