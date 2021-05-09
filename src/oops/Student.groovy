package oops

class Student {

	String name
	int sub1Marks
	int sub2Marks
	
	def printTotal() {
		println "$name has total marks = " + (sub1Marks+sub2Marks)
	}
	static void main(args) {
		Student student1 = new Student()
		student1.name = "John"
		student1.sub1Marks = 2
		student1.sub2Marks = 3
		student1.printTotal()
		
		Student student2 = new Student()
		student2.name = "Maria"
		student2.sub1Marks = 3
		student2.sub2Marks = 4
		student2.printTotal()
	}
}
