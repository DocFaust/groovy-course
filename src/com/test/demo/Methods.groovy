package com.test.demo

def printHello() {
	println "Hello..."
}
printHello()

def sum(int a=10, int b=20) {
	println "Sum is " + (a+b)
}

sum(5, 2)
sum()
sum(5)

def sub (int a, int b) {
	def c = a-b
	return c
}

def result =  sub (10,5)
println "Result is " + result