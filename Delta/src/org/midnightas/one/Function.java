package org.midnightas.one;

import java.util.List;

public abstract class Function extends OneInstance {

	public Function() {
		super(OneClasses.FUNCTION);
	}

	public abstract Object call(List<OneInstance> args);

}
