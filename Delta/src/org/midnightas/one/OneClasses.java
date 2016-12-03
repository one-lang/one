package org.midnightas.one;

import java.util.List;

public class OneClasses {
	
	public static OneClass NUMBER = new OneClass() {
		public void construct(OneInstance instance) {
			instance.vars.put(One.TO_STRING_NAME, new Function() {
				@Override
				public Object call(List<OneInstance> args) {
					return instance.vars.get(One.INTERNAL_VALUE_VAR);
				}
			});
		}
	};
	
	public static OneClass FUNCTION = new OneClass() {
		public void construct(OneInstance instance) {
		}
	};
	
	public static OneClass ARRAY = new OneClass() {
		public void construct(OneInstance instance) {
		}
	};
	
}
