public class Vehicle {

    public String brandName;
    public String modelName;
    public String color;
    public double price;
    private String mfgCode;
    public String fuelType;
    public int seatingCapacity;

    public Vehicle() {
        brandName = "Mercedes";
        modelName = "Class C";
        price = 99999.99;
        color = "White";
        mfgCode = "ABCD123";
        seatingCapacity = 5;
        fuelType = "Petrol";
    }

    public Vehicle(String bName, String mName, double price) {
        brandName = bName;
        modelName = mName;
        this.price = price;
    }

    public Vehicle(String bName, double p, String c) {
        brandName = bName;
        price = p;
        color = c;
    }

    public Vehicle(String bName, int s, String c) {
        brandName = bName;
        seatingCapacity = s;
        color = c;
    }

    public Vehicle(Vehicle v) {
        brandName = v.brandName;
        modelName = v.modelName;
        price = v.price;
        seatingCapacity = v.seatingCapacity;
        color = v.color;
        fuelType = v.fuelType;
    }

    public void setMfgCode(String mCode) {
        mfgCode = mCode;
    }

    public String getMfgCode() {
        return mfgCode;
    }

    public void start() {
        System.out.println("This vehicle has started.");
    }

    public void drive() {
        System.out.println("This vehicle can be driven on all surfaces.");
    }

    public void stop() {
        System.out.println("Stop the ignition. You're at 0 kmph now.");
    }

    public float calcMileage(float dist, float fuel) {
        float baseMileage = dist / fuel;

        if (fuelType.equalsIgnoreCase("petrol"))
            return baseMileage;
        else if (fuelType.equalsIgnoreCase("diesel"))
            return baseMileage * 1.2f;
        else if (fuelType.equalsIgnoreCase("cng"))
            return baseMileage * 1.4f;
        else
            return baseMileage;
    }
}

