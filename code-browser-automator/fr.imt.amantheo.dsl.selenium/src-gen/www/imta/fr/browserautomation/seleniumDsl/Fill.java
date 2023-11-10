/**
 * generated by Xtext 2.32.0
 */
package www.imta.fr.browserautomation.seleniumDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link www.imta.fr.browserautomation.seleniumDsl.Fill#getElement <em>Element</em>}</li>
 *   <li>{@link www.imta.fr.browserautomation.seleniumDsl.Fill#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link www.imta.fr.browserautomation.seleniumDsl.Fill#getTextToFill <em>Text To Fill</em>}</li>
 *   <li>{@link www.imta.fr.browserautomation.seleniumDsl.Fill#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage#getFill()
 * @model
 * @generated
 */
public interface Fill extends Command
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(Selector)
   * @see www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage#getFill_Element()
   * @model containment="true"
   * @generated
   */
  Selector getElement();

  /**
   * Sets the value of the '{@link www.imta.fr.browserautomation.seleniumDsl.Fill#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(Selector value);

  /**
   * Returns the value of the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Name</em>' attribute.
   * @see #setFieldName(String)
   * @see www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage#getFill_FieldName()
   * @model
   * @generated
   */
  String getFieldName();

  /**
   * Sets the value of the '{@link www.imta.fr.browserautomation.seleniumDsl.Fill#getFieldName <em>Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Name</em>' attribute.
   * @see #getFieldName()
   * @generated
   */
  void setFieldName(String value);

  /**
   * Returns the value of the '<em><b>Text To Fill</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text To Fill</em>' attribute.
   * @see #setTextToFill(String)
   * @see www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage#getFill_TextToFill()
   * @model
   * @generated
   */
  String getTextToFill();

  /**
   * Sets the value of the '{@link www.imta.fr.browserautomation.seleniumDsl.Fill#getTextToFill <em>Text To Fill</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text To Fill</em>' attribute.
   * @see #getTextToFill()
   * @generated
   */
  void setTextToFill(String value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' attribute.
   * @see #setVariable(String)
   * @see www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage#getFill_Variable()
   * @model
   * @generated
   */
  String getVariable();

  /**
   * Sets the value of the '{@link www.imta.fr.browserautomation.seleniumDsl.Fill#getVariable <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' attribute.
   * @see #getVariable()
   * @generated
   */
  void setVariable(String value);

} // Fill
