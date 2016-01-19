/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dick
 */
public class PizzaTopping {

	int id;
	String descr;

	public PizzaTopping(int id, String descr) {
		this.id = id;
		this.descr = descr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public static Map<Integer, PizzaTopping> getToppings() {
		Map<Integer, PizzaTopping> toppings = new HashMap<>();
		toppings.put(1, new PizzaTopping(1, "cheese"));
		toppings.put(2, new PizzaTopping(2, "ham"));
		toppings.put(3, new PizzaTopping(3, "pepper"));
		toppings.put(4, new PizzaTopping(4, "saus"));

		return toppings;
	}

	@Override
	public String toString() {
		return descr + "(" + id + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof PizzaTopping) {

			PizzaTopping pt = (PizzaTopping) obj;
			return pt.getId() == this.getId();

		}
		return false;
	}

	@Override
	public int hashCode() {
		return 0;
	}

}
