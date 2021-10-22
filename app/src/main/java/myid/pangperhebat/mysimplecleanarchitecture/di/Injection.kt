package myid.pangperhebat.mysimplecleanarchitecture.di

import myid.pangperhebat.mysimplecleanarchitecture.data.IMessageDataSource
import myid.pangperhebat.mysimplecleanarchitecture.data.MessageDataSource
import myid.pangperhebat.mysimplecleanarchitecture.data.MessageRepository
import myid.pangperhebat.mysimplecleanarchitecture.domain.IMessageRepository
import myid.pangperhebat.mysimplecleanarchitecture.domain.MessageInteractor
import myid.pangperhebat.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}