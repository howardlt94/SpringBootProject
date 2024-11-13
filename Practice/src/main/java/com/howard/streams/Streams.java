package com.howard.streams;

import java.lang.foreign.Linker.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.naming.spi.DirStateFactory.Result;

import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.List;

public class Streams {

	public static void main(String[] args) {

		/*
		 * Streams is way to process collections quickly Streams perform functions like
		 * filtering, mapping,reducing,filtering Streams streamline data processing
		 * Stream is not a data structure instead it takes in input from one Streams
		 * dont change original data they just provide results Streams require no
		 * storage, lazy, chained pipelined, infinite, parallelized Streams are lazily
		 * executed means that operation on stream are not performed until terminal
		 * operation is executed lazy delays intialization of object until its actually
		 * needed
		 * 
		 * Streams are made of intermediate operations that can be pipelined to more
		 * streams, return a stream terminal operations that mark the end of a stream
		 * they return a result
		 * 
		 */

		ArrayList<String> sampleA = new ArrayList<>();
		sampleA.add("help");
		sampleA.add("lost");
		sampleA.add("boy");
		sampleA.add("sheep");
		sampleA.add("help");

		sampleA.stream().map(x -> x.toUpperCase()).forEach(System.out::println);
		System.out.println();
		sampleA.stream().forEach(System.out::println);
		System.out.println("working");
		System.out.println();
		sampleA.stream().filter(x -> x.startsWith("h")).map(x -> x.toUpperCase()).distinct().forEach(System.out::print);
		System.out.println();

		ArrayList<Integer> sampleI = new ArrayList<>();
		sampleI.add(1);
		sampleI.add(5);
		sampleI.add(8);
		sampleI.add(5);
		sampleI.add(1);
		sampleI.add(10);

		System.out.println("*************************");
		sampleA.stream().map(String::toUpperCase).distinct().forEach(System.out::println);
		System.out.println("*************************");

		int indexToCapital = 1;
		sampleA.stream().flatMap(str -> Stream.of(str.charAt(2))).map(x -> x.toUpperCase(indexToCapital))
				.forEach(System.out::println);

		// sampleA.stream().flatMap(str ->
		// Stream.of(str.charAt(2)).map(String::toUpperCase).forEach(System.out::println);
		// sampleA.stream().flatMap(str ->
		// Stream.of(str.charAt(2))).map(String::toUpperCase).forEach(System.out::println);

		ArrayList<Integer> sampleITwo = new ArrayList<>();
		sampleITwo.addAll(sampleI);
		System.out.println(sampleITwo);

		Stream.of(1, 8, 20, 64, 128, 24).filter(x -> x % 2 == 0 && x % 4 == 0 && x % 3 == 0).map(x -> x * 4)
				.forEach(System.out::println);

		// Intermediate operations
		// Map applies given function to elements in stream
		Stream.of(10, 9, 2, 3, 4).map(x -> x * 2).forEach(System.out::println);
		System.out.println();
		sampleI.stream().map(x -> x * 2).forEach(System.out::println);
		System.out.println();

		// Filter is used to select elements based on predicate
		sampleA.stream().filter(x -> x.contains("o")).forEach(System.out::println);
		System.out.println();
		Stream.of("help", "people", "number").filter(x -> x.contains("e")).forEach(System.out::println);
		System.out.println("space");
		sampleA.stream().filter(x -> x.endsWith("p")).forEach(System.out::println);
		Stream.of("help", "people", "fuckerr").filter(x -> x.endsWith("r")).forEach(System.out::println);

		// Sorted is used to sort a stream
		sampleA.stream().filter(x -> x.contains("e")).sorted().forEach(System.out::println);
		System.out.println();
		sampleI.stream().map(x -> x * x).map(x -> x + 4 + x).filter(x -> x % 2 == 0 && x % 4 == 0).sorted()
				.forEach(System.out::println);

		// FlatMap is used to flatten stream of collections into a single elements
		// potentially changing size of stream used to flatten one-to-many
		// transformations
		// used to flatten nested structures
		// breaks down object in stream into one to many
		// flattens multiple objects into one easily accsessed object
		// used to traverse collection of collections
		sampleI.stream().map(x -> x * x).map(x -> x + 4 + x).filter(x -> x % 2 == 0 && x % 4 == 0).sorted()
				.forEach(System.out::println);
		System.out.println();

		List<List<String>> listOfArrayList = Arrays.asList(Arrays.asList("help the lost kids", "sexist"),
				Arrays.asList("trans", "lost trans gen", "for All"),
				Arrays.asList("trans", "lost trans gen", "for All"), Arrays.asList("learning", "for All", "sexist"));

		listOfArrayList.stream().flatMap(x -> x.stream()).filter(x -> x.contains("t")).sorted()
				.forEach(System.out::println);
		System.out.println();
		sampleA.stream().flatMap(str -> Stream.of(str.charAt(2))).forEach(System.out::println);
		System.out.println();
		listOfArrayList.stream().flatMap(x -> x.stream()).filter(x -> x.contains("l")).forEach(System.out::println);

		// flat map with list of list of numbers
		List<Integer> primeNums = Arrays.asList(5, 11, 13, 7);
		List<Integer> evenNums = Arrays.asList(2, 4, 6, 8);
		List<Integer> oddNums = Arrays.asList(1, 3, 5);

		// flat map with list of list of strings
		List<List<Integer>> listofList = Arrays.asList(primeNums, evenNums, oddNums);
		listofList.stream().flatMap(x -> x.stream()).forEach(System.out::println);
		System.out.println();
		listofList.stream().flatMap(x -> x.stream()).filter(x -> x % 2 == 0).forEach(System.out::println);
		System.out.println();
		listOfArrayList.stream().flatMap(x -> x.stream()).filter(x -> x.contains("o")).forEach(System.out::println);
		System.out.println();

		// Distinct() used to remove duplicate elements, returns a stream consisting of
		// non-duplicate/distinct elements
		// works will with flatmap removes duplicate elements, but must be comppletly
		// the same
		listOfArrayList.stream().flatMap(x -> x.stream()).distinct().filter(x -> x.contains("o"))
				.forEach(System.out::println);

		ArrayList<String> sampleArrayl = new ArrayList<>();
		// sampleA.addAll(sampleA);
		sampleArrayl.add("nothingLeft");
		sampleArrayl.add("butWhatIlove");
		sampleArrayl.add("codelistenes");
		sampleArrayl.add("butWhatIlove");
		sampleArrayl.add("codelistenes");

		sampleArrayl.stream().filter(x -> x.contains("love")).distinct().forEach(System.out::println);
		System.out.println();
		sampleArrayl.stream().filter(x -> x.endsWith("e")).sorted().distinct().forEach(System.out::println);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

		for (String name : sampleArrayl) {
			System.out.println(name);
			System.out.println("insde".toUpperCase());
			// System.out.println(name + " " + "inside arrayList");
		}
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

		// Capitalizing Specfic Index in Stream, Using IntStream
		// ? is if else statement if true condition 1 executes if false condition 2
		// executes

		/*
		 * int indexToCapitalize = 1; List<String> result = IntStream.range(0,
		 * listOfArrayList.size()) .mapToObj(i -> i == indexToCapitalize ?
		 * listOfArrayList.get(i).toUpp
		 * 
		 */
		System.out.println("============================================");
		List<String> words = List.of("apple", "banna", "fruits");
		int capitalizeIndex = 2;
		List<String> capitalResult = IntStream.range(0, words.size())
				.mapToObj(i -> i == capitalizeIndex ? words.get(i).toUpperCase() : words.get(i))
				.collect(Collectors.toList());
		System.out.println(capitalResult + "capitalIndex");

		// Peek() performs action on each element without modifying the stream
		// returns a stream without modifying actual stream
		// elements consumed but not actually changed
		System.out.println("777777777777777777777777777777777777777777777777");

		// listOfArrayList.stream().peek(x -> listOfArrayList.add(1,
		// x)).forEach(System.out::println);
		// listOfArrayList.stream().peek(x -> x.)
		sampleA.stream().map(x -> x.toUpperCase()).forEach(System.out::println);
		// sampleA.stream().map(x -> x.to)
		System.out.println("888888888888888888888888888888888888888888888888888");
		sampleA.stream().map(x -> x.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
		;
		System.out.println("888888888888888888888888888888888888888888888888888");

		sampleA.stream().map(x -> x.toLowerCase()).forEach(System.out::println);
		System.out.println(" ");
		sampleA.stream().map(x -> x.toLowerCase()).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("777777777777777777777777777777777777777777777777");

		sampleA.stream().peek(x -> x.chars()).forEach(System.out::println);

		// Terminal Operations ***********************************************88

		// Collect()
		System.out.println("\n AA saved me");
		List<String> sampleNames = Arrays.asList("Some", "Sarah", "Funny", "Faith", "Sample", "MikeIsHelpful",
				"HeIsAgoodMan", "IHelpGoodMen");
		sampleNames.stream().forEach(System.out::println);

		// Collect stream into a list than can be transported and printed
		List<String> streamNames = sampleNames.stream().filter(x -> x.startsWith("F")).collect(Collectors.toList());
		System.out.println("\n comes after the line");
		streamNames.forEach(System.out::println);

		// Reduce() Concats all names into a Stream, reduce stream output to one
		// element, by comparing the elements
		// reduce all elements in stream to one output element but allows manipulation
		// between elemnts including spaces and letters
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		String concatenatedNames = sampleNames.stream().reduce("H",
				(partialString, element) -> partialString + " " + element);
		System.out.println(concatenatedNames);

		Optional<String> longestNamex = sampleNames.stream()
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);
		System.out.println(longestNamex);
		longestNamex.stream().forEach(System.out::println);

		// Count() returns number of elements in stream
		long count = sampleNames.stream().count();
		System.out.println("\ncount:");
		System.out.println("# of elemnts in stream " + count);

		// findFirst finds the first element
		// Optional is a container object that may or may not contain a non null value
		// better handling of null value reduces risk of NullPointerExceptions
		// Optional has its own methods
		Optional<String> firstValueInStream = sampleNames.stream().findFirst();
		System.out.println("\findFirst: ");
		System.out.println(firstValueInStream);
		firstValueInStream.ifPresent(System.out::println);

		// allMatch: check if all elements in stream start with 'S'
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
		boolean allStartWithS = sampleNames.stream().allMatch(x -> x.startsWith("S"));
		System.out.println("\n" + allStartWithS);

		// AnyMatch check if any elemnt in a stream matches, returns a boolean
		boolean startWithS = sampleNames.stream().anyMatch(x -> x.contains("S"));
		System.out.println(startWithS);
		boolean startsWithF = sampleNames.stream().anyMatch(y -> y.contains("a"));
		System.out.println(startsWithF);

		long countSample = sampleNames.stream().count();
		System.out.println(countSample);
		long countAny = listofList.stream().count();
		System.out.println(countAny);
		long countList = listOfArrayList.stream().count();
		System.out.println(countList);
		long countListNext = listOfArrayList.stream().flatMap(x -> x.stream()).count();
		System.out.println(countListNext);

		// collect Method collects elements into new string can manipulate space in
		// between variables
		// Collectors has many methods to combine a strings into a list or a string
		System.out.println();
		System.out.println("Streams are confysing");
		List<String> vowels = List.of("a", "e", "i", "o", "u");
		List<String> listOfVowels = vowels.stream().collect(Collectors.toList());
		System.out.println(listOfVowels);
		System.out.println();
		String concatedName = vowels.stream().reduce("",
				(pString, element) -> "." + pString + " " + "," + element + " ");
		System.out.println(concatedName);

		String concatenatedNamez = sampleNames.stream().reduce("H",
				(partialString, element) -> partialString + " ," + element);
		// StringBuilder resultVowels = vowels.stream().collect(StringBuilder::new, (x,
		// y) -> )
		// StringBuilder resultString = sampleA.stream().collect(StringBuilder::new, (x,
		// y) -> x. )

		// .collect(Collectors.toList());
		List<String> namesConnect = sampleA.stream().collect(Collectors.toList());
		System.out.println(namesConnect);

		// List<String> namesConnectwjoin =
		// sampleA.stream().collect(Collectors.joining());
		String connectnames = sampleA.stream().collect(Collectors.joining());
		System.out.println(connectnames);
		
		List<String> combinedvowels = vowels.stream().collect(Collectors.toList());
		System.out.println(combinedvowels);
		
		List<String> flattenString = listOfArrayList.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(flattenString);
		
		String allNames = listOfArrayList.stream().flatMap(List::stream).collect(Collectors.joining());
		System.out.println(allNames);
		

	}

}
