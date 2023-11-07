/**
 * generated by Xtext 2.32.0
 */
package www.imta.fr.browserautomation.seleniumDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import www.imta.fr.browserautomation.seleniumDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage
 * @generated
 */
public class SeleniumDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SeleniumDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeleniumDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SeleniumDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SeleniumDslSwitch<Adapter> modelSwitch =
    new SeleniumDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseBrowserDsl(BrowserDsl object)
      {
        return createBrowserDslAdapter();
      }
      @Override
      public Adapter caseCommand(Command object)
      {
        return createCommandAdapter();
      }
      @Override
      public Adapter caseOpenBrowser(OpenBrowser object)
      {
        return createOpenBrowserAdapter();
      }
      @Override
      public Adapter caseGoTo(GoTo object)
      {
        return createGoToAdapter();
      }
      @Override
      public Adapter caseClick(Click object)
      {
        return createClickAdapter();
      }
      @Override
      public Adapter caseFill(Fill object)
      {
        return createFillAdapter();
      }
      @Override
      public Adapter caseSelect(Select object)
      {
        return createSelectAdapter();
      }
      @Override
      public Adapter caseVerify(Verify object)
      {
        return createVerifyAdapter();
      }
      @Override
      public Adapter caseRead(Read object)
      {
        return createReadAdapter();
      }
      @Override
      public Adapter caseUncheck(Uncheck object)
      {
        return createUncheckAdapter();
      }
      @Override
      public Adapter caseCombobox(Combobox object)
      {
        return createComboboxAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link www.imta.fr.browserautomation.seleniumDsl.BrowserDsl <em>Browser Dsl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.imta.fr.browserautomation.seleniumDsl.BrowserDsl
   * @generated
   */
  public Adapter createBrowserDslAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.imta.fr.browserautomation.seleniumDsl.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.imta.fr.browserautomation.seleniumDsl.Command
   * @generated
   */
  public Adapter createCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.imta.fr.browserautomation.seleniumDsl.OpenBrowser <em>Open Browser</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.imta.fr.browserautomation.seleniumDsl.OpenBrowser
   * @generated
   */
  public Adapter createOpenBrowserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.imta.fr.browserautomation.seleniumDsl.GoTo <em>Go To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.imta.fr.browserautomation.seleniumDsl.GoTo
   * @generated
   */
  public Adapter createGoToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.imta.fr.browserautomation.seleniumDsl.Click <em>Click</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.imta.fr.browserautomation.seleniumDsl.Click
   * @generated
   */
  public Adapter createClickAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.imta.fr.browserautomation.seleniumDsl.Fill <em>Fill</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.imta.fr.browserautomation.seleniumDsl.Fill
   * @generated
   */
  public Adapter createFillAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.imta.fr.browserautomation.seleniumDsl.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.imta.fr.browserautomation.seleniumDsl.Select
   * @generated
   */
  public Adapter createSelectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.imta.fr.browserautomation.seleniumDsl.Verify <em>Verify</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.imta.fr.browserautomation.seleniumDsl.Verify
   * @generated
   */
  public Adapter createVerifyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.imta.fr.browserautomation.seleniumDsl.Read <em>Read</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.imta.fr.browserautomation.seleniumDsl.Read
   * @generated
   */
  public Adapter createReadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.imta.fr.browserautomation.seleniumDsl.Uncheck <em>Uncheck</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.imta.fr.browserautomation.seleniumDsl.Uncheck
   * @generated
   */
  public Adapter createUncheckAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.imta.fr.browserautomation.seleniumDsl.Combobox <em>Combobox</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.imta.fr.browserautomation.seleniumDsl.Combobox
   * @generated
   */
  public Adapter createComboboxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SeleniumDslAdapterFactory
