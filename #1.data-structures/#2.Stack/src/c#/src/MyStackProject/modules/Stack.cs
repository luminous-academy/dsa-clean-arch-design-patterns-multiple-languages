using System;
using System.Collections.Generic;

public class Stack<T>
{
  private readonly List<T> items = new();

  public void Push(T item) 
  {
    items.Add(item);
  }

  public T? Pop()
  {
    if(items.Count == 0) {
      return default;
    }

    var item = items[^1];
    items.RemoveAt(items.Count - 1);
    return item;
  }

  public T? Peek() 
  {
    return items.Count > 0 ? items [^1] : default;
  }

  public bool isEmpty()
  {
    return items.Count == 0;
  }

  public int Size () {
    return items.Count;
  }

  public void Clear() {
    items.Clear();
  }

  public IReadOnlyList<T> GetItems() {
    return items.AsReadOnly();
  }

}