package com.test.demo

/** Reading files **/

String filePath = "data1.txt"
File myFile = new File(filePath)

// Reading entire content as String

println myFile.text

// COllect in a list

def list = myFile.collect { it }
println list.getClass()

println "list: $list"

// Store in an array

def array = myFile as String[]
println array.getClass()

println "array : $array"

// read file into a list of strings
def lines = myFile.readLines()
println lines.getClass()
println "listof Strings : $lines"

// read line by line

myFile.eachLine { line -> 
	println "line : $line"
}

// read line by line with line #
myFile.eachLine { line, no ->
	println "$no: $line"
}

// read line by line with line #
def lineNoRange = 2..4
def lineList = []

myFile.eachLine { line, no ->
	if(lineNoRange.contains(no)) {
		lineList.add(line)
	}
}

println lineList

// read with reader
def line
myFile.withReader { reader ->
	while((line =reader.readLine())!=null) {
		println line
	}
}

// read with new reader
def outputfile = "data2.txt"
def reader = myFile.newReader()
new File(outputfile).append(reader)
reader.close()

// binary files
byte[] contents = myFile.bytes
println contents
println myFile.length()

// check directory
println myFile.isFile()
println myFile.isDirectory()
println myFile.exists()

// list File
new File("C:/dev/prj/groovy-course/FirstGroovyProject/src/com/test/demo").eachFile { file -> println file.getAbsolutePath() }

//recursive list files
new File("C:/dev/prj/groovy-course/FirstGroovyProject/").eachFileRecurse { file -> println file.getAbsolutePath() }

//Copy FIle

def newFile = new File("data3.txt")
newFile << myFile.text
newFile.delete()
