fun main() {
    var continueApplication = true
    while (continueApplication) {
        val formationsMap = mutableMapOf<String, Formations>(
            "433" to Formations.FourThreeThree(),
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
        val positionsMap = mapOf<String, Positions>(
            "GK" to Positions.GK,
            "RB" to Positions.RB,
            "CB" to Positions.CB,
            "LB" to Positions.LB,
            "CDM" to Positions.CDM,
            "CM" to Positions.CM,
            "CAM" to Positions.CAM,
            "RM" to Positions.RM,
            "LM" to Positions.LM,
            "RW" to Positions.RW,
            "LW" to Positions.LW,
            "ST" to Positions.ST,
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
        var formationSelected = false
        lateinit var selectedFormation: Formations
        while (!formationSelected) {
            val formation = readln()
            if (formation in formationsMap) {
                formationSelected = true
                selectedFormation = formationsMap[formation]!!
            } else {
                println("Invalid formation selected")
            }
        }
        val f = Field(selectedFormation, 0)
        println("Please select a position where you haven't selected any player yet")
        var i = 0
        while (i < 11) {
            println("GK, RB, LB, CB,")
            println("CDM, CM, CAM, RM, LM,")
            println("RW, LW, ST")
            val position = readln()
            if (position in positionsMap) {
                val p = f.formation.getPositions().find {
                    it.positions == positionsMap[position]
                }
                if (p != null) {
                    if (!p.hasPlayer) {
                        var playerSelected = false
                        while (!playerSelected) {
                            println("please type in playername")
                            val player = readln()
                            if (player in PlayerCollection.playerCollection) {
                                playerSelected = true
                                p.setTheSelectedPlayer(PlayerCollection.playerCollection[player])
                            } else {
                                println("Invalid player selected")
                            }
                        }
                    }
                }
            }
            i++
        }
        val c = Chemistry()
        c.field = f
        val nationsList = c.getNationCounters()
        val leaguesList = c.getLeagueCounters()
        for (p in f.formation.getPlayers()) {
            val currentPosition = f.formation.getPositions().find {
                it.player == p
            }
            currentPosition?.let {
                it.increaseChemistryForLeagues(leaguesList[p.league])
                it.increaseChemistryForNations(nationsList[p.nationality])
                it.checkChemistry()
            }
        }
        var chemistry = 0
        for (p in f.formation.getPositions()) {
            chemistry += p.chemistry
        }
        f.chemistry = chemistry
        println(
            "Your final squad has the ${
            formationsMap.entries.firstOrNull() {
                it.value == f.formation
            }?.key
        } with the following players ${
            f.formation.getPlayers().joinToString { it.name }
        } and ${f.chemistry} from 33 possible chemistry points")
        println("would you like to continue ? Y/n")
        var madeDecision = false
        while (!madeDecision) {
            val yesOrNo = readln()
            if (yesOrNo == "Y") {
                madeDecision = true
                continue
            }
            if (yesOrNo == "n") {
                madeDecision = true
                continueApplication = false
                continue
            }
            else{
                println("Invalid expression")
            }
        }
    }
}


