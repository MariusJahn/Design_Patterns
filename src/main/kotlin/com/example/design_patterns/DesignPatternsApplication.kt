package com.example.design_patterns

import com.example.design_patterns.creational.builder.ConcreteHouseBuilder
import com.example.design_patterns.creational.builder.ConstructionEngineer
import com.example.design_patterns.creational.builder.House
import com.example.design_patterns.creational.builder.PrefabricatedHouseBuilder
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DesignPatternsApplication

fun main(args: Array<String>) {
	runApplication<DesignPatternsApplication>(*args)

	val houseBuilder = PrefabricatedHouseBuilder(House())
	val constructionEngineer = ConstructionEngineer(houseBuilder)
	val house = constructionEngineer.constructHouse()

	println(house.toString())
}
