package entregable.genesis.garcia.td_ejemplomvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import entregable.genesis.garcia.td_ejemplomvvm.model.User

class UserViewModel: ViewModel() {
    //VARIABLE DE LISTA DE USUARIOS
    private val _userList = MutableLiveData<List<User>>()

    // ESTA VARIABLE ES LA QUE SE VA A ENCARGAR DE PROPAGAR EL CAMBIO A SUS OBSERVADORES
    val userList: LiveData<List<User>> = _userList
    fun loadUserList() {
        //SIMULANDO LA CARGA DE DATOS DESDE UNA FUENTE
        val users = listOf(
            User(1, "Genesis Garcia"," Genesis@example.com"),
            User(2, "Martina Garcia","Martina@example.com") )
            _userList.value = users
    }
}