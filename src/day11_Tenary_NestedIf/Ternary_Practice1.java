package day11_Tenary_NestedIf;

public class Ternary_Practice1 {
    public static void main(String[] args) {
        //    can ternary statement be use for multi statement
//    ex:

        int num = 100;
        String result = "";

        if(num > 0){
            result = "Postiive";
        }else if (num < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }
        System.out.println(result);


//***********************************************************************************

        String result1 = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        //string result1 - since the return value is in string we assign the ternary statment to a new string
        //            =   condition IF return  ELSE condition IF return Else return
        System.out.println(result1);


    }

}
