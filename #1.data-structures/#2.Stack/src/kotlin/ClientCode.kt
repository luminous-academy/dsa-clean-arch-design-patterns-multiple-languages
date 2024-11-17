fun main(args: Array<String>) {
  val undoRedo = UndoRedo<String>()

  // Adicionando ações
  undoRedo.addAction("Ação 1")
  undoRedo.addAction("Ação 2")
  undoRedo.addAction("Ação 3")

  // Desfazendo ações
  println("Undo: ${undoRedo.undo() ?: "Nada para desfazer"}") // Ação 3
  println("Undo: ${undoRedo.undo() ?: "Nada para desfazer"}") // Ação 2

  // Refazendo ações
  println("Redo: ${undoRedo.redo() ?: "Nada para refazer"}") // Ação 2
  println("Redo: ${undoRedo.redo() ?: "Nada para refazer"}") // Ação 3

  // Adicionando uma nova ação limpa o redo
  undoRedo.addAction("Ação 4")

  undoRedo.debug()

  // Tentativa de refazer - deve falhar porque o redo foi limpo
  println("Redo: ${undoRedo.redo() ?: "Nada para refazer"}") // null

  // Debug para visualizar as pilhas
  undoRedo.debug()
}