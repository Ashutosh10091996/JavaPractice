package JavaVariables;

public class BreakStatement {
	
	public int breakStatement(int breakNumber)
	{
		for(int i= 0 ; i<=100 ; i++)
		{
			if(i == breakNumber)
			{
				System.out.println("Loop is breaked at " + breakNumber);
				break; // This will break the flow once condition satisfied 
				
			}
		}
		
		return  breakNumber;
	}
	
	

}
