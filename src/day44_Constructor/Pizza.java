package day44_Constructor;

public class Pizza {
     String size;
     int numOfCheeseTopping;
     int numOfPepperoniTopping;

    public Pizza(String size, int numOfCheeseTopping, int numOfPepperoniTopping){
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfPepperoniTopping = numOfPepperoniTopping;
    }
    public double calcCost(){

        if(size.equalsIgnoreCase("small")){
            return 10 + numOfCheeseTopping * 2 + numOfPepperoniTopping * 2;
        }else if(size.equalsIgnoreCase("medium")){
            return 12 + numOfCheeseTopping * 2 + numOfPepperoniTopping * 2;
        }else{
            return 14 + numOfCheeseTopping * 2 + numOfPepperoniTopping * 2;
        }
    }
    public String toString(){
        return "Size of Pizza: "+size+"\nQuantity of cheese toppings: "+numOfCheeseTopping+
                "\nQuantity of pepperoni toppings: "+numOfPepperoniTopping+
                "\nTotal cost of Pizza: "+calcCost();
    }
}
