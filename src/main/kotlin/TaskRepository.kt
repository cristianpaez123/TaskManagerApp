package org.example

interface TaskRepository {
    fun addTask(task: Task)
    fun getTasks(): List<Task>
}

class InMemoryTaskRepository : TaskRepository {
    private val tasks = mutableListOf<Task>()
    override fun addTask(task: Task) {
        tasks.add(task)
    }
    override fun getTasks(): List<Task> = tasks
}