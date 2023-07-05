package com.haruMemo.controller

import com.haruMemo.dto.MemoDto
import com.haruMemo.model.MemoVo
import com.haruMemo.service.MemoService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam

@Controller
class MemoController(private val memoService: MemoService) {

    @GetMapping("/memos")
    fun memos(model:Model,
              @RequestParam("searchKeyword", required = false, defaultValue = "")searchKeyword:String,
              @RequestParam("sort", required = false, defaultValue = "num")sort:String
              ):String
    {
        println("확인용 @@")
        println(memoService.getList(searchKeyword,sort))
        val list: List<MemoVo> = memoService.getList(searchKeyword,sort)

        model.addAttribute("list", list);
        return "index.html"
    }

    //메모작성 페이지
    @GetMapping("/write")
    fun write():String{
        return "write.html"
    }

    //메모작성
    @PostMapping("/memos")
    fun write(memoDto: MemoDto): String {
        println("memoDto write 테스트 @@")
        println(memoDto)
        memoService.writeMemo(memoDto)
        return "redirect:/memos"
    }

    //메모복사
    @PostMapping("/memos/{memoId}")
    fun copy(@PathVariable memoId: Long): String {
        println("memo copy 테스트 @@")
        println(memoId)
        memoService.copyMemo(memoId)
        return "redirect:/memos"
    }

    //메모수정 페이지
    @GetMapping("/memos/{memoId}")
    fun update(model:Model, @PathVariable memoId: Long):String{
        val memoVo:MemoVo = memoService.getMemo(memoId)

        println("memoDto update 테스트 @@")
        println(memoVo)

        model.addAttribute("memo", memoVo);
        return "update.html"
    }

    //메모수정
    @PutMapping("/memos/{memoId}")
    fun update(@PathVariable memoId: Long, @RequestBody memoDto: MemoDto): String {
        println("memoDto modify 테스트 @@")
        println(memoId)
        println(memoDto)
        memoService.updateMemo(memoId, memoDto)
        return "redirect:/memos"
    }

    //메모삭제
    @DeleteMapping("/memos/{memoId}")
    fun delete(@PathVariable memoId: Long): String{
        println("memo 삭제 테스트 @@")
        memoService.deleteMemo(memoId)
        return "redirect:/memos"
    }

    //메모보관여부변경
    @PatchMapping("/memos/{memoId}")
    fun updateKeepYNMemo(@PathVariable memoId: Long): String {
        println("memoDto 보관여부수정 테스트 @@")
        memoService.updateKeepYNMemo(memoId)
        return "redirect:/memos"
    }
}