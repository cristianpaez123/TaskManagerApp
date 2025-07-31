package org.example
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val repository = InMemoryTaskRepository()
    val sender = RemoteTaskSender()
    val manager = TaskManager(repository, sender)

    manager.addTask("Aprender Kotlin", "2025-08-01")
    manager.addTask("Enviar informe", "2025-08-02")

    val results = manager.syncTasks()

    for ((task, result) in results) {
        if (result.isSuccess) {
            println("Tarea '${task.title}' sincronizada correctamente.")
        } else {
            println("Error al sincronizar '${task.title}': ${result.exceptionOrNull()?.message}")
        }
    }
}