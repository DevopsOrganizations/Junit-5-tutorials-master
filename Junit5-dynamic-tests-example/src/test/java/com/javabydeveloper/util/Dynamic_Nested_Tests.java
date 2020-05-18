package com.javabydeveloper.util;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Collection;

import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.TestFactory;


public class Dynamic_Nested_Tests {
	
   @TestFactory
   Collection<DynamicContainer> dynamicContainerFromCollection() {
        
	  return asList(
				
			dynamicContainer(
			    "1st root container",
				asList(
						dynamicContainer(
						   "1st Dynamic Container",
						    asList(
						        dynamicTest("1A dynamic test", 
						        		() -> assertTrue(MathUtil.isPrime(13))),
						        dynamicTest("1B dynamic test",
						        		() -> assertEquals(5, MathUtil.devide(25, 5)))
						       )), // end of 1st container
						           
						dynamicContainer(
						    "2nd Dynamic Container",
						     asList(
						         dynamicTest("2A dynamic test",
						        		 () -> assertTrue(MathUtil.isPrime(13))),
						         dynamicTest("2B dynamic test", 
						        		 () -> assertEquals(5, MathUtil.devide(25, 5)))
						       )) // end of 2nd container
						   )
				  ), // End of 1st root container
			
			dynamicContainer(
				    "2nd root container",
					asList(
							dynamicContainer(
							   "3rd Dynamic Container",
							    asList(
							        dynamicTest("3A dynamic test", 
							        		() -> assertTrue(MathUtil.isPrime(13))),
							        dynamicTest("3B dynamic test", 
							        		() -> assertEquals(5, MathUtil.devide(25, 5)))
							       )), // end of 3rd container
							           
							dynamicContainer(
							    "4th Dynamic Container",
							     asList(
							         dynamicTest("4A dynamic test", 
							        		 () -> assertTrue(MathUtil.isPrime(13))),
							         dynamicTest("4B dynamic test", 
							        		 () -> assertEquals(5, MathUtil.devide(25, 5)))
							       )) // end of 4th container
							   )
					  ) // End of 2nd root container
			
		    ); // End of complete List
     }    
}
