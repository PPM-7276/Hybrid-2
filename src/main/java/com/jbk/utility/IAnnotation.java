	package com.jbk.utility;
		
		import java.lang.reflect.Constructor;
		import java.lang.reflect.Method;
	
		import org.testng.IAnnotationTransformer;
		import org.testng.annotations.ITestAnnotation;
	
		public class IAnnotation implements IAnnotationTransformer{
	
			public void transform(ITestAnnotation annotation, Class arg1, Constructor arg2, Method arg3) {
				annotation.setRetryAnalyzer(RetryAnalyzer.class);
			}
		}
	
	