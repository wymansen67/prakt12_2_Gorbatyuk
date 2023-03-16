abstract class User : UserInfo {
    abstract var username:String
    abstract var countRepo:UInt
    override var psswd: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun GetUserInfo() {
        TODO("Not yet implemented")
    }
}