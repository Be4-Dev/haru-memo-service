package com.haruMemo.dto

data class MemoDto (
    val memoId: Long,
    val memoTitle:String,
    val memoContent:String,
    val memoPassword:String,
    val pinYN:Boolean,
    val memoKeepYN:Boolean,
    val memoDeleteYN:Boolean,
    val regDt:String,
    val updDt:String,
)/*{
    fun writeMemo:
}*/