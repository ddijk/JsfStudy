/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import org.apache.log4j.Logger;

public class LifecycleListener implements PhaseListener {

	private static final Logger LOGGER = Logger.getLogger(LifecycleListener.class);

	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

	public void beforePhase(PhaseEvent event) {

		if (event.getPhaseId() == PhaseId.RESTORE_VIEW) {
			FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "mijn bericht from LifecycleListener", "mijn detail from LifecycleListener");
			FacesContext.getCurrentInstance().addMessage(null, fm);
		}
	}

	private static String getLocale() {
		try {
			return FacesContext.getCurrentInstance().getViewRoot().getLocale().toString();
		} catch (NullPointerException npe) {
			return "getLocalel failed";
		}

	}

	public void afterPhase(PhaseEvent event) {

		LOGGER.info("START PHASE " + event.getPhaseId() + ", locale=" + getLocale());
		LOGGER.info("END PHASE " + event.getPhaseId());

	}

}
