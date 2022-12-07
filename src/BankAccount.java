public class BankAccount  {
    private  String bank;
    private String numberCard;
    private String balance;

    public BankAccount(String bank, String numberCard, String balance) {
        this.bank = bank;
        this.numberCard = numberCard;
        this.balance = balance;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bank='" + bank + '\'' +
                ", numberCard='" + numberCard + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
