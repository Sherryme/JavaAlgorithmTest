
public class �ӱ� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour,minute,second;
		int hour2,minute2,second2;
		int fh,fm,fs;
		//����˯��ʱ��
		hour=24-23;
		minute=60-28;
		second=60-45;
		//����˯��ʱ��
		hour2=6;
		minute2=24;
		second2=26;
		//����˯��ʱ��
		fh=hour+hour2;
		fm=minute+minute2;
		fs=60-(second+second2);
		if(second+second2>60){
			fm+=1;
		}
		System.out.println(fh+":"+fm+":"+fs);
	}

}
