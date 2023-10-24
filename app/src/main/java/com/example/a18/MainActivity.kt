package com.example.a18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(s: String): Int {
                var answer = 0
                answer = s.toInt()
                return answer
            }
        }

        val a = Solution()
        a.solution("1234")
        a.solution("+1234")
        a.solution("-1234")
    }
}