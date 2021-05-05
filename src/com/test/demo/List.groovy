package com.test.demo

def fruits = ["Apples","Oranges","Grapes"]
println fruits[1]
println fruits.get(2)

def myList = [1,2,3,['A','B',"Groovy"],4]
println myList[2]
println myList[3][2]

println myList.get(3).get(2)

println myList[0..2]

println myList[4..2]

println myList.contains(2)
println myList.contains("Groovy")
println myList[3].contains("Groovy")
println myList[3].size()

myList.add(10)
println myList

myList<<20
myList.add(2,22)
println myList

myList.remove(2)
println myList


myList += [30,40]
println myList

myList = myList.plus([50])
println myList

myList = myList.minus([50])
println myList

myList -= [30,40]
println myList

myList.pop()
println "pop" + myList

myList.removeLast()
println myList

println myList.intersect([1,2,3])
println myList

myList = myList.reverse()
println myList

myList = myList.sort()
println myList

println myList.isEmpty()
myList.clear()
println myList.isEmpty()


