/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Generic.Maximum;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Assert;

public class MaximumJUnitTest {
    @Test
    public void testMaximum1() {
    	MaximumTest intMaxTest = new MaximumTest();
    	boolean found = false;
    	if(intMaxTest.maximum("Peach","Banana","Apple") == "Peach") {
    		found = true;
    	}
    	Assert.assertTrue(found);
    }
    @Test
    public void testMaximum2() {
    	MaximumTest intMaxTest = new MaximumTest();
    	boolean found = false;
    	if(intMaxTest.maximum(6,4,2) == 6) {
    		found = true;
    	}
    	Assert.assertTrue(found);
    }
    @Test
    public void testMaximum3() {
    	MaximumTest intMaxTest = new MaximumTest();
    	boolean found = false;
    	if(intMaxTest.maximum(2.0,6.0,4.0) == 6.0) {
    		found = true;
    	}
    	Assert.assertTrue(found);
    }
}
