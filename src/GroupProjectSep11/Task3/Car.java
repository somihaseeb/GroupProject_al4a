package GroupProjectSep11.Task3;
    /*Create  a  Class  Car  that  would  have  the following  fields:
    carPrice  and  color  and method calculateSalePrice() which should be returning a price of the car.
    Create 2 sub classes: Sedan and Truck.
    The Truck  class  has  field  as  weight  and  has  its own implementation of  calculateSalePrice() method
    in which returned price calculated as following: if weight>2000 then returned price car should include 10% discount,
    otherwise 20% discount.
    The Sedan class has field as length and also does   it   is   own   implementation   of calculateSalePrice():
    if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discountTask
 */

    public abstract class  Car {
        double carPrice;
        String carColor;
        double salePrice;

        abstract void calculateSalePrice();
    }
    class Truck extends Car {
        double weight;

        Truck(double weight, double carPrice) {
            this.weight = weight;
            this.carPrice = carPrice;
        }
        public void calculateSalePrice() {
            if (weight > 2000) {
                salePrice=(carPrice-carPrice/10);
            } else {
                salePrice = (carPrice - carPrice / 20);
            }
            System.out.println("Price of Truck is "+salePrice);
        }
    }

    class Sedan extends Car {
        double length;
        double salePrice;

        Sedan(double length, double carPrice){
            this.length=length;
            this.carPrice=carPrice;
        }
        public void calculateSalePrice() {
            if (length > 20) {
                salePrice=(carPrice-carPrice/5);
            } else {
                salePrice=(carPrice-carPrice/10);
            }
            System.out.println("Price of Sedan is " + salePrice);
        }
    }

