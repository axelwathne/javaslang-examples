package jz16.javaslang;

import static java.lang.System.out;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import javaslang.Lazy;
import javaslang.control.Either;
import javaslang.control.Try;

public class Ex3 {
	public static void main(String[] args) {
		
		String i = "NaN";
		out.println(
				Try.of(() -> Integer.valueOf(i))
				.getOrElse(0));
		
		
		Lazy<JavaCompiler> expensive = Lazy.of(() -> ToolProvider.getSystemJavaCompiler());
		out.println(expensive.isEvaluated());
		
		
		Either<ArithmeticException, Integer> result = Either.right(5);
		out.println(result.get());
	}
}
