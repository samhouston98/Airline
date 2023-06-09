public class Plane {
    private PlaneType type;
    private int capacity;
    private double totalWeight;

    public Plane(PlaneType type, int capacity, double totalWeight) {
        this.type = type;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public PlaneType getType() {
        return type;
    }

    public void setType(PlaneType type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public double getReservedBagWeightPerPerson() {
        return totalWeight / capacity / 2.0;
    }
}
