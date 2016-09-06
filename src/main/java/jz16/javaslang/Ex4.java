package jz16.javaslang;
import static java.lang.System.out;
import static javaslang.API.Case;
import static javaslang.API.Match;
import static javaslang.Predicates.is;

import javaslang.control.Option;

public class Ex4 {
	public static void main(String[] args) {

		String s = "Ja";

		Boolean a;
		switch (s) {
			case "Ja":
				a = true;
				break;
			case "Nei":
				a = false;
				break;
			default:
				throw new IllegalArgumentException();
		}
		
		s = "Kanskje";
		
		Option<Boolean> b = Match(s).option(
				Case(is("Ja"), true),
				Case(is("Nei"), false)
		);
		
		out.println(a);
		out.println(b);
	};

}
