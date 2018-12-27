package JavaBasics;

import java.awt.geom.Arc2D.Double;


public class Methodoverloading {
   int i;
	public static void main(String[] args) {
		
		try{
		
		Methodoverloading mo= new Methodoverloading();
				mo.sum(10, 0);
		}catch(Exception lacto){
			System.out.print(lacto);
			
			
		}
	}
		
   public int sum(int a, int b)
   {
	   return a/b;
   }
	
  /* public double sum(double a, int b )
   {
	   return a;
   }
*/
}
