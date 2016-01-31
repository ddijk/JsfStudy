/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.select;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import org.junit.Assert;
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

	@Test
	public void testNumberFormat() throws ParseException {
		NumberFormat nf = NumberFormat.getInstance(Locale.US);
		//	DecimalFormat df = NumberFormat.getInstance(Locale.FRANCE);

		Assert.assertTrue(nf instanceof DecimalFormat);

		Number expected = 0.5;
		Assert.assertEquals(expected, nf.parse("0.5"));
	}

	@Test
	public void testNumberFormatNL() throws ParseException {
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
		//	DecimalFormat df = NumberFormat.getInstance(Locale.FRANCE);

		Assert.assertTrue(nf instanceof DecimalFormat);

		Number expected = 0.7;
		Assert.assertEquals(expected, nf.parse("0,7"));
	}

}
