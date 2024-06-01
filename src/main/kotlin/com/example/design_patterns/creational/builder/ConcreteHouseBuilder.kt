package com.example.design_patterns.creational.builder

/**
 * ConcreteBuilder Are concrete classes that implement Builder to construct and assemble parts of the product and return the finished product.
 */
class ConcreteHouseBuilder(private val house: House) : HouseBuilder {
    override fun buildFoundation() {
        this.house.foundation = "Concrete, brick, and stone"
        println("ConcreteHouseBuilder: Foundation complete...")
    }

    override fun buildStructure() {
        this.house.structure = "Concrete, mortar, brick, and reinforced steel"
        println("ConcreteHouseBuilder: Structure complete...")
    }

    override fun buildRoof() {
        this.house.roof = "Concrete and reinforced steel"
        println("ConcreteHouseBuilder: Roof complete...")
    }

    override fun paintHouse() {
        this.house.painted = true
        println("ConcreteHouseBuilder: Painting complete...")
    }

    override fun furnishHouse() {
        this.house.furnished = true
        println("ConcreteHouseBuilder: Firnishing complete...")
    }

    override fun getHouse(): House {
        return this.house
    }
}