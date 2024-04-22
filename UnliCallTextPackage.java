public class UnliCallTextPackage implements TelcoVisitor {
    public void visit(Telco telco) {
        System.out.println(telco.getTelcoName() + " unlimited calls and text package: " + (telco.getUnliCallText() ? "Yes" : "No"));
    }
}