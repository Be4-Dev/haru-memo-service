package com.haruMemo.service

import com.haruMemo.mapper.FolderMapper
import com.haruMemo.mapper.MemoMapper
import com.haruMemo.model.FolderVo
import com.haruMemo.model.MemoVo
import org.springframework.stereotype.Service

@Service
class FolderQueryServiceImpl(private val folderMapper: FolderMapper) : FolderQueryService {

    override fun getList(): List<FolderVo> {
        return folderMapper.getList()
    }
}