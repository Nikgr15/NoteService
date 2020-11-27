package ru.netology

fun main() {

    val firstNote = Note(
            id = 1, ownerId = 11, date = 21_11_2020, text = "First Note", comments = emptyList(), deletedComments
            = emptyList()
            )

            val secondNote = Note(
                    id = 2, ownerId = 22, date = 20_11_2020, text = "Second Note", comments = emptyList(), deletedComments
            = emptyList()

            )

    val firstComment = Comment(1, 11_10_2020, "Первый комментарий", commentId = 1)
    val secondComment = Comment(2, 12_11_2020, "Второй комментарий", commentId = 2)


    NoteService.add(firstNote)
    NoteService.add(secondNote)
    NoteService.commentCreate(firstComment)
    NoteService.commentCreate(secondComment)
    NoteService.deleteNote(2)
    NoteService.deleteComment(1)
    NoteService.recoverComment(1)

}