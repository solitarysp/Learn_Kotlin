package concepts.controlFlow

fun main() {
    lablas()

    testReturn()
}

private fun testReturn() {
    returnMethod()

    returnLocalLambda()

    returnLocalLambdaDefault()

    returnLocalUsingAnouymousFunc()
    
}

private fun returnLocalUsingAnouymousFunc() {
    println("returnLocalUsingAnouymousFunc")
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return  // local return trong  anonymous function cũng sẽ không ảnh hưởng đến methd gốc
        println(value)
    })
}

private fun returnLocalLambdaDefault() {
    println("returnLocalLambdaDefault")
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach// trả về lable default để trả về local call method của lambda
        println(it)

    }
}

private fun returnLocalLambda() {
    println("returnLocalLambda")
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // sử dũng nhãn dán trên method để trả về local call method của lambda. Sẽ chỉ kết thúc local lần này,
        // sẽ next đến lần tiếp theo và không kết thúc methdo
        println(it)
    }
}

private fun returnMethod() {
    println("returnMethod")
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // Nếu return kiểu này, vòng for sẽ kết thúc luôn và method cũng sẽ kết thuc luôn, return sẽ kết thúc cả returnMethod
        println(it)
    }
}

private fun lablas() {
    rootFor@ for (i in 1..10) {
        println(i)
        childFor@ for (j in 10..20) {
            if (i == 5 && j == 15) {
                println("i= $i and j= $j")
                break@rootFor;
            }
        }
    }
}
