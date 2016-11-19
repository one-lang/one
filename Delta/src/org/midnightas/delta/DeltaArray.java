package org.midnightas.delta;

public class DeltaArray extends DeltaInstance {
	
	public DeltaArray() {
		super(DeltaClasses.ARRAY);
	}

	public String toString() {
		return vars.get(Delta.INTERNAL_VALUE_VAR).toString();
	}
	
}
