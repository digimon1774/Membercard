public class App {
    public static void main(String[] args) throws Exception {
        MemberCard platinuCard = new Platinum("Mon", 1500);
        System.out.println("Platinum info");
        platinuCard.display();

        System.out.println("****************************");
        
        MemberCard silverCard = new SilverCard("Mon", 1500);
        System.out.println("SilverCard info");
        silverCard.display();
    }
}
