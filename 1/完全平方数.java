
public class ��ȫƽ���� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//һ��������10�����ڣ���������100����һ����ȫƽ����������168����һ����ȫƽ���������ʸ����Ƕ��٣�һ�����ܱ�ʾ��ĳ������ƽ������ʽ����������Ϊ��ȫƽ����
		for(int i=0;i<=100000;i++){
			for(int j=1;j<=100;j++){
				for(int k=1;k<=100;k++){
					if(i==j*j-100&i==k*k-168){
						System.out.println(i);
					}
				}
			}
		}
	}

}
