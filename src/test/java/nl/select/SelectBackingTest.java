/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.select;

import java.text.MessageFormat;
import java.util.Date;
import org.junit.Test;

/**
 *
 * @author dick
 */
public class SelectBackingTest {

	@Test
	public void testSetLetter() {
		int planet = 7;
		String event = "a disturbance in the Force";

		String result = MessageFormat.format(
			"At {1,time} on {1,date}, there was {2} on planet {0,number,integer}.",
			planet, new Date(), event);

		System.out.println("result=" + result);
	}

}
