public class Ö½ÅÆÈý½ÇÐÎ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1+2+4+6=
		//1+3+5+9=
		//6+7+8+9
		int count=0;
		for(int a=1;a<10;a++){
			for(int b=1;b<10;b++){
				for(int c=1;c<10;c++){
					for(int d=1;d<10;d++){
						for(int e=1;e<10;e++){
							for(int f=1;f<10;f++){
								for(int g=1;g<10;g++){
									for(int h=1;h<10;h++){
										for(int i=1;i<10;i++){
											if((a+b+d+f)==(a+c+e+i)&&(a+c+e+i)==(f+g+h+i)&&(f+g+h+i)==(a+b+d+f)
													&&a!=b&&a!=c&&a!=d&&a!=e&&a!=f&&a!=g&&a!=h&&a!=i
													&&b!=a&&b!=c&&b!=d&&b!=e&&b!=f&&b!=g&&b!=h&&b!=i
													&&d!=a&&d!=b&&a!=d&&c!=e&&d!=f&&a!=g&&a!=g&&a!=h&&a!=i){
													System.out.println(a+" "+b+""+c+"  "+d+""+e+" "+f+""+g+""+h+""+i);
													count++;																		
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		System.out.println(count/6);
	}
}
	