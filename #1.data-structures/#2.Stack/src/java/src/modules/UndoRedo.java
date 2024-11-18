public class UndoRedo<T> {
  private final Stack<T> undoStack = new Stack<>();
  private Stack<T> redoStack = new Stack<>();

  public void addAction(T action) {
      undoStack.push(action);
      redoStack = new Stack<T>(); // Limpa a pilha de redo
  }

  public T undo() {
      T action = undoStack.pop();
      if (action != null) {
          redoStack.push(action);
      }
      return action;
  }

  public T redo() {
      T action = redoStack.pop();
      if (action != null) {
          undoStack.push(action);
      }
      return action;
  }

  public void debug() {
      System.out.println("Undo Stack: " + undoStack.getItems());
      System.out.println("Redo Stack: " + redoStack.getItems());
  }
}
