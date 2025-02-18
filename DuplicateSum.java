class Main
{
	public static void main(String[]args)
	{
	int a[]=new int[]{0,1,2,3,6,7,9,1,2};
	Main main=new Main();
	main.unique(a);
	}
	void unique(int a[])
	{
	   int sum=0;
	   int b[]=new int[a.length];
	   for(int x=0;x<=a.length-1;x++)
	   {
		int count=1;

			if(b[x]==1){
		   	continue;}
		for(int y=x+1;y<=a.length-1;y++)
		{
			if(a[x]==a[y])
			{
			   sum+=a[x];
			   count++;
			   b[y]=1;
			}
		}
		if(count>1)
		{
		System.out.println(a[x]+"=>"+count);
		}

		}
	System.out.println(sum);

	}
}