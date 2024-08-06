//val _ = foo.Task.poll() // error
val _ = foo.Foo.foo("hai") // error, when it shouldn't

class Bar:
    private def bar(x: String): Unit = ()
    def bar(x: Any): Unit = ()
    def bar(x: Int): Unit = ()

val _ = Bar().bar("hai")