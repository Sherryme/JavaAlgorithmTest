package lqb;

public class ���� {

	public static void main(String[] args) {
		// ������ݵ���λ���ּ������պ����ҵ����䡣��ܵ�Ҳ����ˡ���֪������2014�꣬���ң�С��˵������ָ�������ꡣ����һ��4λ������ ���ƶϲ���д��С���ĳ�����ݡ�
		int y;
		for (y = 1950; y < 2014; y++) {
			int ge=y%10;
			int shi=y/10%10;
			int bai=y/100%10;
			int qian=y/1000;
			if(ge+shi+bai+qian==2014-y){
				System.out.println(y);
			}
		}
	}

}
