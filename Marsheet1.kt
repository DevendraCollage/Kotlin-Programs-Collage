// Import the module
import java.util.Scanner

fun main(){

    // Get the import from the user
    val reader = Scanner(System.`in`)

    // Get the marks from the user
    print("Enter Subject 1 Marks : ")
    var sub1 = reader.nextInt()
    print("Enter Subject 2 Marks : ")
    var sub2 = reader.nextInt()
    print("Enter Subject 3 Marks : ")
    val sub3 = reader.nextInt()
    print("Enter Subject 4 Marks : ")
    val sub4 = reader.nextInt()
    print("Enter Subject 5 Marks : ")
    val sub5 = reader.nextInt()
    print("Enter Subject 6 Marks : ")
    val sub6 = reader.nextInt()

    // Calculate the total
    val total = sub1 + sub2 + sub3 + sub4 + sub5 + sub6
    println("Your Total is : $total")

    // Calculate the percentage
    val percentage = total / 6
    println("Your Percentage : $percentage")

    // Print the grade
    if (percentage >= 70){
        print("Fully Passed with Distinction")
    }
    else if (percentage >= 60){
        print("Passed with First Class")
    }
    else if (percentage >= 50){
        print("Passed with Second Class")
    }
    else if (percentage >= 40){
        print("Passed with Third Class")
    }
    else{
        print("You Fail")
    }
}

/*
Output :
Enter Subject 1 Marks : 65
Enter Subject 2 Marks : 78
Enter Subject 3 Marks : 85
Enter Subject 4 Marks : 36
Enter Subject 5 Marks : 45
Enter Subject 6 Marks : 95
Your Total is : 404
Your Percentage : 67
Passed With First Class
 */