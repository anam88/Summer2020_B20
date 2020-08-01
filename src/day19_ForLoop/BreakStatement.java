package day19_ForLoop;

public class BreakStatement {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++ ){
            System.out.println("Hello");
            break; //exit the current loop, because it is inside the loop
        }
        System.out.println("*****************");

        for(char ch = 'A'; ch <= 'H'; ch++){
            System.out.print(ch+" ");
            //create a condition so the loop stop after printing 'C'
            if (ch == 'C'){//this condition has to be TRUE for the break statement to execute
        //it does matter where we put the break statement because JAVA execute from top to bottom
                break;
            }
        }
        System.out.println("*********************");

        for(int i = 10; i <= 50; i += 10){//i: 10, 20, 30, 40 , 50
//            if (i == 30){//only prints 10, 20
//                break; //does not print 30 because break statement is before printing statement
//            }
            System.out.print(i+" ");
            if(i == 30){//prints 10,20,30
                break;
            }
        }
        System.out.println();
        System.out.println("***********************");

        for(int x = 1000; x >= 100; x-= 100){//x: 1000, 900, 800, 700, 600 ..... 100
            if (x == 500){//loop break once x == 500, 500 will not print because loop is already break
                break;
            }
            System.out.println(x +" ");
        }
    }
}
