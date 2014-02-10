/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call#isIsTail <em>Is Tail</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call#getReturnAttributes <em>Return Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_call()
 * @model
 * @generated
 */
public interface Instruction_call extends MiddleInstruction, CallingInstruction
{
	/**
	 * Returns the value of the '<em><b>Is Tail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Tail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tail</em>' attribute.
	 * @see #setIsTail(boolean)
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_call_IsTail()
	 * @model
	 * @generated
	 */
	boolean isIsTail();

	/**
	 * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call#isIsTail <em>Is Tail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tail</em>' attribute.
	 * @see #isIsTail()
	 * @generated
	 */
	void setIsTail(boolean value);

	/**
	 * Returns the value of the '<em><b>Return Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Attributes</em>' containment reference.
	 * @see #setReturnAttributes(ParameterAttributes)
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_call_ReturnAttributes()
	 * @model containment="true"
	 * @generated
	 */
	ParameterAttributes getReturnAttributes();

	/**
	 * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call#getReturnAttributes <em>Return Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Attributes</em>' containment reference.
	 * @see #getReturnAttributes()
	 * @generated
	 */
	void setReturnAttributes(ParameterAttributes value);

} // Instruction_call
