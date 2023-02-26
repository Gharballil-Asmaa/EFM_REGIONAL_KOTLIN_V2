

//1
fun String.estVideOuBlanche(){
    if (isEmpty()){
        println("Empty")
    }
    if(isBlank()) {
        println("Blank")
    }
}

//2
fun String.sigle(): String {
    val mots= this.split(" ").filter {
        it.isNotBlank()
    }
    val sigle = StringBuilder()
    for (m in mots) {
        sigle.append(m[0].uppercase())
    }
    return sigle.toString()
}