package com.Incubyte.Assesment;

/**
 * Hello world!
 *
 */
public class App 
{

	public static int add(String string) {
		// TODO Auto-generated method stub
		
		
		if(string.length()==0)
		{
			return 0;
		}else
			{
			String delimiter = ",";
			if(string.matches("//(.*)\n(.*)")){
				delimiter = Character.toString(string.charAt(2));
				string = string.substring(4);
			}
			
			String numList[] = splitNumbers(string, delimiter + "|\n");
			return sum(numList);
		}
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers, String divider){
	    return numbers.split(divider);
	}

	private static int sum(String[] numbers){
 	    int total = 0;
 	    String negString = "";

        for(String number : numbers){
        	if(toInt(number) < 0){
        		if(negString.equals(""))
        			negString = number;
        		else
        			negString += ("," + number);
        	}
        	
		    	total += toInt(number);
		}

		if(!negString.equals("")){
			throw new IllegalArgumentException("Negatives not allowed: " + negString);
		}

		return total;
    }}
