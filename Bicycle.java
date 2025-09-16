import java.util.Scanner;

 interface Vehicle 
{
	void gear_changed(int gear);
	void speed_up(int inc);
	void apply_break(int dec);
}

public class Bicycle implements Vehicle
{

	int gear;
	int speed;
	@Override
	
	public void gear_changed(int new_gear)
	{
		gear=new_gear;
		System.out.println("gear is changed to"+gear);
	}
	@Override
	public void speed_up(int inc)
	{
		speed+=inc;
		System.out.println("speed is increased up to"+speed);
		
	}
	@Override
	public void apply_break(int dec)
	{
		speed-=dec;
		System.out.println("speed is decreased upto"+speed);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Vehicle[] vehicle=new Vehicle[3];
		vehicle[0]=new Bicycle();
		vehicle[1]=new car();
		vehicle[2]=new bike();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("entre gear");
		int gear=sc.nextInt();
		System.out.println("entre increment in speed");
		int inc=sc.nextInt();
		System.out.println("entre decrement in speed");
		int dec=sc.nextInt();
		
		System.out.println();
		System.out.println("for bicycle");
		vehicle[0].apply_break(dec);
		vehicle[0].speed_up(inc);
		vehicle[0].gear_changed(gear);
		System.out.println();
		System.out.println("for car");
		vehicle[1].apply_break(dec);
		vehicle[1].speed_up(inc);
		vehicle[1].gear_changed(gear);
		System.out.println();
		
		System.out.println("for bike");
		vehicle[2].apply_break(dec);
		vehicle[2].speed_up(inc);
		vehicle[2].gear_changed(gear);

	}

}
class car implements Vehicle
{
	int gear;
	int speed;
	
	@Override
	public void gear_changed(int new_gear)
	{
		gear=new_gear;
		System.out.println("gear is changed to"+gear);
	}
	@Override
	public void speed_up(int inc)
	{
		speed+=inc;
		System.out.println("speed is increased up to"+speed);
		
	}
	@Override
	public void apply_break(int dec)
	{
		speed-=dec;
		System.out.println("speed is decreased upto"+speed);
	}
}
class bike implements Vehicle
{
	int gear;
	int speed;
	
	@Override
	public void gear_changed(int new_gear)
	{
		gear=new_gear;
		System.out.println("gear is changed to"+gear);
	}
	@Override
	public void speed_up(int inc)
	{
		speed+=inc;
		System.out.println("speed is increased up to"+speed);
		
	}
	@Override
	public void apply_break(int dec)
	{
		speed-=dec;
		System.out.println("speed is decreased upto"+speed);
	}
}
