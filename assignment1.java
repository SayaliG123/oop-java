package sayali;
import java.util.Scanner;

public class complex 
{

	double real;
	double imagi;
	public complex() 
	{
		this.real=0;
		this.imagi=0;
	}
	public complex(double real,double imagi)
	{
		this.real=real;
		this.imagi=imagi;
	}
	public complex add(complex c2)
	{
		double realadd=this.real+c2.real;
		double imagiadd=this.imagi+c2.imagi;
		return new complex(realadd,imagiadd);
	}
	public complex sub(complex c2)
	{
		double realsub=this.real-c2.real;
		double imagisub=this.imagi-c2.imagi;
		return new complex(realsub,imagisub);
	}
	public complex mul(complex c2)
	{
		double realmul=(this.real*c2.real)-(this.imagi*c2.imagi);
		double imagimul=(this.real*c2.real)+(this.imagi*c2.imagi);
		return new complex (realmul,imagimul);
	}
	public complex divi(complex c2)
	{
		double realdivi=((this.real*c2.real)+(this.imagi*c2.imagi))/((this.real*this.real)+(c2.imagi*c2.imagi));
		double imagidivi=((this.real*c2.real)-(this.imagi*c2.imagi))/((this.real*this.real)+(c2.imagi*c2.imagi));
		return new complex(realdivi,imagidivi);
	}
	@Override
	public String toString()
	{
		return real+" + "+imagi+" i ";
	}

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner (System.in);
		System.out.println("c1 =a+ib");
		System.out.println("enter a:");
		float a=scanner.nextFloat();
		System.out.println("enter b:");
		float b=scanner.nextFloat();
		System.out.println("c2=c+id");
		System.out.println("enter c:");
		float c=scanner.nextFloat();
		System.out.println("enter d:");
		float d=scanner.nextFloat();
		complex c1=new complex(a,b);
		complex c2=new complex(c,d);
		System.out.println("c1= "+c1);
		System.out.println("c2= "+c2);
		System.out.println("c1+c2= "+c1.add(c2));
		System.out.println("c1-c2= "+c1.sub(c2));
		System.out.println("c1*c2= "+c1.mul(c2));
		System.out.println("c1/c2= "+c1.divi(c2));
		
		

	}

}
