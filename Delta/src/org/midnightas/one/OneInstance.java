package org.midnightas.one;

public class OneInstance extends VarContainer {
	
	public OneClass clazz;
	
	public OneInstance(OneClass clazz) {
		this.clazz = clazz;
		clazz.construct(this);
	}
	
	public String toString() {
		return ((Function) vars.get(One.TO_STRING_NAME)).call(One.EMPTY_ARGS) + "";
	}
	
}
