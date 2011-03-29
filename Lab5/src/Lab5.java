import java.util.ArrayList;


public class Lab5 {

	public static ArrayList<Integer> primeFactorization(int a){
		ArrayList<Integer> ret= new ArrayList<Integer>();
		for(int candidate = 2; a>1; candidate++){
		while(a % candidate ==0){
			ret.add(candidate);
			a/=candidate;
		}}
		if(a>1)
			ret.add(a);
		
		
		return ret;
	}
	
}
