public class Platinum extends MemberCard {
    public Platinum (String name, double purchaseAmount) {
        super(name, purchaseAmount);
}

    @Override
    public double calculateDiscount() {
        return getPurchaseAmount() * .20d;
    }


}
