/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.AggregateInstruction#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.AggregateInstruction#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getAggregateInstruction()
 * @model
 * @generated
 */
public interface AggregateInstruction extends NamedMiddleInstruction
{
	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' containment reference.
	 * @see #setAggregate(TypedValue)
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getAggregateInstruction_Aggregate()
	 * @model containment="true"
	 * @generated
	 */
	TypedValue getAggregate();

	/**
	 * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.AggregateInstruction#getAggregate <em>Aggregate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate</em>' containment reference.
	 * @see #getAggregate()
	 * @generated
	 */
	void setAggregate(TypedValue value);

	/**
	 * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
	 * The list contents are of type {@link com.intel.llvm.ireditor.lLVM_IR.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indices</em>' containment reference list.
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getAggregateInstruction_Indices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getIndices();

} // AggregateInstruction
