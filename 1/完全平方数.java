
public class 完全平方数 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//一个整数（10万以内），它加上100后是一个完全平方数，加上168又是一个完全平方数，请问该数是多少？一个数能表示成某个数的平方的形式，则称这个数为完全平方数
		for(int i=0;i<=100000;i++){
			for(int j=1;j<=100;j++){
				for(int k=1;k<=100;k++){
					if(i==j*j-100&i==k*k-168){
						System.out.println(i);
					}
				}
			}
		}
	}

}
