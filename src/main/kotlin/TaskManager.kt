package org.example

class TaskManager(
    private val repository: TaskRepository,
    private val sender: TaskSender
) {
    fun addTask(title: String, due: String) {
        val task = Task(title, due)
        repository.addTask(task)
    }

    fun syncTasks(): List<Pair<Task, Result<Unit>>> {
        return repository.getTasks().map { task ->
            task to sender.send(task)
        }
    }
}