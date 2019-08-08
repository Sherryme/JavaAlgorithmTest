import java.util.Scanner;
public class ¹ºÎï·½°¸ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int[] price=new int[m];
		for(int i=0;i<=m;i++){
			Scanner scs=new Scanner(System.in);
			price[i]=scs.nextInt();
			if(1000%price[i]==0){
				System.out.println(price);
			}
		}

	}

}
