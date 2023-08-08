package com.haruMemo.service

import com.haruMemo.model.MemoVo

interface MemoQueryService {
    fun getList(searchKeyword:String,sort:String):List<MemoVo>
    fun getMemo(memoId:Long):MemoVo
}