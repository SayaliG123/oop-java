public class studentinfo {
	public int roll_no;
	public String student_name;
	public int sgpa;
	public studentinfo()
	{
		
	}

	public studentinfo(int roll_no,String student_name,int sgp)
	{
		this.roll_no=roll_no;
		this.student_name=student_name;
		this.sgpa=sgp;
	}
	public void dispinfo(int roll_no,String student_name,int sgpa)
	{
		System.out.print("Roll no of student is:"+roll_no);
		System.out.println();
		System.out.print("name of student is:"+student_name);
		System.out.println();
		System.out.print("sgpa is:"+sgpa);
		
	}

	public static void main(String[] args) {
		studentinfo s1=new studentinfo();
		s1.dispinfo(22,"sayali",99);
		// TODO Auto-generated method stub

	}

}
