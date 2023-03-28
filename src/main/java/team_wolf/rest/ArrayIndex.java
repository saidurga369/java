package team_wolf.rest;

public class ArrayIndex 
{
	public String arrayIndTruValue(int ind)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		if(ind<arr.length)
		{
			return "the element present in the index "+ind+" is: "+arr[ind];
		}
		else
		{
			return "invalid index";
		}
	}
}
