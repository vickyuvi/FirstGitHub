package Spring.SpringBoot;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

	interface Characters{
	    void left1();
	    void right1();
	    void up1();
	    void down1();
	}
	 class Supermario1 implements Characters {
	public void left1()
	{
		System.out.println("turn left");
		}
	public void right1()
	{   
		System.out.println("turn right");
		}
	public void up1()
		{
			System.out.println("go up");
			}
	public void down1()
			{
				System.out.println("go down");
				}
	}
	 class Powerpuff1 implements Characters {
	public void left1()
	{   
		System.out.println("turn second left");
		}
	public void right1()
	{   
		System.out.println("turn second right");
		}
	public void up1()
		{
			System.out.println("go 2 steps up");
			}
	public void down1()
			{
				System.out.println("go 2 steps down");
				}
	} 
	 class Pacman1 implements Characters{
		public void left1()
		{
			System.out.println("turn left and again take a left");
			}
		public void right1()
		{
			System.out.println("turn right and again take a right");
			}
		public void up1()
			{
				System.out.println("go up and stop");
				}
		public void down1()
				{
					System.out.println("go down and stop");
					}
		}
	class Runner{
		public Characters obj;
		public Runner(Characters obj){
			this.obj=obj;	
		}
		void run(){
			  obj.left1();
			  obj.right1();
			  obj.up1();
			  obj.down1();
		}
	}

	 class Main1
	{
		public static void main(String args[]) {
			Supermario1 sm= new Supermario1();
			Powerpuff1 pf=new Powerpuff1();
			Pacman1 pm=new Pacman1();
			Runner r=new Runner(sm);
			r.run();
		}
		}

	
	

