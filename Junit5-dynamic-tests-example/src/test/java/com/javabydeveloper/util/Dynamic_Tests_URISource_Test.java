package com.javabydeveloper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class Dynamic_Tests_URISource_Test {
	
	@TestFactory
	Stream<DynamicTest> checkAllTextFiles() throws Exception {
	   return Files.walk(Paths.get("src/test"), 3)
	        .filter(path -> path.toString().endsWith(".txt"))
	        .map(path -> dynamicTest(
	                "> " +path.getFileName(),
	                URI.create("method:com.javabydeveloper.util.Dynamic_Tests_URISource_Test#checkLines"), // test source uri
	                () -> checkLines(path)));
	 }

	  private void checkLines(Path path) throws Exception {
	    List<String> lines = Files.readAllLines(path);
	    String expected = lines.get(1);
	    String actual = new StringBuilder(lines.get(0)).reverse().toString();
	    assertEquals(expected, actual, "Second line is not the reversed first!");
	  }
}
