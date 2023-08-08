package com.haru.memo.service

import com.haru.memo.mapper.MemoMapper
import com.haru.memo.model.MemoVo
import org.springframework.stereotype.Service

@Service
class MemoQueryServiceImpl(private val memoMapper: MemoMapper) : MemoQueryService {

    override fun getList(searchKeyword: String,sort:String): List<MemoVo> {
        return memoMapper.getList(searchKeyword,sort)
    }

    override fun getMemo(memoId: Long): MemoVo {
        return memoMapper.getMemo(memoId)
    }
}