
public class ProjectEulerQ1 {

	public static void main(String[] args) {
		multiplesOfThreesAndFives();
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
}
