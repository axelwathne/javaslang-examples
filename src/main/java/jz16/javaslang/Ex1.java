package jz16.javaslang;

import static java.lang.System.out;

import javaslang.Tuple2;
import javaslang.collection.List;

public class Ex1 {
	public static void main(String[] args) {

		List<Character> a = List.range('a', 'd');
		List<Character> b = a.update(1, 'z');
		List<Tuple2<Character,Character>> z = b.zip(a);
		
		out.println(List.of(a, b, z).mkString("\n"));
	
	}
}
