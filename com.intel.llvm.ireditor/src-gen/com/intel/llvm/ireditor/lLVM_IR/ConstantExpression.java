/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression#getOpcode <em>Opcode</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getConstantExpression()
 * @model
 * @generated
 */
public interface ConstantExpression extends Constant {
	/**
	 * Returns the value of the '<em><b>Opcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opcode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opcode</em>' attribute.
	 * @see #setOpcode(String)
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getConstantExpression_Opcode()
	 * @model
	 * @generated
	 */
	String getOpcode();

	/**
	 * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression#getOpcode <em>Opcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opcode</em>' attribute.
	 * @see #getOpcode()
	 * @generated
	 */
	void setOpcode(String value);

} // ConstantExpression
