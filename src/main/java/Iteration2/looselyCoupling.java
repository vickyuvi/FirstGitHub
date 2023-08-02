package Iteration2;

interface Game{

	void left();
	void right();
		
}
class Game1 implements Game{

	public void left() {
		System.out.println("left_one");
}
	public void right() {
		System.out.println("right_one");
}

}
class Game2 implements Game{

	public void left() {
		System.out.println("left_two");
}
	public void right() {
		System.out.println("right_two");
}

}
class Game3 implements Game{

	public void left() {
		System.out.println("left_three");
}
	public void right() {
		System.out.println("right_three");
}
}

class Runner{
	public Game obj;
	
	public Runner(Game obj) {
		this.obj=obj;
	}	
	
	  void run() {
		obj.left();
		obj.right();
		
	}
}


public class looselyCoupling {
	public static void main(String[] args) {	
		Game1 g1=new Game1();
		Game2 g2=new Game2();
		Game3 g3=new Game3();
		Runner r=new Runner(g1);
		r.run();
	}
	
	
	
	

}

