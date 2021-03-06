package akkapi.cluster

sealed trait SudokoDetailType
case class Row(id: Int) extends SudokoDetailType
case class Column(id: Int) extends SudokoDetailType
case class Block(id: Int) extends SudokoDetailType