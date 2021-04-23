package com.test.demo

//for
for (int i = 1; i<=5; i++) {
	println i
}

for ( a in 1..5) {
	println a;
}

1.upto(5) { println "$it" }

5.times { println "$it" }

1.step(10, 2) { println "$it" }

for (str in  ["Schwein","Kuh","Ente"]) {
	println str
}

def map = ["name":"Groovy", "subject":"Automation"]
for (e in map) {
	println "${e.key}: ${e.value}"
} 

int i = 1
while (i<5) {
	println i
	i++
}
		