package solid_principles

// class should depend on interfaces rather than concrete classes

//class MacBook(private val wiredKeyboard: WiredKeyboard, private val wiredMouse: WiredMouse)
//class WiredKeyboard
//class WiredMouse

//solution
//---------//

class MacBook(private val wiredKeyboard: Keyboard, private val wiredMouse: Mouse)

interface Keyboard
interface Mouse
internal class WiredKeyboard : Keyboard
internal class BluetoothKeyboard : Keyboard

internal class WiredMouse : Mouse
internal class BluetoothMouse : Mouse