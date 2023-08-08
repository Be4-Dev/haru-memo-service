package com.haru.memo.service

import com.haru.memo.mapper.FolderMapper
import com.haru.memo.mapper.MemoMapper
import com.haru.memo.model.FolderVo
import com.haru.memo.model.MemoVo
import org.springframework.stereotype.Service

@Service
class FolderQueryServiceImpl(private val folderMapper: FolderMapper) : FolderQueryService {

    override fun getList(): List<FolderVo> {
        return folderMapper.getList()
    }
}