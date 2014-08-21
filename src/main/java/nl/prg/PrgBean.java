/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.prg;

import javax.enterprise.inject.Model;

/**
 *
 * @author Dick
 */
@Model
public class PrgBean {
	
	String naam;

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	
}
