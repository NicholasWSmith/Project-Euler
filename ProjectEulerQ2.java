
public class ProjectEulerQ2 {

	
	public static int[] array = new int[33];
	public static void main(String[] args) {
		evenFib(32, array, 2);
	}
	
	
	public static void evenFib(int n, int[] array1, int i){
		array[0] = 1;
		array[1] = 2;
		int total = 0;		
		for (int k = i; i < n; i++){
			array[i] = array[i-1] + array[i-2];
			System.out.println(array[i]);
		}	
		for (int l = 0; l < array.length; l++){
			if (array[l]%2 == 0){
				total += array[l];
			}
		}	
		System.out.println("All even numbers are : " + total);		
	}
}
