/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conv;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.component.EditableValueHolder;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;

/**
 *
 * @author Dick
 */
@Model
public class ConvBean {

	@PostConstruct
	void init() {/*
		 FacesContext context = FacesContext.getCurrentInstance();
		 UIViewRoot root = context.getViewRoot();
		 System.out.println("***** Locale is " + root.getLocale());
		 
		 Application app = context.getApplication();
		 ValueExpression ve = app.getExpressionFactory().createValueExpression(context.getELContext(),"#{currentUser.status.qualified}", Boolean.class);
		 Boolean hasMetRequirments = (Boolean) ve.getValue(context.getELContext());
		 */
		/*
		 FacesContext context = FacesContext.getCurrentInstance();
		 UIViewRoot root = context.getViewRoot();
		 EditableValueHolder component = (EditableValueHolder) root.findComponent("form" + NamingContainer.SEPARATOR_CHAR+"userComponent");
		 */
		/*
		 FacesContext context = FacesContext.getCurrentInstance();
		 UIViewRoot root = context.getViewRoot();
		 Validator progressValidator = context.getApplication().createValidator("progressValidator");
		 EditableValueHolder component = (EditableValueHolder) root.findComponent("form" + NamingContainer.SEPARATOR_CHAR+"userComponent");
		 component.addValidator(progressValidator);
		 
		 */

		FacesContext context = FacesContext.getCurrentInstance();
		UIViewRoot root = context.getViewRoot();
		Class[] params = {FacesContext.class, UIComponent.class, Object.class};
		MethodBinding pointerToValidatorMethod = context.getApplication().createMethodBinding("#{user.validateAge}", params);
		EditableValueHolder component = (EditableValueHolder) root.findComponent("form" + NamingContainer.SEPARATOR_CHAR + "userComponent");
		component.setValidator(pointerToValidatorMethod);

	}

	public HtmlInputText getInp1() {
		if (inp1 == null) {
			System.out.println("inp1 is null");
		} else {
			System.out.println("inp1 is " + inp1.getValue());
		}
		return inp1;
	}

	public void setInp1(HtmlInputText inp1) {
		System.out.println("set inp1 called, " + inp1.getValue());
		this.inp1 = inp1;
	}

	String naam;
	int age;
	HtmlInputText inp1;

	/**
	 * Creates a new instance of ConvBean
	 */
	public ConvBean() {
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void show() {
		System.out.println("inp1 = " + inp1.getValue() + ", age is " + age);
		inp1.setReadonly(true);
	}

}
