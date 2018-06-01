
public class Rectangle {
	int length;
	int width;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width,int length) {
		if(width > 0.0 && width <20.0 && length  > 0.0 && length <20.0)
			
		{
		this.length=length;	
		this.width = width;
	}else
	{
		System.out.println("not in range");
	}
	}
	public void area(int a, int b) {
		int area= a*b;
		System.out.println("area: " +area+"");
		
	}
	public void perimeter(int a, int b) {
		int peri= 2*(a+b);
		System.out.println("perimeter: " +peri+"");
	}
	public static void main(String ards[]) { 
		Rectangle r1 = new Rectangle();
		//Rectangle r2 = new Rectangle();
		r1.area(5,8);
		r1.perimeter(5,8);
		r1.setWidth(2,2);
	}

}
