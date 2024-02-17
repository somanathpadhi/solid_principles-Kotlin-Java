package solid_principles

//Wrong implementation of interfaces
interface RestaurantEmployee {
    fun washDishes()
    fun serveCustomer()
    fun takeOrders()
    fun cookFood()
}

//class Waiter: RestaurantEmployee {
//    override fun washDishes() {
//        //not my job
//    }
//
//    override fun serveCustomer() {
//        println("Serving")
//    }
//
//    override fun takeOrders() {
//        println("Taking order")
//    }
//
//    override fun cookFood() {
//        //not my job
//    }
//}

// interfaces should not be such, that client should not implement
//unnecessary functions they do not need
// so need to divide the interface to smaller interfaces

// Solution
//-----------//
interface WaiterInterface {
    fun serverCustomer()
    fun takeOrder()
}

interface ChefInterface {
    fun cookFood()
}
interface HelperInterface{
    fun washDishes()
}

class Waiter : WaiterInterface {
    override fun serverCustomer() {
        println("Serving")
    }

    override fun takeOrder() {
        println("Taking order")
    }
}