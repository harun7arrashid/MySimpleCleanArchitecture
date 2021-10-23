package myid.pangperhebat.mysimplecleanarchitecture.domain

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner


// memeriksa apakah data yang didapat pada UseCase berasal dari Repository atau tidak.

@RunWith(MockitoJUnitRunner::class)
class MessageUseCaseTest {

    private lateinit var messageUseCase: MessageUseCase

    @Mock
    private lateinit var messageRepository: IMessageRepository // karena ini berupa interface, maka dapat dibikin mock dgn mudah. dan mengembalikan data dummy ketika fungsi dipanggil

    @Before
    fun setUp() {
        messageUseCase   = MessageInteractor(messageRepository)
        val dummyMessage = MessageEntity("Hello $NAME Welcome to Clean Architecture")
        `when`(messageRepository.getWelcomeMessage("$NAME")).thenReturn(dummyMessage)
    }

    @Test
    fun `should get data from repository`() {
        val message = messageUseCase.getMessage("$NAME")

        verify(messageRepository).getWelcomeMessage("$NAME")
        verifyNoMoreInteractions(messageRepository) // untuk memastikan semua interaksi sudah di-verify. Fungsi ini akan membuat test gagal jika ada interaksi yang belum di-verify
        Assert.assertEquals("Hello $NAME Welcome to Clean Architecture", message.welcomeMessage) // memvalidasi hasil message yang didapatkan apakah sesuai dengan ekspektasi atau tidak
    }

    companion object {
        const val NAME = "Dicoding"
    }

}