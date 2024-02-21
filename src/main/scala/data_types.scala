import io.github.iltotore.iron.constraint.collection.*
import io.github.iltotore.iron.constraint.numeric.*
import io.github.iltotore.iron.constraint.numeric
import io.github.iltotore.iron.{! => _, *}

object data_types {

  case class SizedString[N <: Int](value: String :| MaxLength[N])

  case class Rating[UpTo <: Int](value: Double :| Interval.Closed[0, UpTo])

  case class Natural(value: Int :| numeric.GreaterEqual[0])

  case class Key(value: String)

  case class Timestamp(value: Long)

}
