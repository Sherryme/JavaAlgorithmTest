package lqb;

public class �ټ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int g = 0; g <=19; g++) {
			for (int m = 0; m <=33; m++) {
				int x=100-g-m;
				if((g*5+m*3+x/3==100)&&x%3==0){
					System.out.println("��"+g+" ĸ"+m+" С"+x);
				}
			}
		}
	}

}
