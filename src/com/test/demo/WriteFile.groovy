package com.test.demo

File myFile = new File("data1.txt")

myFile.write("This is Line 1")

myFile << "\nThis is Line 2"

//myFile.text = "This is Line 3"


myFile.withWriter { writer ->
	writer.writeLine("This is Line 4")
}

myFile.append("\nThis is Line 5")

println myFile.length()
println myFile.isFile()
println myFile.isDirectory()
println myFile.isHidden()
println myFile.exists()
println myFile.text


def newFile = new File("data2.txt")
newFile << myFile.text

myFile.bytes = []

myFile.renameTo("newFile.txt")

myFile.delete()