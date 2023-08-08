package com.haru.memo.mapper

import com.haru.memo.model.FolderVo
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface FolderMapper {
    fun getList():List<FolderVo>
}