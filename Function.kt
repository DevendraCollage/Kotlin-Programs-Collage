class Student{
    var skills: String? = null  // Null Assignment
    fun display(){
        println(skills)
    }
}

fun main(){

    val stud1 = Student()
    stud1.skills = "Singing"
    stud1.display()

    val stud2 = Student()
    stud2.skills = "Dancing"
    stud2.display()

    val stud3 = stud1 + stud2
    stud3.display()
}

infix operator fun Student.plus(s1:Student): Student{
    val newStud = Student()
    newStud.skills = this.skills + " & " + s1.skills
    return newStud
}