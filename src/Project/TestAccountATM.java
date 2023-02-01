package Project;

import java.util.Scanner;

public class TestAccountATM {
  private static Scanner intput = new Scanner(System.in);
   private Account[] accounts = new Account[10];

    /**создаёт объект банкомат с 10 ю банковскими счетами
     * с заполненым id и балансом
     */
    public TestAccountATM() {
        for (int i = 0; i<accounts.length; i++){
            accounts[i] = new Account(i, 10000);
        }
    }

    public static void main(String[] args) {
        TestAccountATM accountATM = new TestAccountATM();
        int id;
        while (true){
            System.out.print("Введите id: ");
            id = intput.nextInt();
            if (id<0||id>accountATM.accounts.length){
                System.out.print("Введите, пожалуйста, корректный id");
                continue;
            }

            while (true){
                int choice = accountATM.getMenuSelection();
                if (choice ==1) {
                    System.out.println("Баланс равен: " + accountATM.accounts[id].getBalance());
                }else if (choice ==2){
                    accountATM.withDraw(id);
                }else if (choice==3){
                    accountATM.deposit(id);
                }else {
                    break;
                }
            }
        }
    }

    /**
     * Отображает меню и получает один из его пунктов
     * @return
     */
    public int getMenuSelection(){
        int choice;
        while (true){
            System.out.println("\nОсновное меню");
            System.out.println("1: проверить баланс счёта");
            System.out.println("2: снять со счёта");
            System.out.println("3: положить на счёт");
            System.out.println("4: выйти");
            System.out.print("Введите пункт меню: ");
            choice = intput.nextInt();
            if (choice<1||choice>4){
                System.out.println("Вы ввели некорректный пунк меню!");
            }else {
                break;
            }
        }
        return choice;
    }

    /**
     * снимает с выбранного счёта введёную сумму
     * @param id
     */
    public void withDraw(int id){
        System.out.println("Введите сумму для снятия со счёта: ");
        int amount = intput.nextInt();
        if (amount<0){
            System.out.println("сумма отрицательная! Операция отменена.");
        }else if (amount<=accounts[id].getBalance()){
            accounts[id].withDraw(amount);
        }else{
            System.out.println("Недостаточно средств на счёте! Операция отменена.");
        }
    }

    /**
     * пополняет счёт на указанную сумму
     */
    public void deposit(int id){
        System.out.println("Введите сумму для внесения на счёт: ");
        int amount = intput.nextInt();
        if (amount>=0){
            accounts[id].deposite(amount);
        }else {
            System.out.println("Сумма отрицательная! Операция отменена.");
        }
    }
}
