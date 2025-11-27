package com.example.myroomsatu.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myroomsatu.viewmodel.EntryViewModel
import com.example.myroomsatu.viewmodel.HomeViewModel
import com.example.myroomsatu.repositori.AplikasiSiswa

object PenyediaViewModel {

    val Factory = viewModelFactory {

        initializer {
            val app = aplikasiSiswa()
            HomeViewModel(app.container.repositoriSiswa)
        }

        initializer {
            val app = aplikasiSiswa()
            EntryViewModel(app.container.repositoriSiswa)
        }
    }
}

fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)
