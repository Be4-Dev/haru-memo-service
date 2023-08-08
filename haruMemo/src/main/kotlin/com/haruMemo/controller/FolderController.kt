package com.haruMemo.controller

import com.haruMemo.dto.MemoDto
import com.haruMemo.model.FolderVo
import com.haruMemo.model.MemoVo
import com.haruMemo.service.FolderQueryService
import com.haruMemo.service.MemoCommandService
import com.haruMemo.service.MemoQueryService
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
class FolderController(
    private val memoCommandService: MemoCommandService,
    private val memoQueryService: MemoQueryService,
    private val folderQueryService: FolderQueryService
) {

    @GetMapping("/folder")
    fun memos(model:Model
    ):String
    {
        val folder: List<FolderVo> = folderQueryService.getList()
        model.addAttribute("folder", folder);

        return "folder.html"
    }
}