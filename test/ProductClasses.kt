package test
import java.util.Date

data class Category(
  var name : String?,
  val categoryId : UUID?
)

data class Models(
  var mfrModel : String?,
  var stockModel : String?,
  var obsoleteModels : MutableList<String>?
)

data class Specifications(
  var AQSpecifications : String?,
  var shortMarketingSpecification : String?,
  var longMarketingSpecification : String?
)

data class ProductProperty(
  val propertyId : UUID?,
  var property : String?,
  val valueId : UUID?,
  var value : String?
)

data class ResourceLink(
  var name : String?,
  var url : String?,
  var mimeType : String?,
  var mediaType : String?
)

data class ProductDimension(
  var productHeight : Double?,
  var productWidth : Double?,
  var productDepth : Double?,
  var shippingCube : Double?,
  var shippingWeight : Double?
)

data class PackingData(
  var unitsPerCase : String?,
  var sellingUnit : String?,
  var caseName : String?,
  var packedBy : String?,
  var priceBy : String?
)

data class PricingData(
  var netPrice : Double?,
  var listPrice : Double?,
  var isCallPrice : Boolean?,
  var markup : Double?,
  var sellPrice : Double?,
  var mapMrpPrice : Double?,
  var mapMrpPriceExpiration : Date?,
  var tariffPercentage : String?,
  var flyerNetPrice : Double?,
  var flyerNetStart : Date?,
  var flyerNetEnd : Date?
)

data class GTINData(
  var each : MutableList<String>?,
  var innerPacks : MutableList<String>?,
  var outerPacks : MutableList<String>?
)

