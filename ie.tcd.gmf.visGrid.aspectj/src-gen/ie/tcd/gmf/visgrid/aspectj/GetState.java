package ie.tcd.gmf.visgrid.aspectj;

import ie.tcd.gmf.visgrid.aspectj.GridlabdAPI;
import ie.tcd.gmf.visgrid.aspectj.http.Property;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import visGrid.House;

@Aspect
public class GetState {
  private EObject current = null;
  
  private EStructuralFeature efeature = null;
  
  public GridlabdAPI apiRoot;
  
  public boolean _operation_GET_Any_Any(final EObject element, final EStructuralFeature feature, final Object value) {
    try{
    	
    	boolean _xblockexpression = false;
    	{
    	  this.current = element;
    	  this.efeature = feature;
    	  boolean _xifexpression = false;
    	  if ((element instanceof House)) {
    	    boolean _xifexpression_1 = false;
    	    EClassifier _eType = feature.getEType();
    	    String _name = _eType.getName();
    	    boolean _equals = "EString".equals(_name);
    	    if (_equals) {
    	      boolean _xifexpression_2 = false;
    	      String _name_1 = this.efeature.getName();
    	      boolean _equals_1 = _name_1.equals("name");
    	      if (_equals_1) {
    	        _xifexpression_2 = false;
    	      } else {
    	        _xifexpression_2 = true;
    	      }
    	      _xifexpression_1 = _xifexpression_2;
    	    } else {
    	      _xifexpression_1 = false;
    	    }
    	    _xifexpression = _xifexpression_1;
    	  } else {
    	    _xifexpression = false;
    	  }
    	  _xblockexpression = (_xifexpression);
    	}
    	if(!_xblockexpression)
    		return false;
    	if(!precondition())
    		return false;
    	String result = invoke();
    	postcondition(result);
    	return true;
    }
    catch(Exception e){
    	e.printStackTrace();
    	return false;
    }
  }
  
  @Before("call(* *.eGet(org.eclipse.emf.ecore.EStructuralFeature,boolean)) && target(elem) &&  args(feature,*) && (!cflow(call(* ie.tcd.gmf.visgrid.aspectj.*._operation_*(*,*,*))))")
  public void _listen__operation_GET_Any_Any(final EObject elem, final EStructuralFeature feature) {
    apiRoot = GridlabdAPI.resolveInstance(elem.eResource());
    _operation_GET_Any_Any(elem, feature, null);
    
  }
  
  public boolean precondition() {
    return true;
  }
  
  public void postcondition(final String s) {
    this.current.eSet(this.efeature, s);
  }
  
  public String invoke() throws Exception {
    String _xblockexpression = null;
    {
      Property _property = new Property();
      final Property prop = _property;
      String _name = ((House) this.current).getName();
      String _name_1 = this.efeature.getName();
      String _valueOfProperty = prop.getValueOfProperty(_name, _name_1);
      _xblockexpression = (_valueOfProperty);
    }
    return _xblockexpression;
  }
}
