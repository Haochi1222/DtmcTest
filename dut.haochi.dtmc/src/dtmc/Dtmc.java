/**
 */
package dtmc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dtmc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtmc.Dtmc#getName <em>Name</em>}</li>
 *   <li>{@link dtmc.Dtmc#getParameters <em>Parameters</em>}</li>
 *   <li>{@link dtmc.Dtmc#getStates <em>States</em>}</li>
 *   <li>{@link dtmc.Dtmc#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dtmc.Dtmc#getRewards <em>Rewards</em>}</li>
 * </ul>
 *
 * @see dtmc.DtmcPackage#getDtmc()
 * @model
 * @generated
 */
public interface Dtmc extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dtmc.DtmcPackage#getDtmc_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dtmc.Dtmc#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute list.
	 * @see dtmc.DtmcPackage#getDtmc_Parameters()
	 * @model
	 * @generated
	 */
	EList<String> getParameters();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link dtmc.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see dtmc.DtmcPackage#getDtmc_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link dtmc.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see dtmc.DtmcPackage#getDtmc_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Rewards</b></em>' containment reference list.
	 * The list contents are of type {@link dtmc.Reward}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewards</em>' containment reference list.
	 * @see dtmc.DtmcPackage#getDtmc_Rewards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reward> getRewards();

} // Dtmc
