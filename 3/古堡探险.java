package lqb;

public class π≈±§ÃΩœ’ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 1; a <=9; a++) {
			for (int b = 0; b <=9; b++) {
				for (int c = 0; c<=9; c++) {
					for (int d = 0; d <=9; d++) {
						 for (int e = 1; e <=9; e++) {
							for (int f = 0; f <=9; f++) {
								if((a*10000+b*1000+c*100+d*10+e)*f==e*10000+d*1000+c*100+b*10+a&&
									a!=b&&a!=c&&a!=d&&a!=e&&a!=f&&c!=e){
									System.out.println("A"+a+" B"+b+" C"+c+" D"+d+" E"+e);
								}
							}
						}
					}
				}
			}
		}
	}

}
