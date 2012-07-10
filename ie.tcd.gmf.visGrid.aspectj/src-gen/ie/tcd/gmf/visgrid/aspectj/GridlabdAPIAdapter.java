package ie.tcd.gmf.visgrid.aspectj;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class GridlabdAPIAdapter extends AdapterImpl {
  public void notifyChanged(final Notification notification) {
    StackTraceElement[] st = Thread.currentThread().getStackTrace();
    for(int i=0; i<st.length; i++){
    	if(st[i].getMethodName().startsWith("_operation_"))
    		return;
    }
    Object notifier = notification.getNotifier();
    EStructuralFeature feature = (EStructuralFeature)notification.getFeature();
    Object newvalue = notification.getNewValue();
  }
  
  public static GridlabdAPIAdapter INSTANCE = new GridlabdAPIAdapter();
}
