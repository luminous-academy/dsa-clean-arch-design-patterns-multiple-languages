public class ClientCode {
  public static void main(String[] args) {
    UndoRedo<String> undoRedo = new UndoRedo<>();

    // Adicionando ações
    undoRedo.addAction("Ação 1");
    undoRedo.addAction("Ação 2");
    undoRedo.addAction("Ação 3");

    // Desfazendo ações
    System.out.println("Undo: " + undoRedo.undo()); // Ação 3
    System.out.println("Undo: " + undoRedo.undo()); // Ação 2

    // Refazendo ações
    System.out.println("Redo: " + undoRedo.redo()); // Ação 2
    System.out.println("Redo: " + undoRedo.redo()); // Ação 3

    // Adicionando uma nova ação limpa o redo
    undoRedo.addAction("Ação 4");

    // Tentativa de refazer (deve falhar porque o redo foi limpo)
    System.out.println("Redo: " + undoRedo.redo()); // null

    // Debug para visualizar as pilhas
    undoRedo.debug();
  }
}
