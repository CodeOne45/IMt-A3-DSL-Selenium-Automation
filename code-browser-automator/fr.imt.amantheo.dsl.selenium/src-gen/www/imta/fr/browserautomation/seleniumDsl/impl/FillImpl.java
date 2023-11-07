/**
 * generated by Xtext 2.32.0
 */
package www.imta.fr.browserautomation.seleniumDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import www.imta.fr.browserautomation.seleniumDsl.Fill;
import www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link www.imta.fr.browserautomation.seleniumDsl.impl.FillImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link www.imta.fr.browserautomation.seleniumDsl.impl.FillImpl#getTextToFill <em>Text To Fill</em>}</li>
 *   <li>{@link www.imta.fr.browserautomation.seleniumDsl.impl.FillImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FillImpl extends CommandImpl implements Fill
{
  /**
   * The default value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldName()
   * @generated
   * @ordered
   */
  protected static final String FIELD_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldName()
   * @generated
   * @ordered
   */
  protected String fieldName = FIELD_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTextToFill() <em>Text To Fill</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextToFill()
   * @generated
   * @ordered
   */
  protected static final String TEXT_TO_FILL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTextToFill() <em>Text To Fill</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextToFill()
   * @generated
   * @ordered
   */
  protected String textToFill = TEXT_TO_FILL_EDEFAULT;

  /**
   * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected String variable = VARIABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FillImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SeleniumDslPackage.Literals.FILL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFieldName()
  {
    return fieldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFieldName(String newFieldName)
  {
    String oldFieldName = fieldName;
    fieldName = newFieldName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumDslPackage.FILL__FIELD_NAME, oldFieldName, fieldName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTextToFill()
  {
    return textToFill;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTextToFill(String newTextToFill)
  {
    String oldTextToFill = textToFill;
    textToFill = newTextToFill;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumDslPackage.FILL__TEXT_TO_FILL, oldTextToFill, textToFill));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVariable(String newVariable)
  {
    String oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumDslPackage.FILL__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SeleniumDslPackage.FILL__FIELD_NAME:
        return getFieldName();
      case SeleniumDslPackage.FILL__TEXT_TO_FILL:
        return getTextToFill();
      case SeleniumDslPackage.FILL__VARIABLE:
        return getVariable();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SeleniumDslPackage.FILL__FIELD_NAME:
        setFieldName((String)newValue);
        return;
      case SeleniumDslPackage.FILL__TEXT_TO_FILL:
        setTextToFill((String)newValue);
        return;
      case SeleniumDslPackage.FILL__VARIABLE:
        setVariable((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SeleniumDslPackage.FILL__FIELD_NAME:
        setFieldName(FIELD_NAME_EDEFAULT);
        return;
      case SeleniumDslPackage.FILL__TEXT_TO_FILL:
        setTextToFill(TEXT_TO_FILL_EDEFAULT);
        return;
      case SeleniumDslPackage.FILL__VARIABLE:
        setVariable(VARIABLE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SeleniumDslPackage.FILL__FIELD_NAME:
        return FIELD_NAME_EDEFAULT == null ? fieldName != null : !FIELD_NAME_EDEFAULT.equals(fieldName);
      case SeleniumDslPackage.FILL__TEXT_TO_FILL:
        return TEXT_TO_FILL_EDEFAULT == null ? textToFill != null : !TEXT_TO_FILL_EDEFAULT.equals(textToFill);
      case SeleniumDslPackage.FILL__VARIABLE:
        return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (fieldName: ");
    result.append(fieldName);
    result.append(", textToFill: ");
    result.append(textToFill);
    result.append(", variable: ");
    result.append(variable);
    result.append(')');
    return result.toString();
  }

} //FillImpl