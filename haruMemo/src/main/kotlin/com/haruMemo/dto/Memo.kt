package com.haruMemo.dto

import com.haruMemo.model.MemoVo
import org.jetbrains.annotations.NotNull

data class MemoDto(
    val memoId: Long?,
    val memoTitle: String,
    val memoContent: String,
    val memoPassword: String?,
    val pinYN: Boolean?,
    val memoKeepYN: String?,
    val memoDeleteYN: Boolean?,
    val regDt: String?,
    val updDt: String?,
) {
    fun toMemoVo(): MemoVo {

        return MemoVo(
            memoId = memoId,
            memoTitle = memoTitle,
            memoContent = memoContent,
            memoPassword = memoPassword,
            pinYN = pinYN,
            memoKeepYN = memoKeepYN,
            memoDeleteYN = memoDeleteYN,
            regDt = regDt,
            updDt = updDt
        )
    }
}