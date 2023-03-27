package com.example.roomapp

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Contact::class],
    version = 1
)
abstract class ContactDataBase : RoomDatabase() {

    abstract val dao: ContactDao
}