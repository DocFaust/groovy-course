package com.test.demo

class Fruits {
	
	private String fruitName 
	private String fruitColor
	
	def setFruitName(String name) {
		fruitName = name
	}
	
	def setFruitColor(String color) {
		fruitColor = color
	}


	public String getFruitName() {
		return fruitName;
	}

	public String getFruitColor() {
		return fruitColor;
	}
	
	static void main(args) {
		Fruits apple = new Fruits()	
		apple.setFruitName("Apple")
		apple.setFruitColor("red")
		
		println apple.getFruitName()
		println apple.getFruitColor()
	}
}
