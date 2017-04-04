package exercise1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest1 {

	Calculator cal;
	
	@Before
	public void setup(){
		cal=new Calculator();
		
	}
	
	@Test

	public void shouldAddTwoNumbers(){
		
		Assert.assertEquals(0,cal.add(1,-1));
		Assert.assertEquals(-5,cal.add(-15,10));
		
		
		
}
	
	@Test
	
	public void shoulMinusTwoNumbers(){
		boolean t=false;
		
		if(cal.sub(10,-15)<0){
			 t=true;
					
		}
		
		Assert.assertTrue(t);
		if(cal.sub(3,3)==0){
		t=true;
	}
		Assert.assertTrue(t);
	}
	
	@Test
	
public void shoulMultiplyTwoNumbers(){
		
		Assert.assertEquals(0,cal.mul(3,0));
		Assert.assertEquals(6,cal.mul(-2,-3));
		Assert.assertEquals(-90, cal.mul(9, -10));
	}


     @Test(expected=ArithmeticException.class)
     
     public void shouldDivideTwoNumbers(){
    	 
    	cal.div(3, 0);
        	
     
     }


}



