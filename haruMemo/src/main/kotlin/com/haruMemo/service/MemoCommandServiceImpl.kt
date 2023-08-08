package com.haruMemo.service

import com.haruMemo.dto.MemoDto
import com.haruMemo.exception.MemoNotFoundException
import com.haruMemo.repository.MemoRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional // 데이터변경로직에만 어노테이션 붙여주기
@Service
class MemoCommandServiceImpl(private val memoRepository: MemoRepository) : MemoCommandService {

    override fun writeMemo(memoDto: MemoDto) {
        memoRepository.save(memoDto.toMemoEntity())
    }

    override fun copyMemo(memoId: Long) {
        val originalMemo = memoRepository.findByIdOrNull(memoId)
            ?: throw MemoNotFoundException(memoId)
        val copiedMemo = originalMemo.copy()
        memoRepository.save(copiedMemo)

    }

    override fun updateMemo(memoId: Long, memoDto: MemoDto) {
        val originalMemo = memoRepository.findByIdOrNull(memoId)
            ?: throw MemoNotFoundException(memoId)
        originalMemo.modifyMemo(memoDto.memoTitle, memoDto.memoContent, memoDto.folderId)
    }

    override fun updateKeepYNMemo(memoId: Long, keepYn: Boolean) {
        val originalMemo = memoRepository.findByIdOrNull(memoId)
            ?: throw MemoNotFoundException(memoId)
        originalMemo.keep(keepYn)
    }

    override fun deleteMemo(memoId: Long) {
        memoRepository.deleteById(memoId)
    }
}