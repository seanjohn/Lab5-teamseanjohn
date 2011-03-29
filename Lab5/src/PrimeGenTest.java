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

}
