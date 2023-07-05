package com.haruMemo.service

import com.haruMemo.dto.MemoDto
import com.haruMemo.mapper.MemoMapper
import com.haruMemo.model.MemoVo
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MemoServiceImpl(private val memoMapper: MemoMapper) : MemoService {

    @Transactional // 데이터변경로직에만 어노테이션 붙여주기
    override fun writeMemo(memoDto: MemoDto) {
        memoMapper.insert(memoVo = memoDto.toMemoVo())
    }

    override fun copyMemo(memoId: Long) {
        memoMapper.copy(memoId)
    }

    override fun updateMemo(memoId: Long, memoDto: MemoDto) {
        memoMapper.update(memoVo = memoDto.toMemoVo(), memoId)
    }

    override fun updateKeepYNMemo(memoId: Long) {
        println("서비스임플@@")
        println(memoId)
        memoMapper.updateKeepYNMemo(memoId)
    }

    override fun getList(searchKeyword: String,sort:String): List<MemoVo> {
        return memoMapper.getList(searchKeyword,sort)
    }

    override fun getMemo(memoId: Long): MemoVo {
        return memoMapper.getMemo(memoId)
    }

    override fun deleteMemo(memoId: Long) {
        memoMapper.delete(memoId)
    }
}