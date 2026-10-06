class Position(val positions: Positions, var hasPlayer: Boolean, var chemistry: Int, var player: Player?) {
    fun setPlayer(player: Player){
        this.player = player
        this.hasPlayer = true
    }
    fun getPlayer(): Player{
        return this.player!!
    }
    fun deleteplayer(){
        this.player = null
        hasPlayer = false
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