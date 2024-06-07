package com.example.design_patterns.creational.singleton

class SingletonClass private constructor() {
    companion object {

        @Volatile
        private var instance: SingletonClass? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: SingletonClass().also { instance = it }
            }

    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun toString(): String {
        return "Hey, my name is Instance"
    }

}