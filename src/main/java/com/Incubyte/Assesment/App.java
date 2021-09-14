package com.Incubyte.Assesment;

/**
 * Hello world!
 *
 */
public class App 
{

	public static int add(String string) {
		// TODO Auto-generated method stub
		int sum=0;
		
		if(string.length()==0)
		{
			return 0;
		}else
		{
			for(int i=0;i<string.length();i++)
			{
				if(Character.isDigit(string.charAt(i)))
						{
					if(Integer.parseInt(String.valueOf(string.charAt(i)))>0)
					{
						
						sum=sum+Integer.parseInt(String.valueOf(string.charAt(i)));
					}
						}
			}
		}
		return sum;
	}
    
}
