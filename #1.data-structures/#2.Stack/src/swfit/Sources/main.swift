func main() {
    let undoRedo = UndoRedo<String>()

    // Adicionando ações
    undoRedo.addAction("Ação 1")
    undoRedo.addAction("Ação 2")
    undoRedo.addAction("Ação 3")

    // Desfazendo ações
    print("Undo:", undoRedo.undo() ?? "Nada para desfazer") // Ação 3
    print("Undo:", undoRedo.undo() ?? "Nada para desfazer") // Ação 2

    // Refazendo ações
    print("Redo:", undoRedo.redo() ?? "Nada para refazer") // Ação 2
    print("Redo:", undoRedo.redo() ?? "Nada para refazer") // Ação 3

    // Adicionando uma nova ação limpa o redo
    undoRedo.addAction("Ação 4")

    // Tentativa de refazer (deve falhar porque o redo foi limpo)
    print("Redo:", undoRedo.redo() ?? "Nada para refazer") // nil

    // Debug para visualizar as pilhas
    undoRedo.debug()
}

main()
