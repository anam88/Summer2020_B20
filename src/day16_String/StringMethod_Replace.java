package day16_String;

public class StringMethod_Replace {
    public static void main(String[] args) {
        //replace method of String class
/*replace all old value with the given new value. It does not make any changes in
 the old object. */
        String email = "magicland@gmail.com";
        //variable = object
         email = email.replace("gmail", "yahoo");
         System.out.println(email);

         String word = "java";//word is referring to object java
        //by assigning the variable to new object now its value is jeve
         word = word.replace("a","e");
        System.out.println(word);

        //make the Java unique to replace certain Java words

        String sentence = "I like to learn Java, Java is cool, Java is fun";
            sentence = sentence.replace("a, Java","a, C#");
        sentence  = sentence.replace(", Java ",", Python ");
        System.out.println(sentence);

        //replace
        String s1 = "I like to stay in Cybertek, Cybertek is nice place";
        s1= s1.replace("Cybertek","MIT");
        System.out.println(s1);
        s1 = s1.replace("MIT", "Cybertek");
        System.out.println(s1);

        //replace Character

        String s2 = "I Like to LeaRn Java";
        s2 = s2.replace('R', 'r');
        System.out.println(s2);

        /*
         *replaceFirst(oldValue, newValue)- it will replace first occur old value with new value*/

        String s3 = "I like to drink tea, and tea";
        s3= s3.replaceFirst("tea","coffee");
        System.out.println(s3);

        String s4 = "I like to Watch Game of Thrones, and Walking dead";
        s4 = s4.replaceAll(", and Walking dead","");
        System.out.println(s4);



    }
}
