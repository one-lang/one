package org.midnightas.delta;

import java.util.List;

public abstract class Function extends DeltaInstance {

	public Function() {
		super(DeltaClasses.FUNCTION);
	}

	public abstract Object call(List<DeltaInstance> args);

}
