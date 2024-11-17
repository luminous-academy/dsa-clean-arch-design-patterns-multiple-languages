import { Stack } from "./Stack";

export class UndoRedo<T> {
  private undoStack: Stack<T> = new Stack<T>();
  private redoStack: Stack<T> = new Stack<T>();

  addAction(action: T): void {
    this.undoStack.push(action);
    this.redoStack = new Stack(); // Limpa a pilha de redo
  }

  undo(): T | undefined {
    const action = this.undoStack.pop();
    if (action !== undefined) {
      this.redoStack.push(action);
    }

    return action;
  }

  redo() {
    const action = this.redoStack.pop();
    if (action !== undefined) {
      this.undoStack.push(action);
    }

    return action;
  }

  debug(): void {
    console.log("Undo Stack: ", [...this.undoStack.getItems()]);
    console.log("Redo Stack: ", [...this.redoStack.getItems()]);
  }
}
