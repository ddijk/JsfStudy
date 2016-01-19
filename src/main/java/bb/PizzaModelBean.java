/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import model.PizzaTopping;
import org.apache.log4j.Logger;

@Model

public class PizzaModelBean {

	PizzaTopping[] toppings = new PizzaTopping[4];

	PizzaTopping[] selectedToppings;
	private static final Logger LOGGER = Logger.getLogger(PizzaModelBean.class);

	PizzaTopping naam;

	@PostConstruct
	void setup() {
		PizzaTopping.getToppings().values().toArray(toppings);

	}

	public PizzaTopping[] getToppings() {
		return toppings;
	}

	public void setToppings(PizzaTopping[] toppings) {
		this.toppings = toppings;
	}

	public PizzaTopping[] getSelectedToppings() {
		if (selectedToppings != null) {
			LOGGER.info("getSelectedToppings " + Arrays.asList(selectedToppings));
		}
		return selectedToppings;
	}

	public void setSelectedToppings(PizzaTopping[] selectedToppings) {
		LOGGER.info("setTsetSelectedToppingsoppings " + Arrays.asList(selectedToppings));
		this.selectedToppings = selectedToppings;
	}

	public PizzaTopping getNaam() {
		LOGGER.info("getNaam: " + naam);
		return naam;
	}

	public void setNaam(PizzaTopping naam) {
		LOGGER.info("setNaam: " + naam);
		this.naam = naam;
	}

}
