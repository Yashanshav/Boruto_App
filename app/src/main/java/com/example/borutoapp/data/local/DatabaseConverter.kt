package com.example.borutoapp.data.local

import androidx.room.TypeConverter

// Room Database don't know how to handle lists, so we need to convert list to string and back to display in our
// data class properties.
class DatabaseConverter {

    private val separator = ","

    @TypeConverter
    fun convertListToString(list: List<String>): String {
        val stringBuilder = StringBuilder()

        for(item in list) {
            stringBuilder.append(item).append(separator)
        }
        stringBuilder.setLength(stringBuilder.length - separator.length)

        return stringBuilder.toString()
    }

    @TypeConverter
    fun convertStringToList(s: String): List<String> {
        return s.split(separator)
    }
}