package com.haru.memo.dto

import com.haru.memo.model.FolderEntity

data class FolderDto(
    val id: Long? = null,
    val name: String,
    val thumbnail: String? = null,
) {
    fun toFolderEntity(): FolderEntity {

        return FolderEntity(
            id = id,
            name = name,
            thumbnail = thumbnail
        )
    }
}