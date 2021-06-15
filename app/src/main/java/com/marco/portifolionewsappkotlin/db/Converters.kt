package com.marco.portifolionewsappkotlin.db

import androidx.room.TypeConverter
import com.marco.portifolionewsappkotlin.models.Source

class Converters {

    @TypeConverter
    fun FromSource(source: Source): String {
        return source.name
    }
    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name,name)
    }
}