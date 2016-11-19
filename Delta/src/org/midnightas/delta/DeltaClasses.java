package org.midnightas.delta;

import java.util.List;

public class DeltaClasses {
	
	public static DeltaClass NUMBER = new DeltaClass() {
		public void construct(DeltaInstance instance) {
			instance.vars.put(Delta.TO_STRING_NAME, new Function() {
				@Override
				public Object call(List<DeltaInstance> args) {
					return instance.vars.get(Delta.INTERNAL_VALUE_VAR);
				}
			});
		}
	};
	
	public static DeltaClass FUNCTION = new DeltaClass() {
		public void construct(DeltaInstance instance) {
		}
	};
	
	public static DeltaClass ARRAY = new DeltaClass() {
		public void construct(DeltaInstance instance) {
		}
	};
	
}
