package com.haru.memo.service

import com.haru.memo.dto.FolderDto
import com.haru.memo.repository.FolderRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional // 데이터변경로직에만 어노테이션 붙여주기
@Service
class FolderCommandServiceImpl(private val folderRepository: FolderRepository) : FolderCommandService {

    override fun addFolder(folderDto: FolderDto) {
        folderRepository.save(folderDto.toFolderEntity())
    }

    override fun deleteFolder(folderId: Long) {
        folderRepository.deleteById(folderId)
    }
}