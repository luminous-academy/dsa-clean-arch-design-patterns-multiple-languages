import { UndoRedo } from "./modules/UndoRedo";

const undoRedo = new UndoRedo<string>();

// Adicionando ações
undoRedo.addAction("Ação 1");
undoRedo.addAction("Ação 2");
undoRedo.addAction("Ação 3");

// Desfazendo ações
console.log("Undo: ", undoRedo.undo()); // Ação 3
console.log("Undo: ", undoRedo.undo()); // Ação 2

// Refazendo ações
console.log("Redo: ", undoRedo.redo()); // Ação 2
console.log("Redo: ", undoRedo.redo()); // Ação 3

// Adicionando uma nova ação, limpa o redo
undoRedo.addAction("Ação 4");

undoRedo.debug();

// Tentativa de refazer (deve falhar, pois o redo foi limpo)
console.log("Redo: ", undoRedo.redo()); // undefined
