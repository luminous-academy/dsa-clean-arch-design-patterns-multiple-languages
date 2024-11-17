class Stack<T> {
  private val items = mutableListOf<T>()

  fun push(item: T) {
      items.add(item)
  }

  fun pop(): T? {
      return if (items.isNotEmpty()) items.removeAt(items.size - 1) else null
  }

  fun peek(): T? {
      return items.lastOrNull()
  }

  fun isEmpty(): Boolean {
      return items.isEmpty()
  }

  fun size(): Int {
      return items.size
  }

  fun clear() {
      items.clear()
  }

  fun getItems(): List<T> {
      return items.toList() // Retorna uma cópia imutável
  }
}
