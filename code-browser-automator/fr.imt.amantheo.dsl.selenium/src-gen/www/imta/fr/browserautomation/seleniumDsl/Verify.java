/**
 * generated by Xtext 2.32.0
 */
package www.imta.fr.browserautomation.seleniumDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link www.imta.fr.browserautomation.seleniumDsl.Verify#getTextToVerify <em>Text To Verify</em>}</li>
 *   <li>{@link www.imta.fr.browserautomation.seleniumDsl.Verify#getLinkToVerify <em>Link To Verify</em>}</li>
 *   <li>{@link www.imta.fr.browserautomation.seleniumDsl.Verify#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage#getVerify()
 * @model
 * @generated
 */
public interface Verify extends Command
{
  /**
   * Returns the value of the '<em><b>Text To Verify</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text To Verify</em>' attribute.
   * @see #setTextToVerify(String)
   * @see www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage#getVerify_TextToVerify()
   * @model
   * @generated
   */
  String getTextToVerify();

  /**
   * Sets the value of the '{@link www.imta.fr.browserautomation.seleniumDsl.Verify#getTextToVerify <em>Text To Verify</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text To Verify</em>' attribute.
   * @see #getTextToVerify()
   * @generated
   */
  void setTextToVerify(String value);

  /**
   * Returns the value of the '<em><b>Link To Verify</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link To Verify</em>' attribute.
   * @see #setLinkToVerify(String)
   * @see www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage#getVerify_LinkToVerify()
   * @model
   * @generated
   */
  String getLinkToVerify();

  /**
   * Sets the value of the '{@link www.imta.fr.browserautomation.seleniumDsl.Verify#getLinkToVerify <em>Link To Verify</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link To Verify</em>' attribute.
   * @see #getLinkToVerify()
   * @generated
   */
  void setLinkToVerify(String value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' attribute.
   * @see #setVariable(String)
   * @see www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage#getVerify_Variable()
   * @model
   * @generated
   */
  String getVariable();

  /**
   * Sets the value of the '{@link www.imta.fr.browserautomation.seleniumDsl.Verify#getVariable <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' attribute.
   * @see #getVariable()
   * @generated
   */
  void setVariable(String value);

} // Verify
