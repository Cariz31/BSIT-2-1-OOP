public class CashPayment extends Payment {

    // TODO 9
    public CashPayment(int id, String payerName, double amount) {
        super(id, payerName, amount);
    }

    @Override
    public String provider() {
        return "CASH";
    }

    @Override
    public void pay() {
        System.out.printf(" Cash: PHP %.2f received. Please get your change.%n",
                getAmount());
    }
}
