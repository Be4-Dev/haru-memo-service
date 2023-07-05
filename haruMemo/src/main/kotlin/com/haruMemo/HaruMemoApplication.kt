package com.haruMemo

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@MapperScan(
	basePackages = ["com.haruMemo.mapper"]
)
class HaruMemoApplication

fun main(args: Array<String>) {
	runApplication<HaruMemoApplication>(*args)
}
