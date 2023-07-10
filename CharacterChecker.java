
/**
 * This code will be used to check character.
 *
 * @Brennan Gilbert 
 * @9/26/22
 */
import java.util.Scanner;

public class CharacterChecker{
    public static void main(String[] args)
    {
        char cr;
        int counter;
        Scanner UserInput = new Scanner(System.in);
        
        for(counter=0; counter <=3; counter++){
            
            System.out.println("Input any character or symbol:");
            cr = UserInput.nextLine().charAt(0);
            
            if((cr == 'a')||(cr == 'e')||(cr == 'i')||(cr == 'o')||(cr == 'u')||(cr == 'A')||(cr == 'E')
            ||(cr == 'I')||(cr == 'O')
                ||(cr == 'U')){
                    System.out.println(cr + " is a vowel");
            }
                else if((cr >= 'a') && (cr <= 'z') || (cr >= 'A') && (cr <= 'Z'))
                {
                    System.out.println(cr + " is  consonant");
            }
                else if((cr >= '0') && (cr <= '9') && (cr % 2 == 0))
                {
                    System.out.println(cr + " is an even number");
            }
                else if((cr >= '0') && (cr <= '9') && (cr % 2 != 0))
                {
                    System.out.println( cr + " is an odd number");
            }
                else
                {
                    System.out.println( cr + " is a special character");
            }
}
}
}