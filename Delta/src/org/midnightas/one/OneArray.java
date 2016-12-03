package org.midnightas.one;

public class OneArray extends OneInstance {
	
	public OneArray() {
		super(OneClasses.ARRAY);
	}

	public String toString() {
		return vars.get(One.INTERNAL_VALUE_VAR).toString();
	}
	
}
