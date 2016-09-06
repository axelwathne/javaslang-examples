package jz16.javaslang;

import static java.lang.System.out;

import javaslang.Function1;
import javaslang.Function2;

public class Ex2 {
	public static void main(String[] args) {

		
		Function2<String, String, String> f1 = (a,b) -> "(" + a + b + ")";
		Function1<String, String> f1c = f1.curried().apply("a");
		Function1<String, String> f1cm = f1c.memoized();
		
		out.println(f1cm.andThen(String::toUpperCase).apply("b"));
	}
}
