// Import Statement
import java.util.Scanner

class Marksheet1(a_s1: Int, a_s2: Int, a_s3: Int) {
    val s1 = a_s1
    val s2 = a_s2
    val s3 = a_s3

    fun result() {
        var result: String = ""
        if (s1 < 28 || s2 < 28 || s3 < 28) {
            print("Fail")
        } else {
            var total = s1 + s2 + s3
            var per = total / 300 
            if (per > 70) {
                print("Passed With Distinction")
            } else if (per > 60) {
                print("Passed With First Class")
            }else if (per > 50){
                print("Passed With Second Class")
            }else if (per > 40){
                print("Passed With Thrid Class")
            }
            println(total)
            println(per)
            println(result)
        }
    }
}

fun main(){
    val readData = Scanner(System.`in`)

    try {
        print("Enter Marks 1 : ")
        val s1 = readData.nextInt()
        print("Enter Marks 2 : ")
        val s2 = readData.nextInt()
        print("Enter Marks 3 : ")
        val s3 = readData.nextInt()

        val stud1 = Marksheet1(s1,s2,s3)
        println(stud1.result())
    }catch (e:Exception) {
        println(e.message + "Please Enter Numeric Value Only")
    }
}