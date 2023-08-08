package com.haruMemo.service

import com.haruMemo.dto.FolderDto

interface FolderCommandService {
    fun addFolder(folderDto: FolderDto):Unit //Unit은 자바의 void와 비슷, 적응되면 주석 지우기
//    fun copyMemo(memoId:Long)
//    fun updateMemo(memoId:Long, memoDto: MemoDto):Unit //Unit은 자바의 void와 비슷, 적응되면 주석 지우기
//    fun updateKeepYNMemo(memoId:Long, keepYn: Boolean):Unit //Unit은 자바의 void와 비슷, 적응되면 주석 지우기
    fun deleteFolder(folderId:Long)
}