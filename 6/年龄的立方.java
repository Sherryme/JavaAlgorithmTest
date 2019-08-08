public class 年龄 {

	public static void main(String[] args) {
		// 我的年龄的立方是一个四位数，四次方是一个六位数，他们每一位从0-9,各不重复，请问我多少岁？
		for (int x = 10; x < 100; x++) {
			int li=x*x*x;
			int sici=li*x;
			if(li>999&&li<10000&&sici>99999&&sici<1000000)
			System.out.println(x+"岁 "+li+" "+sici);
		}
	}

}
