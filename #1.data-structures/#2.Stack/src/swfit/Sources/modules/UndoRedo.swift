class UndoRedo<T> {
    private let undoStack = Stack<T>()
    private var redoStack = Stack<T>()

    func addAction(_ action: T) {
        undoStack.push(action)
        redoStack = Stack() // Limpa a pilha de redo
    }

    func undo() -> T? {
        guard let action = undoStack.pop() else {
            return nil
        }
        redoStack.push(action)
        return action
    }

    func redo() -> T? {
        guard let action = redoStack.pop() else {
            return nil
        }
        undoStack.push(action)
        return action
    }

    func debug() {
        print("Undo Stack: \(undoStack.getItems())")
        print("Redo Stack: \(redoStack.getItems())")
    }
}
