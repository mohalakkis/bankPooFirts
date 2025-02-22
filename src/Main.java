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
        coo2.balace = 000;
        coo2.accountOwner = "teste";

      try {
          coo2.printBalance();
        boolean deposito =   coo2.deposit(-10);

        if (!deposito) {
            System.out.println("ach que deu errado!!!");
            return;
        }
          coo2.printBalance();

          coo2.saque(230);
          coo2.printBalance();
      }  catch (Exception e) {
          System.out.println("Ocorreu um erro: " + e.getMessage());
          e.printStackTrace();
      }



    }
}