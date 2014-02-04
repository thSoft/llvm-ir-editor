/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction invoke void</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getCconv <em>Cconv</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getType <em>Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getCallee <em>Callee</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getArgs <em>Args</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getToLabel <em>To Label</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getExceptionLabel <em>Exception Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_invoke_void()
 * @model
 * @generated
 */
public interface Instruction_invoke_void extends TerminatorInstruction {
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
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_invoke_void_Cconv()
	 * @model containment="true"
	 * @generated
	 */
	CConv getCconv();

	/**
	 * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getCconv <em>Cconv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cconv</em>' containment reference.
	 * @see #getCconv()
	 * @generated
	 */
	void setCconv(CConv value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(VoidType)
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_invoke_void_Type()
	 * @model containment="true"
	 * @generated
	 */
	VoidType getType();

	/**
	 * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(VoidType value);

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
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_invoke_void_Callee()
	 * @model containment="true"
	 * @generated
	 */
	Callee getCallee();

	/**
	 * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getCallee <em>Callee</em>}' containment reference.
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
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_invoke_void_Args()
	 * @model containment="true"
	 * @generated
	 */
	ArgList getArgs();

	/**
	 * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getArgs <em>Args</em>}' containment reference.
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
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_invoke_void_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	FunctionAttributes getAttributes();

	/**
	 * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(FunctionAttributes value);

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
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_invoke_void_ToLabel()
	 * @model containment="true"
	 * @generated
	 */
	BasicBlockRef getToLabel();

	/**
	 * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getToLabel <em>To Label</em>}' containment reference.
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
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_invoke_void_ExceptionLabel()
	 * @model containment="true"
	 * @generated
	 */
	BasicBlockRef getExceptionLabel();

	/**
	 * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getExceptionLabel <em>Exception Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Label</em>' containment reference.
	 * @see #getExceptionLabel()
	 * @generated
	 */
	void setExceptionLabel(BasicBlockRef value);

} // Instruction_invoke_void
