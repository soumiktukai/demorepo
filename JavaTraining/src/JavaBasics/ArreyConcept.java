package JavaBasics;

public class ArreyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//int array
		int i[] =new int[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		//System.out.println(i[2]);
		//System.out.println(i[4]);
		//System.out.println(i.length);
		
		for(int j=0;j<i.length;j++){
			System.out.println(i[j]);
			
		}
   //double array
		double b[] =new double[4];
		
		b[0]=14.55;
		
		
		//string array
		
		String s[]=new String[3];
		
		s[0]="kolkata";
		s[1]="durgapuja";
		s[2]="prem";
		
		System.out.println(s[2]);
		
		
		
		//char array
		
		char c[]= new char[3];
		
		c[0]=3;
		c[1]='$';
		c[2]='f';
		
		System.out.println(c[0]);
		
		//object of array
		
		Object obj[]=new Object[6];
		
		obj[0]= '#';
		obj[1]="kolkata";
		obj[2]= true;
		obj[3]= 5;
		obj[4]= 15.65;
		
		

		
				
				
		
		
		
		
		
	}

}
