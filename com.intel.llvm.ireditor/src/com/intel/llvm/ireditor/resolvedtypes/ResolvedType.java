/*
Copyright (c) 2013, Intel Corporation

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

    * Redistributions of source code must retain the above copyright notice,
      this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright notice,
      this list of conditions and the following disclaimer in the documentation
      and/or other materials provided with the distribution.
    * Neither the name of Intel Corporation nor the names of its contributors
      may be used to endorse or promote products derived from this software
      without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package com.intel.llvm.ireditor.resolvedtypes;

public abstract class ResolvedType {
	/**
	 * Textual representation of the type, as it would appear in a well-formatted source file.
	 */
	public abstract String toString();
	
	/**
	 * The contained type, if any, or null if there is none.
	 * @param index
	 * @return
	 */
	public ResolvedType getContainedType(int index) { return null; }
	
	/**
	 * The number of bits used by this type.
	 * @return
	 */
	public int getBits() { return 0; }
	
	/**
	 * @param t
	 * @return True if it's okay to encounter 't' when 'this' is expected.
	 */
	public boolean accepts(ResolvedType t) {
		// All types should accept themselves and 'any'.
		return t.getClass() == ResolvedAnyType.class ||
				this.equals(t);
	}
	
	public boolean equals(Object obj) {
		return obj != null && obj.getClass() == getClass();
	}
	
	public int hashCode() {
		return getClass().hashCode();
	}
}