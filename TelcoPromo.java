public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco("Smart", 500, 15, false);
        TelcoSubscription globe = new Telco("Globe", 450, 10, true);
        TelcoSubscription ditto = new Telco("Ditto", 400, 8, true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallTextOffer unli = new UnliCallTextPackage();

        System.out.println(smart.accept(promo));
        System.out.println(globe.accept(promo));
        System.out.println(ditto.accept(promo));

        System.out.println();

        System.out.println(smart.accept(unli));
        System.out.println(globe.accept(unli));
        System.out.println(ditto.accept(unli));
    }
}
