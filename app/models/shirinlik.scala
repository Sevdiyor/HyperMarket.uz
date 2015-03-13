package models

/**
 * Created by hacker on 3/13/2015.
 */

case class shirinlik(id:Int, name: String, imgUrl: String, narx: Int)
object shirinlik{
  var shirinliklarr = List(
    shirinlik(3, "Anorli tort", "tort.jpg", 2500),
    shirinlik(6, "Olmali tort", "tort.jpg", 2200),
    shirinlik(7, "Tort", "tort.jpg", 30000),
    shirinlik(9, "Anorli tort", "tort.jpg", 40000),
    shirinlik(8, "Anorli tort", "tort.jpg", 10000),
    shirinlik(10, "Anorli tort", "tort.jpg", 15000),
    shirinlik(11, "Anorli tort", "tort.jpg", 20000),
    shirinlik(15, "Anorli tort", "tort.jpg", 38000)

  )
  def findall = shirinliklarr.sortBy(_.id)

}
