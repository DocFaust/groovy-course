package com.test.demo
try {
	int i = 1/0
} catch (ArithmeticException ae){
	println "Was rechnest du da???"
	println ae.getMessage()
	
} catch (Exception e) {
	println "huhu"
	println e.getMessage()
	//e.printStackTrace()
} finally {
	println "Mach ich trotzdem"
}