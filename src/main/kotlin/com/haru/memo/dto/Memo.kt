package com.haru.memo.dto

import com.haru.memo.model.MemoEntity
import java.time.LocalDateTime

data class MemoDto(
    val memoId: Long? = null,
    val memoTitle: String,
    val memoContent: String,
    val memoPassword: String?,
    val pinYN: Boolean?,
    val memoKeepYN: String?,
    val memoDeleteYN: String?,
    val regDt: LocalDateTime?,
    val updDt: LocalDateTime?,
    val folderId: Long? = null
) {
    fun toMemoEntity(): MemoEntity {

        return MemoEntity(
            memoId = memoId,
            memoTitle = memoTitle,
            memoContent = memoContent,
            memoPassword = memoPassword,
            memoKeepYn = memoKeepYN,
            memoDeleteYn = memoDeleteYN,
            regDt = regDt,
            updDt = updDt,
            folderId = folderId
        )
    }
}