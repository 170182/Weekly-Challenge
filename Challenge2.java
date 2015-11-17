
public class Challenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		for(int row = 1; row <= n; row +=2)
		{
			for (int space = 6; space = row-space ; space--)
			{
				System.out.print(" ");
			}
			for(int count = 1; count <= row; count++)
			
				System.out.print("*");
				System.out.println();
			//stuck
			
		}

	}

}
