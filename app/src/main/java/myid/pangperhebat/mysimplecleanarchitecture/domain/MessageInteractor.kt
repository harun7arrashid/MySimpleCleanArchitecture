package myid.pangperhebat.mysimplecleanarchitecture.domain

class MessageInteractor(private val messageRepository: IMessageRepository): MessageUseCase {

    override fun getMessage(name: String): MessageEntity {
        return messageRepository.getWelcomeMessage(name)
    }

}

// Package di atas merupakan komponen utama yang tidak akan berubah-ubah walaupun terjadi perubahan pada Layer Data dan Presentation. Jika dilihat secara teliti, kode di atas tidak tergantung dengan framework dan hanya berisi fungsi Kotlin murni.