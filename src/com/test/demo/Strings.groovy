package com.test.demo

def name = "Werner"
println name
println "My name is " + name
println "My name is ".concat(name)
println "My name is ${name}"
println 'My name is ${name}'


def s1 = '''This is a groovy class
and we are learning things'''

println s1

println name.length()
println name[2]
println name[-2]

println name.indexOf('r')

println name[0..2]
println name[5..3]
println name[0,2,4]

println name.substring(2)
println name.substring(1,4)


def str = "This is a groovy class"

println str.split(" ")

println str-("groovy ")


println str.replace("class", "session")

println str.toUpperCase()
println str.toLowerCase()

println str.toList()

println "Groovy " * 3

println "Abc".equals("Abc")
println "Abc".equalsIgnoreCase("abc")


def s2 = /a green "sky" 
	$name/

def s3 = $/a blue "sky" 
	$name/$

println s2
println s3