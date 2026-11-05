package com.example.myapplication.data
import com.example.myapplication.model.Word
import java.util.LinkedList

class Datasource {

    fun loadWords(): LinkedList<Word> {

        val wordList = LinkedList<Word>()
        for (i in 0 until 20) {
            wordList.addLast(Word("Word $i"))
        }
        return wordList
    }
}
