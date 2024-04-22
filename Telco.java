public class Telco implements TelcoSubscription {
    private double dataAllowance;
    private double promoPrice;
    private String telcoName;
    private boolean unliCallText;

    public Telco(double dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    public double getDataAllowance() {
        return dataAllowance;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }

    public void accept(TelcoVisitor visitor) {
        visitor.visit(this);
    }
}
