
public class Checkerboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for (int i = 0; i<8; i++)
    {
    	for (int j = 0; j < 8; j++)
    	{
    		if ((j + i)% 2 == 0)
    		{
    			System.out.print("0 ");
    		}
    		else
    		{
    			System.out.print("1 ");
    		}
    	}
    	System.out.println();
    }
	}

}
