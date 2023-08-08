package com.haru.memo

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@MapperScan(
	basePackages = ["com.haru.memo.mapper"]
)
class HaruMemoApplication

fun main(args: Array<String>) {
	runApplication<HaruMemoApplication>(*args)
}
