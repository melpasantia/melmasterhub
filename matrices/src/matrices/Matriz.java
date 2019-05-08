package matrices;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[][];
		x = new int [3][3];
		x[0][0] = 1;
		x[0][1] = 2;
		x[0][2] = 3;
		x[1][0] = 4;
		x[1][1] = 5;
		x[1][2] = 6;
		x[2][0] = 7;
		x[2][1] = 8;
		x[2][2] = 9;
		
		//System.out.println("x[0][2]: "+x[0][2]);
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("x["+i+"]["+j+"]= "+x[i][j]);
			}
		}
	}

}
