package com.haru.memo.service

import com.haru.memo.model.MemoVo

interface MemoQueryService {
    fun getList(searchKeyword:String,sort:String):List<MemoVo>
    fun getMemo(memoId:Long):MemoVo
}