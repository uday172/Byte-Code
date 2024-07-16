package ConstructorPrograms;

public class Rectangle {
	int width;
	int height;
	Rectangle(int width,int height){
		this.width = width;
		this.height = height;
	}
	int calculateArea() {
		return width*height;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(12,13);
		System.out.println("Area : "+r.calculateArea());
	}

}
