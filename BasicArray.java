import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		int sum=0,pro=1;
		int arr[]=new int[5];
		System.out.println(arr.length);
		Scanner s=new Scanner(System.in);
		System.out.println("enter array elements");
		for(int y=0;y<=arr.length-1;y++)
		{
			arr[y]=s.nextInt();
		}
		for(int x=0;x<=arr.length-1;x++)
		{
			sum+=arr[x];
			pro*=arr[x];
			System.out.println("arr["+x+"]="+arr[x]);
		}
			System.out.println("sum is "+sum);
			System.out.println("pro is "+pro);

	}
}