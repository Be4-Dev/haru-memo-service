package com.haruMemo.service

import com.haruMemo.model.FolderVo

interface FolderQueryService {
    fun getList():List<FolderVo>
}