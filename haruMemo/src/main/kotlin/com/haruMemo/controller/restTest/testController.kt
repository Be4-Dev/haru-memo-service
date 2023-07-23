package com.haruMemo.controller.restTest

import com.haruMemo.dto.MemoDto
import com.haruMemo.model.MemoVo
import com.haruMemo.service.MemoService
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/apiTest")
class testController(private val memoService: MemoService) {

    @GetMapping("/memos")
    fun memos(@RequestParam("searchKeyword", required = false, defaultValue = "")searchKeyword:String,
              @RequestParam("sort", required = false, defaultValue = "num")sort:String
    ):List<MemoVo>
    {
        return memoService.getList(searchKeyword,sort)
    }

    //메모작성
    @PostMapping("/memos")
    fun write(memoDto: MemoDto): String {
        memoService.writeMemo(memoDto)
        return "메모 작성 API 완료"
    }

    //메모복사
    @PostMapping("/memos/{memoId}")
    fun copy(@PathVariable memoId: Long): String {
        memoService.copyMemo(memoId)
        return "메모 복사 API 완료"
    }

    //메모수정
    @PutMapping("/memos/{memoId}")
    fun update(@PathVariable memoId: Long, @RequestBody memoDto: MemoDto): String {
        memoService.updateMemo(memoId, memoDto)
        return "메모 수정 API 완료"
    }

    //메모삭제
    @DeleteMapping("/memos/{memoId}")
    fun delete(@PathVariable memoId: Long): String{
        memoService.deleteMemo(memoId)
        return "메모 삭제 API 완료"
    }

    //메모보관여부변경
    @PatchMapping("/memos/{memoId}")
    fun updateKeepYNMemo(@PathVariable memoId: Long): String {
        memoService.updateKeepYNMemo(memoId)
        return "메모 보관여부변경 API 완료"
    }
}