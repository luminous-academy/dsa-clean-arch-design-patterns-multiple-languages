class Stack<T> {
    private var items: [T] = []

    func push(_ item: T) {
        items.append(item)
    }

    func pop() -> T? {
        return items.popLast()
    }

    func peek() -> T? {
        return items.last
    }

    func isEmpty() -> Bool {
        return items.isEmpty
    }

    func size() -> Int {
        return items.count
    }

    func clear() {
        items.removeAll()
    }

    func getItems() -> [T] {
        return items
    }
}
