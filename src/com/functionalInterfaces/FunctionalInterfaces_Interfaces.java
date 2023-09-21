package com.functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class FunctionalInterfaces_Interfaces {

	// one input and one output of same type
	static UnaryOperator<String> unaryOps = String::toLowerCase;

	// two inputs and one output of same type
	static BinaryOperator<String> binaryOps = (String a, String b) -> a + "||" + b;

	static Function<Integer, String> func = (Integer a) -> "Str: " + a;

	static BiFunction<String, Integer, Integer> biFunc = (String a, Integer b) -> Integer
			.valueOf(b + Integer.parseInt(a));

	// andThen can be invoked on all types of functions
	static BiFunction<String, Integer, String> biFuncAndThen = biFunc.andThen(func);

	static Supplier<Integer[]> suppl = () -> {
		return new Integer[] { 1, 2, 3, 4, 5 };
	};

	static Consumer<String> cons = (s) -> {
		System.out.println("cons: " + s.toLowerCase());
	};

	static BiConsumer<String, String> biCons1 = (a, b) -> {
		System.out.println("biCons: " + a + " ** " + b);
	};

	static BiConsumer<String, String> biCons2 = (a, b) -> {
		System.out.println("biCons: " + a + " || " + b);
	};

	// andThen can be invoked on all types of Consumer
	static BiConsumer<String, String> biconsAndThen = biCons1.andThen(biCons2);

	static Predicate<String> pred = a -> a.equalsIgnoreCase("Test");

	static BiPredicate<String, String> biPred = (a, b) -> a.equalsIgnoreCase(b);

	static BiPredicate<String, String> biPred2 = (a, b) -> a.trim().equalsIgnoreCase(b.trim());

	// and can be invoked on all types of Predicates
	static BiPredicate<String, String> biPred3 = biPred2.and(biPred);

	public static void main(String[] args) {
		System.out.println(unaryOps.apply("TEST"));
		System.out.println(binaryOps.apply("first", "second"));
		System.out.println(func.apply(1));
		System.out.println(biFunc.apply("12", 13));
		System.out.println(biFuncAndThen.apply("12", 13));
		System.out.println(
				Arrays.stream(suppl.get()).map((Integer a) -> a.toString()).collect(Collectors.joining(" | ")));
		System.err.println(Arrays.stream(suppl.get()).map((Integer a) -> a.toString()).collect(ArrayList::new,
				ArrayList::add, ArrayList::addAll));
		cons.accept("Testing");
		biconsAndThen.accept("Testing", "InTerFaCE");
		System.out.println(pred.test("test"));
		System.out.println(biPred.test("TEst", "tEST"));
		System.out.println(biPred3.test("TEst", "  tEST"));
	}

}
