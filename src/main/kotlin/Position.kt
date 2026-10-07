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
    fun increaseChemistryForNations(numPlayerProperty: Int){
        if (numPlayerProperty <= 1){
            return
        }
        if (numPlayerProperty in 2..4){
            chemistry += 1
            return
        }
        if (numPlayerProperty in 5..7){
            chemistry += 2
            return
        }
        if (numPlayerProperty == 8){
            chemistry += 3
        }
    }
    fun increaseChemistryForLeagues(numPlayerProperty: Int){
        if (numPlayerProperty <= 2){
            return
        }
        if (numPlayerProperty in 3..4){
            chemistry += 1
            return
        }
        if (numPlayerProperty in 5..7){
            chemistry += 2
            return
        }
        if (numPlayerProperty == 8){
            chemistry += 3
        }
    }
    fun checkChemistry(){
        if (chemistry > 3){
            chemistry = 3
        }
    }
}