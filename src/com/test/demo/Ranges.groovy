package com.test.demo

def range = 1..10

println range
println range.size()
println range.getFrom()
println range.getTo()

assert range.from == 1
assert range.to == 10

println range.get(3)
println range[3]

println range.contains(6)
println range.isReverse()

def range2 = 10..1
println range2.isReverse()


def suub = range.subList(3, 7)
println suub.getFrom()
println suub.getTo()

for (i in 1..10 ) {
	println i
}

for (i in range) {
	println i
}

(1..10).each { i -> 
	println "Value: $i"
}

range.each { i ->
	println "Value: $i"
}

println range instanceof java.util.List