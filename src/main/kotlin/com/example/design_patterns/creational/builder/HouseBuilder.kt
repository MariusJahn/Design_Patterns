package com.example.design_patterns.creational.builder

/**
 * Builder Is an interface to build the parts of a product.
 */

interface HouseBuilder {
    fun buildFoundation()
    fun buildStructure()
    fun buildRoof()
    fun paintHouse()
    fun furnishHouse()
    fun getHouse(): House?
}