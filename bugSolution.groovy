def myMethod() {
    def list = [1, 2, 3]
    def iterator = list.iterator()
    while (iterator.hasNext()) {
        def it = iterator.next()
        println it
        if (it == 2) {
            iterator.remove()
        }
    }
    println list
}    

//Alternative solution:

def myMethod2() {
    def list = [1, 2, 3]
    def newList = []
    list.each {it->
        if(it != 2){
            newList << it
        }
    }
    println newList
}