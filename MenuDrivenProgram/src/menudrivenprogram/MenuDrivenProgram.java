package menudrivenprogram;
import java.util.*;

public class MenuDrivenProgram {

	public static void main(String[] args) {
    int num1,num2;

    System.out.println("MENU");
    System.out.println("====");
    System.out.println("ADD");
    System.out.println("SUB");
    System.out.println("MUL");
    System.out.println("DIV");
    
    System.out.println("Enter number1: ");
    Scanner scan=new Scanner(System.in);
    num1 =scan.nextInt();
    System.out.println("Enter number2: ");
    num2 =scan.nextInt();
    scan.nextLine();
    System.out.println("Enter option in words");
    String option = scan.nextLine();
    option=option.toUpperCase();
    switch(option)
    {
    case "ADD":System.out.println("Addition of two numbers is :"+ (num1+num2));
                 break;
    case "SUB":System.out.println("Subtraction of two numbers is :"+ (num1-num2));
    break;
    case "MUL":System.out.println("Multiplication of two numbers is :"+ (num1*num2));
    break;
    case "DIV":System.out.println("Division of two numbers is :"+ (num1/num2));
    break;
    default:System.out.println("Not a menu option");
    break;
    }
	}

}
