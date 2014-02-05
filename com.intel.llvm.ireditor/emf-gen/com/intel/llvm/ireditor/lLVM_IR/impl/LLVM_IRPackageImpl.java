/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRFactory;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LLVM_IRPackageImpl extends EPackageImpl implements LLVM_IRPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "lLVM_IR.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topLevelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetSpecificAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalValueRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localValueRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalValueDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliaseeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inlineAsmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantExpression_convertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantExpression_getelementptrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantExpression_selectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantExpression_compareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantExpression_extractelementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantExpression_insertelementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantExpression_shufflevectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantExpression_extractvalueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantExpression_insertvalueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantExpression_binaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass undefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zeroInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataNodeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressSpaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionPrefixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alignStackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataSuffixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startingInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass middleInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedMiddleInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminatorInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedTerminatorInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_retEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_brEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_switchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_indirectbrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_invoke_voidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_invoke_nonVoidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_resumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_unreachableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicBlockRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_addEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_faddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fastMathFlagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_subEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_fsubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_mulEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_fmulEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_udivEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_sdivEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_fdivEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_uremEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_sremEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_fremEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitwiseBinaryInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_shlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_lshrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_ashrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_xorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorInstructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_extractelementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_insertelementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_shufflevectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_extractvalueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_insertvalueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_allocaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_loadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_storeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_fenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_cmpxchgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_atomicrmwEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_getelementptrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_icmpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_fcmpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_phiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_selectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_callEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_call_nonVoidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_call_voidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calleeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inlineAssemblerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_va_argEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_landingpadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass landingpadClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonVoidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass starEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeSuffixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonLeftRecursiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonLeftRecursiveNonVoidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x86mmxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cConvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction_invokeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LLVM_IRPackageImpl()
	{
		super(eNS_URI, LLVM_IRFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LLVM_IRPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static LLVM_IRPackage init()
	{
		if (isInited) return (LLVM_IRPackage)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI);

		// Obtain or create and register package
		LLVM_IRPackageImpl theLLVM_IRPackage = (LLVM_IRPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LLVM_IRPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LLVM_IRPackageImpl());

		isInited = true;

		// Load packages
		theLLVM_IRPackage.loadPackage();

		// Fix loaded packages
		theLLVM_IRPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theLLVM_IRPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LLVM_IRPackage.eNS_URI, theLLVM_IRPackage);
		return theLLVM_IRPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel()
	{
		if (modelEClass == null)
		{
			modelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(0);
		}
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Elements()
	{
        return (EReference)getModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopLevelElement()
	{
		if (topLevelElementEClass == null)
		{
			topLevelElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(1);
		}
		return topLevelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeGroup()
	{
		if (attributeGroupEClass == null)
		{
			attributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(2);
		}
		return attributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeGroup_Name()
	{
        return (EAttribute)getAttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeGroup_Attributes()
	{
        return (EReference)getAttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeGroup_Alignstack()
	{
        return (EReference)getAttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeGroup_AlignstackValue()
	{
        return (EAttribute)getAttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeGroup_TargetSpecificAttributes()
	{
        return (EReference)getAttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetSpecificAttribute()
	{
		if (targetSpecificAttributeEClass == null)
		{
			targetSpecificAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(3);
		}
		return targetSpecificAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetSpecificAttribute_Name()
	{
        return (EAttribute)getTargetSpecificAttribute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetSpecificAttribute_Value()
	{
        return (EAttribute)getTargetSpecificAttribute().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedMetadata()
	{
		if (namedMetadataEClass == null)
		{
			namedMetadataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(4);
		}
		return namedMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedMetadata_Name()
	{
        return (EAttribute)getNamedMetadata().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedMetadata_Node()
	{
        return (EReference)getNamedMetadata().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataRef()
	{
		if (metadataRefEClass == null)
		{
			metadataRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(5);
		}
		return metadataRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataRef_Ref()
	{
        return (EReference)getMetadataRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueRef()
	{
		if (valueRefEClass == null)
		{
			valueRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(6);
		}
		return valueRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalValueRef()
	{
		if (globalValueRefEClass == null)
		{
			globalValueRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(7);
		}
		return globalValueRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalValueRef_Constant()
	{
        return (EReference)getGlobalValueRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalValueRef_Metadata()
	{
        return (EReference)getGlobalValueRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalValueRef()
	{
		if (localValueRefEClass == null)
		{
			localValueRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(8);
		}
		return localValueRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalValueRef_Ref()
	{
        return (EReference)getLocalValueRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalValue()
	{
		if (globalValueEClass == null)
		{
			globalValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(9);
		}
		return globalValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalValueDef()
	{
		if (globalValueDefEClass == null)
		{
			globalValueDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(10);
		}
		return globalValueDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalValue()
	{
		if (localValueEClass == null)
		{
			localValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(11);
		}
		return localValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalValue_Name()
	{
        return (EAttribute)getLocalValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedInstruction()
	{
		if (namedInstructionEClass == null)
		{
			namedInstructionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(12);
		}
		return namedInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction()
	{
		if (instructionEClass == null)
		{
			instructionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(13);
		}
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_Metadata()
	{
        return (EReference)getInstruction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_Opcode()
	{
        return (EAttribute)getInstruction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlias()
	{
		if (aliasEClass == null)
		{
			aliasEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(14);
		}
		return aliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlias_Name()
	{
        return (EAttribute)getAlias().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlias_Linkage()
	{
        return (EAttribute)getAlias().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlias_Visibility()
	{
        return (EAttribute)getAlias().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlias_Type()
	{
        return (EReference)getAlias().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlias_Aliasee()
	{
        return (EReference)getAlias().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasee()
	{
		if (aliaseeEClass == null)
		{
			aliaseeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(15);
		}
		return aliaseeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasee_Ref()
	{
        return (EReference)getAliasee().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasee_Bitcast()
	{
        return (EReference)getAliasee().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetInfo()
	{
		if (targetInfoEClass == null)
		{
			targetInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(16);
		}
		return targetInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetInfo_InfoType()
	{
        return (EAttribute)getTargetInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetInfo_Layout()
	{
        return (EAttribute)getTargetInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInlineAsm()
	{
		if (inlineAsmEClass == null)
		{
			inlineAsmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(17);
		}
		return inlineAsmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAsm_AsmLine()
	{
        return (EAttribute)getInlineAsm().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVariable()
	{
		if (globalVariableEClass == null)
		{
			globalVariableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(18);
		}
		return globalVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVariable_Name()
	{
        return (EAttribute)getGlobalVariable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVariable_Linkage()
	{
        return (EAttribute)getGlobalVariable().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalVariable_Addrspace()
	{
        return (EReference)getGlobalVariable().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVariable_TlsModel()
	{
        return (EAttribute)getGlobalVariable().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVariable_UnsignificantAddress()
	{
        return (EAttribute)getGlobalVariable().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVariable_Constant()
	{
        return (EAttribute)getGlobalVariable().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalVariable_Type()
	{
        return (EReference)getGlobalVariable().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalVariable_InitialValue()
	{
        return (EReference)getGlobalVariable().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVariable_Section()
	{
        return (EAttribute)getGlobalVariable().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVariable_Align()
	{
        return (EAttribute)getGlobalVariable().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant()
	{
		if (constantEClass == null)
		{
			constantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(19);
		}
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstant_Ref()
	{
        return (EReference)getConstant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantExpression()
	{
		if (constantExpressionEClass == null)
		{
			constantExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(20);
		}
		return constantExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantExpression_Opcode()
	{
        return (EAttribute)getConstantExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantExpression_convert()
	{
		if (constantExpression_convertEClass == null)
		{
			constantExpression_convertEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(21);
		}
		return constantExpression_convertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_convert_FromType()
	{
        return (EReference)getConstantExpression_convert().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_convert_Constant()
	{
        return (EReference)getConstantExpression_convert().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_convert_TargetType()
	{
        return (EReference)getConstantExpression_convert().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantExpression_getelementptr()
	{
		if (constantExpression_getelementptrEClass == null)
		{
			constantExpression_getelementptrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(22);
		}
		return constantExpression_getelementptrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_getelementptr_ConstantType()
	{
        return (EReference)getConstantExpression_getelementptr().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_getelementptr_Constant()
	{
        return (EReference)getConstantExpression_getelementptr().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_getelementptr_IndexTypes()
	{
        return (EReference)getConstantExpression_getelementptr().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_getelementptr_Indices()
	{
        return (EReference)getConstantExpression_getelementptr().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantExpression_select()
	{
		if (constantExpression_selectEClass == null)
		{
			constantExpression_selectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(23);
		}
		return constantExpression_selectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_select_Condition()
	{
        return (EReference)getConstantExpression_select().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_select_Op1()
	{
        return (EReference)getConstantExpression_select().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_select_Op2()
	{
        return (EReference)getConstantExpression_select().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantExpression_compare()
	{
		if (constantExpression_compareEClass == null)
		{
			constantExpression_compareEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(24);
		}
		return constantExpression_compareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantExpression_compare_Condition()
	{
        return (EAttribute)getConstantExpression_compare().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_compare_Op1()
	{
        return (EReference)getConstantExpression_compare().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_compare_Op2()
	{
        return (EReference)getConstantExpression_compare().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantExpression_extractelement()
	{
		if (constantExpression_extractelementEClass == null)
		{
			constantExpression_extractelementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(25);
		}
		return constantExpression_extractelementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_extractelement_Vector()
	{
        return (EReference)getConstantExpression_extractelement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_extractelement_Index()
	{
        return (EReference)getConstantExpression_extractelement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantExpression_insertelement()
	{
		if (constantExpression_insertelementEClass == null)
		{
			constantExpression_insertelementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(26);
		}
		return constantExpression_insertelementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_insertelement_VectorType()
	{
        return (EReference)getConstantExpression_insertelement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_insertelement_Vector()
	{
        return (EReference)getConstantExpression_insertelement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_insertelement_Element()
	{
        return (EReference)getConstantExpression_insertelement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_insertelement_Index()
	{
        return (EReference)getConstantExpression_insertelement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantExpression_shufflevector()
	{
		if (constantExpression_shufflevectorEClass == null)
		{
			constantExpression_shufflevectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(27);
		}
		return constantExpression_shufflevectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_shufflevector_Vector1()
	{
        return (EReference)getConstantExpression_shufflevector().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_shufflevector_Vector2()
	{
        return (EReference)getConstantExpression_shufflevector().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_shufflevector_Mask()
	{
        return (EReference)getConstantExpression_shufflevector().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantExpression_extractvalue()
	{
		if (constantExpression_extractvalueEClass == null)
		{
			constantExpression_extractvalueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(28);
		}
		return constantExpression_extractvalueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_extractvalue_Value()
	{
        return (EReference)getConstantExpression_extractvalue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantExpression_extractvalue_Indices()
	{
        return (EAttribute)getConstantExpression_extractvalue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantExpression_insertvalue()
	{
		if (constantExpression_insertvalueEClass == null)
		{
			constantExpression_insertvalueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(29);
		}
		return constantExpression_insertvalueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_insertvalue_Value()
	{
        return (EReference)getConstantExpression_insertvalue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_insertvalue_Element()
	{
        return (EReference)getConstantExpression_insertvalue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantExpression_insertvalue_Indices()
	{
        return (EAttribute)getConstantExpression_insertvalue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantExpression_binary()
	{
		if (constantExpression_binaryEClass == null)
		{
			constantExpression_binaryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(30);
		}
		return constantExpression_binaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_binary_Op1()
	{
        return (EReference)getConstantExpression_binary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantExpression_binary_Op2()
	{
        return (EReference)getConstantExpression_binary().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUndef()
	{
		if (undefEClass == null)
		{
			undefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(31);
		}
		return undefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockAddress()
	{
		if (blockAddressEClass == null)
		{
			blockAddressEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(32);
		}
		return blockAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockAddress_Function()
	{
        return (EReference)getBlockAddress().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockAddress_BasicBlock()
	{
        return (EReference)getBlockAddress().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZeroInitializer()
	{
		if (zeroInitializerEClass == null)
		{
			zeroInitializerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(33);
		}
		return zeroInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureConstant()
	{
		if (structureConstantEClass == null)
		{
			structureConstantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(34);
		}
		return structureConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureConstant_List()
	{
        return (EReference)getStructureConstant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureConstant_Packed()
	{
        return (EAttribute)getStructureConstant().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayConstant()
	{
		if (arrayConstantEClass == null)
		{
			arrayConstantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(35);
		}
		return arrayConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayConstant_List()
	{
        return (EReference)getArrayConstant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVectorConstant()
	{
		if (vectorConstantEClass == null)
		{
			vectorConstantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(36);
		}
		return vectorConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorConstant_List()
	{
        return (EReference)getVectorConstant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantList()
	{
		if (constantListEClass == null)
		{
			constantListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(37);
		}
		return constantListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantList_TypedConstants()
	{
        return (EReference)getConstantList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedConstant()
	{
		if (typedConstantEClass == null)
		{
			typedConstantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(38);
		}
		return typedConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedConstant_Type()
	{
        return (EReference)getTypedConstant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedConstant_Value()
	{
        return (EReference)getTypedConstant().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleConstant()
	{
		if (simpleConstantEClass == null)
		{
			simpleConstantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(39);
		}
		return simpleConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleConstant_Value()
	{
        return (EAttribute)getSimpleConstant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataNode()
	{
		if (metadataNodeEClass == null)
		{
			metadataNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(40);
		}
		return metadataNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataNode_Elements()
	{
        return (EReference)getMetadataNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataNodeElement()
	{
		if (metadataNodeElementEClass == null)
		{
			metadataNodeElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(41);
		}
		return metadataNodeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataNodeElement_Value()
	{
        return (EReference)getMetadataNodeElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataNodeElement_MetadataRef()
	{
        return (EReference)getMetadataNodeElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataNodeElement_Null()
	{
        return (EAttribute)getMetadataNodeElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataString()
	{
		if (metadataStringEClass == null)
		{
			metadataStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(42);
		}
		return metadataStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataString_Name()
	{
        return (EAttribute)getMetadataString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressSpace()
	{
		if (addressSpaceEClass == null)
		{
			addressSpaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(43);
		}
		return addressSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressSpace_Value()
	{
        return (EAttribute)getAddressSpace().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction()
	{
		if (functionEClass == null)
		{
			functionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(44);
		}
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Header()
	{
        return (EReference)getFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionDef()
	{
		if (functionDefEClass == null)
		{
			functionDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(45);
		}
		return functionDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDef_BasicBlocks()
	{
        return (EReference)getFunctionDef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionDecl()
	{
		if (functionDeclEClass == null)
		{
			functionDeclEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(46);
		}
		return functionDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionHeader()
	{
		if (functionHeaderEClass == null)
		{
			functionHeaderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(47);
		}
		return functionHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionHeader_Linkage()
	{
        return (EAttribute)getFunctionHeader().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionHeader_Visibility()
	{
        return (EAttribute)getFunctionHeader().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionHeader_Cconv()
	{
        return (EReference)getFunctionHeader().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionHeader_RettypeAttrs()
	{
        return (EReference)getFunctionHeader().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionHeader_Rettype()
	{
        return (EReference)getFunctionHeader().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionHeader_Name()
	{
        return (EAttribute)getFunctionHeader().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionHeader_Parameters()
	{
        return (EReference)getFunctionHeader().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionHeader_Attrs()
	{
        return (EReference)getFunctionHeader().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionHeader_Section()
	{
        return (EAttribute)getFunctionHeader().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionHeader_Align()
	{
        return (EAttribute)getFunctionHeader().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionHeader_Gc()
	{
        return (EAttribute)getFunctionHeader().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionHeader_FunctionPrefix()
	{
        return (EReference)getFunctionHeader().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionPrefix()
	{
		if (functionPrefixEClass == null)
		{
			functionPrefixEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(48);
		}
		return functionPrefixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPrefix_Value()
	{
        return (EReference)getFunctionPrefix().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameters()
	{
		if (parametersEClass == null)
		{
			parametersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(49);
		}
		return parametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameters_Parameters()
	{
        return (EReference)getParameters().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameters_Vararg()
	{
        return (EAttribute)getParameters().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionAttributes()
	{
		if (functionAttributesEClass == null)
		{
			functionAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(50);
		}
		return functionAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionAttributes_FunctionAttributes()
	{
        return (EReference)getFunctionAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionAttributes_Alignstack()
	{
        return (EReference)getFunctionAttributes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionAttributes_AlignstackValue()
	{
        return (EAttribute)getFunctionAttributes().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionAttributes_FunctionAttributeGroupRefs()
	{
        return (EReference)getFunctionAttributes().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlignStack()
	{
		if (alignStackEClass == null)
		{
			alignStackEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(51);
		}
		return alignStackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionAttribute()
	{
		if (functionAttributeEClass == null)
		{
			functionAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(52);
		}
		return functionAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionAttribute_Attribute()
	{
        return (EAttribute)getFunctionAttribute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicBlock()
	{
		if (basicBlockEClass == null)
		{
			basicBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(53);
		}
		return basicBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicBlock_Name()
	{
        return (EAttribute)getBasicBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicBlock_Instructions()
	{
        return (EReference)getBasicBlock().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataSuffix()
	{
		if (metadataSuffixEClass == null)
		{
			metadataSuffixEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(54);
		}
		return metadataSuffixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataSuffix_Name()
	{
        return (EAttribute)getMetadataSuffix().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataSuffix_Value()
	{
        return (EReference)getMetadataSuffix().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartingInstruction()
	{
		if (startingInstructionEClass == null)
		{
			startingInstructionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(55);
		}
		return startingInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiddleInstruction()
	{
		if (middleInstructionEClass == null)
		{
			middleInstructionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(56);
		}
		return middleInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedMiddleInstruction()
	{
		if (namedMiddleInstructionEClass == null)
		{
			namedMiddleInstructionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(57);
		}
		return namedMiddleInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminatorInstruction()
	{
		if (terminatorInstructionEClass == null)
		{
			terminatorInstructionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(58);
		}
		return terminatorInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedTerminatorInstruction()
	{
		if (namedTerminatorInstructionEClass == null)
		{
			namedTerminatorInstructionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(59);
		}
		return namedTerminatorInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_ret()
	{
		if (instruction_retEClass == null)
		{
			instruction_retEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(60);
		}
		return instruction_retEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_ret_Val()
	{
        return (EReference)getInstruction_ret().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_br()
	{
		if (instruction_brEClass == null)
		{
			instruction_brEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(61);
		}
		return instruction_brEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_br_Condition()
	{
        return (EReference)getInstruction_br().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_br_True()
	{
        return (EReference)getInstruction_br().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_br_False()
	{
        return (EReference)getInstruction_br().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_br_Unconditional()
	{
        return (EReference)getInstruction_br().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_switch()
	{
		if (instruction_switchEClass == null)
		{
			instruction_switchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(62);
		}
		return instruction_switchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_switch_ComparisonValue()
	{
        return (EReference)getInstruction_switch().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_switch_DefaultDest()
	{
        return (EReference)getInstruction_switch().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_switch_CaseConditions()
	{
        return (EReference)getInstruction_switch().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_switch_Destinations()
	{
        return (EReference)getInstruction_switch().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_indirectbr()
	{
		if (instruction_indirectbrEClass == null)
		{
			instruction_indirectbrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(63);
		}
		return instruction_indirectbrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_indirectbr_Address()
	{
        return (EReference)getInstruction_indirectbr().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_indirectbr_Destinations()
	{
        return (EReference)getInstruction_indirectbr().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_invoke_void()
	{
		if (instruction_invoke_voidEClass == null)
		{
			instruction_invoke_voidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(64);
		}
		return instruction_invoke_voidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_invoke_void_Type()
	{
        return (EReference)getInstruction_invoke_void().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_invoke_nonVoid()
	{
		if (instruction_invoke_nonVoidEClass == null)
		{
			instruction_invoke_nonVoidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(65);
		}
		return instruction_invoke_nonVoidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_invoke_nonVoid_Type()
	{
        return (EReference)getInstruction_invoke_nonVoid().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_resume()
	{
		if (instruction_resumeEClass == null)
		{
			instruction_resumeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(66);
		}
		return instruction_resumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_resume_Value()
	{
        return (EReference)getInstruction_resume().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_unreachable()
	{
		if (instruction_unreachableEClass == null)
		{
			instruction_unreachableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(67);
		}
		return instruction_unreachableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicBlockRef()
	{
		if (basicBlockRefEClass == null)
		{
			basicBlockRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(68);
		}
		return basicBlockRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicBlockRef_Ref()
	{
        return (EReference)getBasicBlockRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryInstruction()
	{
		if (binaryInstructionEClass == null)
		{
			binaryInstructionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(69);
		}
		return binaryInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryInstruction_Type()
	{
        return (EReference)getBinaryInstruction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryInstruction_Op1()
	{
        return (EReference)getBinaryInstruction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryInstruction_Op2()
	{
        return (EReference)getBinaryInstruction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_add()
	{
		if (instruction_addEClass == null)
		{
			instruction_addEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(70);
		}
		return instruction_addEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_fadd()
	{
		if (instruction_faddEClass == null)
		{
			instruction_faddEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(71);
		}
		return instruction_faddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_fadd_FastMathFlags()
	{
        return (EReference)getInstruction_fadd().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFastMathFlag()
	{
		if (fastMathFlagEClass == null)
		{
			fastMathFlagEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(72);
		}
		return fastMathFlagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFastMathFlag_Kind()
	{
        return (EAttribute)getFastMathFlag().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_sub()
	{
		if (instruction_subEClass == null)
		{
			instruction_subEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(73);
		}
		return instruction_subEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_fsub()
	{
		if (instruction_fsubEClass == null)
		{
			instruction_fsubEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(74);
		}
		return instruction_fsubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_fsub_FastMathFlags()
	{
        return (EReference)getInstruction_fsub().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_mul()
	{
		if (instruction_mulEClass == null)
		{
			instruction_mulEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(75);
		}
		return instruction_mulEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_fmul()
	{
		if (instruction_fmulEClass == null)
		{
			instruction_fmulEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(76);
		}
		return instruction_fmulEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_fmul_FastMathFlags()
	{
        return (EReference)getInstruction_fmul().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_udiv()
	{
		if (instruction_udivEClass == null)
		{
			instruction_udivEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(77);
		}
		return instruction_udivEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_sdiv()
	{
		if (instruction_sdivEClass == null)
		{
			instruction_sdivEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(78);
		}
		return instruction_sdivEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_fdiv()
	{
		if (instruction_fdivEClass == null)
		{
			instruction_fdivEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(79);
		}
		return instruction_fdivEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_fdiv_FastMathFlags()
	{
        return (EReference)getInstruction_fdiv().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_urem()
	{
		if (instruction_uremEClass == null)
		{
			instruction_uremEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(80);
		}
		return instruction_uremEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_srem()
	{
		if (instruction_sremEClass == null)
		{
			instruction_sremEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(81);
		}
		return instruction_sremEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_frem()
	{
		if (instruction_fremEClass == null)
		{
			instruction_fremEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(82);
		}
		return instruction_fremEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitwiseBinaryInstruction()
	{
		if (bitwiseBinaryInstructionEClass == null)
		{
			bitwiseBinaryInstructionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(83);
		}
		return bitwiseBinaryInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitwiseBinaryInstruction_Type()
	{
        return (EReference)getBitwiseBinaryInstruction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitwiseBinaryInstruction_Op1()
	{
        return (EReference)getBitwiseBinaryInstruction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitwiseBinaryInstruction_Op2()
	{
        return (EReference)getBitwiseBinaryInstruction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_shl()
	{
		if (instruction_shlEClass == null)
		{
			instruction_shlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(84);
		}
		return instruction_shlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_lshr()
	{
		if (instruction_lshrEClass == null)
		{
			instruction_lshrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(85);
		}
		return instruction_lshrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_ashr()
	{
		if (instruction_ashrEClass == null)
		{
			instruction_ashrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(86);
		}
		return instruction_ashrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_and()
	{
		if (instruction_andEClass == null)
		{
			instruction_andEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(87);
		}
		return instruction_andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_or()
	{
		if (instruction_orEClass == null)
		{
			instruction_orEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(88);
		}
		return instruction_orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_xor()
	{
		if (instruction_xorEClass == null)
		{
			instruction_xorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(89);
		}
		return instruction_xorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVectorInstructions()
	{
		if (vectorInstructionsEClass == null)
		{
			vectorInstructionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(90);
		}
		return vectorInstructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_extractelement()
	{
		if (instruction_extractelementEClass == null)
		{
			instruction_extractelementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(91);
		}
		return instruction_extractelementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_extractelement_Vector()
	{
        return (EReference)getInstruction_extractelement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_extractelement_Index()
	{
        return (EReference)getInstruction_extractelement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_insertelement()
	{
		if (instruction_insertelementEClass == null)
		{
			instruction_insertelementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(92);
		}
		return instruction_insertelementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_insertelement_Vector()
	{
        return (EReference)getInstruction_insertelement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_insertelement_Element()
	{
        return (EReference)getInstruction_insertelement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_insertelement_Index()
	{
        return (EReference)getInstruction_insertelement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_shufflevector()
	{
		if (instruction_shufflevectorEClass == null)
		{
			instruction_shufflevectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(93);
		}
		return instruction_shufflevectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_shufflevector_Vector1()
	{
        return (EReference)getInstruction_shufflevector().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_shufflevector_Vector2()
	{
        return (EReference)getInstruction_shufflevector().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_shufflevector_Mask()
	{
        return (EReference)getInstruction_shufflevector().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateInstruction()
	{
		if (aggregateInstructionEClass == null)
		{
			aggregateInstructionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(94);
		}
		return aggregateInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateInstruction_Aggregate()
	{
        return (EReference)getAggregateInstruction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateInstruction_Indices()
	{
        return (EReference)getAggregateInstruction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_extractvalue()
	{
		if (instruction_extractvalueEClass == null)
		{
			instruction_extractvalueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(95);
		}
		return instruction_extractvalueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_insertvalue()
	{
		if (instruction_insertvalueEClass == null)
		{
			instruction_insertvalueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(96);
		}
		return instruction_insertvalueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_insertvalue_Element()
	{
        return (EReference)getInstruction_insertvalue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_alloca()
	{
		if (instruction_allocaEClass == null)
		{
			instruction_allocaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(97);
		}
		return instruction_allocaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_alloca_Type()
	{
        return (EReference)getInstruction_alloca().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_alloca_NumElements()
	{
        return (EReference)getInstruction_alloca().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_alloca_Alignment()
	{
        return (EAttribute)getInstruction_alloca().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_load()
	{
		if (instruction_loadEClass == null)
		{
			instruction_loadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(98);
		}
		return instruction_loadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_load_Pointer()
	{
        return (EReference)getInstruction_load().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_load_Alignment()
	{
        return (EAttribute)getInstruction_load().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_load_NontemporalIndex()
	{
        return (EReference)getInstruction_load().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_load_InvariantLoadIndex()
	{
        return (EReference)getInstruction_load().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_load_Ordering()
	{
        return (EAttribute)getInstruction_load().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_store()
	{
		if (instruction_storeEClass == null)
		{
			instruction_storeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(99);
		}
		return instruction_storeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_store_Value()
	{
        return (EReference)getInstruction_store().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_store_Pointer()
	{
        return (EReference)getInstruction_store().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_store_Alignment()
	{
        return (EAttribute)getInstruction_store().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_store_NontemporalIndex()
	{
        return (EReference)getInstruction_store().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_store_Ordering()
	{
        return (EAttribute)getInstruction_store().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_fence()
	{
		if (instruction_fenceEClass == null)
		{
			instruction_fenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(100);
		}
		return instruction_fenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_fence_Ordering()
	{
        return (EAttribute)getInstruction_fence().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_cmpxchg()
	{
		if (instruction_cmpxchgEClass == null)
		{
			instruction_cmpxchgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(101);
		}
		return instruction_cmpxchgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_cmpxchg_Pointer()
	{
        return (EReference)getInstruction_cmpxchg().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_cmpxchg_ComparedWith()
	{
        return (EReference)getInstruction_cmpxchg().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_cmpxchg_NewValue()
	{
        return (EReference)getInstruction_cmpxchg().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_cmpxchg_Ordering()
	{
        return (EAttribute)getInstruction_cmpxchg().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_atomicrmw()
	{
		if (instruction_atomicrmwEClass == null)
		{
			instruction_atomicrmwEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(102);
		}
		return instruction_atomicrmwEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_atomicrmw_Operation()
	{
        return (EAttribute)getInstruction_atomicrmw().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_atomicrmw_Pointer()
	{
        return (EReference)getInstruction_atomicrmw().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_atomicrmw_Argument()
	{
        return (EReference)getInstruction_atomicrmw().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_atomicrmw_Ordering()
	{
        return (EAttribute)getInstruction_atomicrmw().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_getelementptr()
	{
		if (instruction_getelementptrEClass == null)
		{
			instruction_getelementptrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(103);
		}
		return instruction_getelementptrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_getelementptr_Base()
	{
        return (EReference)getInstruction_getelementptr().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_getelementptr_Indices()
	{
        return (EReference)getInstruction_getelementptr().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversionInstruction()
	{
		if (conversionInstructionEClass == null)
		{
			conversionInstructionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(104);
		}
		return conversionInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionInstruction_FromType()
	{
        return (EReference)getConversionInstruction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionInstruction_Value()
	{
        return (EReference)getConversionInstruction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionInstruction_TargetType()
	{
        return (EReference)getConversionInstruction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherInstruction()
	{
		if (otherInstructionEClass == null)
		{
			otherInstructionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(105);
		}
		return otherInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_icmp()
	{
		if (instruction_icmpEClass == null)
		{
			instruction_icmpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(106);
		}
		return instruction_icmpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_icmp_Condition()
	{
        return (EAttribute)getInstruction_icmp().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_icmp_Type()
	{
        return (EReference)getInstruction_icmp().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_icmp_Op1()
	{
        return (EReference)getInstruction_icmp().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_icmp_Op2()
	{
        return (EReference)getInstruction_icmp().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_fcmp()
	{
		if (instruction_fcmpEClass == null)
		{
			instruction_fcmpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(107);
		}
		return instruction_fcmpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_fcmp_Condition()
	{
        return (EAttribute)getInstruction_fcmp().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_fcmp_Type()
	{
        return (EReference)getInstruction_fcmp().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_fcmp_Op1()
	{
        return (EReference)getInstruction_fcmp().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_fcmp_Op2()
	{
        return (EReference)getInstruction_fcmp().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_phi()
	{
		if (instruction_phiEClass == null)
		{
			instruction_phiEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(108);
		}
		return instruction_phiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_phi_Type()
	{
        return (EReference)getInstruction_phi().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_phi_Values()
	{
        return (EReference)getInstruction_phi().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_phi_Labels()
	{
        return (EReference)getInstruction_phi().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_select()
	{
		if (instruction_selectEClass == null)
		{
			instruction_selectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(109);
		}
		return instruction_selectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_select_Condition()
	{
        return (EReference)getInstruction_select().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_select_Value1()
	{
        return (EReference)getInstruction_select().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_select_Value2()
	{
        return (EReference)getInstruction_select().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_call()
	{
		if (instruction_callEClass == null)
		{
			instruction_callEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(110);
		}
		return instruction_callEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_call_IsTail()
	{
        return (EAttribute)getInstruction_call().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_call_Cconv()
	{
        return (EReference)getInstruction_call().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_call_ReturnAttributes()
	{
        return (EReference)getInstruction_call().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_call_Callee()
	{
        return (EReference)getInstruction_call().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_call_Args()
	{
        return (EReference)getInstruction_call().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_call_FunctionAttributes()
	{
        return (EReference)getInstruction_call().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_call_nonVoid()
	{
		if (instruction_call_nonVoidEClass == null)
		{
			instruction_call_nonVoidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(111);
		}
		return instruction_call_nonVoidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_call_nonVoid_Type()
	{
        return (EReference)getInstruction_call_nonVoid().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_call_void()
	{
		if (instruction_call_voidEClass == null)
		{
			instruction_call_voidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(112);
		}
		return instruction_call_voidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_call_void_Type()
	{
        return (EReference)getInstruction_call_void().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgList()
	{
		if (argListEClass == null)
		{
			argListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(113);
		}
		return argListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgList_Arguments()
	{
        return (EReference)getArgList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallee()
	{
		if (calleeEClass == null)
		{
			calleeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(114);
		}
		return calleeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInlineAssembler()
	{
		if (inlineAssemblerEClass == null)
		{
			inlineAssemblerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(115);
		}
		return inlineAssemblerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAssembler_Assembler()
	{
        return (EAttribute)getInlineAssembler().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAssembler_Flags()
	{
        return (EAttribute)getInlineAssembler().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_va_arg()
	{
		if (instruction_va_argEClass == null)
		{
			instruction_va_argEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(116);
		}
		return instruction_va_argEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_va_arg_Arglist()
	{
        return (EReference)getInstruction_va_arg().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_va_arg_Type()
	{
        return (EReference)getInstruction_va_arg().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_landingpad()
	{
		if (instruction_landingpadEClass == null)
		{
			instruction_landingpadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(117);
		}
		return instruction_landingpadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_landingpad_ResultType()
	{
        return (EReference)getInstruction_landingpad().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_landingpad_Personality()
	{
        return (EReference)getInstruction_landingpad().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_landingpad_Clauses()
	{
        return (EReference)getInstruction_landingpad().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLandingpadClause()
	{
		if (landingpadClauseEClass == null)
		{
			landingpadClauseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(118);
		}
		return landingpadClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLandingpadClause_LandingPadType()
	{
        return (EAttribute)getLandingpadClause().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLandingpadClause_CatchType()
	{
        return (EReference)getLandingpadClause().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLandingpadClause_ArrayType()
	{
        return (EReference)getLandingpadClause().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLandingpadClause_ArrayConstant()
	{
        return (EReference)getLandingpadClause().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedValue()
	{
		if (typedValueEClass == null)
		{
			typedValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(119);
		}
		return typedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedValue_Type()
	{
        return (EReference)getTypedValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedValue_Ref()
	{
        return (EReference)getTypedValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterType()
	{
		if (parameterTypeEClass == null)
		{
			parameterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(120);
		}
		return parameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterType_Type()
	{
        return (EReference)getParameterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterType_Attrs()
	{
        return (EReference)getParameterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterAttributes()
	{
		if (parameterAttributesEClass == null)
		{
			parameterAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(121);
		}
		return parameterAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterAttributes_Attributes()
	{
        return (EAttribute)getParameterAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument()
	{
		if (argumentEClass == null)
		{
			argumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(122);
		}
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_Type()
	{
        return (EReference)getArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_Ref()
	{
        return (EReference)getArgument().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter()
	{
		if (parameterEClass == null)
		{
			parameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(123);
		}
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Type()
	{
        return (EReference)getParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonVoidType()
	{
		if (nonVoidTypeEClass == null)
		{
			nonVoidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(124);
		}
		return nonVoidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonVoidType_BaseType()
	{
        return (EReference)getNonVoidType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonVoidType_Suffixes()
	{
        return (EReference)getNonVoidType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonVoidType_Stars()
	{
        return (EReference)getNonVoidType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStar()
	{
		if (starEClass == null)
		{
			starEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(125);
		}
		return starEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStar_AddressSpace()
	{
        return (EReference)getStar().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType()
	{
		if (typeEClass == null)
		{
			typeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(126);
		}
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_BaseType()
	{
        return (EReference)getType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Stars()
	{
        return (EReference)getType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Suffixes()
	{
        return (EReference)getType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeSuffix()
	{
		if (typeSuffixEClass == null)
		{
			typeSuffixEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(127);
		}
		return typeSuffixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeSuffix_ContainedTypes()
	{
        return (EReference)getTypeSuffix().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeSuffix_Vararg()
	{
        return (EAttribute)getTypeSuffix().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeSuffix_Stars()
	{
        return (EReference)getTypeSuffix().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonLeftRecursiveType()
	{
		if (nonLeftRecursiveTypeEClass == null)
		{
			nonLeftRecursiveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(128);
		}
		return nonLeftRecursiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonLeftRecursiveType_Type()
	{
        return (EReference)getNonLeftRecursiveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonLeftRecursiveType_Typedef()
	{
        return (EReference)getNonLeftRecursiveType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonLeftRecursiveNonVoidType()
	{
		if (nonLeftRecursiveNonVoidTypeEClass == null)
		{
			nonLeftRecursiveNonVoidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(129);
		}
		return nonLeftRecursiveNonVoidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonLeftRecursiveNonVoidType_Type()
	{
        return (EReference)getNonLeftRecursiveNonVoidType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonLeftRecursiveNonVoidType_Typedef()
	{
        return (EReference)getNonLeftRecursiveNonVoidType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDef()
	{
		if (typeDefEClass == null)
		{
			typeDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(130);
		}
		return typeDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDef_Name()
	{
        return (EAttribute)getTypeDef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDef_Type()
	{
        return (EReference)getTypeDef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntType()
	{
		if (intTypeEClass == null)
		{
			intTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(131);
		}
		return intTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueType()
	{
		if (opaqueTypeEClass == null)
		{
			opaqueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(132);
		}
		return opaqueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructType()
	{
		if (structTypeEClass == null)
		{
			structTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(133);
		}
		return structTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructType_Types()
	{
        return (EReference)getStructType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructType_Packed()
	{
        return (EAttribute)getStructType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVectorType()
	{
		if (vectorTypeEClass == null)
		{
			vectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(134);
		}
		return vectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVectorType_Size()
	{
        return (EAttribute)getVectorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorType_ElemType()
	{
        return (EReference)getVectorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayType()
	{
		if (arrayTypeEClass == null)
		{
			arrayTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(135);
		}
		return arrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayType_Size()
	{
        return (EAttribute)getArrayType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayType_ElemType()
	{
        return (EReference)getArrayType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX86mmxType()
	{
		if (x86mmxTypeEClass == null)
		{
			x86mmxTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(136);
		}
		return x86mmxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoidType()
	{
		if (voidTypeEClass == null)
		{
			voidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(137);
		}
		return voidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataType()
	{
		if (metadataTypeEClass == null)
		{
			metadataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(138);
		}
		return metadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatingType()
	{
		if (floatingTypeEClass == null)
		{
			floatingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(139);
		}
		return floatingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCConv()
	{
		if (cConvEClass == null)
		{
			cConvEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(140);
		}
		return cConvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCConv_Val()
	{
        return (EAttribute)getCConv().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCConv_CustomNumber()
	{
        return (EAttribute)getCConv().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction_invoke()
	{
		if (instruction_invokeEClass == null)
		{
			instruction_invokeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI).getEClassifiers().get(141);
		}
		return instruction_invokeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_invoke_Cconv()
	{
        return (EReference)getInstruction_invoke().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_invoke_Callee()
	{
        return (EReference)getInstruction_invoke().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_invoke_Args()
	{
        return (EReference)getInstruction_invoke().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_invoke_Attributes()
	{
        return (EReference)getInstruction_invoke().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_invoke_ToLabel()
	{
        return (EReference)getInstruction_invoke().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_invoke_ExceptionLabel()
	{
        return (EReference)getInstruction_invoke().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLVM_IRFactory getLLVM_IRFactory()
	{
		return (LLVM_IRFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage()
	{
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null)
		{
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try
		{
			resource.load(null);
		}
		catch (IOException exception)
		{
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents()
	{
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier)
	{
		if (eClassifier.getInstanceClassName() == null)
		{
			eClassifier.setInstanceClassName("com.intel.llvm.ireditor.lLVM_IR." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //LLVM_IRPackageImpl
