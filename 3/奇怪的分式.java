package lqb;

public class Ææ¹ÖµÄ·ÖÊ½ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for (int a = 1; a <=9; a++) {
			for (int b = 1; b <=9; b++) {
				if (a==b)
					continue;
				for (int c = 1; c <=9; c++) {
					for (int d = 1; d <=9; d++) {
						if (c==d)
							continue;
						if((a*b)/(c*d)==(a*10+c)/(c*10+d)){
							//System.out.println(a+"/"+b+"*"+c+"/"+d);
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}

}