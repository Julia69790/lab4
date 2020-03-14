import data.Student
import data.studentList
import react.*
import react.dom.li
import react.dom.ol

interface RListStudentProps : RProps {
    var studentList: ArrayList<Student>
}

class RListStudent: RComponent<RListStudentProps, RState>() {
    override fun RBuilder.render() {
        ol {
            studentList.forEach {
                li {
                    rstudent(it)
                }
            }
        }
    }
}

fun RBuilder.rliststudent(studentList: ArrayList<Student>) =
    child(
        functionalComponent<RListStudentProps> {
            ol {
                data.studentList.forEach {
                    li {
                        rstudent(it)
                    }
                }
            }
        }
    ){
        attrs.studentList = studentList
    }