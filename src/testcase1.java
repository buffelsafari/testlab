
import org.junit.Test;

import static org.junit.Assert.*;



public class testcase1
{
	Splorf sut;
	@Test
	public void test() 
	{
		int expected=1;
		int actual;
		sut=new Splorf();
		actual=sut.ret(1);
		
		assertEquals(actual, expected);
		
	}	

}


