package com.example.mipt_2lab

public class WordCounter {
    fun wordCount(input: String): Int
    {
        val words = input.split("\\w+".toRegex())
        val count = words.count() - 1
        return count
    }
    fun symbolCount(input: String): Int
    {
        var count = 0
        for (i in 0..input.length - 1)
        {
            val ch = input[i]
            if (ch != ' ')
            {
                ++count
            }
        }
        return count
    }
}