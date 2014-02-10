/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction invoke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_invokeImpl#getToLabel <em>To Label</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_invokeImpl#getExceptionLabel <em>Exception Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Instruction_invokeImpl extends CallingInstructionImpl implements Instruction_invoke
{
	/**
	 * The cached value of the '{@link #getToLabel() <em>To Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToLabel()
	 * @generated
	 * @ordered
	 */
	protected BasicBlockRef toLabel;

	/**
	 * The cached value of the '{@link #getExceptionLabel() <em>Exception Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionLabel()
	 * @generated
	 * @ordered
	 */
	protected BasicBlockRef exceptionLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Instruction_invokeImpl()
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
		return LLVM_IRPackage.eINSTANCE.getInstruction_invoke();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicBlockRef getToLabel()
	{
		return toLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToLabel(BasicBlockRef newToLabel, NotificationChain msgs)
	{
		BasicBlockRef oldToLabel = toLabel;
		toLabel = newToLabel;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_INVOKE__TO_LABEL, oldToLabel, newToLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToLabel(BasicBlockRef newToLabel)
	{
		if (newToLabel != toLabel)
		{
			NotificationChain msgs = null;
			if (toLabel != null)
				msgs = ((InternalEObject)toLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_INVOKE__TO_LABEL, null, msgs);
			if (newToLabel != null)
				msgs = ((InternalEObject)newToLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_INVOKE__TO_LABEL, null, msgs);
			msgs = basicSetToLabel(newToLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_INVOKE__TO_LABEL, newToLabel, newToLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicBlockRef getExceptionLabel()
	{
		return exceptionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptionLabel(BasicBlockRef newExceptionLabel, NotificationChain msgs)
	{
		BasicBlockRef oldExceptionLabel = exceptionLabel;
		exceptionLabel = newExceptionLabel;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_INVOKE__EXCEPTION_LABEL, oldExceptionLabel, newExceptionLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionLabel(BasicBlockRef newExceptionLabel)
	{
		if (newExceptionLabel != exceptionLabel)
		{
			NotificationChain msgs = null;
			if (exceptionLabel != null)
				msgs = ((InternalEObject)exceptionLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_INVOKE__EXCEPTION_LABEL, null, msgs);
			if (newExceptionLabel != null)
				msgs = ((InternalEObject)newExceptionLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_INVOKE__EXCEPTION_LABEL, null, msgs);
			msgs = basicSetExceptionLabel(newExceptionLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_INVOKE__EXCEPTION_LABEL, newExceptionLabel, newExceptionLabel));
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
			case LLVM_IRPackage.INSTRUCTION_INVOKE__TO_LABEL:
				return basicSetToLabel(null, msgs);
			case LLVM_IRPackage.INSTRUCTION_INVOKE__EXCEPTION_LABEL:
				return basicSetExceptionLabel(null, msgs);
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
			case LLVM_IRPackage.INSTRUCTION_INVOKE__TO_LABEL:
				return getToLabel();
			case LLVM_IRPackage.INSTRUCTION_INVOKE__EXCEPTION_LABEL:
				return getExceptionLabel();
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
			case LLVM_IRPackage.INSTRUCTION_INVOKE__TO_LABEL:
				setToLabel((BasicBlockRef)newValue);
				return;
			case LLVM_IRPackage.INSTRUCTION_INVOKE__EXCEPTION_LABEL:
				setExceptionLabel((BasicBlockRef)newValue);
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
			case LLVM_IRPackage.INSTRUCTION_INVOKE__TO_LABEL:
				setToLabel((BasicBlockRef)null);
				return;
			case LLVM_IRPackage.INSTRUCTION_INVOKE__EXCEPTION_LABEL:
				setExceptionLabel((BasicBlockRef)null);
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
			case LLVM_IRPackage.INSTRUCTION_INVOKE__TO_LABEL:
				return toLabel != null;
			case LLVM_IRPackage.INSTRUCTION_INVOKE__EXCEPTION_LABEL:
				return exceptionLabel != null;
		}
		return super.eIsSet(featureID);
	}

} //Instruction_invokeImpl
