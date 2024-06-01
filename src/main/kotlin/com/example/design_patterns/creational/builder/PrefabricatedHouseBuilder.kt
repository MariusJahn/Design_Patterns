package com.example.design_patterns.creational.builder

/**
 * ConcreteBuilder Are concrete classes that implement Builder to construct and assemble parts of the product and return the finished product.
 */
class PrefabricatedHouseBuilder(private val house: House) : HouseBuilder {
    override fun buildFoundation() {
        this.house.foundation = "Wood, laminate, and PVC flooring"
        println("ConcreteHouseBuilder: Foundation complete...")
    }

    override fun buildStructure() {
        this.house.structure = "Structural steels and wooden wall panels"
        println("ConcreteHouseBuilder: Structure complete...")
    }

    override fun buildRoof() {
        this.house.roof = "Roofing sheets"
        println("ConcreteHouseBuilder: Roof complete...")
    }

    override fun paintHouse() {
        this.house.painted = false
        println("ConcreteHouseBuilder: Painting not required...")
    }

    override fun furnishHouse() {
        this.house.furnished = true
        println("ConcreteHouseBuilder: Firnishing complete...")
    }

    override fun getHouse(): House {
        return this.house
    }
}