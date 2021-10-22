package myid.pangperhebat.mysimplecleanarchitecture.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import myid.pangperhebat.mysimplecleanarchitecture.domain.MessageEntity
import myid.pangperhebat.mysimplecleanarchitecture.domain.MessageUseCase

class MainViewModel(private val msgUseCase: MessageUseCase): ViewModel() {
    private val _message = MutableLiveData<MessageEntity>()
    val message: LiveData<MessageEntity> = _message

    fun setName(name: String) {
        _message.value = msgUseCase.getMessage(name)
    }
}