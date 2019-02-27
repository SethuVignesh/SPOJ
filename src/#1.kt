import java.util.*

fun main(args:Array<String>){

    var al= ArrayList<Int>()
    var  input=0;
    val reader =Scanner(System.`in`)
    while (true){
        input =reader.nextInt()
        if(input==42){
            break
        }
        al.add(input)
    }

    al.sort()

    for (element in al){
        println(element)
    }
}