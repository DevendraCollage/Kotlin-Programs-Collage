// Import Statement
import java.util.Scanner

// Default Arguments
fun draw(name: String? = null, age: Int? = null, address: String? = null) {
    // String Template Example
    println("${name?.uppercase()} lives in ${address?.uppercase()} and age is $age")
}

fun main() {
    val readData = Scanner(System.`in`)

    // Take Data From User
    print("Enter Your Name : ")
    val name = readData.nextLine()
    print("Give Your Country Name : ")
    val address = readData.nextLine()
    print("Give Your Age : ")
    val age = readData.nextInt()

    // Named Arguments
    draw(name = name, address = address, age = age)
}

/*
Output :
Enter Your Name : devendra
Give Your Country Name : india
Give Your Age : 20
DEVENDRA lives in INDIA and age is 20
 */