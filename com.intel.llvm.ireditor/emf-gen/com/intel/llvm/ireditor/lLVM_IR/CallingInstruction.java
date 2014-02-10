/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calling Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.CallingInstruction#getCconv <em>Cconv</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.CallingInstruction#getCallee <em>Callee</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.CallingInstruction#getArgs <em>Args</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.CallingInstruction#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getCallingInstruction()
 * @model
 * @generated
 */
public interface CallingInstruction extends Instruction
{
	/**
	 * Returns the value of the '<em><b>Cconv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cconv</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cconv</em>' containment reference.
	 * @see #setCconv(CConv)
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getCallingInstruction_Cconv()
	 * @model containment="true"
	 * @generated
	 */
	CConv getCconv();

	/**
	 * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.CallingInstruction#getCconv <em>Cconv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cconv</em>' containment reference.
	 * @see #getCconv()
	 * @generated
	 */
	void setCconv(CConv value);

	/**
	 * Returns the value of the '<em><b>Callee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callee</em>' containment reference.
	 * @see #setCallee(Callee)
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getCallingInstruction_Callee()
	 * @model containment="true"
	 * @generated
	 */
	Callee getCallee();

	/**
	 * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.CallingInstruction#getCallee <em>Callee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callee</em>' containment reference.
	 * @see #getCallee()
	 * @generated
	 */
	void setCallee(Callee value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference.
	 * @see #setArgs(ArgList)
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getCallingInstruction_Args()
	 * @model containment="true"
	 * @generated
	 */
	ArgList getArgs();

	/**
	 * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.CallingInstruction#getArgs <em>Args</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' containment reference.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(ArgList value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(FunctionAttributes)
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getCallingInstruction_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	FunctionAttributes getAttributes();

	/**
	 * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.CallingInstruction#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(FunctionAttributes value);

} // CallingInstruction
