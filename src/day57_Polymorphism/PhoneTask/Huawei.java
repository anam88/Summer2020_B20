package day57_Polymorphism.PhoneTask;

public class Huawei extends Phone implements AndroidApp, AppleApp, Downloadable {

    public Huawei(String model, double price, String size){
        super("Huawei",model,price,size);
        if(price > 200){
            throw new RuntimeException("Invalid Price, Huawei' price cannot more than $200!");
        }
    }

    @Override
    public void downloadable() {
        System.out.println("Huawei is downloading apps from "+AndroidApp.AppStoreName+" and "+AppleApp.AppStoreName);

    }

    @Override
    void texting(long phoneNumber1, long phoneNumber2) {
        System.out.println("Huawei is texting to "+phoneNumber1+phoneNumber2);
    }

    @Override
    void calling(long phoneNumber) {
        System.out.println("Huawei is calling to "+phoneNumber);
    }

    @Override
    public String toString() {
        return "Huawei{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
