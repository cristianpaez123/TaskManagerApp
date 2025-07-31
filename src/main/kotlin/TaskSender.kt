package org.example

interface TaskSender {
    fun send(task: Task): Result<Unit>
}

class RemoteTaskSender : TaskSender {
    override fun send(task: Task): Result<Unit> {
        return try {
            println("Enviando tarea al servidor: $task")
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}