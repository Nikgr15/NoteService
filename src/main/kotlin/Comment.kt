package ru.netology

data class Comment(
        val id: Int,
        val date: Int,
        val text: String,
        val commentId: Int
) {

    override fun toString(): String {
        return "(id= $id, date= $date, text= $text)"
    }
}
