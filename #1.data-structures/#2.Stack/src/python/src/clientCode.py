from modules.UndoRedo import UndoRedo  # Assumindo que a classe UndoRedo está no arquivo modules/undo_redo.py

# Exemplo de uso
undo_redo = UndoRedo[str]()

# Adicionando ações
undo_redo.add_action("Ação 1")
undo_redo.add_action("Ação 2")
undo_redo.add_action("Ação 3")

# Desfazendo ações
print("Undo:", undo_redo.undo())  # Ação 3
print("Undo:", undo_redo.undo())  # Ação 2

# Refazendo ações
print("Redo:", undo_redo.redo())  # Ação 2
print("Redo:", undo_redo.redo())  # Ação 3

# Adicionando uma nova ação limpa o redo
undo_redo.add_action("Ação 4")

# Tentativa de refazer (deve falhar porque o redo foi limpo)
print("Redo:", undo_redo.redo())  # None

# Debug para visualizar as pilhas
undo_redo.debug()