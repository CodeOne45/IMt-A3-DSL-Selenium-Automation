/**
 * generated by Xtext 2.32.0
 */
package www.imta.fr.browserautomation.seleniumDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Click</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link www.imta.fr.browserautomation.seleniumDsl.Click#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage#getClick()
 * @model
 * @generated
 */
public interface Click extends DOMCommand
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(Selector)
   * @see www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage#getClick_Element()
   * @model containment="true"
   * @generated
   */
  Selector getElement();

  /**
   * Sets the value of the '{@link www.imta.fr.browserautomation.seleniumDsl.Click#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(Selector value);

} // Click