# lab4
Класс RListStudent:<br>
interface RListStudentProps : RProps {<br>
    var studentList: ArrayList<Student><br>
}<br>

class RListStudent: RComponent<RListStudentProps, RState>() {<br>
    override fun RBuilder.render() {<br>
        ol {<br>
            studentList.forEach {<br>
                li {<br>
                    rstudent(it)<br>
                }<br>
            }<br>
        }<br>
    }<br>
}<br>

fun RBuilder.rliststudent(studentList: ArrayList<Student>) =<br>
    child(<br>
        functionalComponent<RListStudentProps> {<br>
            ol {<br>
                data.studentList.forEach {<br>
                    li {<br>
                        rstudent(it)<br>
                    }<br>
                }<br>
            }<br>
        }<br>
    ){<br>
        attrs.studentList = studentList<br>
    }<br>
    В функцию передан список студентов.В child() вызвана функция для создания функционального компонента. Внутри этой функции находится rstudent, что позволяет создать компонент для каждого студента. В результате создается компонент, который содержит в себе список студентов. Список: ![](screen4/список.png) Элементы списка:<br>студент 1 ![](screen4/студент1.png)студент 2 ![](screen4/студент2.png) студент 3 ![](screen4/студент3.png)
