package com.haruMemo.repository

import com.haruMemo.model.FolderEntity
import com.haruMemo.model.MemoEntity
import org.springframework.data.jpa.repository.JpaRepository

interface FolderRepository: JpaRepository<FolderEntity, Long> {
}