package kr.brain07;

public class Rectangle extends Polygon{

	public Rectangle(int length) {
		super(length, length);
//		super.setHeight(length); //오류가 나는 건 생성자 1개가 super에 없어서
//		super.setWidth(length);
		
	}
	
	@Override
	public int evaluate() {
		int area = getHeight()* getWidth();
		setName("Rectangle");
		return area;
	}

}
