package com.example.android.hilt.data


/**
 * Created by Raouf Ben Ammar on 10/07/2021.
 */

interface LoggerDataSource {
    fun addLog(msg: String)
    fun getAllLogs(callback: (List<Log>) -> Unit)
    fun removeLogs()
}