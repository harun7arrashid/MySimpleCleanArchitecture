package myid.pangperhebat.mysimplecleanarchitecture.domain

// class yang akan menjadi basis dari semua Use Case
interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}