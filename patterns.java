import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    //Right Angled Triangle
	    System.out.println("Printing Right Angled Triangle");
	    for(int i=1; i<=5; i++){
	        System.out.println();
    	        for(int j=1; j<=i; j++){
    	            System.out.print("*");
    	        }
	    }
	    //Reverse Right Angled Triangle
	    System.out.println("\nPrinting Reverse Right Angled Triangle");
	    for(int i=5; i>=1; i--){
	        System.out.println();
    	        for(int j=1; j<=i; j++){
    	            System.out.print("*");
    	        }
	    }
	    //Printing Mirrored Right Angled Triangle
	    System.out.println("\nPrinting Mirrored Right Angled Triangle");
	    for(int i=1; i<=5; i++){
	        System.out.println();
	        for(int n=0;n<5-i;n++)
                {
                    System.out.print(" ");
                }
    	        for(int j=1; j<=i; j++){
    	            System.out.print("*");
    	        }
	    }
	    
	    //Reverse Right Angled Triangle
	    System.out.println("\nPrinting Reverse Right Angled Triangle");
	    for(int i=5; i>=1; i--){
	        System.out.println();
	        for(int n=0;n<5-i;n++)
                {
                    System.out.print(" ");
                }
    	        for(int j=1; j<=i; j++){
    	            System.out.print("*");
    	        }
	    }
	    
	    //Centered Equilateral Right Angled Triangle
	    System.out.println("\nCentered Equilateral Right Angled Triangle");
	    for(int i=1; i<=5; i++){
	        System.out.println();
	        for(int n=5;n>=i;n--)
                {
                    System.out.print(" ");
                }
    	        for(int j=1; j<=i; j++){
    	            System.out.print("* ");
    	        }
	    }
	    
	    //Centered Reverse Equilateral Right Angled Triangle
	    System.out.println("\nPrinting Centered Reverse Equilateral Angled Triangle");
	    for(int i=5; i>=1; i--){
	        System.out.println("");
	        for(int n=5;n>=i;n--)
                {
                    System.out.print(" ");
                }
    	        for(int j=1; j<=i; j++){
    	            System.out.print("* ");
    	        }
	    }
	    //Factorial from FOR loop
	    int fact=1;
	    System.out.print("\n\nEnter a number to find Factorial from FOR loop\n");
	    Scanner input = new Scanner(System.in);
	    int number = input.nextInt();
	    for(int i=number;i>=1;i--){
	        fact = fact*i;
	    }
	    System.out.println("Factorial of the number is: " + fact);
	    
	    
	    //Factorial from WHILE loop
	    int factWHILE=1;
	    System.out.print("\n\nEnter a number to find Factorial from WHILE loop\n");
	    int i = number;
	    while(i>=1){
	        factWHILE = factWHILE*i;
	        i--;
	    }
	    System.out.println("Factorial of the number is: " + fact);
	}
}
