package kr.co.bullets.hiltdemo

import android.util.Log

// assume that we cannot access the code of this class
// this class belong to a third party library
// How would you write codes to inject this DataSource Dependency in the MainActivity
class DataSource {
    fun getRemoteData() {
        Log.i("MyTag", "Data downloading....")
    }
}