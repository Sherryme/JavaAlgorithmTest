package lqb;

public class С�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int jj=1;jj<50;jj++){
			for (int mm = 1; mm < 50; mm++) {
				if((jj+mm)*6==jj*mm&&jj>mm&&jj-mm<=8){
					System.out.println("���õ�������"+mm+"��");
				}
			}
		}
	}
}