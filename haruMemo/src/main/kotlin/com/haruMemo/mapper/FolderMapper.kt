package com.haruMemo.mapper

import com.haruMemo.model.FolderVo
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface FolderMapper {
    fun getList():List<FolderVo>
}