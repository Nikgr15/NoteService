package ru.netology

object NoteService {
    private var notes = mutableListOf<Note>()
    private var deletedNotes = mutableListOf<Note>()
    private var comments = mutableListOf<Comment>()
    private var deleteComments = mutableListOf<Comment>()
    private var currentId = 1

    fun add(note: Note): Note {
        notes.plusAssign(note.copy(id = currentId++))
        return notes.last()
    }

    fun commentCreate(comment: Comment): Boolean {
        for(note: Note in notes) {
            if (note.id == comment.noteId) {
                val commentList = (note.comments).toMutableList()
                commentList.add(comment)
                val updatedNote = note.copy(comments = commentList)
                notes[notes.indexOf(note)] = updatedNote
                return true
            }
        }
        return false
    }
    fun deleteNote(noteId: Int): Boolean {
        if (noteId < 0 || noteId > notes.size) {
            print("Такого ID не существует")
            return false
        }
        for (note: Note in notes) {
            if (noteId == note.id) {
                deletedNotes.add(note)
                notes.remove(note)
                return true
            }
        }
        return false
    }
    fun deleteComment(commentId: Int): Boolean {
        for (comment in comments)
            if (commentId != comment.commentId) {
                print("Такого Id не существует")
                return false
            } else {
                for (comment in comments) {
                    if (commentId == comment.commentId) {
                        deleteComments.add(comment)
                        comments.remove(comment)
                        print("Комментарий удален")
                        return true
                    }

                }
            }
        return false
    }
    fun recoverComment(commentId: Int): Boolean {
        for (comment in deleteComments) {
            if (commentId == comment.commentId) {
                comments.add(comment)
                deleteComments.remove(comment)
                return true
            }

            }
        return false
        }
    }