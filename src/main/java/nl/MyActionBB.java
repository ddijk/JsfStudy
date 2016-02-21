/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl;

import javax.enterprise.inject.Model;
import javax.faces.event.ActionEvent;
import org.apache.log4j.Logger;

/**
 *
 * @author dick
 */
@Model
public class MyActionBB {

	String action;
	String comment;
	private static final Logger LOGGER = Logger.getLogger(MyBB.class);

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		LOGGER.info("action =   " + action);
		this.action = action;
	}

	public void processAction(ActionEvent ae) {

		if (comment.equals("hai")) {
			action = "/default";
		} else {
			action = "/default2";
		}
		LOGGER.info("processAction =   " + action);

	}

	public String action() {
		return action;
	}
}
