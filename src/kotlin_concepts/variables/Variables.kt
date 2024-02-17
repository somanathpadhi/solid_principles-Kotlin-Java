package kotlin_concepts.variables

//Modifier 'const' is not applicable to 'local variable'
//Using const helps improve performance by allowing the
// compiler to substitute the constant values directly
// where they are used in the code.
//You can use const with a property or a member inside
// a companion object if its type is a primitive or a String.
//Similar to companion objects, const can be used with
// properties inside objects.

//const val: Can only be used at the
// top level of a file( at the outermost level of your Kotlin file.),
// in an object, or in a companion object.

//val: Used for general read-only properties that may be initialized
// at runtime and are not required to be compile-time constants.
//const val: Used specifically for declaring compile-time constants.
// It is suitable for values that are known at compile time, such as
// literal values, primitive types, or string literals.

//top level declaration
const val  NUMBER = 1

fun main() {
    val a = 30
    var b = 3
    b = 45
}

class A {
    companion object {
        //only primitives and string values are allowed
        const val VALUE = 4
    }
}

object B {
    const val PI = 3.14
}
