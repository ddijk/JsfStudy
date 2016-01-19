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
@FacesConverter(value = "naamConverter")
public class NaamConverter implements Converter {

	private static final Logger LOGGER = Logger.getLogger(NaamConverter.class);

	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
		LOGGER.info("getAsObject:" + string);
		return PizzaTopping.getToppings().get(Integer.parseInt(string));
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic, Object o) {
		LOGGER.info("getAsString:" + o.getClass());
		PizzaTopping pt = (PizzaTopping) o;
		return "" + pt.getId();
	}

}
