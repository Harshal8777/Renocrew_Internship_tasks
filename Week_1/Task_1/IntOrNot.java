import java.util.Scanner;

public class IntOrNot {
	
	
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number");
	    System.out.println(sc.hasNextInt());
	    sc.close();
	  }

}
