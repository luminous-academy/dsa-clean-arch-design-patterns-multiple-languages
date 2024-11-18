from typing import Generic, TypeVar, Optional
from modules.Stack import Stack  # Assumindo que o Stack está implementado em um arquivo separado chamado stack.py

T = TypeVar('T')

class UndoRedo(Generic[T]):
    def __init__(self):
        self._undo_stack: Stack[T] = Stack[T]()
        self._redo_stack: Stack[T] = Stack[T]()

    def add_action(self, action: T) -> None:
        self._undo_stack.push(action)
        self._redo_stack = Stack()  # Limpa a pilha de redo

    def undo(self) -> Optional[T]:
        action = self._undo_stack.pop()
        if action is not None:
            self._redo_stack.push(action)
        return action

    def redo(self) -> Optional[T]:
        action = self._redo_stack.pop()
        if action is not None:
            self._undo_stack.push(action)
        return action

    def debug(self) -> None:
        print("Undo Stack:", list(self._undo_stack.items))
        print("Redo Stack:", list(self._redo_stack.items))
