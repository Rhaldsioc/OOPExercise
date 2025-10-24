public class GymMembershipMain {
    public static void main(String[] args) {
        GymMembership basic = new GymMembership("Ana", "Basic", 6);
        PremiumMembership premium = new PremiumMembership("John", 12, true, true);

        basic.displayInfo();
        System.out.println("Total Fee: ₱ - GymMembershipMain.Java:7" + basic.calculateFee());
        System.out.println();

        premium.displayInfo();
        System.out.println("Total Fee: ₱ - GymMembershipMain.Java:11" + premium.calculateFee());
        premium.checkSpecialOffer();
    }
}
