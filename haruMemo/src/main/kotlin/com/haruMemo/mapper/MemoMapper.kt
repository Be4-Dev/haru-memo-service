package com.haruMemo.mapper

import com.haruMemo.model.MemoVo
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface MemoMapper {
    fun insert(memoVo: MemoVo)
    fun copy(memoId: Long)
    fun update(memoVo: MemoVo, memoId:Long)
    fun updateKeepYNMemo(memoId:Long)
    fun getList(searchKeyword:String,sort:String):List<MemoVo>
    fun getMemo(memoId:Long):MemoVo
    fun delete(memoId:Long)
}