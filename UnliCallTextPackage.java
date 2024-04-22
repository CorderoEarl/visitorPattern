public class UnliCallTextPackage implements UnliCallTextOffer {
    @Override
    public String showUnliCallsTextOffer(TelcoSubscription telcoSubscription) {
        return telcoSubscription.getTelcoName() + " unlimited call/text offer is " + (telcoSubscription.getUnliCallText() ? "available" : "not available");
    }
}