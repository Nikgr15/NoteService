package ru.netology

data class Note(
        val id: Int,
        val ownerId: Int,
        val date: Int,
        val text: String,
        val comments: List<Comment>,
        val deletedComments: List<Comment>,
) {

    override fun toString(): String {
        return "( id= $id, ownerId= $ownerId, date= $date, text= $text, comments= $comments, deleted" +
                "comments= $deletedComments)"
    }

}