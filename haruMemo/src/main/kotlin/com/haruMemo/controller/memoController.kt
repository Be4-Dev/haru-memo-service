package com.haruMemo.controller

import com.haruMemo.dto.MemoDto
import com.haruMemo.service.memoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
class memoController {

    @Autowired
    lateinit var memoService: memoService;

    @GetMapping("/")
    fun index():String{
        return "index.html"
    }

    @PostMapping("/memos")
    fun write(memoDto: MemoDto): String {
        memoService.writeMemo(memoDto);
        return "redirect:/"
    }
}