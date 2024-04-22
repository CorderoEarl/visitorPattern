public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(TelcoSubscription telcoSubscription) {
        return telcoSubscription.getTelcoName() + " offers " + telcoSubscription.getPromoPrice() + " GB for " + telcoSubscription.getPromoPrice();
    }
}