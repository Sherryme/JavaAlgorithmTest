public class ���� {

	public static void main(String[] args) {
		// �ҵ������������һ����λ�����Ĵη���һ����λ��������ÿһλ��0-9,�����ظ��������Ҷ����ꣿ
		for (int x = 10; x < 100; x++) {
			int li=x*x*x;
			int sici=li*x;
			if(li>999&&li<10000&&sici>99999&&sici<1000000)
			System.out.println(x+"�� "+li+" "+sici);
		}
	}

}
