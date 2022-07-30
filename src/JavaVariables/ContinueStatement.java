package JavaVariables;

public class ContinueStatement {
	
	public int ContinueStatement1(int ContinueNumber)
	{
		
		for(int i = 0 ; i <=100 ; i++)
		{
			//System.out.println("Loop Started :- " + i + "\n");
			if(i==ContinueNumber)
			{
				System.out.println("Loop is breaked at :" + ContinueNumber);
				continue;
				
			}
			
		}
		return ContinueNumber;
	}

}
