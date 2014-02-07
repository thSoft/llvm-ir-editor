package com.intel.llvm.ireditor.serializer;

import com.google.inject.Inject;
import com.intel.llvm.ireditor.services.LLVM_IRGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class LLVM_IRSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LLVM_IRGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ConstantExpression_binary_ExactKeyword_0_1_1_q;
	protected AbstractElementAlias match_ConstantExpression_binary___NswKeyword_0_0_1_1_or_NuwKeyword_0_0_1_0__a;
	protected AbstractElementAlias match_ConstantExpression_getelementptr_InboundsKeyword_1_q;
	protected AbstractElementAlias match_FloatingType_DoubleKeyword_0_2_or_FloatKeyword_0_1_or_Fp128Keyword_0_3_or_HalfKeyword_0_0_or_Ppc_fp128Keyword_0_5_or_X86_fp80Keyword_0_4;
	protected AbstractElementAlias match_FunctionHeader_Unnamed_addrKeyword_3_q;
	protected AbstractElementAlias match_InlineAssembler_AlignstackKeyword_2_q;
	protected AbstractElementAlias match_InlineAssembler_InteldialectKeyword_3_q;
	protected AbstractElementAlias match_InlineAssembler_SideeffectKeyword_1_q;
	protected AbstractElementAlias match_Instruction_add___NswKeyword_2_1_or_NuwKeyword_2_0__a;
	protected AbstractElementAlias match_Instruction_ashr_ExactKeyword_2_q;
	protected AbstractElementAlias match_Instruction_atomicrmw_SinglethreadKeyword_7_q;
	protected AbstractElementAlias match_Instruction_atomicrmw_VolatileKeyword_2_q;
	protected AbstractElementAlias match_Instruction_cmpxchg_SinglethreadKeyword_8_q;
	protected AbstractElementAlias match_Instruction_cmpxchg_VolatileKeyword_2_q;
	protected AbstractElementAlias match_Instruction_fence_SinglethreadKeyword_1_q;
	protected AbstractElementAlias match_Instruction_getelementptr_InboundsKeyword_2_q;
	protected AbstractElementAlias match_Instruction_invoke_nonVoid___InregKeyword_3_2_or_SignextKeyword_3_1_or_ZeroextKeyword_3_0__a;
	protected AbstractElementAlias match_Instruction_invoke_void___InregKeyword_2_2_or_SignextKeyword_2_1_or_ZeroextKeyword_2_0__a;
	protected AbstractElementAlias match_Instruction_load_SinglethreadKeyword_2_1_3_q;
	protected AbstractElementAlias match_Instruction_load_VolatileKeyword_2_0_0_q;
	protected AbstractElementAlias match_Instruction_load_VolatileKeyword_2_1_1_q;
	protected AbstractElementAlias match_Instruction_lshr_ExactKeyword_2_q;
	protected AbstractElementAlias match_Instruction_mul___NswKeyword_2_1_or_NuwKeyword_2_0__a;
	protected AbstractElementAlias match_Instruction_sdiv_ExactKeyword_2_q;
	protected AbstractElementAlias match_Instruction_shl___NswKeyword_2_1_or_NuwKeyword_2_0__a;
	protected AbstractElementAlias match_Instruction_store_SinglethreadKeyword_1_1_4_q;
	protected AbstractElementAlias match_Instruction_store_VolatileKeyword_1_0_0_q;
	protected AbstractElementAlias match_Instruction_store_VolatileKeyword_1_1_1_q;
	protected AbstractElementAlias match_Instruction_sub___NswKeyword_2_1_or_NuwKeyword_2_0__a;
	protected AbstractElementAlias match_Instruction_udiv_ExactKeyword_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LLVM_IRGrammarAccess) access;
		match_ConstantExpression_binary_ExactKeyword_0_1_1_q = new TokenAlias(false, true, grammarAccess.getConstantExpression_binaryAccess().getExactKeyword_0_1_1());
		match_ConstantExpression_binary___NswKeyword_0_0_1_1_or_NuwKeyword_0_0_1_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getConstantExpression_binaryAccess().getNswKeyword_0_0_1_1()), new TokenAlias(false, false, grammarAccess.getConstantExpression_binaryAccess().getNuwKeyword_0_0_1_0()));
		match_ConstantExpression_getelementptr_InboundsKeyword_1_q = new TokenAlias(false, true, grammarAccess.getConstantExpression_getelementptrAccess().getInboundsKeyword_1());
		match_FloatingType_DoubleKeyword_0_2_or_FloatKeyword_0_1_or_Fp128Keyword_0_3_or_HalfKeyword_0_0_or_Ppc_fp128Keyword_0_5_or_X86_fp80Keyword_0_4 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFloatingTypeAccess().getDoubleKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getFloatingTypeAccess().getFloatKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getFloatingTypeAccess().getFp128Keyword_0_3()), new TokenAlias(false, false, grammarAccess.getFloatingTypeAccess().getHalfKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getFloatingTypeAccess().getPpc_fp128Keyword_0_5()), new TokenAlias(false, false, grammarAccess.getFloatingTypeAccess().getX86_fp80Keyword_0_4()));
		match_FunctionHeader_Unnamed_addrKeyword_3_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getUnnamed_addrKeyword_3());
		match_InlineAssembler_AlignstackKeyword_2_q = new TokenAlias(false, true, grammarAccess.getInlineAssemblerAccess().getAlignstackKeyword_2());
		match_InlineAssembler_InteldialectKeyword_3_q = new TokenAlias(false, true, grammarAccess.getInlineAssemblerAccess().getInteldialectKeyword_3());
		match_InlineAssembler_SideeffectKeyword_1_q = new TokenAlias(false, true, grammarAccess.getInlineAssemblerAccess().getSideeffectKeyword_1());
		match_Instruction_add___NswKeyword_2_1_or_NuwKeyword_2_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getInstruction_addAccess().getNswKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getInstruction_addAccess().getNuwKeyword_2_0()));
		match_Instruction_ashr_ExactKeyword_2_q = new TokenAlias(false, true, grammarAccess.getInstruction_ashrAccess().getExactKeyword_2());
		match_Instruction_atomicrmw_SinglethreadKeyword_7_q = new TokenAlias(false, true, grammarAccess.getInstruction_atomicrmwAccess().getSinglethreadKeyword_7());
		match_Instruction_atomicrmw_VolatileKeyword_2_q = new TokenAlias(false, true, grammarAccess.getInstruction_atomicrmwAccess().getVolatileKeyword_2());
		match_Instruction_cmpxchg_SinglethreadKeyword_8_q = new TokenAlias(false, true, grammarAccess.getInstruction_cmpxchgAccess().getSinglethreadKeyword_8());
		match_Instruction_cmpxchg_VolatileKeyword_2_q = new TokenAlias(false, true, grammarAccess.getInstruction_cmpxchgAccess().getVolatileKeyword_2());
		match_Instruction_fence_SinglethreadKeyword_1_q = new TokenAlias(false, true, grammarAccess.getInstruction_fenceAccess().getSinglethreadKeyword_1());
		match_Instruction_getelementptr_InboundsKeyword_2_q = new TokenAlias(false, true, grammarAccess.getInstruction_getelementptrAccess().getInboundsKeyword_2());
		match_Instruction_invoke_nonVoid___InregKeyword_3_2_or_SignextKeyword_3_1_or_ZeroextKeyword_3_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getInstruction_invoke_nonVoidAccess().getInregKeyword_3_2()), new TokenAlias(false, false, grammarAccess.getInstruction_invoke_nonVoidAccess().getSignextKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getInstruction_invoke_nonVoidAccess().getZeroextKeyword_3_0()));
		match_Instruction_invoke_void___InregKeyword_2_2_or_SignextKeyword_2_1_or_ZeroextKeyword_2_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getInstruction_invoke_voidAccess().getInregKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getInstruction_invoke_voidAccess().getSignextKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getInstruction_invoke_voidAccess().getZeroextKeyword_2_0()));
		match_Instruction_load_SinglethreadKeyword_2_1_3_q = new TokenAlias(false, true, grammarAccess.getInstruction_loadAccess().getSinglethreadKeyword_2_1_3());
		match_Instruction_load_VolatileKeyword_2_0_0_q = new TokenAlias(false, true, grammarAccess.getInstruction_loadAccess().getVolatileKeyword_2_0_0());
		match_Instruction_load_VolatileKeyword_2_1_1_q = new TokenAlias(false, true, grammarAccess.getInstruction_loadAccess().getVolatileKeyword_2_1_1());
		match_Instruction_lshr_ExactKeyword_2_q = new TokenAlias(false, true, grammarAccess.getInstruction_lshrAccess().getExactKeyword_2());
		match_Instruction_mul___NswKeyword_2_1_or_NuwKeyword_2_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getInstruction_mulAccess().getNswKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getInstruction_mulAccess().getNuwKeyword_2_0()));
		match_Instruction_sdiv_ExactKeyword_2_q = new TokenAlias(false, true, grammarAccess.getInstruction_sdivAccess().getExactKeyword_2());
		match_Instruction_shl___NswKeyword_2_1_or_NuwKeyword_2_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getInstruction_shlAccess().getNswKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getInstruction_shlAccess().getNuwKeyword_2_0()));
		match_Instruction_store_SinglethreadKeyword_1_1_4_q = new TokenAlias(false, true, grammarAccess.getInstruction_storeAccess().getSinglethreadKeyword_1_1_4());
		match_Instruction_store_VolatileKeyword_1_0_0_q = new TokenAlias(false, true, grammarAccess.getInstruction_storeAccess().getVolatileKeyword_1_0_0());
		match_Instruction_store_VolatileKeyword_1_1_1_q = new TokenAlias(false, true, grammarAccess.getInstruction_storeAccess().getVolatileKeyword_1_1_1());
		match_Instruction_sub___NswKeyword_2_1_or_NuwKeyword_2_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getInstruction_subAccess().getNswKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getInstruction_subAccess().getNuwKeyword_2_0()));
		match_Instruction_udiv_ExactKeyword_2_q = new TokenAlias(false, true, grammarAccess.getInstruction_udivAccess().getExactKeyword_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getINT_TYPERule())
			return getINT_TYPEToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal INT_TYPE:
	 * 	'i' INTEGER
	 * ;
	 */
	protected String getINT_TYPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "i";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ConstantExpression_binary_ExactKeyword_0_1_1_q.equals(syntax))
				emit_ConstantExpression_binary_ExactKeyword_0_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConstantExpression_binary___NswKeyword_0_0_1_1_or_NuwKeyword_0_0_1_0__a.equals(syntax))
				emit_ConstantExpression_binary___NswKeyword_0_0_1_1_or_NuwKeyword_0_0_1_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConstantExpression_getelementptr_InboundsKeyword_1_q.equals(syntax))
				emit_ConstantExpression_getelementptr_InboundsKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FloatingType_DoubleKeyword_0_2_or_FloatKeyword_0_1_or_Fp128Keyword_0_3_or_HalfKeyword_0_0_or_Ppc_fp128Keyword_0_5_or_X86_fp80Keyword_0_4.equals(syntax))
				emit_FloatingType_DoubleKeyword_0_2_or_FloatKeyword_0_1_or_Fp128Keyword_0_3_or_HalfKeyword_0_0_or_Ppc_fp128Keyword_0_5_or_X86_fp80Keyword_0_4(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_Unnamed_addrKeyword_3_q.equals(syntax))
				emit_FunctionHeader_Unnamed_addrKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InlineAssembler_AlignstackKeyword_2_q.equals(syntax))
				emit_InlineAssembler_AlignstackKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InlineAssembler_InteldialectKeyword_3_q.equals(syntax))
				emit_InlineAssembler_InteldialectKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InlineAssembler_SideeffectKeyword_1_q.equals(syntax))
				emit_InlineAssembler_SideeffectKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_add___NswKeyword_2_1_or_NuwKeyword_2_0__a.equals(syntax))
				emit_Instruction_add___NswKeyword_2_1_or_NuwKeyword_2_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_ashr_ExactKeyword_2_q.equals(syntax))
				emit_Instruction_ashr_ExactKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_atomicrmw_SinglethreadKeyword_7_q.equals(syntax))
				emit_Instruction_atomicrmw_SinglethreadKeyword_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_atomicrmw_VolatileKeyword_2_q.equals(syntax))
				emit_Instruction_atomicrmw_VolatileKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_cmpxchg_SinglethreadKeyword_8_q.equals(syntax))
				emit_Instruction_cmpxchg_SinglethreadKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_cmpxchg_VolatileKeyword_2_q.equals(syntax))
				emit_Instruction_cmpxchg_VolatileKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_fence_SinglethreadKeyword_1_q.equals(syntax))
				emit_Instruction_fence_SinglethreadKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_getelementptr_InboundsKeyword_2_q.equals(syntax))
				emit_Instruction_getelementptr_InboundsKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_invoke_nonVoid___InregKeyword_3_2_or_SignextKeyword_3_1_or_ZeroextKeyword_3_0__a.equals(syntax))
				emit_Instruction_invoke_nonVoid___InregKeyword_3_2_or_SignextKeyword_3_1_or_ZeroextKeyword_3_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_invoke_void___InregKeyword_2_2_or_SignextKeyword_2_1_or_ZeroextKeyword_2_0__a.equals(syntax))
				emit_Instruction_invoke_void___InregKeyword_2_2_or_SignextKeyword_2_1_or_ZeroextKeyword_2_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_load_SinglethreadKeyword_2_1_3_q.equals(syntax))
				emit_Instruction_load_SinglethreadKeyword_2_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_load_VolatileKeyword_2_0_0_q.equals(syntax))
				emit_Instruction_load_VolatileKeyword_2_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_load_VolatileKeyword_2_1_1_q.equals(syntax))
				emit_Instruction_load_VolatileKeyword_2_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_lshr_ExactKeyword_2_q.equals(syntax))
				emit_Instruction_lshr_ExactKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_mul___NswKeyword_2_1_or_NuwKeyword_2_0__a.equals(syntax))
				emit_Instruction_mul___NswKeyword_2_1_or_NuwKeyword_2_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_sdiv_ExactKeyword_2_q.equals(syntax))
				emit_Instruction_sdiv_ExactKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_shl___NswKeyword_2_1_or_NuwKeyword_2_0__a.equals(syntax))
				emit_Instruction_shl___NswKeyword_2_1_or_NuwKeyword_2_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_store_SinglethreadKeyword_1_1_4_q.equals(syntax))
				emit_Instruction_store_SinglethreadKeyword_1_1_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_store_VolatileKeyword_1_0_0_q.equals(syntax))
				emit_Instruction_store_VolatileKeyword_1_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_store_VolatileKeyword_1_1_1_q.equals(syntax))
				emit_Instruction_store_VolatileKeyword_1_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_sub___NswKeyword_2_1_or_NuwKeyword_2_0__a.equals(syntax))
				emit_Instruction_sub___NswKeyword_2_1_or_NuwKeyword_2_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_udiv_ExactKeyword_2_q.equals(syntax))
				emit_Instruction_udiv_ExactKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'exact'?
	 */
	protected void emit_ConstantExpression_binary_ExactKeyword_0_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('nuw' | 'nsw')*
	 */
	protected void emit_ConstantExpression_binary___NswKeyword_0_0_1_1_or_NuwKeyword_0_0_1_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'inbounds'?
	 */
	protected void emit_ConstantExpression_getelementptr_InboundsKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     'x86_fp80' | 
	     'float' | 
	     'half' | 
	     'ppc_fp128' | 
	     'double' | 
	     'fp128'
	 )
	 */
	protected void emit_FloatingType_DoubleKeyword_0_2_or_FloatKeyword_0_1_or_Fp128Keyword_0_3_or_HalfKeyword_0_0_or_Ppc_fp128Keyword_0_5_or_X86_fp80Keyword_0_4(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'unnamed_addr'?
	 */
	protected void emit_FunctionHeader_Unnamed_addrKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'alignstack'?
	 */
	protected void emit_InlineAssembler_AlignstackKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'inteldialect'?
	 */
	protected void emit_InlineAssembler_InteldialectKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'sideeffect'?
	 */
	protected void emit_InlineAssembler_SideeffectKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('nsw' | 'nuw')*
	 */
	protected void emit_Instruction_add___NswKeyword_2_1_or_NuwKeyword_2_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'exact'?
	 */
	protected void emit_Instruction_ashr_ExactKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_Instruction_atomicrmw_SinglethreadKeyword_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'volatile'?
	 */
	protected void emit_Instruction_atomicrmw_VolatileKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_Instruction_cmpxchg_SinglethreadKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'volatile'?
	 */
	protected void emit_Instruction_cmpxchg_VolatileKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_Instruction_fence_SinglethreadKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'inbounds'?
	 */
	protected void emit_Instruction_getelementptr_InboundsKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('signext' | 'zeroext' | 'inreg')*
	 */
	protected void emit_Instruction_invoke_nonVoid___InregKeyword_3_2_or_SignextKeyword_3_1_or_ZeroextKeyword_3_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('signext' | 'inreg' | 'zeroext')*
	 */
	protected void emit_Instruction_invoke_void___InregKeyword_2_2_or_SignextKeyword_2_1_or_ZeroextKeyword_2_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_Instruction_load_SinglethreadKeyword_2_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'volatile'?
	 */
	protected void emit_Instruction_load_VolatileKeyword_2_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'volatile'?
	 */
	protected void emit_Instruction_load_VolatileKeyword_2_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'exact'?
	 */
	protected void emit_Instruction_lshr_ExactKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('nsw' | 'nuw')*
	 */
	protected void emit_Instruction_mul___NswKeyword_2_1_or_NuwKeyword_2_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'exact'?
	 */
	protected void emit_Instruction_sdiv_ExactKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('nuw' | 'nsw')*
	 */
	protected void emit_Instruction_shl___NswKeyword_2_1_or_NuwKeyword_2_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_Instruction_store_SinglethreadKeyword_1_1_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'volatile'?
	 */
	protected void emit_Instruction_store_VolatileKeyword_1_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'volatile'?
	 */
	protected void emit_Instruction_store_VolatileKeyword_1_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('nsw' | 'nuw')*
	 */
	protected void emit_Instruction_sub___NswKeyword_2_1_or_NuwKeyword_2_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'exact'?
	 */
	protected void emit_Instruction_udiv_ExactKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
