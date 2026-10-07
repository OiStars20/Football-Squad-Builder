fun main() {
    val formationsMap = mutableMapOf<String, Formations>(
        "443" to Formations.FourThreeThree(),
        "433(2)" to Formations.FourThreeThree2(),
        "433(3)" to Formations.FourThreeThree3(),
        "433(4)" to Formations.FourThreeThree4(),
        "4321" to Formations.FourThreeTwoOne(),
        "4411" to Formations.FourFourOneOne(),
        "442" to Formations.FourFourTwo(),
        "422(2)" to Formations.FourFourTwo2(),
        "451" to Formations.FourFiveOne(),
        "451(2)" to Formations.FourFiveOne2(),
        "5212" to Formations.FiveTwoOneTwo(),
        "523" to Formations.FiveTwoThree(),
        "532" to Formations.FiveThreeTwo(),
        "541" to Formations.FiveFourOne(),
        "3142" to Formations.ThreeOneFourTwo(),
        "343" to Formations.ThreeFourThree(),
        "352" to Formations.ThreeFiveTwo(),
        "41212" to Formations.FourOneTwoOneTwo(),
        "41212(2)" to Formations.FourOneTwoOneTwo2(),
        "4132" to Formations.FourOneThreeTwo(),
        "4213" to Formations.FourTwoOneThree(),
        "4222" to Formations.FourTwoTwoTwo(),
        "4231" to Formations.FourTwoThreeOne(),
        "4231(2)" to Formations.FourTwoThreeOne2(),
        "424" to Formations.FourTwoFour(),
        "4312" to Formations.FourThreeOneTwo()
    )
    println("Welcome to Football-Squad-Builder")
    println("What formation would you like to use for your squad?")
    println("433, 433(2), 433(3),")
    println("433(4),4321 , 4411,")
    println("442, 442(2), 451,")
    println("451(2), 5212, 523,")
    println("532, 541, 3142,")
    println("3412, 343, 352,")
    println("41212, 41212(2), 4132,")
    println("4213, 4222, 4231,")
    println("4231(2), 424, 4312")
}


