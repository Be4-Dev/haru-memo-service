package com.haruMemo.dto

import com.haruMemo.model.FolderEntity

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