import check_definitions.performChecks
import models.{BadHotelTable, HotelTable}
import schema_checks.SchemaChecks

object Main extends App {

  performChecks[SchemaChecks, HotelTable]

  // TODO: Uncomment the following line and enter "sbt check" in the console
  //  to see the compile time errors:
  //  performChecks[SchemaChecks, BadHotelTable]
}
