abstract class shape 
{	
	int a,b;
	
	public shape(int a,int b)
	
	{
		this.a=a;
		this.b=b;
	}
	public shape(int a)
	{
		this.a=a;
	}
	
	abstract double calculate_area();
	public void draw()
	{
		System.out.println("this is class shape");
	}
}

class triangle extends shape
{
	public triangle(int a,int b)
	{
		super(a,b);
	}
	@Override
	public double calculate_area()
	{
		double area=a*b*0.5;
		System.out.println("area of triangle is "+area);
		return area;
	}
	@Override
	public void draw()
	{
		System.out.println("this is triangle class");
	}
	public static void main(String[] args) 
	{
		shape t=new triangle(22,45);
		t.calculate_area();
		t.draw();
		System.out.println();
		shape r=new rectangle(34,89);
		r.calculate_area();
		r.draw();
		System.out.println();
		shape s=new square(45);
		s.calculate_area();
		s.draw();

	}
}
	
	class rectangle extends shape
	{
		public rectangle(int a,int b)
		{
			super(a,b);
		}
		@Override
		public double calculate_area()
		{
			double area=a*b;
			System.out.println("area of rectangle is:"+area);
			return area;
		}
		@Override
		public void draw()
		{
			System.out.println("this is rectangle class");
		}
		
	}
	class square extends shape
	{
		public square(int a)
		{
			super (a);
			
		}
		@Override
		public double calculate_area()
		{
			double area =a*a;
			System.out.println("area of square is:"+area);
			return area;
		}
		@Override
		public void draw()
		{
			System.out.println("this is square class");
		}
	}

	


