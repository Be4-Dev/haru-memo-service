package com.haruMemo

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HaruMemoApplication

fun main(args: Array<String>) {
	runApplication<HaruMemoApplication>(*args)
}
