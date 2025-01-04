def myMethod() {
    def list = [1, 2, 3]
    list.each { it ->
        println it
        if (it == 2) { list.remove(it) }
    }
}