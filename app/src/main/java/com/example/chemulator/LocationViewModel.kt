package com.example.chemulator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LocationViewModel : ViewModel() {
    private var _location = MutableLiveData("United States")
    val location: LiveData<String>
        get() = _location
}
}