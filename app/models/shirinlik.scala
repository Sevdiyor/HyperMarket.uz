package models

import javax.swing.text.html.HTML.Tag

/**
 * Created by hacker on 3/13/2015.
 */

import play.api.db.slick.Config.driver.simple._

case class Shirinlik(id:Option[Int],
                     name: String,
                     imgUrl: String,
                     narx: Int)

class ShirinlikTable(tag: Tag) extends Table[Shirinlik](tag, "shirinlik"){
  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)
  def name = column[String]("NAME", O.Default(""))
  def imgUrl = column[String]("IMGURL", O.Default(""))
  def narx = column[Int]("NARX", O.Default(""))
  def * = (id.?, name, imgUrl, narx) <> (Shirinlik.tupled, Shirinlik.unapply _)
}
