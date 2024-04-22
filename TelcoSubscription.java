public interface TelcoSubscription {
    String getTelcoName();
    double getPromoPrice();
    boolean getUnliCallText();
    void accept(TelcoVisitor visitor);
}
