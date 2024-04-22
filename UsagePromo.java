public class UsagePromo implements TelcoVisitor {
    public void visit(Telco telco) {
        System.out.println(telco.getTelcoName() + " Data Usage Offer and price: " + telco.getDataAllowance() + "GB, price " + telco.getPromoPrice());
    }
}