fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")
    val array = intArrayOf(1,6,8,4,3,9,10,56,4)
    sort(array)
    println(array.contentToString())
}