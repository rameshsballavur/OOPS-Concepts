class Graph{
	public void  drawPoint(){
		System.out.println("kjdsfkjsdh");
	}
	public static int drawPoint(int x,int y){
		int a = x-y;
		return a;
	}
	public void drawPoint(double y,int x){
		System.out.println("x = "+x + " y = "+y);
	}
	public void drawPoint(int y,double x){
		System.out.println("x = "+x + " y = "+y);

	}
	public double drawPoint(double x,double y){
		//System.out.println("x = "+x + " y = "+y);

		double z = x+y;
		return z;
	}
	public static void main(String[] args) {
		Graph g1 = new Graph();
		g1.drawPoint();
		System.out.println(g1.drawPoint(1,1));//subtraction
		g1.drawPoint(1.2,2);
		g1.drawPoint(2,3.5);
		System.out.println(g1.drawPoint(3.5,4.5));0//additionbvvv
		System.out.println("relskj");
		System.out.println(45);
		System.out.println("smlm"+"fdf");
	}
}