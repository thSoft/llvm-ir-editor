/*
* generated by Xtext
*/
package com.intel.llvm.ireditor.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractLLVM_IRJavaValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.intel.com/llvm/ireditor"));
		return result;
	}

}
