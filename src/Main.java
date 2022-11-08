public class Main {
    public static void main(String[] args) {
        Human[] human = new Human[5];
        human[0] = new Human("Максим",1987,"Минск","бренд-менеджером");
        human[1] = new Human("Аня",-7,"","");
        human[2] = new Human("Катя", 1994,"Калининград", "продакт-менеджером");
        human[3] = new Human("Артем", 1995, "Москва", "директором по развитию бизнеса");
        //Вывод результатов
        System.out.println(human[2].toString());
        //Human.printAllHuman(human);
        ///Задача 2
        Car[] car = new Car[5];
        car[0] = new Car("Lada", "", 2015, "", "желтого", 1.7);
        //car[1] = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черного", 3.0);
        //car[2] = new Car("BMW", "Z8", 2021,"Германии", "черный", 3.0);
        //car[3] = new Car("Kia", "Sportage 4 поколение", 2018, "Южной Корее", "красного", 2.4);
        //car[4] = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевого", 1.6);
        //Вывод результатов
        System.out.println(car[0].toString());
        //Car.printAllCar(car);
    }
}