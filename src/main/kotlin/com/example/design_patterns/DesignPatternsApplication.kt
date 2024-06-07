package com.example.design_patterns

import com.example.design_patterns.creational.builder.ConcreteHouseBuilder
import com.example.design_patterns.creational.builder.ConstructionEngineer
import com.example.design_patterns.creational.builder.House
import com.example.design_patterns.creational.builder.PrefabricatedHouseBuilder
import com.example.design_patterns.creational.singleton.SingletonClass
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DesignPatternsApplication

fun main(args: Array<String>) {
	runApplication<DesignPatternsApplication>(*args)


	// Builder Pattern
	/*val houseBuilder = PrefabricatedHouseBuilder(House())
	val constructionEngineer = ConstructionEngineer(houseBuilder)
	val house = constructionEngineer.constructHouse()

	println(house.toString())*/

	//Singleton Pattern
	val instance1 = SingletonClass.getInstance()
	val instance2 = SingletonClass.getInstance()
	val instance3 = SingletonClass.getInstance()

	println(instance1 == instance2)
	println(instance2.equals(instance3))
	println(instance1.toString())
}
