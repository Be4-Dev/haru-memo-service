package com.haruMemo.model

data class MemoVo(//기본값이 없으면 맵퍼단계에서 에러가 남, 개념 알아보기
    val memoId: Long? = null,
    val memoTitle: String = "",
    val memoContent: String = "",
    val regDt: String? = null,
    val updDt: String? = null,
    val memoPassword: String? = null,
    val pinYN: Boolean? = null,
    val memoKeepYN: String? = null,
    val memoDeleteYN: Boolean? = null,
)