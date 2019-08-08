
public class 钟表 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour,minute,second;
		int hour2,minute2,second2;
		int fh,fm,fs;
		//昨天睡眠时间
		hour=24-23;
		minute=60-28;
		second=60-45;
		//今天睡眠时间
		hour2=6;
		minute2=24;
		second2=26;
		//共计睡眠时间
		fh=hour+hour2;
		fm=minute+minute2;
		fs=60-(second+second2);
		if(second+second2>60){
			fm+=1;
		}
		System.out.println(fh+":"+fm+":"+fs);
	}

}
