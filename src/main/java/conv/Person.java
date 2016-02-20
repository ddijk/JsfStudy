/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conv;

/**
 *
 * @author dick
 */
public class Person {

	String naam;

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	@Override
	public String toString() {
		return "Person{" + "naam=" + naam + '}';
	}

}
