package tp1.e2;

public class Appliance {

    private String name;
    private double price = 100; //in pesos
    private String colour = "GRIS PLATA";
    private int energyConsumption = 10; //In KW
    private double weight = 2.0; //in kg

    public Appliance(String name) {
        this.name = name;
    }

    public Appliance(String name, double price, String colour, int energyConsumption, double weight) {
        this.name = name;
        this.price = price;
        this.colour = colour;
        this.energyConsumption = energyConsumption;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String describe() {
        return String.format(
                "The appliance is %s. It costs %.2f pesos, has a colour of %s, consumes %d KW of energy, and weighs %.2f kg.",
                name, price, colour, energyConsumption, weight
        );
    }

    public boolean isLowConsumption() {
        return energyConsumption < 45;
    }

    public double getBalance (){
        return price / weight;
    }

    public boolean isHighEnd () {

        return getBalance() > 3;
    }
}
