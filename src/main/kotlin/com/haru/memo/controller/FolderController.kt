package com.haru.memo.controller

import com.haru.memo.model.FolderVo
import com.haru.memo.service.FolderQueryService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class FolderController(
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