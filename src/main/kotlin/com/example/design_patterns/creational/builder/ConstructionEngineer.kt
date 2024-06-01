package com.example.design_patterns.creational.builder

/**
 * Director (ConstructionEngineer): A class that directs a builder to perform the steps in the order that is required to build the product.
 */
class ConstructionEngineer(private val houseBuilder: HouseBuilder) {

    fun constructHouse(): House? {
        houseBuilder.buildFoundation()
        houseBuilder.buildStructure()
        houseBuilder.buildRoof()
        houseBuilder.paintHouse()
        houseBuilder.furnishHouse()
        return houseBuilder.getHouse()
    }

}