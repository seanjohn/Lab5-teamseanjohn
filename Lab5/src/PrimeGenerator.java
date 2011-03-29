import java.util.ArrayList;


public class PrimeGenerator {

	public static ArrayList<Integer> primeGen(int i) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ret= new ArrayList<Integer>();
		int x =2;
		for(;x<i;x++){
			if(Lab5.primeFactorization(x).size()==1)
				ret.add(x);
		}
		return ret;
	}
	
	
}
