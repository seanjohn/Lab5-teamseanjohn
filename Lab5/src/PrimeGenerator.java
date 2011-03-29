import java.util.ArrayList;


public class PrimeGenerator {

	public static ArrayList<Integer> primeGen(int i) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ret= new ArrayList<Integer>();
		int x =2;
		while(i>x){
			ret.add(x);
			x++;
		}
	
		return ret;
	}

	
	
}
