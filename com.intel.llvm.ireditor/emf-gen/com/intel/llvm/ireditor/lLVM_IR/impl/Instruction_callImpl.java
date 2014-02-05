/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.ArgList;
import com.intel.llvm.ireditor.lLVM_IR.CConv;
import com.intel.llvm.ireditor.lLVM_IR.Callee;
import com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_call;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.ParameterAttributes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_callImpl#isIsTail <em>Is Tail</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_callImpl#getCconv <em>Cconv</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_callImpl#getReturnAttributes <em>Return Attributes</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_callImpl#getCallee <em>Callee</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_callImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_callImpl#getFunctionAttributes <em>Function Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Instruction_callImpl extends MiddleInstructionImpl implements Instruction_call {
	/**
	 * The default value of the '{@link #isIsTail() <em>Is Tail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TAIL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTail() <em>Is Tail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTail()
	 * @generated
	 * @ordered
	 */
	protected boolean isTail = IS_TAIL_EDEFAULT;

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
	 * The cached value of the '{@link #getReturnAttributes() <em>Return Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnAttributes()
	 * @generated
	 * @ordered
	 */
	protected ParameterAttributes returnAttributes;

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
	 * The cached value of the '{@link #getFunctionAttributes() <em>Function Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionAttributes()
	 * @generated
	 * @ordered
	 */
	protected FunctionAttributes functionAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Instruction_callImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LLVM_IRPackage.eINSTANCE.getInstruction_call();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTail() {
		return isTail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTail(boolean newIsTail) {
		boolean oldIsTail = isTail;
		isTail = newIsTail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL__IS_TAIL, oldIsTail, isTail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CConv getCconv() {
		return cconv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCconv(CConv newCconv, NotificationChain msgs) {
		CConv oldCconv = cconv;
		cconv = newCconv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL__CCONV, oldCconv, newCconv);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCconv(CConv newCconv) {
		if (newCconv != cconv) {
			NotificationChain msgs = null;
			if (cconv != null)
				msgs = ((InternalEObject)cconv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL__CCONV, null, msgs);
			if (newCconv != null)
				msgs = ((InternalEObject)newCconv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL__CCONV, null, msgs);
			msgs = basicSetCconv(newCconv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL__CCONV, newCconv, newCconv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterAttributes getReturnAttributes() {
		return returnAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnAttributes(ParameterAttributes newReturnAttributes, NotificationChain msgs) {
		ParameterAttributes oldReturnAttributes = returnAttributes;
		returnAttributes = newReturnAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL__RETURN_ATTRIBUTES, oldReturnAttributes, newReturnAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnAttributes(ParameterAttributes newReturnAttributes) {
		if (newReturnAttributes != returnAttributes) {
			NotificationChain msgs = null;
			if (returnAttributes != null)
				msgs = ((InternalEObject)returnAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL__RETURN_ATTRIBUTES, null, msgs);
			if (newReturnAttributes != null)
				msgs = ((InternalEObject)newReturnAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL__RETURN_ATTRIBUTES, null, msgs);
			msgs = basicSetReturnAttributes(newReturnAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL__RETURN_ATTRIBUTES, newReturnAttributes, newReturnAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Callee getCallee() {
		return callee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallee(Callee newCallee, NotificationChain msgs) {
		Callee oldCallee = callee;
		callee = newCallee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL__CALLEE, oldCallee, newCallee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallee(Callee newCallee) {
		if (newCallee != callee) {
			NotificationChain msgs = null;
			if (callee != null)
				msgs = ((InternalEObject)callee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL__CALLEE, null, msgs);
			if (newCallee != null)
				msgs = ((InternalEObject)newCallee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL__CALLEE, null, msgs);
			msgs = basicSetCallee(newCallee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL__CALLEE, newCallee, newCallee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgList getArgs() {
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgs(ArgList newArgs, NotificationChain msgs) {
		ArgList oldArgs = args;
		args = newArgs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL__ARGS, oldArgs, newArgs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgs(ArgList newArgs) {
		if (newArgs != args) {
			NotificationChain msgs = null;
			if (args != null)
				msgs = ((InternalEObject)args).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL__ARGS, null, msgs);
			if (newArgs != null)
				msgs = ((InternalEObject)newArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL__ARGS, null, msgs);
			msgs = basicSetArgs(newArgs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL__ARGS, newArgs, newArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionAttributes getFunctionAttributes() {
		return functionAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionAttributes(FunctionAttributes newFunctionAttributes, NotificationChain msgs) {
		FunctionAttributes oldFunctionAttributes = functionAttributes;
		functionAttributes = newFunctionAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL__FUNCTION_ATTRIBUTES, oldFunctionAttributes, newFunctionAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionAttributes(FunctionAttributes newFunctionAttributes) {
		if (newFunctionAttributes != functionAttributes) {
			NotificationChain msgs = null;
			if (functionAttributes != null)
				msgs = ((InternalEObject)functionAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL__FUNCTION_ATTRIBUTES, null, msgs);
			if (newFunctionAttributes != null)
				msgs = ((InternalEObject)newFunctionAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL__FUNCTION_ATTRIBUTES, null, msgs);
			msgs = basicSetFunctionAttributes(newFunctionAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL__FUNCTION_ATTRIBUTES, newFunctionAttributes, newFunctionAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LLVM_IRPackage.INSTRUCTION_CALL__CCONV:
				return basicSetCconv(null, msgs);
			case LLVM_IRPackage.INSTRUCTION_CALL__RETURN_ATTRIBUTES:
				return basicSetReturnAttributes(null, msgs);
			case LLVM_IRPackage.INSTRUCTION_CALL__CALLEE:
				return basicSetCallee(null, msgs);
			case LLVM_IRPackage.INSTRUCTION_CALL__ARGS:
				return basicSetArgs(null, msgs);
			case LLVM_IRPackage.INSTRUCTION_CALL__FUNCTION_ATTRIBUTES:
				return basicSetFunctionAttributes(null, msgs);
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
			case LLVM_IRPackage.INSTRUCTION_CALL__IS_TAIL:
				return isIsTail();
			case LLVM_IRPackage.INSTRUCTION_CALL__CCONV:
				return getCconv();
			case LLVM_IRPackage.INSTRUCTION_CALL__RETURN_ATTRIBUTES:
				return getReturnAttributes();
			case LLVM_IRPackage.INSTRUCTION_CALL__CALLEE:
				return getCallee();
			case LLVM_IRPackage.INSTRUCTION_CALL__ARGS:
				return getArgs();
			case LLVM_IRPackage.INSTRUCTION_CALL__FUNCTION_ATTRIBUTES:
				return getFunctionAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LLVM_IRPackage.INSTRUCTION_CALL__IS_TAIL:
				setIsTail((Boolean)newValue);
				return;
			case LLVM_IRPackage.INSTRUCTION_CALL__CCONV:
				setCconv((CConv)newValue);
				return;
			case LLVM_IRPackage.INSTRUCTION_CALL__RETURN_ATTRIBUTES:
				setReturnAttributes((ParameterAttributes)newValue);
				return;
			case LLVM_IRPackage.INSTRUCTION_CALL__CALLEE:
				setCallee((Callee)newValue);
				return;
			case LLVM_IRPackage.INSTRUCTION_CALL__ARGS:
				setArgs((ArgList)newValue);
				return;
			case LLVM_IRPackage.INSTRUCTION_CALL__FUNCTION_ATTRIBUTES:
				setFunctionAttributes((FunctionAttributes)newValue);
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
			case LLVM_IRPackage.INSTRUCTION_CALL__IS_TAIL:
				setIsTail(IS_TAIL_EDEFAULT);
				return;
			case LLVM_IRPackage.INSTRUCTION_CALL__CCONV:
				setCconv((CConv)null);
				return;
			case LLVM_IRPackage.INSTRUCTION_CALL__RETURN_ATTRIBUTES:
				setReturnAttributes((ParameterAttributes)null);
				return;
			case LLVM_IRPackage.INSTRUCTION_CALL__CALLEE:
				setCallee((Callee)null);
				return;
			case LLVM_IRPackage.INSTRUCTION_CALL__ARGS:
				setArgs((ArgList)null);
				return;
			case LLVM_IRPackage.INSTRUCTION_CALL__FUNCTION_ATTRIBUTES:
				setFunctionAttributes((FunctionAttributes)null);
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
			case LLVM_IRPackage.INSTRUCTION_CALL__IS_TAIL:
				return isTail != IS_TAIL_EDEFAULT;
			case LLVM_IRPackage.INSTRUCTION_CALL__CCONV:
				return cconv != null;
			case LLVM_IRPackage.INSTRUCTION_CALL__RETURN_ATTRIBUTES:
				return returnAttributes != null;
			case LLVM_IRPackage.INSTRUCTION_CALL__CALLEE:
				return callee != null;
			case LLVM_IRPackage.INSTRUCTION_CALL__ARGS:
				return args != null;
			case LLVM_IRPackage.INSTRUCTION_CALL__FUNCTION_ATTRIBUTES:
				return functionAttributes != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isTail: ");
		result.append(isTail);
		result.append(')');
		return result.toString();
	}

} //Instruction_callImpl
