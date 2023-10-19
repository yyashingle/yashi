package point.test;
import point.code.Point;
import java.util.*;

public class Tester2D {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		 System.out.println("enter Two Points");
		 Point p =new Point(sc.nextInt(),sc.nextInt());
		 Point q =new Point(sc.nextInt(),sc.nextInt());
		 
	  	if(isEqual(p,q)) {
	  		System.out.println("They are equal");
	  	}
	  	else {
	  		System.out.println("They are not equal");
	  	}
	  	
	  	System.out.println("distance between Points is :" +calcuDist(p, q) );
   
	}
	
	private static double calcuDist(Point p, Point q) {
		return  Math.sqrt(Math.pow((p.x-q.x),2)+Math.pow((q.y-p.y), 2));
	}

	private static boolean isEqual(Point p, Point q) {
		   if(p.x==q.x && p.y==q.y) {
			    return true;
		   }else {
		        return false;
		   }
	}

}
