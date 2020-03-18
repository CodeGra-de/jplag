package jplag.java113;

import org.jetbrains.annotations.Contract;

public enum JavaTokenConstants {
	FILE_END(0),

	// check used to mark tokens that are actually generated by the adapter
	SEPARATOR_TOKEN(1),

	J_PACKAGE(2),				// check
	J_IMPORT(3),				// check
	J_CLASS_BEGIN(4),			// check
	J_CLASS_END(5),			// check
	J_METHOD_BEGIN(6),		// check
	J_METHOD_END(7),			// check
	J_VARDEF(8),				// check
	J_SYNC_BEGIN(9),			// check
	J_SYNC_END(10),			// check
	J_DO_BEGIN(11),			// check
	J_DO_END(12),				// check
	J_WHILE_BEGIN(13),		// check
	J_WHILE_END(14),			// check
	J_FOR_BEGIN(15),			// check
	J_FOR_END(16),			// check
	J_SWITCH_BEGIN(17),		// check
	J_SWITCH_END(18),			// check
	J_CASE(19),				// check
	J_TRY_BEGIN(20),			// check
	J_CATCH_BEGIN(21),    	// check
	J_CATCH_END(22),      	// check
	J_FINALLY(23),			// check
	J_IF_BEGIN(24),			// check
	J_ELSE(25),				// check
	J_IF_END(26),				// check
	J_COND(27),				// check
	J_BREAK(28),				// check
	J_CONTINUE(29),			// check
	J_RETURN(30),				// check
	J_THROW(31),				// check
	J_IN_CLASS_BEGIN(32),		//
	J_IN_CLASS_END(33),		//
	J_APPLY(34),				// check
	J_NEWCLASS(35),			// check
	J_NEWARRAY(36),			// check
	J_ASSIGN(37),				// check
	J_INTERFACE_BEGIN(38),	// check
	J_INTERFACE_END(39),		// check
	J_CONSTR_BEGIN(40),		// 
	J_CONSTR_END(41),			//
	J_INIT_BEGIN(42),			// check
	J_INIT_END(43),			// check
	J_VOID(44),				//
	J_ARRAY_INIT_BEGIN(45),	// check
	J_ARRAY_INIT_END(46), 	// check

	// new in 1.5:
	J_ENUM_BEGIN(47),			// check 
	J_ENUM_CONSTANT(48),	// ?? doesn't exist in JAVAC
	J_ENUM_END(49),			// check
	J_GENERIC(50),			// check
	J_ASSERT(51),				// check

	J_ANNO(52),				// check
	J_ANNO_MARKER(53),		// ??
	J_ANNO_M_BEGIN(54),		// ??
	J_ANNO_M_END(55),			// ??
	J_ANNO_T_BEGIN(56),		// check
	J_ANNO_T_END(57),			// check
	J_ANNO_C_BEGIN(58),		// ??
	J_ANNO_C_END(59),			// ??

	// new in 1.7
	J_TRY_WITH_RESOURCE(60), 	// check
	
	// new in 1.9
	J_REQUIRES(61), 	       // check
	J_PROVIDES(62), 	       // check
	J_EXPORTS(63), 	       // check
	J_MODULE_BEGIN(64),     // check
	J_MODULE_END(65), 	       // check
	

	J_YIELD(66),

	J_LAMBDA(67);

	private final int value;
	private static int MAX_VALUE;
	static {
		for (JavaTokenConstants value : values()) {
			MAX_VALUE = Math.max(MAX_VALUE, value.getValue());
		}
	}
	@Contract(pure = true)
	JavaTokenConstants(int value) {
		this.value = value;
	}

	@Contract(pure = true)
	public int getValue() {
		return value;
	}

	@Contract(pure = true)
	static public int getNumTokens() {
		return MAX_VALUE + 1;
	}

	static String valueToString(int value) {
		for (JavaTokenConstants javaTokenConstants : values()) {
			if (javaTokenConstants.getValue() == value) {
				return javaTokenConstants.toString();
			}
		}
		return "Unkonwn";
	}
}
