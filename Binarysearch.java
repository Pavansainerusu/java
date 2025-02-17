class Array
{
public static void main(String[]args)
{
	int a[]=new int[]{50,30,20,12,34,-7,45,50};
	int temp=0;
	for(int fix=0;fix<a.length;fix++)
	{
		for(int c=fix+1;c<a.length;c++)
		{
		if(a[fix]>a[c])
		{
			temp=a[fix];
			a[fix]=a[c];
			a[c]=temp;
		}
		}
	}
	System.out.println("after sorting");
	for(int x=0;x<=a.length-1;x++)
	{
		System.out.println(a[x]);
	}
		System.out.println("largest number is"+a[a.length-1]);
	for(int x=a.length-2;x>=0;x--)
	{
		if(a[x]!=a[a.length-1])
		{
			System.out.println("Second largest is"+a[x]);
			break;
		}
	}

}
}