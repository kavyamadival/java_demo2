import java.util.Scanner;
class findarea
{
	public static void main(String args[])
	{
		double pi=3.14,area;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the area of circle");
		int radius=s.nextInt();
		area=pi*radius*radius;
		System.out.println("area of circle is"+area);
	}
}