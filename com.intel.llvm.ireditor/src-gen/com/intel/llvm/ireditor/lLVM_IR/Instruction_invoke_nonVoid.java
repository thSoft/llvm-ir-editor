/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction invoke non Void</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_invoke_nonVoid()
 * @model
 * @generated
 */
public interface Instruction_invoke_nonVoid extends Instruction_invoke, NamedTerminatorInstruction {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(NonVoidType)
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_invoke_nonVoid_Type()
	 * @model containment="true"
	 * @generated
	 */
	NonVoidType getType();

	/**
	 * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(NonVoidType value);

} // Instruction_invoke_nonVoid
