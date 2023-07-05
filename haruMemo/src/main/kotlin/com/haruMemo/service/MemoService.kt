package com.haruMemo.service

import com.haruMemo.dto.MemoDto
import com.haruMemo.model.MemoVo

interface MemoService {
    fun writeMemo(memoDto: MemoDto):Unit //Unit은 자바의 void와 비슷, 적응되면 주석 지우기
    fun copyMemo(memoId:Long)
    fun updateMemo(memoId:Long, memoDto: MemoDto):Unit //Unit은 자바의 void와 비슷, 적응되면 주석 지우기
    fun updateKeepYNMemo(memoId:Long):Unit //Unit은 자바의 void와 비슷, 적응되면 주석 지우기
    fun getList(searchKeyword:String,sort:String):List<MemoVo>
    fun getMemo(memoId:Long):MemoVo
    fun deleteMemo(memoId:Long)
}