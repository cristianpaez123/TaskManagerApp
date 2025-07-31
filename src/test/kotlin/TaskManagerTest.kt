import org.example.InMemoryTaskRepository
import org.example.RemoteTaskSender
import org.example.TaskManager
import kotlin.test.Test
import kotlin.test.assertEquals

class TaskManagerTest {

    @Test
    fun testAddTask() {
        val repo = InMemoryTaskRepository()
        val sender = RemoteTaskSender()
        val manager = TaskManager(repo, sender)

        manager.addTask("Estudiar Kotlin", "2025-08-01")

        val tasks = repo.getTasks()
        assertEquals(1, tasks.size)
        assertEquals("Estudiar Kotlin", tasks[0].title)
    }
}
