package com.haru.memo.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "memo")
class MemoEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memo_id")
    var memoId: Long? = 0L,

    @Column(name = "memo_title", length = 45)
    var memoTitle: String = "",

    @Column(name = "memo_content", length = 45)
    var memoContent: String = "",

    @Column(name = "memo_password", length = 45)
    var memoPassword: String? = null,

    @Column(name = "memo_keep_yn", length = 45)
    var memoKeepYn: String? = null,

    @Column(name = "memo_delete_yn", length = 45)
    var memoDeleteYn: String? = null,

    @Column(name = "reg_dt")
    var regDt: LocalDateTime? = null,

    @Column(name = "upd_dt")
    var updDt: LocalDateTime? = null,

    @Column(name = "folder_id")
    var folderId: Long? = null
) {
    fun copy(): MemoEntity {
        return MemoEntity(
            memoTitle = memoTitle,
            memoContent = memoContent,
            memoPassword = memoPassword,
            memoKeepYn = memoKeepYn,
            memoDeleteYn = memoDeleteYn,
            regDt = regDt,
            updDt = updDt,
            folderId = folderId
        )
    }

    fun modifyMemo(memoTitle: String, memoContent: String, folderId:Long?) {
        this.memoTitle = memoTitle
        this.memoContent = memoContent
        this.folderId = folderId
    }

    fun keep(memoKeepYn: Boolean) {
        this.memoKeepYn = if (memoKeepYn) "Y" else "N"
    }
}