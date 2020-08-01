package day08_LogicalOperators;

public class PracticeTask {

    /* int b = 2;
       boolean res = ++b == 2 || --b == 2 && --b ==2;
       what is res? */
    public static void main(String[] args) {
        int b = 2;
        boolean res = ++b == 2 || --b == 2 && --b ==2;
        //          = 3  == 2  current value of b = 3
        //          2 == 2 current value of b = 2
        //          1 == 2 current value of b = 1
        //          = 3 == 2 || 2 == 2 && 1 == 2
        //          =  False || True    &&   False
        //                   true && False
        System.out.println(res); //false

      boolean x = true, z = true;
      int y = 20;
      x = (y != 10) || (z = false);
      //   20 != 10 ||   false
      /*  true    ||    false --> in || operator as long as one expression is true, return
       value will be true */
        System.out.println(x);


        int c = 5;
        boolean r2 = c++ == 6 || c-- == 5 || c == 5;
                  // c++ == 6 -->current value of c = 5, after post increment c = 6
                  // 5 == 6 --> False
                  // c-- == 5 --> current value of c = 6, after post decreamant c = 5
                  // 6 == 5 --> False
                  // c == 5 --> current value of c = 5
                  // 5 == 5 --> True

        System.out.println(r2);

        int ApplesCount = 20;
        int OrangesCount = 30;
        int PearsCount = 30;
        boolean comp = ApplesCount < OrangesCount || OrangesCount >= PearsCount;
                   //      20   <     30          ||   30         >=  30
                   //            True             ||     True
        System.out.println(comp);

        boolean A = true;
        boolean B = !A;
        boolean C= A != B       &&    A == !B     &&    !A == B;
                // true != false && true == true  &&     true == true
                //    true      &&    true        && true
        System.out.println(C); //true


    }
}
