
/**
 * This program will be used to convert measurements from the imperial system to the metric system.
 */
import java.util.Scanner;
//importing java scanner for user input
public class lab9Ex1
{
    public static void main(String[]args){
        Scanner integer = new Scanner(System.in);
        //declaring scanner for user input for measurement
        Scanner units = new Scanner(System.in);
        //Declaring scanner for the type of measurement
        char unit;
        //User's type of measurement
        double Value,kg,km,li;
        //
        System.out.println("Please enter an integer quantity and the unit type:");
        Value = integer.nextDouble();
        //user will input the measurement
        unit = units.nextLine().charAt(0);
        // user will input the type of measurement
            if((unit == 'p')||(unit == 'P')){
            //This if statement is used for pound conversion
            kg = PoundConversion(Value); 
            //calling the pound conversion method below
            System.out.println(Value + " Pounds is equal to: " + kg + " kilograms");
        }
            else if((unit =='m')||(unit =='M')){
                //This else if statement is used for mile conversion
                km = MileConversion(Value);
                //calling the mileconversion method below
                System.out.println(Value + " Miles is equal to: " + km + " kilometers");
            }
            else if((unit == 'g')||(unit == 'G')){
                //This else if statement is used for Gallon conversion 
                li = literconversion(Value);
                //calling the literconversion method below
                System.out.println(Value + "Gallons is equal to: " + li + " liters");
            }
    }
    public static double PoundConversion(double Value){
        //this method is used when user inputs p into the unit variable
        double kg;
        kg = Value / 2.2;
        return kg;
        //Returning the kg value into the main method
    }
    public static double MileConversion(double Value){
        //this method is used when user inputs m into the unit variable
        double km;
        km = 1.61 * Value;
        return km;
        //Returning the km value into the main method
    }
    public static double literconversion(double Value){
        //this mehtod is used when user inputs g into the unit variable
        double li;
        li = 3.79 * Value;
        return li;
        //Returning the li value into the main method
    }
}

