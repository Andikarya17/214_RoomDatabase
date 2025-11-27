package com.example.myroomsatu.viewmodel.provider

package com.example.myroomsatu.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myroomsatu.viewmodel.EntryViewModel
import com.example.myroomsatu.viewmodel.HomeViewModel
import com.example.myroomsatu.AplikasiSiswa

object PenyediaViewModel {

    val Factory = viewModelFactory {

        initializer {
            HomeViewModel(
                repositoriSiswa = aplikasiSiswa().container.repositoriSiswa
            )
        }

        initializer {
            EntryViewModel(
                repositoriSiswa = aplikasiSiswa().container.repositoriSiswa
            )
        }
    }
}
fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)

