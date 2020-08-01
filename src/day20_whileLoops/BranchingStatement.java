package day20_whileLoops;

public class BranchingStatement {
    public static void main(String[] args) {

        char ch = 'A';
        while(ch <= 'E'){
            if(ch == 'C'){
                ch++;
//                break; will exit the loop and output will be AB
                continue;//skips everything even the iterator, that's why we are adding an other
                //iterator before continue.
            }
            System.out.println(ch+" ");
            ch++;
        }


        //System.exit(0)
        if(true){
            System.exit(0);//exit the system and stops the JVM
        }
        System.out.println("Done");//will not execute because the program is already terminated
    }
}
