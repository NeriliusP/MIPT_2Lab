package com.example.mipt_2lab

import org.junit.Test

import org.junit.Assert.*

class WordCounterTest {
    @Test
    fun word_Count_Test_With_Words_Plus_One_Space(){
        val wordCounter = WordCounter()
        val result = wordCounter.wordCount("Jonas petras Kazys")
        assertEquals(3, result)
    }
    @Test
    fun word_Count_Test_Empty_One_Space(){
        val wordCounter = WordCounter()
        val result = wordCounter.wordCount("")
        assertEquals(0, result)
    }
    @Test
    fun word_Count_Test_Multiple_Empty_Spaces(){
        val wordCounter = WordCounter()
        val result = wordCounter.wordCount("                    ")
        assertEquals(0, result)
    }
    @Test
    fun word_Count_Test_Words_Multiple_Spaces(){
        val wordCounter = WordCounter()
        val result = wordCounter.wordCount("JOnas                         Kazys                                        Juozukas")
        assertEquals(3, result)
    }
    @Test
    fun word_Count_Test_Words_Mixed_With_Symbols(){
        val wordCounter = WordCounter()
        val result = wordCounter.wordCount("JOnas.,.,.,.,.,.,.,.,Kazys,.,.,.,.,,.,.,,,Kazimieras")
        assertEquals(3, result)
    }
    @Test
    fun symbol_Count_Test_One_Word(){
        val wordCounter = WordCounter()
        val result = wordCounter.symbolCount("Petras")
        assertEquals(6, result)
    }
    @Test
    fun symbol_Count_Test_One_Word_Spaced_With_One_Space(){
        val wordCounter = WordCounter()
        val result = wordCounter.symbolCount("P e t r a s")
        assertEquals(6, result)
    }
    @Test
    fun symbol_Count_Test_One_Word_Spaced_With_Multiple_Spaces(){
        val wordCounter = WordCounter()
        val result = wordCounter.symbolCount("P       e t        r   a s     ")
        assertEquals(6, result)
    }
    @Test
    fun symbol_Count_Test_One_Word_Spaced_With_Symbols(){
        val wordCounter = WordCounter()
        val result = wordCounter.symbolCount("P....,e,,,,t,,,r,,,a,,s")
        assertEquals(23, result)
    }
    @Test
    fun symbol_Count_Test_One_Word_Spaced_With_Symbols_And_Spaces(){
        val wordCounter = WordCounter()
        val result = wordCounter.symbolCount("P..   .   .,e,   ,      ,,t,,    ,r,,,   a,,s")
        assertEquals(23, result)
    }
}