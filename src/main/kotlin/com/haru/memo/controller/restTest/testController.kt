package com.haru.memo.controller.restTest

import com.haru.memo.dto.FolderDto
import com.haru.memo.dto.MemoDto
import com.haru.memo.model.MemoVo
import com.haru.memo.service.FolderCommandService
import com.haru.memo.service.MemoCommandService
import com.haru.memo.service.MemoQueryService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/apiTest")
class testController(
    private val memoCommandService: MemoCommandService,
    private val memoQueryService: MemoQueryService,
    private val folderCommandService: FolderCommandService,
) {

    @GetMapping("/memos")
    fun memos(
        @RequestParam("searchKeyword", required = false, defaultValue = "") searchKeyword: String,
        @RequestParam("sort", required = false, defaultValue = "num") sort: String
    ): List<MemoVo> {
        return memoQueryService.getList(searchKeyword, sort)
    }

    //메모작성
    @PostMapping("/memos")
    fun write(memoDto: MemoDto): String {
        memoCommandService.writeMemo(memoDto)
        println(memoDto)
        return "메모 작성 API 완료"
    }

    //메모복사
    @PostMapping("/memos/{memoId}")
    fun copy(@PathVariable memoId: Long): String {
        memoCommandService.copyMemo(memoId)
        return "메모 복사 API 완료"
    }

    //메모수정
    @PutMapping("/memos/{memoId}")
    fun update(@PathVariable memoId: Long, @RequestBody memoDto: MemoDto): String {
        memoCommandService.updateMemo(memoId, memoDto)
        println(memoDto)
        return "메모 수정 API 완료"
    }

    //메모삭제
    @DeleteMapping("/memos/{memoId}")
    fun delete(@PathVariable memoId: Long): String {
        memoCommandService.deleteMemo(memoId)
        return "메모 삭제 API 완료"
    }

    //메모보관여부변경
    @PatchMapping("/memos/{memoId}")
    fun updateKeepYNMemo(@PathVariable memoId: Long, @RequestBody map: Map<String, Boolean>): String {
        memoCommandService.updateKeepYNMemo(memoId, map["memoKeepYn"] ?: false)
        return "메모 보관여부변경 API 완료"
    }

    //폴더작성
    @PostMapping("/folder")
    fun add(@RequestBody folderDto: FolderDto): String {
        println("폴더추가테스트@@@")
        println(folderDto)
        folderCommandService.addFolder(folderDto)
        return "폴더 작성 API 완료"
    }

    //폴더삭제
    @DeleteMapping("/folder/{folderId}")
    fun deleteFolder(@PathVariable folderId: Long): String {
        folderCommandService.deleteFolder(folderId)
        return "메모 삭제 API 완료"
    }
}