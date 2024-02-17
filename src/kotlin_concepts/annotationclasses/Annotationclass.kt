package kotlin_concepts.annotationclasses

annotation class MyAnnotation(val value: String)

@MyAnnotation("constant_value")
class MyClass
//check the above code in chartgpt for explanation