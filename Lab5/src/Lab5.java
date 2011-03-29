import java.util.ArrayList;


public class Lab5 {

	public static ArrayList<Integer> primeFactorization(int a){
		ArrayList<Integer> ret= new ArrayList<Integer>();
		while(a % 2 ==0){
			ret.add(2);
			a/=2;
		}
		if(a>1)
			ret.add(a);
		
		
		return ret;
	}
	
}
