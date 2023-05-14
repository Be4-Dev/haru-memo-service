package com.haruMemo.service

import com.haruMemo.dto.MemoDto
import com.haruMemo.mapper.memoMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class memoServiceImpl : memoService {

    @Autowired
    lateinit var memoMapper: memoMapper;

    override fun writeMemo(memoDto: MemoDto) {
        memoMapper.insert(memoDto)
    }
}