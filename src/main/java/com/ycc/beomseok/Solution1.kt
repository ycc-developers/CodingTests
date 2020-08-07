package com.ycc.beomseok

class Solution1 {
    fun solve(compressed: String): Int {
        val compressedResult = mutableListOf<Int>()
        val maxWrapWordCount = compressed.length / 2
        for (i in maxWrapWordCount downTo 1) {
            val compress = compress(compressed, i)
            compressedResult += compress
        }
        return compressedResult.min()?: compressed.length
    }

    private fun compress(src: String, wrapWordCount: Int): Int {
        val wordArray = mutableListOf<String>()
        val wordCounterArray = mutableListOf<Int>()
        for (i in src.indices step wrapWordCount) {
            val endIndex = (i + wrapWordCount).coerceAtMost(src.length)
            val wrapWord = src.substring(i, endIndex)
            if (wordArray.isNotEmpty() && wordArray[wordArray.size - 1] == wrapWord) {
                wordCounterArray[wordArray.size - 1]++
            } else {
                wordArray.add(wrapWord)
                wordCounterArray.add(1)
            }
        }
        var result = 0
        for ((index, word) in wordArray.withIndex()) {
            val entryCount = if (wordCounterArray[index] == 1) "" else "${wordCounterArray[index]}"
            val wordCount = "$entryCount${word}".length
            result += wordCount
        }
        return result
    }
}