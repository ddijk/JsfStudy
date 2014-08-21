/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datatable;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.component.UIData;
import javax.faces.context.FacesContext;

/**
 *
 * @author Dick
 */
@Model
public class DatatableBean {
	
	UIData persons;
	
	List<Person> personen = new ArrayList<>();
	
	@PostConstruct
	void init() {
		personen.add(new Person("Jens", "Dijk"));
		personen.add(new Person("Lieve", "Dijk"));
	}

	public UIData getPersons() {
		return persons;
	}

	public void setPersons(UIData persons) {
		this.persons = persons;
	}

	public List<Person> getPersonen() {
		return personen;
	}

	public void setPersonen(List<Person> personen) {
		this.personen = personen;
	}
	
	
	public String rowAction() {
		
		 Person p = (Person) persons.getRowData();
		final String rowMsg = "row klikt: "+p;
		System.out.println(rowMsg);
		FacesContext fc = FacesContext.getCurrentInstance();
		fc.getExternalContext().getRequestMap().put("msg", rowMsg);
		return null;
	}
	
	
}
