class Array
{
	public static void main(String[]args)
	{
		int b[][]=new int[][]{{1,2,3,4,5},{2,3,4,5},{3,4,5}};
		int sum1=0;
		for(int r=0;r<=b.length-1;r++)
		{
			int sum=0;
			for(int c=0;c<=b[r].length-1;c++)
			{
				sum=sum+b[r][c];
			}
			System.out.println(r+" sum is "+sum);
			sum1=sum1+sum;
		}
			System.out.println("Sum of total Array"+sum1);
	}
}