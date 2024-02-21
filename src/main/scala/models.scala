import data_types.{Key, Natural, Rating, SizedString, Timestamp}

object models {

  case class HotelTable(
    trHotelId: Key,
    trLastUpdate: Timestamp,
    trHotelName: SizedString[200],
    trHotelAddress: SizedString[200],
    trCity: SizedString[100],
    trState: SizedString[50],
    trZipCode: SizedString[10],
    trCountry: SizedString[20],
    trPhoneNumber: SizedString[15],
    trHotelWebsite: SizedString[200],
    trHotelRating: Rating[5],
    trAmenities: SizedString[300],
    trNumberOfRooms: Natural,
    trNumberOfAvailableRooms: Natural,
    trRoomTypes: SizedString[30],
    trRoomPrices: SizedString[70],
    trHotelImageUrl: SizedString[300],
    trDescription: SizedString[300],
    trPolicies: SizedString[200],
    trCancellationPolicy: SizedString[500],
    trContactPerson: SizedString[50],
    trContactEmail: SizedString[40],
  )

  case class BadHotelTable(
    trLastUpdate: Timestamp,
    trHotelName: SizedString[200],
    trHotelAddress: SizedString[200],
    trCity: SizedString[100],
    trRegion: SizedString[50],
    trState: SizedString[50],
    trZipCode: SizedString[10],
    trCountry: SizedString[20],
    trCreationDate: Timestamp,
    trPhoneNumber: SizedString[15],
    trSecondaryPhoneNumber: SizedString[15],
    trHotelWebsite: SizedString[200],
    trHotelRating: Rating[5],
    trAmenities: String,
    trNumberOfRooms: Natural,
    trNumberOfAvailableRooms: Natural,
    trNumberOfBusinessCenters: Natural,
    roomTypes: SizedString[30],
    trRoomPrices: SizedString[70],
    trHotelImageUrl: SizedString[300],
    description: SizedString[300],
    trPolicies: SizedString[200],
    trPrivacyPolicy: SizedString[300],
    cancellationPolicy: SizedString[700],
    trContactPerson: SizedString[50],
    trContactEmail: SizedString[40],
  )

}
