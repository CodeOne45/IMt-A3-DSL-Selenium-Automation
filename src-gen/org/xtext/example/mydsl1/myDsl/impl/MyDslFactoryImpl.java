/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl1.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl1.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.MODEL: return createModel();
      case MyDslPackage.COMMAND: return createCommand();
      case MyDslPackage.OPEN_BROWSER_COMMAND: return createOpenBrowserCommand();
      case MyDslPackage.NAVIGATE_TO_COMMAND: return createNavigateToCommand();
      case MyDslPackage.CLICK_COMMAND: return createClickCommand();
      case MyDslPackage.FILL_COMMAND: return createFillCommand();
      case MyDslPackage.SELECT_COMMAND: return createSelectCommand();
      case MyDslPackage.VERIFY_COMMAND: return createVerifyCommand();
      case MyDslPackage.READ_COMMAND: return createReadCommand();
      case MyDslPackage.OPEN_BROWSER: return createOpenBrowser();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OpenBrowserCommand createOpenBrowserCommand()
  {
    OpenBrowserCommandImpl openBrowserCommand = new OpenBrowserCommandImpl();
    return openBrowserCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NavigateToCommand createNavigateToCommand()
  {
    NavigateToCommandImpl navigateToCommand = new NavigateToCommandImpl();
    return navigateToCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClickCommand createClickCommand()
  {
    ClickCommandImpl clickCommand = new ClickCommandImpl();
    return clickCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FillCommand createFillCommand()
  {
    FillCommandImpl fillCommand = new FillCommandImpl();
    return fillCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectCommand createSelectCommand()
  {
    SelectCommandImpl selectCommand = new SelectCommandImpl();
    return selectCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VerifyCommand createVerifyCommand()
  {
    VerifyCommandImpl verifyCommand = new VerifyCommandImpl();
    return verifyCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReadCommand createReadCommand()
  {
    ReadCommandImpl readCommand = new ReadCommandImpl();
    return readCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OpenBrowser createOpenBrowser()
  {
    OpenBrowserImpl openBrowser = new OpenBrowserImpl();
    return openBrowser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
