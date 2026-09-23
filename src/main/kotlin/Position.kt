class Position(val positions: Positions, var hasPlayer: Boolean, var chemistry: Int, var player: Player?) {
    fun setPlayer(){

    }
    fun increaseChemistry(chemistryPlus: Int){
        if (chemistry + chemistryPlus >= 3){
            chemistry = 3
        }
        else{
            chemistry = chemistry + chemistryPlus
        }
    }
}