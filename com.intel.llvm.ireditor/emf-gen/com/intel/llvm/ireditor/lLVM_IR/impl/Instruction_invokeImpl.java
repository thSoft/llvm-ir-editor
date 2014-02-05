/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.ArgList;
import com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef;
import com.intel.llvm.ireditor.lLVM_IR.CConv;
import com.intel.llvm.ireditor.lLVM_IR.Callee;
import com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes;
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
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_invokeImpl#getCconv <em>Cconv</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_invokeImpl#getCallee <em>Callee</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_invokeImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_invokeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_invokeImpl#getToLabel <em>To Label</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_invokeImpl#getExceptionLabel <em>Exception Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Instruction_invokeImpl extends TerminatorInstructionImpl implements Instruction_invoke
{
	/**
	 * The cached value of the '{@link #getCconv() <em>Cconv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCconv()
	 * @generated
	 * @ordered
	 */
	protected CConv cconv;

	/**
	 * The cached value of the '{@link #getCallee() <em>Callee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallee()
	 * @generated
	 * @ordered
	 */
	protected Callee callee;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected ArgList args;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected FunctionAttributes attributes;

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
	public CConv getCconv()
	{
		return cconv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCconv(CConv newCconv, NotificationChain msgs)
	{
		CConv oldCconv = cconv;
		cconv = newCconv;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_INVOKE__CCONV, oldCconv, newCconv);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCconv(CConv newCconv)
	{
		if (newCconv != cconv)
		{
			NotificationChain msgs = null;
			if (cconv != null)
				msgs = ((InternalEObject)cconv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_INVOKE__CCONV, null, msgs);
			if (newCconv != null)
				msgs = ((InternalEObject)newCconv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_INVOKE__CCONV, null, msgs);
			msgs = basicSetCconv(newCconv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_INVOKE__CCONV, newCconv, newCconv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Callee getCallee()
	{
		return callee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallee(Callee newCallee, NotificationChain msgs)
	{
		Callee oldCallee = callee;
		callee = newCallee;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_INVOKE__CALLEE, oldCallee, newCallee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallee(Callee newCallee)
	{
		if (newCallee != callee)
		{
			NotificationChain msgs = null;
			if (callee != null)
				msgs = ((InternalEObject)callee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_INVOKE__CALLEE, null, msgs);
			if (newCallee != null)
				msgs = ((InternalEObject)newCallee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_INVOKE__CALLEE, null, msgs);
			msgs = basicSetCallee(newCallee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_INVOKE__CALLEE, newCallee, newCallee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgList getArgs()
	{
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgs(ArgList newArgs, NotificationChain msgs)
	{
		ArgList oldArgs = args;
		args = newArgs;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_INVOKE__ARGS, oldArgs, newArgs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgs(ArgList newArgs)
	{
		if (newArgs != args)
		{
			NotificationChain msgs = null;
			if (args != null)
				msgs = ((InternalEObject)args).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_INVOKE__ARGS, null, msgs);
			if (newArgs != null)
				msgs = ((InternalEObject)newArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_INVOKE__ARGS, null, msgs);
			msgs = basicSetArgs(newArgs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_INVOKE__ARGS, newArgs, newArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionAttributes getAttributes()
	{
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(FunctionAttributes newAttributes, NotificationChain msgs)
	{
		FunctionAttributes oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_INVOKE__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(FunctionAttributes newAttributes)
	{
		if (newAttributes != attributes)
		{
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_INVOKE__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_INVOKE__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_INVOKE__ATTRIBUTES, newAttributes, newAttributes));
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
			case LLVM_IRPackage.INSTRUCTION_INVOKE__CCONV:
				return basicSetCconv(null, msgs);
			case LLVM_IRPackage.INSTRUCTION_INVOKE__CALLEE:
				return basicSetCallee(null, msgs);
			case LLVM_IRPackage.INSTRUCTION_INVOKE__ARGS:
				return basicSetArgs(null, msgs);
			case LLVM_IRPackage.INSTRUCTION_INVOKE__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
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
			case LLVM_IRPackage.INSTRUCTION_INVOKE__CCONV:
				return getCconv();
			case LLVM_IRPackage.INSTRUCTION_INVOKE__CALLEE:
				return getCallee();
			case LLVM_IRPackage.INSTRUCTION_INVOKE__ARGS:
				return getArgs();
			case LLVM_IRPackage.INSTRUCTION_INVOKE__ATTRIBUTES:
				return getAttributes();
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
			case LLVM_IRPackage.INSTRUCTION_INVOKE__CCONV:
				setCconv((CConv)newValue);
				return;
			case LLVM_IRPackage.INSTRUCTION_INVOKE__CALLEE:
				setCallee((Callee)newValue);
				return;
			case LLVM_IRPackage.INSTRUCTION_INVOKE__ARGS:
				setArgs((ArgList)newValue);
				return;
			case LLVM_IRPackage.INSTRUCTION_INVOKE__ATTRIBUTES:
				setAttributes((FunctionAttributes)newValue);
				return;
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
			case LLVM_IRPackage.INSTRUCTION_INVOKE__CCONV:
				setCconv((CConv)null);
				return;
			case LLVM_IRPackage.INSTRUCTION_INVOKE__CALLEE:
				setCallee((Callee)null);
				return;
			case LLVM_IRPackage.INSTRUCTION_INVOKE__ARGS:
				setArgs((ArgList)null);
				return;
			case LLVM_IRPackage.INSTRUCTION_INVOKE__ATTRIBUTES:
				setAttributes((FunctionAttributes)null);
				return;
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
			case LLVM_IRPackage.INSTRUCTION_INVOKE__CCONV:
				return cconv != null;
			case LLVM_IRPackage.INSTRUCTION_INVOKE__CALLEE:
				return callee != null;
			case LLVM_IRPackage.INSTRUCTION_INVOKE__ARGS:
				return args != null;
			case LLVM_IRPackage.INSTRUCTION_INVOKE__ATTRIBUTES:
				return attributes != null;
			case LLVM_IRPackage.INSTRUCTION_INVOKE__TO_LABEL:
				return toLabel != null;
			case LLVM_IRPackage.INSTRUCTION_INVOKE__EXCEPTION_LABEL:
				return exceptionLabel != null;
		}
		return super.eIsSet(featureID);
	}

} //Instruction_invokeImpl
