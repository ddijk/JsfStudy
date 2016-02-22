/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb;

import java.util.Locale;
import javax.enterprise.inject.Model;
import javax.validation.constraints.Size;
import org.apache.log4j.Logger;

/**
 *
 * @author dick
 */
@Model
public class BeanValBB {

	@Size(min = 3, max = 5)
	String naam;
	private static final Logger LOGGER = Logger.getLogger(BeanValBB.class);

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		LOGGER.info("setNaam " + naam);
		this.naam = naam;
	}

	public static void main(String[] args) {
		System.out.println("locale= " + Locale.getDefault());
	}
}
