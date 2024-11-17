var undoRedo = new UndoRedo<string>();

undoRedo.AddAction("Ação 1");
undoRedo.AddAction("Ação 2");
undoRedo.AddAction("Ação 3");

// Desfazendo as ações 
Console.WriteLine("Undo: " + undoRedo.Undo()); // Ação 3
Console.WriteLine("Undo: " + undoRedo.Undo()); // Ação 2


Console.WriteLine("Redo: " + undoRedo.Redo()); // Ação 2
Console.WriteLine("Redo: " + undoRedo.Redo()); // Ação 3

undoRedo.Debug();

undoRedo.AddAction("Açao 4");

Console.WriteLine("Redo: " + (undoRedo.Redo() ?? "Nada para refazer")); // null

undoRedo.Undo();

undoRedo.Debug();