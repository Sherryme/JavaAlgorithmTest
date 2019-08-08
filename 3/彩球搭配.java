package lqb;

public class ≤ «Ú¥Ó≈‰ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int red=0;red<=3;red++){
			for (int white = 0; white <=3; white++) {
				for (int black = 0; black <=6; black++) {
					if(red+white+black==8){
						System.out.println("∫Ï"+red+" ∞◊"+white+" ∫⁄"+black);
						count++;
					}
				}
			}
		}
		System.out.println("“ªπ≤”–"+count+"÷÷¥Ó≈‰");
	}
}
