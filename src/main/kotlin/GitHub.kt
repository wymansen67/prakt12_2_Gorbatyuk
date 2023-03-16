class GitHub(_name: String):User() {
    override var username:String = _name

    constructor(_name: String, _countRepo: UInt): this(_name){
        countRepo = _countRepo
    }

    constructor(_name: String, _countRepo: UInt, _psswd: String): this(_name, _countRepo){
        psswd = _psswd
    }

    override var countRepo: UInt
        get() = 0u
        set(value) {}
    override var psswd: String
        get() = "undefined"
        set(value) {}

    override fun GetUserInfo() {
        println("Пользователь: $username\nКоличество репозиториев: $countRepo")
    }

}