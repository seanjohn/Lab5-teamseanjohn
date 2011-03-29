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
	
	@Test
	public void Test4(){
		assertEquals(createArray(2,3),PrimeGenerator.primeGen(4));
	}
	
	@Test
	public void Test6(){
		assertEquals(createArray(2,3,5),PrimeGenerator.primeGen(6));
	}
	
	public ArrayList<Integer> createArray(int...ints){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int x: ints){
			result.add(x);
		}
		return result;
	}

}
