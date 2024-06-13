public abstract class Shape {
	protected float area;
		abstract void calArea();
		void show() {
			System.out.println("Area of the shape is "+ area);
		}
}
public class Rectangle extends Shape {
	private float height,width;
	public Rectangle() {
		this.width = 5.0f;
		this.height = 2.0f;
	}
	
	public Rectangle(float width,float height) {
		this.height=height;
		this.width=width;
	}
	@Override
	void calArea() {
		super.area = width * height;	
	}	
}
public class Square extends Shape{
	private float side;
	public Square() {
		side = 2.0f;
	}
	
	public Square(float side) {
		this.side=side;
	}
	@Override
	void calArea() {
		super.area=side*side;
	}
}
public class Abstractdemo {

	public static void main(String[] args) {
		//static binding
		Square sq = new Square();
		Rectangle Re = new Rectangle(); 
		sq.calArea();
		sq.show();
		Re.calArea();
		Re.show();
		
		//dynamic binding
		Shape shape;
		shape = new Rectangle();
		shape.calArea();
		shape.show();
		
		shape = new Square();
		shape.calArea();
		shape.show();	
	}
}
