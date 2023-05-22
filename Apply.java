package eclipse_project;
import java.util.*;

public class Apply {

	public static void main(String[] args) {
		Scanner ref = new Scanner (System.in );
	System.out.print("Enter First number :");
	int a = ref.nextInt();
	System.out.print("Enter Second number :");
	int b = ref.nextInt();

      addition  ob =new addition();
      System.out.println("sum of  "+a+" + "+ b+" = "+ ob.add(a,b));
      ref.close();
      
	}

}
