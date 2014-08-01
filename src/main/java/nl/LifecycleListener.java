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

public class LifecycleListener implements PhaseListener {

    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

    public void beforePhase(PhaseEvent event) {
        System.out.println("START PHASE " + event.getPhaseId());
        if (event.getPhaseId() == PhaseId.RESTORE_VIEW) {
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "mijn bericht from listerer", "mijn detail from listere");
            FacesContext.getCurrentInstance().addMessage(null, fm);
        }
    }

    public void afterPhase(PhaseEvent event) {
        System.out.println("END PHASE " + event.getPhaseId());

    }

}
