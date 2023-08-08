package com.haru.memo.repository

import com.haru.memo.model.MemoEntity
import org.springframework.data.jpa.repository.JpaRepository

interface MemoRepository: JpaRepository<MemoEntity, Long> {
}