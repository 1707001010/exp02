package Triangle;
import java.util.Scanner;

class Point{
	double x=0;
	double y=0;
	public void Point(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public double getX() { return x; }
	public double getY() { return y; }
	 
	public double distance(Point p1, Point p2) {    
		return Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2)+Math.pow(p1.getY()-p2.getY(), 2));
	}
}

class Perimeter{
	
}

public class Triangle {
	public static void main(String[] args) {
		Point p=new Point();
		Point p1=new Point();
		Point p2=new Point();
		Point p3=new Point();
		Scanner sc = new Scanner(System.in); 
		System.out.println("请输入第一个点的x,y");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		System.out.println("请输入第二个点的x,y");
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		System.out.println("请输入第三个点的x,y");
		double x3=sc.nextDouble();
		double y3=sc.nextDouble();
		p1.Point(x1, y1);
		p2.Point(x2, y2);
		p3.Point(x3, y3);
		if(x1==x2&&x2==x3||y1==y2&&y2==y3) {
			System.out.println("这三个点不能构成三角形");
		}
		else {
			double c=p.distance(p1, p2)+p.distance(p3, p2)+p.distance(p1, p3);
			double s1=p.distance(p1, p2);
			double s2=p.distance(p1, p3);
			double s3=p.distance(p3, p2);
			double d=(s1+s2+s3)/2;
			double area=Math.sqrt(d*(d-s1)*(d-s2)*(d-s3));
			System.out.print("周长：");
			System.out.println(c);
			System.out.print("面积：");
			System.out.println(area);
		}
	}
}

