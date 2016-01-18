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
import org.apache.log4j.Logger;

@Model
public class PizzaBean {

	String[] toppings;
	private static Logger LOGGER = Logger.getLogger(PizzaBean.class);
	List<String> toppingsList = new ArrayList<>();

	@PostConstruct
	void setup() {

		toppingsList.add("cheese");
		toppingsList.add("pepperonie");
		toppingsList.add("mjushroom");
		toppingsList.add("ham");
	}

	public String[] getToppings() {
		return toppings;
	}

	public void setToppings(String[] toppings) {
		LOGGER.info("setToppings " + Arrays.asList(toppings));
		this.toppings = toppings;
	}

	public List<String> getToppingsList() {
		return toppingsList;
	}

	public void setToppingsList(List<String> toppingsList) {
		this.toppingsList = toppingsList;
	}

}
