
public class Shape {
	double side;
	double length;
	double breadth;
	public Shape(int side) {
		this.side=side;
	}
	public Shape (double length,double breadth) {
		if(length > 0.0 && length <20.0)
		{
		
		this.length=length;
		this.breadth=breadth;
		}
		else
		{
		System.out.println("input is not with in the range");
		}
		
	}
	public double areaRectangle() {
		return length *breadth;
	}
	public double periRectangle() {
		return 2*(length*breadth);
	}
	public static void main(String args[]) {
	
		//Shape square= new Shape(5);
		Shape rectangle=new Shape(2,5);
		System.out.print(rectangle.areaRectangle());
	}
	

}
