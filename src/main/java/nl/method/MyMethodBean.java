/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.method;

import javax.enterprise.inject.Model;

/**
 *
 * @author Dick
 */
@Model
public class MyMethodBean {
	
	public String myElMethod(String p1, String p2) {
		return "city:"+p1+", land="+ p2;
	}
}
