// Base Class
open class Inheritance{
    val name = "Devendra Parmar"
    fun A(){
        println("Base Class")
    }
}

// Derived Class
class Derived : Inheritance(){
    fun B(){
        println(name)
        println("Derived Class")
    }
}

// Main Function
fun main(){
    val Derived = Derived()
    Derived.A()
    Derived.B()
}


/*
Output :
Base Class
Devendra Parmar
Derived Class
 */
