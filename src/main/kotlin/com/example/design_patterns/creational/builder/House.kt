package com.example.design_patterns.creational.builder

import lombok.ToString

/**
 * Product (House): A class that represents the product to create.
 */
@ToString
data class House(var foundation: String = "", var structure: String = "", var roof: String = "", var furnished: Boolean = false, var painted: Boolean = false)

