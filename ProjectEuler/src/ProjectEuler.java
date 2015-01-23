
public class ProjectEuler {

	/**
	 * @param args
	 */
	public static int evenFibTotal = 0;
	public static int fibTotal = 0;
	public static int[] array = new int[33];
	public static void main(String[] args) {
		array[0] = 1;
		array[1] = 2;
		System.out.print(evenFib(31, array, 2));
	}
	
	public static void multiplesOfThreesAndFives(){
		
		int total = 0;
		for (int i = 0; i < 1000; i++){
			if (i%3 == 0){
				total += i;
			} else if(i%5 == 0){
				total += i;
			}
		}
		
		
	}
	
	public static int evenFib(int n, int[] array1, int i){
		
		array1[i] = array[i-1] + array1[-2];
		evenFib(n+1, array1, i);
		
		return 0;
		
		
		
		
		
	}

}
