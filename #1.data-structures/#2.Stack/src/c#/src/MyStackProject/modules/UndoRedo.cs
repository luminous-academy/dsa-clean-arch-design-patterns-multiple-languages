public class UndoRedo<T>
{
  private Stack<T> undoStack = new Stack<T>();
  private Stack<T> redoStack = new Stack<T>();

  public void AddAction(T action) 
  {
    undoStack.Push(action);
    redoStack = new Stack<T>();
  }

  public T? Undo()
  {
    var action = undoStack.Pop();
    if(action != null) {
      redoStack.Push(action);
    }

    return action;
  }

  public T? Redo()
  {
    var action = redoStack.Pop();
    if(action != null) {
      undoStack.Push(action);
    }
    return action;
  }

  public void Debug() {
    Console.WriteLine("Undo Stack: " + string.Join(',', undoStack.GetItems()));
    Console.WriteLine("Redo Stack: " + string.Join(',', redoStack.GetItems()));
  }

}