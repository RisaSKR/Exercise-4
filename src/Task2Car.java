class Car {
    private String model;
    private String brand;
    private int year;
    private int prices;
    private String colour;
    private int quantity;

    public Car(String model, String brand, int year, int prices, String colour, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.prices = prices;
        this.colour = colour;
        this.quantity = quantity;
    }

        public String getModel(){
            return model;
        }
        public String getBrand(){
            return brand;
        }
        public int getYear(){
            return year;
        }
        public int getPrices(){
            return prices;
        }
        public String getColour(){
            return colour;
        }
        public int getQuantity(){
            return quantity;
        }

        public void setModel(String mod){
        this.model = mod;
        }
        public void setBrand(String bn){
        this.brand = bn;
        }
        public void setYear(int yr){
        this.year = yr;
        }
        public void setPrices(int ps){
        this.prices = ps;
        }
        public void setColour(String cl){
        this.colour = cl;
        }
        public void setQuantity(int quan){
        this.quantity = quan;
        }


    public String toString() {
        return "Car = " +
                "Model = " + model + ", " +
                "Brand = " + brand + ", " +
                "Year = " + year + ", " +
                "Prices = " + prices + ", " +
                "Colour = " + colour + ", " +
                "Quantity = " + quantity;

    }

    void sell(int sold)
    {quantity-=sold;}
    //quantity = quantity - sold

}



public class Task2Car
{
    public static void main(String[] args)
    {
        Car Car = new Car("G200","MercedesBenz",2021,108880,"Black",1);
        System.out.println(Car.toString());
        Car.sell(1);
        System.out.println(Car.toString());
        int year=Car.getYear();
        System.out.println(year);
        Car.setPrices(109990);
        System.out.println(Car.toString());



    }



}
