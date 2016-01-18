/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb;

import javax.enterprise.inject.Model;

@Model
public class MyRequestScopedBB {

	String club = "ajax";

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

}
