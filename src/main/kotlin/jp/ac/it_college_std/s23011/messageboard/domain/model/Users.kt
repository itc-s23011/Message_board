package jp.ac.it_college_std.ss23011.messageboard.domain.model

data class Users(
    val id: Long,
    val viewName: String,
    val email: String,
    val password: String
)
