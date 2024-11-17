class UndoRedo<T> {
  private var undoStack = Stack<T>()
  private var redoStack = Stack<T>()

  fun addAction(action: T) {
      undoStack.push(action)
      redoStack = Stack<T>() // Limpa a pilha de redo
  }

  fun undo(): T? {
      val action = undoStack.pop()
      if (action != null) {
          redoStack.push(action)
      }
      return action
  }

  fun redo(): T? {
      val action = redoStack.pop()
      if (action != null) {
          undoStack.push(action)
      }
      return action
  }

  fun debug() {
      println("Undo Stack: ${undoStack.getItems()}")
      println("Redo Stack: ${redoStack.getItems()}")
  }
}
