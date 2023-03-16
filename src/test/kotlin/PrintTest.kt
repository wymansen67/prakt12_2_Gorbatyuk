fun main(){

    var userInfo = kotlin.arrayOfNulls<String>(3)

        print("Имя пользователя:")
        userInfo[0] = readln()
        println()
        print("Кол-во репозиториев:")
        userInfo[1] = readln()
        println()
        print("Пароль:")
        userInfo[2] = readln()
        println()

    var userInfo1 = kotlin.arrayOfNulls<String>(3)

        print("Имя пользователя:")
        userInfo1[0] = readln()
        println()
        print("Кол-во репозиториев:")
        userInfo1[1] = readln()
        println()
        print("Пароль:")
        userInfo1[2] = readln()
        println()

    var userInfo2 = kotlin.arrayOfNulls<String>(3)

        print("Имя пользователя:")
        userInfo2[0] = readln()
        println()
        print("Кол-во репозиториев:")
        userInfo2[1] = readln()
        println()
        print("Пароль:")
        userInfo2[2] = readln()
        println()

    var usr1 = GitHub(userInfo[0].toString(), 20U, userInfo[2].toString())
    var usr2 = GitHub(userInfo1[0].toString(), userInfo1[1]!!.toUInt(), userInfo1[2].toString())
    var usr3 = GitHub(userInfo2[0].toString(), 15U, userInfo2[2].toString())

    usr1.GetUserInfo()
    usr2.GetUserInfo()
    usr3.GetUserInfo()


}