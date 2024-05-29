package ex7_work;

public class PrintGraph {

	public void printG( int[] res ) {
		
		for(int i = 0; i < res.length; i++) {
			System.out.printf("%d 갯수 : ", i);
		
			for (int j=0; j < res[i]; j++) {
				System.out.print("#");
			}
			System.out.print(" " + res[i]);
			System.out.println();
		}

		
	}
	
}
