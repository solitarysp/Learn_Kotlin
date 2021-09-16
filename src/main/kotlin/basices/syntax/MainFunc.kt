package basices.syntax

fun main(args: Array<String>) {
    logUsingPrint()
    funUsing()
}

fun funUsing() {
    println(funUsingSimple(b=1,a=2))
    println(funUsingSimpleShort(5, 5))

    funUsingNotUsingReturn("thanh");

    funUsingNotUsingReturn2("thanh");
}
// 2 cách tạo 1 method không cần trả về data
fun funUsingNotUsingReturn(name: String): Unit {
    // Trình compiler của kotlin hỗ trợ tiêm data 1 cách dễ dàng như này
    println("Name is: $name");
}
fun funUsingNotUsingReturn2(name: String): Unit {
    println("Name is: $name");
}

// Khai báo method và có data trả về
fun funUsingSimple(a: Int, b: Int): Int {
    return a + b;
}
// nếu body đơn giản thì có thể làm như này để ngắn code
fun funUsingSimpleShort(a: Int, b: Int) = a + b;

// Sử dụng print để in data ra
// bản chất vẫn sẽ gọi đến  System.out.print
private fun logUsingPrint() {
    print("d")
    println("d")
}
