public interface TelcoSubscription {
    String getTelcoName();
    double getPromoPrice();
    boolean getUnliCallText();
    String accept(UsagePromo promo);
    String accept(UnliCallTextOffer unliPackage);
}
