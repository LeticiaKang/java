package kr.brain07;

public class Triangle extends Polygon {

	public Triangle(int height, int width) {
		super(height, width);
	}
	
	@Override
	public int evaluate() {
		int area = getHeight()* getWidth() / 2;
		return area;
	}

}
