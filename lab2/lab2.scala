
class Person(val givenName:String, var surname:String, protected val id:String){ //parametry tej klasy są parametrami konstruktora głównego
//tutaj kod konstruktora głównego
    def name = givenName + surname
}

// object Appl {
//   def main(agrs: Array[String]) = {
//     val p = new Person("Jan", "Kowalski", "1234567890")
//     println(p.name)
//     println(p.id)
//   }
// }

object Appl extends App {
  val p = new Person("Jan", "Kowalski", "1234567890")
  println(p.name)
}







