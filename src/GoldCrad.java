public class GoldCrad extends MemberCard {
   public GoldCrad(String name, double purchaseAmount) {
    super(name, purchaseAmount);
   }

@Override
public double calculateDiscount() {
    return getPurchaseAmount() * .15d;
}

   
}
