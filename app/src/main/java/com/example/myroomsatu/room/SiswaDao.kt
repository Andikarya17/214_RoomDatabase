package com.example.myroomsatu.room

import androidx.room.Dao
import kotlinx.coroutines.flow.Flow
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface SiswaDao {

    @Query("SELECT * FROM siswa ORDER BY nama ASC")
    fun getAllSiswa(): Flow<List<Siswa>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)
}