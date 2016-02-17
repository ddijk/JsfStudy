/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.ajax;

import java.util.Arrays;
import java.util.List;
import javax.enterprise.inject.Model;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;
import javax.inject.Named;
import org.apache.log4j.Logger;

/**
 *
 * @author Dick
 */
@Named(value = "calcManagedBean")
@Model
public class CalcManagedBean {

	private static final Logger LOGGER = Logger.getLogger(CalcManagedBean.class);

	int getal1;
	int getal2;

	int result;

	ValueChangeListener vcl;

	List<String> colors = Arrays.asList("blue", "red", "yellow");
	String selectedColor;

	/**
	 * Creates a new instance of CalcManagedBean
	 */
	public CalcManagedBean() {

		vcl = new ValueChangeListener() {

			@Override
			public void processValueChange(ValueChangeEvent vce) throws AbortProcessingException {
				System.out.println("processValueChange " + vce.getNewValue());
			}
		};

	}

	public int getGetal1() {
		return getal1;
	}

	public void setGetal1(int getal1) {
		this.getal1 = getal1;
	}

	public int getGetal2() {
		return getal2;
	}

	public void setGetal2(int getal2) {
		this.getal2 = getal2;
	}

	public int getResult() {
		LOGGER.info("getal1 =" + getal1 + ", getal2=" + getal2);
		return result;
	}

	public void setResult(int result) {
		LOGGER.info("getal1 =" + getal1 + ", getal2=" + getal2);
		this.result = result;
	}

	public void calculate() {
		LOGGER.info("getal1 =" + getal1 + ", getal2=" + getal2);
		result = getal1 + getal2;
	}

	public void method1() {
		LOGGER.info("method1 called, color =" + selectedColor);
	}

	public void method2() {
		LOGGER.info("method2 called");
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public String getSelectedColor() {
		return selectedColor;
	}

	public void setSelectedColor(String selectedColor) {
		LOGGER.info("color set to " + selectedColor);
		this.selectedColor = selectedColor;
	}

	public ValueChangeListener getVcl() {
		return vcl;
	}

	public void setVcl(ValueChangeListener vcl) {
		this.vcl = vcl;
	}

}
