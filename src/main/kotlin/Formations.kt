sealed class Formations {
    data class fourThreeThree(val formationPositions: List<Position> = listOf<Position>(
        Position(Positions.GK,false,0,null)
    )) : Formations()
}