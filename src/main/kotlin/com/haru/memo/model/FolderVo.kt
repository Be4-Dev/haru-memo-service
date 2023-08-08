package com.haru.memo.model

data class FolderVo(//기본값이 없으면 맵퍼단계에서 에러가 남, 개념 알아보기
    val id: Long? = null,
    val name: String = "",
    val thumbnail: String? = null,
)