sealed class Formations : GetPlayers {
    data class FourThreeThree(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.RW,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.LW,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FourThreeThree2(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.RW,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.LW,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FourThreeThree3(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.RW,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.LW,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FourThreeThree4(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CAM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.RW,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.LW,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FourFourOneOne(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.RM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.LM,false,0,null),
        Position(Positions.CAM,false,0,null),
        Position(Positions.ST,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FourFourTwo(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.RM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.LM,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.ST,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FourFourTwo2(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.RM,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.LM,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.ST,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FourFiveOne(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.RM,false,0,null),
        Position(Positions.CAM,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.CAM,false,0,null),
        Position(Positions.LM,false,0,null),
        Position(Positions.ST,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FourFiveOne2(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.RM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.LM,false,0,null),
        Position(Positions.ST,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FiveTwoOneTwo(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CAM,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.ST,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FiveTwoThree(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.RW,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.LW,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FiveThreeTwo(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.ST,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FiveFourOne(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.RM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.LM,false,0,null),
        Position(Positions.ST,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class ThreeOneFourTwo(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.RM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.LM,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.ST,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class ThreeFourTwoOne(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.RM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.LM,false,0,null),
        Position(Positions.CAM,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.CAM,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class ThreeFourThree(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.RM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.LM,false,0,null),
        Position(Positions.RW,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.LW,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class ThreeFiveTwo(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.RM,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.CAM,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.LM,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.ST,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FourOneTwoOneTwo(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.RM,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.LM,false,0,null),
        Position(Positions.CAM,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.ST,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FourOneTwoOneTwo2(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CAM,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.ST,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FourOneThreeTwo(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.RM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.LM,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.ST,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FourTwoOneThree(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.CAM,false,0,null),
        Position(Positions.RW,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.LW,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FourTwoTwoTwo(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.CAM,false,0,null),
        Position(Positions.CAM,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.ST,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FourTwoThreeOne(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.CAM,false,0,null),
        Position(Positions.CAM,false,0,null),
        Position(Positions.CAM,false,0,null),
        Position(Positions.ST,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FourTwoThreeOne2(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.CDM,false,0,null),
        Position(Positions.RM,false,0,null),
        Position(Positions.CAM,false,0,null),
        Position(Positions.LM,false,0,null),
        Position(Positions.ST,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FourTwoFour(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.RW,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.LW,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FourThreeOneTwo(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CAM,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.ST,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
    data class FourThreeTwoOne(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null),
        Position(Positions.RB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.CB,false,0,null),
        Position(Positions.LB,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CM,false,0,null),
        Position(Positions.CAM,false,0,null),
        Position(Positions.ST,false,0,null),
        Position(Positions.CAM,false,0,null)
    )) : Formations(){
        override fun getPlayers(): List<Player>{
            val playerList = mutableListOf<Player>()
            for (p in formationPositions){
                playerList.add(p.getPlayer())
            }
            return playerList
        }
    }
}