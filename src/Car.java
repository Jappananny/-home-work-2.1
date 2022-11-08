public class Car{
    private String brand;
    private String model;
    private String productionCountry;
    private String color;
    private int productionYear;
    private final double engineVolume;

    public Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume){
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.engineVolume = engineVolume;
    }
    public int getProductionYear() {
        return this.productionYear;
    }
    public double getEngineVolume() {
        return this.engineVolume;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public String getProductionCountry(){
        return this.productionCountry;
    }
    public String getColor(){
        return this.color;
    }
    @Override
    public String toString(){
        return brand + " " + model + ", " + productionYear + " год выпуска, сборка в " + productionCountry +
                ", " + color + " цвета, объем двигателя - " + engineVolume + " литра.";
    }
    public static void printAllCar(Car[] car){
        for (Car car1 : car){
            if (car1 != null){
                System.out.println(car1.toString());
            }
        }

    }
}