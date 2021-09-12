package GroupProjectSep11.Task3;

public class CarTester {
    public static void main(String[] args) {

        Car car1 = new Truck(1000, 4000);
        car1.calculateSalePrice();

        Car car2 =new Sedan(55, 4000);
        car2.calculateSalePrice();
    }
}
