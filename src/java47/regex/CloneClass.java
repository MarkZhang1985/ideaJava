package java47.regex;

public class CloneClass {

	 class House {

		private Double length;
		private Double width;
		private Double height;
		private Double area;
		private TV tv;

		public Double getLength() {
			return length;
		}

		public void setLength(Double length) {
			this.length = length;
		}

		public Double getWidth() {
			return width;
		}

		public void setWidth(Double width) {
			this.width = width;
		}

		public Double getHeight() {
			return height;
		}

		public void setHeight(Double height) {
			height = height;
		}

		public Double getArea() {
			return area;
		}

		public TV getTv() {
			return tv;
		}

		public void setTv(TV tv) {
			this.tv = tv;
		}

		public void calculationArea(){
			this.area = length * width;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}

		@Override
		public String toString() {
			return super.toString();
		}
	}

	public class TV {

		private String size;

		public String getSize() {
			return size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}

		@Override
		public String toString() {
			return super.toString();
		}
	}


	public void main(String[] args) {

		House house = new House();
		TV tv = new TV();

		house.setLength(50.0);
		house.setWidth(60.0);
		house.setHeight(3.5);
		house.calculationArea();
		System.out.println("样板房的信息："+house.toString());


	}
}
