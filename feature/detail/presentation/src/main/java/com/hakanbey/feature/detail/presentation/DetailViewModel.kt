package com.hakanbey.feature.detail.presentation

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.hakanbey.common.data.util.onError
import com.hakanbey.common.data.util.onSuccess
import com.hakanbey.common.presentation.base.BaseViewModel
import com.hakanbey.feature.detail.domain.entity.GetCharacterDetailResponseModelEntity
import com.hakanbey.feature.detail.domain.usecase.GetCharacterDetailUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class DetailViewModel @Inject constructor(
    application: Application,
    private val useCase: GetCharacterDetailUseCase
) : BaseViewModel(application) {

    private val _characterDetail = MutableLiveData<GetCharacterDetailResponseModelEntity>()
    val characterDetail: LiveData<GetCharacterDetailResponseModelEntity> = _characterDetail

    fun getCharacterDetail(id: String) {
        viewModelScope.launch(Dispatchers.IO) {
            useCase.invoke(id)
                .onStart { showIndicator() }
                .onCompletion { hideIndicator() }
                .collect { result ->
                    result.onSuccess { success ->
                        _characterDetail.postValue((success.data))
                    }
                    result.onError { error ->
                        println("Error: $error")
                        error.networkError.printStackTrace()
                    }
                }
        }
    }

}