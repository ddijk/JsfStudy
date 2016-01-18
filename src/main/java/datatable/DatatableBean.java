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
import org.apache.log4j.Logger;

/**
 *
 * @author Dick
 */
@Model
public class DatatableBean {

	UIData persons;
	private static final Logger LOGGER = Logger.getLogger(DatatableBean.class);

	List<Person> personen = new ArrayList<>();

	@PostConstruct
	void init() {
		personen.add(new Person("Jens", "Dijk"));
		personen.add(new Person("Lieve", "Dijk"));
		personen.add(new Person("Patricia", "Dijk"));
		personen.add(new Person("Dick", "Dijk"));

	}

	public UIData getPersons() {
		LOGGER.info("get UIData persons");
		return persons;
	}

	public void setPersons(UIData persons) {
		LOGGER.info("set UIData persons");
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
		final String rowMsg = "row klikt: " + p;
		LOGGER.info(rowMsg);
		FacesContext fc = FacesContext.getCurrentInstance();
		fc.getExternalContext().getRequestMap().put("msg", rowMsg);
		return null;
	}

}
