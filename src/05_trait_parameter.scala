package hello

object trait_parameter {
  trait CoordLike(x: Double, y: Double) {
    def show() = println(s"($x, $y)")
  }

  object Coord extends CoordLike(1.0, 2.0)

  def main(args: Array[String]): Unit = {
    Coord.show()
  }
}
