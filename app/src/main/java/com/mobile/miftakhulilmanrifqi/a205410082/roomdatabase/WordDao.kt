package com.mobile.miftakhulilmanrifqi.a205410082.roomdatabase


import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface WordDao {

    @Query("SELECT * from word_table ORDER BY word ASC")
    fun getAlphabetizedWords(): LiveData<List<Word>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend  fun insert(word: Word)

//    @Query("DELETE FROM word_table")
//     fun deleteAll(): List<Word>

    @Query("DELETE FROM word_table")
    suspend fun deleteAll()
}
