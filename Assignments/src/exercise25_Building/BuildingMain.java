package exercise25_Building;

public class BuildingMain {
    public static void main(String[] args) {
        ResidentialBuilding rb = new ResidentialBuilding("123 Main St", 5, 5000, 20);
        CommercialBuilding cb = new CommercialBuilding("Business Ave", 10, 10000, 8000);

        System.out.println("Residential Rent: - BuildingMain.java:8" + rb.calculateTotalRent(8000));
        System.out.println("Commercial Rent: - BuildingMain.java:9" + cb.calculateTotalRent(500));
    }
}
