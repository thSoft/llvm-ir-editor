/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.Instruction;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.MetadataSuffix;
import com.intel.llvm.ireditor.lLVM_IR.NamedInstruction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.NamedInstructionImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.NamedInstructionImpl#getOpcode <em>Opcode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedInstructionImpl extends LocalValueImpl implements NamedInstruction {
	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<MetadataSuffix> metadata;

	/**
	 * The default value of the '{@link #getOpcode() <em>Opcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpcode()
	 * @generated
	 * @ordered
	 */
	protected static final String OPCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpcode() <em>Opcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpcode()
	 * @generated
	 * @ordered
	 */
	protected String opcode = OPCODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LLVM_IRPackage.eINSTANCE.getNamedInstruction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetadataSuffix> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<MetadataSuffix>(MetadataSuffix.class, this, LLVM_IRPackage.NAMED_INSTRUCTION__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpcode() {
		return opcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpcode(String newOpcode) {
		String oldOpcode = opcode;
		opcode = newOpcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.NAMED_INSTRUCTION__OPCODE, oldOpcode, opcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LLVM_IRPackage.NAMED_INSTRUCTION__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
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
			case LLVM_IRPackage.NAMED_INSTRUCTION__METADATA:
				return getMetadata();
			case LLVM_IRPackage.NAMED_INSTRUCTION__OPCODE:
				return getOpcode();
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
			case LLVM_IRPackage.NAMED_INSTRUCTION__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends MetadataSuffix>)newValue);
				return;
			case LLVM_IRPackage.NAMED_INSTRUCTION__OPCODE:
				setOpcode((String)newValue);
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
			case LLVM_IRPackage.NAMED_INSTRUCTION__METADATA:
				getMetadata().clear();
				return;
			case LLVM_IRPackage.NAMED_INSTRUCTION__OPCODE:
				setOpcode(OPCODE_EDEFAULT);
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
			case LLVM_IRPackage.NAMED_INSTRUCTION__METADATA:
				return metadata != null && !metadata.isEmpty();
			case LLVM_IRPackage.NAMED_INSTRUCTION__OPCODE:
				return OPCODE_EDEFAULT == null ? opcode != null : !OPCODE_EDEFAULT.equals(opcode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Instruction.class) {
			switch (derivedFeatureID) {
				case LLVM_IRPackage.NAMED_INSTRUCTION__METADATA: return LLVM_IRPackage.INSTRUCTION__METADATA;
				case LLVM_IRPackage.NAMED_INSTRUCTION__OPCODE: return LLVM_IRPackage.INSTRUCTION__OPCODE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Instruction.class) {
			switch (baseFeatureID) {
				case LLVM_IRPackage.INSTRUCTION__METADATA: return LLVM_IRPackage.NAMED_INSTRUCTION__METADATA;
				case LLVM_IRPackage.INSTRUCTION__OPCODE: return LLVM_IRPackage.NAMED_INSTRUCTION__OPCODE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (opcode: ");
		result.append(opcode);
		result.append(')');
		return result.toString();
	}

} //NamedInstructionImpl
