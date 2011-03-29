import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;



public class PrimeGenTest {
	
	@Test
	public void Test1(){
		assertEquals(new ArrayList<Integer>(),PrimeGenerator.primeGen(1));
	}
	
	@Test
	public void Test2(){
		assertEquals(new ArrayList<Integer>(),PrimeGenerator.primeGen(2));
	}
	
	@Test
	public void Test3(){
		assertEquals(createArray(2),PrimeGenerator.primeGen(3));
	}
	
	public ArrayList<Integer> createArray(int...ints){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int x: ints){
			result.add(x);
		}
		return result;
	}

}
