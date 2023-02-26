
class Dictionnaire {
    //1
    var Dictionnaire:MutableList<Entree> = mutableListOf()

    //2
    fun nombresEntrées():Int{
        return Dictionnaire.size
    }

    //add
    fun ajouter(e:Entree){
        if (Dictionnaire.contains(e)){
            throw Exception("le mot existe déjà")
        }else {
            Dictionnaire.add(e)
        }
    }

    //remove
    fun supprimer(e:Entree):Boolean{
        if(Dictionnaire.contains(e)) {
            Dictionnaire.remove(e)
            return true
        }else {
            throw Exception("N'existe pas !!")
            return false
        }
    }

    //remove
    fun supprimer(motFrench:String):Boolean{
        var et = false
        for (entre in Dictionnaire){
            if (entre.motFr==motFrench){
                Dictionnaire.remove(entre)
                et=true
            }else {
                throw Exception("N'existe pas !!")
                et=false
            } }
        return et
    }

    fun anFr(motEnglish:String): MutableList<String> {
        val motsFrançais = mutableListOf<String>()
        for (entree in Dictionnaire) {
            if (entree.motAng == motEnglish) {
                motsFrançais.add(entree.motFr)
            }
        }
        return motsFrançais
    }

    fun motsAnglais(): Set<String> {
        return Dictionnaire.map { it.motAng }.toSet()
    }

    fun dictionnaireAnFr():HashMap<String,ArrayList<String>>{
        val dictionnaire = HashMap<String, ArrayList<String>>()
        for (entree in Dictionnaire) {
            val motsFrançais = dictionnaire.getOrDefault(entree.motAng, ArrayList())
            motsFrançais.add(entree.motFr)
            dictionnaire[entree.motAng] = motsFrançais
        }
        return dictionnaire
    }
    //toString
    override fun toString():String{
        val str = StringBuilder()
        for (entree in Dictionnaire) {
            str.append(entree.toString())
        }
        return str.toString()
    }
}
