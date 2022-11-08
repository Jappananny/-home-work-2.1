public class Car{
    private String brand;
    private String model;
    private String productionCountry;
    private String color;
    private int productionYear;
    private double engineVolume;

    public Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume){
        if (brand.length() <= 0 || brand == null){
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model.length() <= 0 || model == null){
            this.model = "Что за покомон ?";
        } else {
            this.model = model;
        }
        if (productionYear <= 0){
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry.length() <= 0 || productionCountry == null){
            this.productionCountry = "Ваканда";
        } else {
            this.productionCountry = productionCountry;
        }
        if (color.length() <= 0 || color == null){
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (engineVolume <= 0){
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
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