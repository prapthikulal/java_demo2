import java.util.Scanner;
class findArea
{
	public static void main(String args[])
		{
			double pi=3.14,area;
			Scanner S=new Scanner(System.in);
			System.out.println("Enter the redious of circle: ");
			int radius=S.nextInt();
			area=pi*radius*radius;
			System.out.println("Area of circle is: "+area);
		}
}