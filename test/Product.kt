package test

data class Product(
  var productId : UUID?,
  var mfrId : UUID?,
  var models : Models?,
  var specifications : Specifications?,
  var productCategory : Category?,
  var categoryValues : Array<ProductProperty>?,
  var isConfigurable : Boolean?,
  var pictures : Array<ResourceLink>?,
  var documents : Array<ResourceLink>?,
  var drawings : Array<ResourceLink>?,
  var productDimension : ProductDimension?,
  var freightClass : String?,
  var shipFromZip : String?,
  var packingData : PackingData?,
  var pricing : PricingData?,
  var GTIN : GTINData?,
  var prop65 : String?,
  var certifications : String?
)