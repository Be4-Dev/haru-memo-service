package com.haruMemo.service

import com.haruMemo.dto.MemoDto

interface memoService {
    fun writeMemo(memoDto: MemoDto):Unit //Unit은 자바의 void와 비슷, 적응되면 주석 지우기
}