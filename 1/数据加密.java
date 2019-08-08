import java.util.Scanner;

public class Êı¾İ¼ÓÃÜ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp;
		int single=num%10;
		int ten=num/10%10;
		int hundred=num/100%10;
		int thousand=num/1000;
		single=(single+5)%10;
		ten=(ten+5)%10;
		hundred=(hundred+5)%10;
		thousand=(thousand+5)%10;
		temp=thousand;
		thousand=single;
		single=temp;
		temp=ten;
		hundred=ten;
		ten=temp;
		System.out.println(thousand+""+hundred+""+ten+""+single);	
	}
}