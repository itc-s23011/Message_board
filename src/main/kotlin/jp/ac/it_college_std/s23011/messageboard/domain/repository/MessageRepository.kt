package jp.ac.it_college_std.ss23011.messageboard.domain.repository

import jp.ac.it_college_std.ss23011.messageboard.domain.model.Messages


interface MessageRepository {
    fun createMessage(message: Messages): Messages

    fun getMessageById(id: Long): Messages?

    fun getMessageByThreadId(threadId: Long): List<Messages>

    fun updateMessage(message: Messages): Messages

    fun deleteMessage(id: Long)
}