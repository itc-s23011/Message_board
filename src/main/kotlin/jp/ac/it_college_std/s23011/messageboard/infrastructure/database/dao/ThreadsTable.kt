package jp.ac.it_college_std.ss23011.messageboard.infrastructure.database.dao

import org.jetbrains.exposed.dao.id.LongIdTable
import org.jetbrains.exposed.sql.kotlin.datetime.datetime

object ThreadsTable  : LongIdTable("threads") {
    val title = varchar("title", 256)
    val userId = reference("user_id", UsersTable)
    val createdBy = reference("created_by", UsersTable)
    val createdAt = datetime("created_at")
    val updatedAt = datetime("updated_at")
    val deleted = bool("deleted").default(false)
}