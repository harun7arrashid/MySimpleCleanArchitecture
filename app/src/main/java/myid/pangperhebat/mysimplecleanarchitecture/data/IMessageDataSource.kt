package myid.pangperhebat.mysimplecleanarchitecture.data

import myid.pangperhebat.mysimplecleanarchitecture.domain.MessageEntity


// interface untuk datasource yang merupakan template untuk implementasinya nanti
interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}