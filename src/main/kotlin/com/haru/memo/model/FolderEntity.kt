package com.haru.memo.model

import jakarta.persistence.*

@Entity
@Table(name = "folder")
class FolderEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = 0L,

    @Column(name = "name", length = 45)
    var name: String = "",

    @Column(name = "thumbnail", length = 45)
    var thumbnail: String? = null
) {
}