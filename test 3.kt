fun main(){
    subjects()
}
fun subjects(){
        var Math = 70
    if (Math >100){
        println("Invalid value for math")

    }else if(Math<0){
        println("Invalid value for math")
    }
        var Eng = 60
    if(Eng >100){
        println("Invalid value for Eng")

    }else if(Eng<0){
        println("Invalid value for Eng")
    }

     var Chem = 70
    if(Chem>100){
        println("Invalid value for Chem")
    }else if(Chem<0){
        println("Invalid value for Chem")
    }
        var Bio = 79
    if(Bio>100){
        println("Invalid value for Bio")

    }else if(Bio<0){
        println("Invalid value for Bio")
    }
        var Geo = 68
    if(Geo>100){
        println("Invalid value for Geo")

    }else if(Geo<0){
        println("Invalid value for Geo")
    }
        var Cre = 80
    if(Cre>100){
        println("Invalid value for Cre")

    }else if(Cre<0){
        println("Invalid value for Cre")
    }


    var sum =(Math+Eng+Chem+Bio+Geo+Cre)
    var average =(sum)/6



    if (average >100){
        println("Average is invalid")

    }else if(average <0){
        println("Average is invalid")

    }else if(average >=80){
        println("A")

    }else if(average >=70){
        println("B")

    }else if(average >=60){
        println("C")
    }else{
        println("D")
    }


}