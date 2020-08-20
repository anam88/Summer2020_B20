package day44_Constructor;

public class ConstructorIntro {
    /*public ConstructorIntro(int a){

    }

     */
    public ConstructorIntro(String arr){
        System.out.println("Hello "+arr);
        System.out.println("How are you? "+arr);
    }
    public static void main(String[] args) {

       // ConstructorIntro obj = new ConstructorIntro(10);
        //new ConstructorIntro("Apple");
        ConstructorIntro obj3 = new ConstructorIntro("Muhtar");
        ConstructorIntro obj4 = new ConstructorIntro("DAwud");
        ConstructorIntro obj5 = new ConstructorIntro("Zeliha");

    }
}
