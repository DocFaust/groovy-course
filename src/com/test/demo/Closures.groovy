package com.test.demo

def str = "Hello"
def myClosure1 =  { name -> println "${str} ${name}" }
myClosure1.call("Werner")

def myMethod(clos) {
	clos.call("Groovy")
}

myMethod(myClosure1)

def myClosure2 = { a,b,c ->
	return (a+b+c)
}

println myClosure2(10,20,30)

def myList1 = ["Apples", "Oranges", "Grapes"]
println myList1.each { it }

def myMap = [
	'subject':'groovy',
	'topic':'closures'
]

println myMap.each { it }

def myList = [1, 2, 3, 4, 5]
println myList.find {item -> item == 5}   // Liefert ein Element zurück
println myList.findAll {item -> item > 3} // Liefert alle Elemente zurück
println myList.any { item -> item > 3 }   // True, wenn eines > 3
println myList.every { item -> item > 3 } // True, wenn ALLE > 3
println myList.collect { item -> item*2  }

