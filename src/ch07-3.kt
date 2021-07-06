import java.time.LocalDateTime

data class TwitterMessage(
    var userName: String,
    var userId: String,
    var createdAt: LocalDateTime,
    var content: String,
    var retweeted: Int,
    var liked: Int)