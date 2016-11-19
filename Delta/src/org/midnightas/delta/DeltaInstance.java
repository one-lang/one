package org.midnightas.delta;

public class DeltaInstance extends VarContainer {
	
	public DeltaClass clazz;
	
	public DeltaInstance(DeltaClass clazz) {
		this.clazz = clazz;
		clazz.construct(this);
	}
	
	public String toString() {
		return ((Function) vars.get(Delta.TO_STRING_NAME)).call(Delta.EMPTY_ARGS) + "";
	}
	
}
