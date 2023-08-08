package com.haruMemo.repository

import com.haruMemo.model.MemoEntity
import org.springframework.data.jpa.repository.JpaRepository

interface MemoRepository: JpaRepository<MemoEntity, Long> {
}