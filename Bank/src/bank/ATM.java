package bank;

public class ATM {
    //ATM должен реализовывать 1 интерфейс, обязывающий банкомат выполнять функции:
    // проверка баланса, снятие наличных и пополнение счёта

    interface functions{
        public void checkBalance();
        public int balance = 5000;

        public void cashWithdrawal();

        public void accountReplenishment();
    }

    public class CashMachine implements functions{

        @Override
        public void checkBalance() {
            if (balance >= 0){
                System.out.println("Ваш баланс: " + balance);
            } else {
                System.out.println("Вы должны банку!");
            }
        }

        @Override
        public void cashWithdrawal() { //снятие

        }

        @Override
        public void accountReplenishment() { //пополнение

        }
    }
}
