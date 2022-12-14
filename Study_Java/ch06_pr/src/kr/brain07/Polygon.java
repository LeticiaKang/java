package kr.brain07;
import java.util.*;
public abstract class Polygon {
		
		// 삼각형, 직사각, 정사각, 평행사변, 사다리꼴
		private int height;
		private int top;
		private int depth; //부피, 적층
		private int width;
		private String name;

//=================== 초기화 ========================
		
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
		
//=================== 메소드 ========================
		public abstract int evaluate();

		
}
