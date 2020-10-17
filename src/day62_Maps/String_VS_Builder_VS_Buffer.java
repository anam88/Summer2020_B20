package day62_Maps;

public class String_VS_Builder_VS_Buffer {
    public static void main(String[] args) {
        String str1 = "cybertek";
        str1.concat(" school");
        System.out.println(str1); //immutable
        System.out.println("**************************************");
        String str2 = new String("Cybertek");
        StringBuilder sb1 = new StringBuilder("cybertek");
        sb1.append(" school");
        System.out.println(sb1);//mutable
        sb1.reverse();
        System.out.println(sb1);
        System.out.println("**************************************");
        //converting stringbuilder to string
        String name = "kayak";
        String reversedName = new StringBuilder(name).reverse().toString();
        System.out.println(name.equalsIgnoreCase(reversedName));
        System.out.println("**************************************");
        //converting string to stringbuilder
            String s1 = "Friday";
            StringBuilder s2 = new StringBuilder(s1);

        //convert stringbuilder to string
        String s3 = s2.toString();

    }
}
