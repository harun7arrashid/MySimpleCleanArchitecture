package myid.pangperhebat.mysimplecleanarchitecture.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import myid.pangperhebat.mysimplecleanarchitecture.di.Injection
import myid.pangperhebat.mysimplecleanarchitecture.domain.MessageUseCase

// Kelas ini digunakan untuk menginisiasi ViewModel yang memiliki parameter
class MainViewModelFactory (private var messageUseCase: MessageUseCase): ViewModelProvider.NewInstanceFactory() {
    companion object {
        @Volatile
        private var instance: MainViewModelFactory? = null

        fun getInstance(): MainViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: MainViewModelFactory(Injection.provideUseCase())
            }
    }

    @Suppress("UNCHECKED_CAST")

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MainViewModel::class.java) -> MainViewModel(messageUseCase) as T
            else -> throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
        }
    }
}