package com.hakanbey.feature.home.presentation.ui

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.hakanbey.common.presentation.base.BaseViewModel
import com.hakanbey.common.data.util.onError
import com.hakanbey.common.data.util.onSuccess
import com.hakanbey.feature.home.domain.repository.entity.ResultEntity
import com.hakanbey.feature.home.domain.repository.usecase.GetAllCharacterUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    application: Application,
    private val useCase: GetAllCharacterUseCase
) : BaseViewModel(application) {

    private val _characterList = MutableLiveData<List<ResultEntity>>()
    val characterList: LiveData<List<ResultEntity>> = _characterList

    fun getAllCharacters() {
        viewModelScope.launch(Dispatchers.IO) {
            useCase.invoke()
                .collect { result ->
                    result.onSuccess { success ->
                        val myList: ArrayList<ResultEntity> = arrayListOf()
                        success.data.results?.let { nullableList ->
                            nullableList.forEach { item ->
                                item?.let { myList.add(it) }
                            }
                        }
                        _characterList.postValue(myList)
                    }
                    result.onError { error ->
                        println("HATA: ${error.networkError}")
                    }
                }
        }
    }

}