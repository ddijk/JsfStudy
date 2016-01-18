/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import model.PizzaTopping;
import org.apache.log4j.Logger;

@Model

public class PizzaModelBean {

	List<PizzaTopping> toppings = new ArrayList<>();

	PizzaTopping[] selectedToppings;
	private static final Logger LOGGER = Logger.getLogger(PizzaModelBean.class);

	@PostConstruct
	void setup() {
		toppings.addAll(PizzaTopping.getToppings().values());
	}

	public List<PizzaTopping> getToppings() {
		return toppings;
	}

	public void setToppings(List<PizzaTopping> toppings) {
		this.toppings = toppings;
	}

	public PizzaTopping[] getSelectedToppings() {
		return selectedToppings;
	}

	public void setSelectedToppings(PizzaTopping[] selectedToppings) {
		LOGGER.info("setTsetSelectedToppingsoppings " + Arrays.asList(selectedToppings));
		this.selectedToppings = selectedToppings;
	}

}