package com.programmergabut.quranyuk.domain.repository

import com.programmergabut.quranyuk.domain.model.ReadSurah
import com.programmergabut.quranyuk.domain.model.Surah

interface QuranRepository {
    @Throws(Exception::class)
    suspend fun getAllSurah(): List<Surah>
    @Throws(Exception::class)
    suspend fun getReadSurah(surahId: Int): ReadSurah?
}