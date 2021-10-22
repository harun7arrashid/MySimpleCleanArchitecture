package myid.pangperhebat.mysimplecleanarchitecture.data

import myid.pangperhebat.mysimplecleanarchitecture.domain.IMessageRepository
import myid.pangperhebat.mysimplecleanarchitecture.domain.MessageEntity

//  Kelas ini akan mengatur datasource yang akan diberikan kepada Use Case.
class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {

    override fun getWelcomeMessage(name: String): MessageEntity =
        messageDataSource.getMessageFromSource(name)

}