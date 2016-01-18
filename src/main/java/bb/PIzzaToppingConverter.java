/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import model.PizzaTopping;
import org.apache.log4j.Logger;

/**
 *
 * @author dick
 */
@FacesConverter(value = "pizzaConverter")
public class PIzzaToppingConverter implements Converter {

	private static final Logger LOGGER = Logger.getLogger(PIzzaToppingConverter.class);

	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String string) {

		int id = Integer.parseInt(string);
		final PizzaTopping pt = PizzaTopping.getToppings().get(id);
		LOGGER.info("getAsObject:" + string + ", " + pt);
		return pt;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic, Object o) {
		System.out.println(o);
		LOGGER.info("getAsString:" + o);
		//PizzaTopping pt = (PizzaTopping) o;
		//return pt.getDescr();
		return "" + o;

	}

}
