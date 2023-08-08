package com.haru.memo.repository

import com.haru.memo.model.FolderEntity
import org.springframework.data.jpa.repository.JpaRepository

interface FolderRepository: JpaRepository<FolderEntity, Long> {
}