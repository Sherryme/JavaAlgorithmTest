
public class 立方尾不变 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		
		for(int i=1;i<=10000;i++){
			if((i*i*i)%10==i){
				count++;
			}else if(((i*i*i)/10%10)*10+(i*i*i)%10==i){
				count++;
			}else if(((i*i*i)/100%10)*100+((i*i*i)/10%10)*10+(i*i*i)%10==i){
				count++;
			}else if(((i*i*i)/1000%10)*1000+((i*i*i)/100%10)*100+((i*i*i)/10%10)*10+(i*i*i)%10==i){
				count++;				
			}	
		}
		System.out.println(count);
	}

}
