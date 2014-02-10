/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction invoke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke#getToLabel <em>To Label</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke#getExceptionLabel <em>Exception Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_invoke()
 * @model
 * @generated
 */
public interface Instruction_invoke extends CallingInstruction, TerminatorInstruction
{
	/**
	 * Returns the value of the '<em><b>To Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Label</em>' containment reference.
	 * @see #setToLabel(BasicBlockRef)
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_invoke_ToLabel()
	 * @model containment="true"
	 * @generated
	 */
	BasicBlockRef getToLabel();

	/**
	 * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke#getToLabel <em>To Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Label</em>' containment reference.
	 * @see #getToLabel()
	 * @generated
	 */
	void setToLabel(BasicBlockRef value);

	/**
	 * Returns the value of the '<em><b>Exception Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Label</em>' containment reference.
	 * @see #setExceptionLabel(BasicBlockRef)
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_invoke_ExceptionLabel()
	 * @model containment="true"
	 * @generated
	 */
	BasicBlockRef getExceptionLabel();

	/**
	 * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke#getExceptionLabel <em>Exception Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Label</em>' containment reference.
	 * @see #getExceptionLabel()
	 * @generated
	 */
	void setExceptionLabel(BasicBlockRef value);

} // Instruction_invoke
