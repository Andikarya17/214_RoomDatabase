package com.example.myroomsatu.repositori

interface ContainerApp {
    val repositoriSiswa: RepositoriSiswa
}
class ContainerDataApp(private val context: Context) : ContainerApp {
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(
            siswaDao = DatabaseSiswa.getDatabase(context).siswaDao()
        )
    }
}
