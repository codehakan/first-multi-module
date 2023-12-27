package com.hakanbey.feature.detail.presentation

import android.app.Application
import com.hakanbey.common.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class DetailViewModel @Inject constructor(
    application: Application
) : BaseViewModel(application) {


}