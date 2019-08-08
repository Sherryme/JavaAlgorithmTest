package lqb;

public class 年龄 {

	public static void main(String[] args) {
		// 出生年份的四位数字加起来刚好是我的年龄。表弟的也是如此。已知今年是2014年，并且，小明说的年龄指的是周岁。这是一个4位整数， 请推断并填写出小明的出生年份。
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
