package exercise30_GymMembership;

public class GymMembership {
    protected String memberName;
    protected String membershipType;
    protected int duration; // in months

    public GymMembership(String memberName, String membershipType, int duration) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.duration = duration;
    }

    public double calculateFee() {
        switch (membershipType.toLowerCase()) {
            case "basic": return duration * 500;
            case "standard": return duration * 800;
            case "premium": return duration * 1200;
            default: return duration * 500;
        }
    }

    public void displayInfo() {
        System.out.println("Member:  GymMembershipMain.Java:22 - GymMembership.java:24" + memberName + " | Type: " + membershipType + " | Duration: " + duration + " months");
    }
}

class PremiumMembership extends GymMembership {
    private boolean personalTrainer;
    private boolean spaAccess;

    public PremiumMembership(String memberName, int duration, boolean personalTrainer, boolean spaAccess) {
        super(memberName, "Premium", duration);
        this.personalTrainer = personalTrainer;
        this.spaAccess = spaAccess;
    }

    @Override
    public double calculateFee() {
        double base = super.calculateFee();
        if (personalTrainer) base += 1000;
        if (spaAccess) base += 500;
        return base;
    }

    public void checkSpecialOffer() {
        if (duration >= 12) {
            System.out.println("🎉 Special Offer: 1 month free for 12month premium members!  GymMembershipMain.Java:46 - GymMembership.java:48");
        } else {
            System.out.println("No special offer available.  GymMembershipMain.Java:48 - GymMembership.java:50");
        }
    }
}
