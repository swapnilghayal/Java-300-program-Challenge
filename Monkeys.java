import java.util.*;
public class Monkeys{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of monkeys");
		int n = sc.nextInt();

		System.out.println("Enter number of eatable banana by single monkey");
		int k = sc.nextInt();
		System.out.println("Enter number of eatable Peanuts by single Monkey ");
		int j = sc.nextInt();
		
		System.out.println("Enter number of banana");
		int m = sc.nextInt();	
		System.out.println("Enter number of peanuts");
		int p = sc.nextInt();
		
		int x = m /k;
		int y = p /j ;

		
		if(n < x ){
			n = n-x;
			System.out.println(n);
}
		}
}