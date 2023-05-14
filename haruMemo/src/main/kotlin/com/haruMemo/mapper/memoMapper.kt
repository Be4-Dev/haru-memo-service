package com.haruMemo.mapper

import com.haruMemo.dto.MemoDto
import org.apache.ibatis.annotations.Mapper

@Mapper
interface memoMapper {
    fun insert(memoDto: MemoDto):Unit
}