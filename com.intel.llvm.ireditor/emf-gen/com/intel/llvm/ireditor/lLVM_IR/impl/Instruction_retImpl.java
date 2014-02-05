/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.Instruction_ret;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.TypedValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction ret</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_retImpl#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Instruction_retImpl extends TerminatorInstructionImpl implements Instruction_ret
{
	/**
	 * The cached value of the '{@link #getVal() <em>Val</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal()
	 * @generated
	 * @ordered
	 */
	protected TypedValue val;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Instruction_retImpl()
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
		return LLVM_IRPackage.eINSTANCE.getInstruction_ret();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedValue getVal()
	{
		return val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVal(TypedValue newVal, NotificationChain msgs)
	{
		TypedValue oldVal = val;
		val = newVal;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_RET__VAL, oldVal, newVal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVal(TypedValue newVal)
	{
		if (newVal != val)
		{
			NotificationChain msgs = null;
			if (val != null)
				msgs = ((InternalEObject)val).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_RET__VAL, null, msgs);
			if (newVal != null)
				msgs = ((InternalEObject)newVal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_RET__VAL, null, msgs);
			msgs = basicSetVal(newVal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_RET__VAL, newVal, newVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case LLVM_IRPackage.INSTRUCTION_RET__VAL:
				return basicSetVal(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case LLVM_IRPackage.INSTRUCTION_RET__VAL:
				return getVal();
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
			case LLVM_IRPackage.INSTRUCTION_RET__VAL:
				setVal((TypedValue)newValue);
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
			case LLVM_IRPackage.INSTRUCTION_RET__VAL:
				setVal((TypedValue)null);
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
			case LLVM_IRPackage.INSTRUCTION_RET__VAL:
				return val != null;
		}
		return super.eIsSet(featureID);
	}

} //Instruction_retImpl
