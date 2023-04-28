package com.haruMemo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class firstController {

    @GetMapping("test")
    fun test(model:Model):String{

        return "index.html" // html 모델로 반환
    }

    @GetMapping("resTest")
    @ResponseBody
    fun res(model:Model):String{

        return "ResponseBody 테스트" // 문자열로 반환
    }

    @GetMapping("pathVTest/{pathVPa}")
    @ResponseBody
    fun pathVRes(@PathVariable("pathVPa") pathV:String):String{

        return pathV // 변수로 받은 {pathVPa}을 pathV에 넣어줌 > @pathVariable의 기능
    }
}