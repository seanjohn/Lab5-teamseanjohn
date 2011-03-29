
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


/**
 * TODO Put here a description of what this class does.
 *
 * @author krasicji.
 *         Created Mar 24, 2011.
 */
public class Lab5Tests {

	@Test
	public void Test1(){
		assertEquals(new ArrayList<Integer>(),Lab5.primeFactorization(1));
	}
	
	@Test
	public void Test2(){
		assertEquals(createArray(2),Lab5.primeFactorization(2));
	}
	
	@Test
	public void Test3(){
		assertEquals(createArray(3),Lab5.primeFactorization(3));
	}
	
	@Test
	public void Test4(){
		assertEquals(createArray(2,2),Lab5.primeFactorization(4));
	}
	
	public ArrayList<Integer> createArray(int...ints){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int x: ints){
			result.add(x);
		}
		return result;
	}

}
