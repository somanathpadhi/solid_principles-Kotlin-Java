package solid_principles

interface InvoiceDao{
    fun save(invoice: Invoice)
}

 class DatabaseInvoiceDao: InvoiceDao{
     override fun save(invoice: Invoice) {
         println("Stored in DB")
     }
 }

class FileInvoiceDao: InvoiceDao{
    override fun save(invoice: Invoice) {
        println("Stored in File")
    }
}