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
	
	@Test
	public void TestBIGNUMBER(){
		assertEquals(createArray(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97),PrimeGenerator.primeGen(100));
	}
	
	public ArrayList<Integer> createArray(int...ints){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int x: ints){
			result.add(x);
		}
		return result;
	}

}
