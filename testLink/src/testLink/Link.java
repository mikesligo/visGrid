/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package testLink;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link testLink.Link#getEReference0 <em>EReference0</em>}</li>
 * </ul>
 * </p>
 *
 * @see testLink.TestLinkPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference list.
	 * The list contents are of type {@link testLink.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference list.
	 * @see testLink.TestLinkPackage#getLink_EReference0()
	 * @model
	 * @generated
	 */
	EList<Link> getEReference0();

} // Link
