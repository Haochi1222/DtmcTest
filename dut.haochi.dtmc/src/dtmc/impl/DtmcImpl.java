/**
 */
package dtmc.impl;

import dtmc.Dtmc;
import dtmc.DtmcPackage;
import dtmc.Reward;
import dtmc.State;
import dtmc.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dtmc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dtmc.impl.DtmcImpl#getName <em>Name</em>}</li>
 *   <li>{@link dtmc.impl.DtmcImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link dtmc.impl.DtmcImpl#getStates <em>States</em>}</li>
 *   <li>{@link dtmc.impl.DtmcImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dtmc.impl.DtmcImpl#getRewards <em>Rewards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DtmcImpl extends MinimalEObjectImpl.Container implements Dtmc {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameters;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getRewards() <em>Rewards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRewards()
	 * @generated
	 * @ordered
	 */
	protected EList<Reward> rewards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DtmcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtmcPackage.Literals.DTMC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtmcPackage.DTMC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getParameters() {
		if (parameters == null) {
			parameters = new EDataTypeUniqueEList<String>(String.class, this, DtmcPackage.DTMC__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, DtmcPackage.DTMC__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, DtmcPackage.DTMC__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reward> getRewards() {
		if (rewards == null) {
			rewards = new EObjectContainmentEList<Reward>(Reward.class, this, DtmcPackage.DTMC__REWARDS);
		}
		return rewards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DtmcPackage.DTMC__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case DtmcPackage.DTMC__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case DtmcPackage.DTMC__REWARDS:
				return ((InternalEList<?>)getRewards()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DtmcPackage.DTMC__NAME:
				return getName();
			case DtmcPackage.DTMC__PARAMETERS:
				return getParameters();
			case DtmcPackage.DTMC__STATES:
				return getStates();
			case DtmcPackage.DTMC__TRANSITIONS:
				return getTransitions();
			case DtmcPackage.DTMC__REWARDS:
				return getRewards();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DtmcPackage.DTMC__NAME:
				setName((String)newValue);
				return;
			case DtmcPackage.DTMC__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends String>)newValue);
				return;
			case DtmcPackage.DTMC__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case DtmcPackage.DTMC__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case DtmcPackage.DTMC__REWARDS:
				getRewards().clear();
				getRewards().addAll((Collection<? extends Reward>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case DtmcPackage.DTMC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DtmcPackage.DTMC__PARAMETERS:
				getParameters().clear();
				return;
			case DtmcPackage.DTMC__STATES:
				getStates().clear();
				return;
			case DtmcPackage.DTMC__TRANSITIONS:
				getTransitions().clear();
				return;
			case DtmcPackage.DTMC__REWARDS:
				getRewards().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DtmcPackage.DTMC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DtmcPackage.DTMC__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case DtmcPackage.DTMC__STATES:
				return states != null && !states.isEmpty();
			case DtmcPackage.DTMC__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case DtmcPackage.DTMC__REWARDS:
				return rewards != null && !rewards.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", parameters: ");
		result.append(parameters);
		result.append(')');
		return result.toString();
	}

} //DtmcImpl
