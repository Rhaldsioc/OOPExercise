package exercise25_Building;

public class ResidentialBuilding extends Building {
    private int numberOfApartments;

    public ResidentialBuilding(String address, int floors, double totalArea, int numberOfApartments) {
        super(address, floors, totalArea);
        this.numberOfApartments = numberOfApartments;
    }

    public double calculateTotalRent(double rentPerApartment) {
        return numberOfApartments * rentPerApartment;
    }
}
