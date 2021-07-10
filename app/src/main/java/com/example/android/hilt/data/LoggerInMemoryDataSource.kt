package com.example.android.hilt.data

import java.util.*
import javax.inject.Inject


/**
 * Created by Raouf Ben Ammar on 10/07/2021.
 */
class LoggerInMemoryDataSource @Inject constructor() : LoggerDataSource {

    private val logs = LinkedList<Log>()

    override fun addLog(msg: String) {
        logs.addFirst(Log(msg, System.currentTimeMillis()))
    }

    override fun getAllLogs(callback: (List<Log>) -> Unit) {
        callback(logs)
    }

    override fun removeLogs() {
        logs.clear()
    }
}