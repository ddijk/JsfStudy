/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package event;

import javax.enterprise.inject.Model;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlInputTextarea;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author Dick
 */
@Model
public class PartialBean {
	
	HtmlInputText zipcode, state, name;
	boolean showInfo;
	HtmlSelectBooleanCheckbox infoCheckbox;
	HtmlInputTextarea info;
	

	public HtmlInputText getZipcode() {
		return zipcode;
	}

	public void setZipcode(HtmlInputText zipcode) {
		System.out.println("zet zip");
		this.zipcode = zipcode;
	}

	public HtmlInputText getState() {
		return state;
	}

	public void setState(HtmlInputText state) {
		this.state = state;
	}

	public HtmlInputText getName() {
		return name;
	}

	public void setName(HtmlInputText name) {
		System.out.println("zet naam");
		this.name = name;
	}
	
	public void zipCodeChanged(ValueChangeEvent vce) {
		
		String zip = (String) vce.getNewValue();
		System.out.println("zipcde is now "+ zip);
		
		if ( zip.equals("2411")) {
			state.setValue("Texas");
		} else {
			state.setValue("Arizona");
		}
		
		//FacesContext.getCurrentInstance().renderResponse();
		
	}
	
	public void infoHandler(ValueChangeEvent vce) {
		showInfo = (Boolean)vce.getNewValue();
		
		System.out.println("showInfo is now: "+ showInfo);

	}
	
	public boolean isShowInfo() {
		return showInfo;
	}

	public void setShowInfo(boolean showInfo) {
		this.showInfo = showInfo;
	}

	public HtmlSelectBooleanCheckbox getInfoCheckbox() {
		return infoCheckbox;
	}

	public void setInfoCheckbox(HtmlSelectBooleanCheckbox infoCheckbox) {
		this.infoCheckbox = infoCheckbox;
	}

	public HtmlInputTextarea getInfo() {
		return info;
	}

	public void setInfo(HtmlInputTextarea info) {
		this.info = info;
	}
	
	
	
}
