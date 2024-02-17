package solid_principles

class Marker(val name: String, val color: String, val year: Int, val price: Int)

class Invoice(private val marker: Marker, private val quantity: Int) {
    fun calculateTotal(): Int {
        return ((this.marker.price) * this.quantity)
    }
}

// to make it open /closed this class is made as interface and implemented save method

//open class InvoiceDao(private val invoice: Invoice) {
//    fun saveToDB() {
//        println("saved to DB")
//    }
//}

class InvoicePrinter(private val invoice: Invoice) {
    fun print() {
        println("Invoice printed")
    }
}

fun main() {

}
