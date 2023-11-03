object Pracs{
    def forLoop(){
        var i: Int = 10
        for(element <- 1 to i){
            println(element)
        }
        
    }

    def whileLoop(): Unit = {
        var counter:Int = 10
        while(counter > 0){
            println(counter)
            counter-=1
        }
    }

    


    def main(args: Array[String]): Unit = {
        println("Hello world")
        forLoop()

        val age = "20";
        age match
        {
        case "20" => println(age);
        case "18" => println(age);
        case "30" => println(age);
        case "40" => println(age);
        case "50" => println(age);

        case "default" => println("wrong input")


            val name = "random"
        val age = 2300
        println(name + " is of " + age + " years old ")
        println(s"$name is of $age years old. \n he is alpha ") //s is for string
        println(raw"$name is of $age years old. \n he is alpha ") //raw is to write as it is
        }
    }
}