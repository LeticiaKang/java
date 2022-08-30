package kr.brain07;
import java.util.*;
public abstract class Polygon {
		
		// �ﰢ��, ���簢, ���簢, ����纯, ��ٸ���
		private int height;
		private int top;
		private int depth; //����, ����
		private int width;
		private String name;

//=================== �ʱ�ȭ ========================
		
		public Polygon(int height,int width, int top) {
			this.height = height;
			this.top = top;
			this.width = width;
		}
		
		public Polygon(int height, int width) {
			this.height = height;
			this.width = width;
		}
		
//=================== Getter, Settet ========================
		public int getDepth() {
			return depth;
		}

		public void setDepth(int depth) {
			this.depth = depth;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setHeight(int height) {
			this.height = height;
		}
		public int getHeight() {
			return height;
		}
		
		public void setWidth(int top) {
			this.width = width;
		}
		public int getWidth() {
			return width;
		}
		
		
		public void setTop(int top) {
			this.top = top;
		}
		public int getTop() {
			return top;
		}
		
//=================== �޼ҵ� ========================
		public abstract int evaluate();

		
}