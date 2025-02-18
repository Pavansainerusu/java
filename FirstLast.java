class Main
{
	public static void main(String[]args)
	{
	int a[]=new int[]{0,1,2,3,6,7,9,1,2,2,3,3,6,6,6,0,0,0,0,0,6,6};
	Main main=new Main();
	main.unique(a);
	}
	void unique(int a[])
	{
	   int b[]=new int[a.length];
	   int max=Integer.MIN_VALUE;
	   String element="";
	   int duplicates=0,first=0,last=0;
	   for(int x=0;x<=a.length-1;x++)
	   {
		int count=1;
		if(b[x]==1){
		   continue;}
		for(int y=x+1;y<=a.length-1;y++)
		{
			if(a[x]==a[y])
			{
			   count++;
			   b[y]=1;
			}
		}
		if(count>1)
		{
			duplicates++;
			if(duplicates==1)
			{
				first=a[x];
			}
			System.out.println(a[x]+"=>"+count);
			last=a[x];
		}
	}
	System.out.println("first is"+first+"last is"+last);
}
}