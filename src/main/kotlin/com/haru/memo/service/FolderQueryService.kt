package com.haru.memo.service

import com.haru.memo.model.FolderVo

interface FolderQueryService {
    fun getList():List<FolderVo>
}