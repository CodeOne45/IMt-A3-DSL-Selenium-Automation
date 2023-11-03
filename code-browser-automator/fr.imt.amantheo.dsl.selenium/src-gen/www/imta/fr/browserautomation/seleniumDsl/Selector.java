/**
 * generated by Xtext 2.32.0
 */
package www.imta.fr.browserautomation.seleniumDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link www.imta.fr.browserautomation.seleniumDsl.Selector#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link www.imta.fr.browserautomation.seleniumDsl.Selector#getDomType <em>Dom Type</em>}</li>
 *   <li>{@link www.imta.fr.browserautomation.seleniumDsl.Selector#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link www.imta.fr.browserautomation.seleniumDsl.Selector#getLabel <em>Label</em>}</li>
 *   <li>{@link www.imta.fr.browserautomation.seleniumDsl.Selector#getProperties <em>Properties</em>}</li>
 *   <li>{@link www.imta.fr.browserautomation.seleniumDsl.Selector#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage#getSelector()
 * @model
 * @generated
 */
public interface Selector extends EObject
{
  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference.
   * @see #setPredicate(SelectorPredicate)
   * @see www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage#getSelector_Predicate()
   * @model containment="true"
   * @generated
   */
  SelectorPredicate getPredicate();

  /**
   * Sets the value of the '{@link www.imta.fr.browserautomation.seleniumDsl.Selector#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(SelectorPredicate value);

  /**
   * Returns the value of the '<em><b>Dom Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dom Type</em>' attribute.
   * @see #setDomType(String)
   * @see www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage#getSelector_DomType()
   * @model
   * @generated
   */
  String getDomType();

  /**
   * Sets the value of the '{@link www.imta.fr.browserautomation.seleniumDsl.Selector#getDomType <em>Dom Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dom Type</em>' attribute.
   * @see #getDomType()
   * @generated
   */
  void setDomType(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference.
   * @see #setAttributes(Attributes)
   * @see www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage#getSelector_Attributes()
   * @model containment="true"
   * @generated
   */
  Attributes getAttributes();

  /**
   * Sets the value of the '{@link www.imta.fr.browserautomation.seleniumDsl.Selector#getAttributes <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributes</em>' containment reference.
   * @see #getAttributes()
   * @generated
   */
  void setAttributes(Attributes value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage#getSelector_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link www.imta.fr.browserautomation.seleniumDsl.Selector#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference.
   * @see #setProperties(Properties)
   * @see www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage#getSelector_Properties()
   * @model containment="true"
   * @generated
   */
  Properties getProperties();

  /**
   * Sets the value of the '{@link www.imta.fr.browserautomation.seleniumDsl.Selector#getProperties <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties</em>' containment reference.
   * @see #getProperties()
   * @generated
   */
  void setProperties(Properties value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' containment reference.
   * @see #setParent(Selector)
   * @see www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage#getSelector_Parent()
   * @model containment="true"
   * @generated
   */
  Selector getParent();

  /**
   * Sets the value of the '{@link www.imta.fr.browserautomation.seleniumDsl.Selector#getParent <em>Parent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' containment reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Selector value);

} // Selector