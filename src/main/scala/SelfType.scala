object SelfType {

  def main(args: Array[String]): Unit = {

    val u = new RegisterUser("catholly", "nephren")
    u.insert()

  }

}


class User(var name: String, var password: String) {
  def test1(): Unit = {
    print("method in User")
  }
}

trait UserDao {
  _: User =>

  def insert(): Unit = {
    println(s"insert into db: $name,$password")
  }
}

class RegisterUser(name: String, password: String) extends User(name, password) with UserDao
