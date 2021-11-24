package myid.pangperhebat.mysimplecleanarchitecture.data

import myid.pangperhebat.mysimplecleanarchitecture.domain.MessageEntity

//  implementasi datasource yang merupakan sumber data message yang akan didapat
class MessageDataSource: IMessageDataSource {

    override fun getMessageFromSource(name: String): MessageEntity =
        MessageEntity("Hello $name! Welcome to Clean Architecture :D")
}