package com.ohgiraffers.section02.uses.subsection03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application2 {

	public static void main(String[] args) {

		/* 수업목표. 스트림의 최종연산중 하나인 reduce에 대해 이해하고 사용할 수 있다. */
		/*  Optional<T> reduce(BinaryOperator<T> accumulator);
		 *  reduce() 라는 메소드는 스트림에 있는 데이터들의 총합을 계산해준다.
		 */
		
	    OptionalInt reduceOneParam = IntStream.range(1, 4)     // 1, 2, 3
			                                    .reduce((a, b) -> {
			                                        return Integer.sum(a, b);
			                                    });

	    System.out.println("reduceOneParam = " + reduceOneParam.getAsInt());
	}
}
