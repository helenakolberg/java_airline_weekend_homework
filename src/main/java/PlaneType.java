public enum PlaneType {
    BOEING256(200, 40000),
    BOEING747(300, 50000),
    BOEING812(250, 55000);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
