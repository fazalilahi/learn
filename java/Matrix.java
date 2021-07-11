import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Matrix {
	
	public int[][] matrix;
	
	public Matrix(int[][] matrix) {
		this.matrix = matrix;
	}
	
	public static void printMatrix(Matrix matrix) {
		for(int i = 0; i < matrix.matrix.length; i++) {
			for (int j =0; j < matrix.matrix[i].length; j++) {
				System.out.print(matrix.matrix[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
	
	public int getTrace() {
		int trace = 0;
		for( int i = 0; i < matrix.length; i++)
			trace += matrix[i][i];
		return trace;
	}
	
	public Matrix getTranspose() {
		int transpose[][] = new int[matrix.length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		return new Matrix(transpose);
	}
	
	public static void main(String[] args) throws Exception {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		System.out.println("Enter the no. of row/columns: ");
		int n = Integer.parseInt(br.readLine());
		int [][] elements = new int[n][n];
		System.out.println("Enter Matrix elemnents: ");
		for (int i = 0; i < n; i++) {
			for(int j = 0 ; j < n; j++) {
				System.out.print("\n (" + (i + 1) + ", " + (j + 1) + "): ");
				elements[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		Matrix mx = new Matrix(elements);
		System.out.println("\nMatrix: ");
		printMatrix(mx);
		System.out.println("\nTranspose of the Matrix: ");
		printMatrix(mx.getTranspose());
		System.out.println("\nTrace of the Matrix: " + mx.getTrace());
	}
}