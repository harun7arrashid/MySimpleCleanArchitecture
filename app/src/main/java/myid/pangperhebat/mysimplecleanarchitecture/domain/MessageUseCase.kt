package myid.pangperhebat.mysimplecleanarchitecture.domain

// class yang akan menjadi basis dari semua Use Case
//Class ini digunakan sebagai kode induk dari Interactor yang akan didefinisikan.
// untuk meneruskan manggil fungsi di repo
interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}