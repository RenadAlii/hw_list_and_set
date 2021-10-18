import java.io.File

fun main(args: Array<String>) {

//part1
var myfavCity= mutableListOf("Makkah","Riyadh","Dammam")
myfavCity.addAll( listOf("Alkharj","Jeddah"))
myfavCity[myfavCity.lastIndex]="Madina"
    println(myfavCity)

//part2
    var listOfint=mutableListOf(12,3,5,6,2)
    listOfint[2]=12
    println(listOfint)
    listOfint.removeIf{ it == 12 }
    //or
    listOfint.removeAll{ it == 12 }

    println(listOfint)

//part3

    //reading data from file
var readFromFile=File("data/dataToRead.txt").readText().split(",")


    var listOfNum=listOf(12,55,77,6,5,99,33,35,78,2)
   println( maxNum(listOfNum))

}


//fun to return max NO.
fun maxNum(listOfNum: List<Int>): Int {
    var max= listOfNum[0]
for(i in 1 until listOfNum.size){
     if(max<=listOfNum[i])
      max=listOfNum[i]
}
    return max
}
