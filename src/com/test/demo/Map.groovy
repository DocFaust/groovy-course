package com.test.demo

def employee = [
	'name':'John', 
	'age':40
	]
	
println employee

println employee.name
println employee['age']
println employee.get('age')
println employee.getAt('age')

println employee.size()

println employee.put("city", 'Paris')
println employee

println employee.containsKey('city')
println employee.containsValue('Paris')

println employee.getClass()

def empl2 = employee.clone()
println empl2

employee.each {	key, value -> 
	println "$key: $value" 
}
employee.eachWithIndex { key, value, i -> 
	println "$i | $key \t: $value"
}

employee.each { entry -> 
	println "$entry.key : $entry.value" 
}

employee.eachWithIndex { 
	entry,i -> println "$i | $entry.key \t: $entry.value" 
}


def map1 = ['a':1, 'b':2]
def entries = map1.entrySet()
entries.each { entry ->
	assert entry.key in ['a','b']
	assert entry.value in [1,2,3]
}
map1.each { entry ->
	assert entry.key in ['a','b']
	assert entry.value in [1,2]
}

def keys = map1.keySet()
println keys