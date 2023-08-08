package com.haru.memo.exception

class MemoNotFoundException(memoId:Long)
    : RuntimeException("${memoId}번의 memoId를 찾을 수 없습니다.")