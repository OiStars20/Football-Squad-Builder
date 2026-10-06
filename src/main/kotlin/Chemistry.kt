class Chemistry {
    lateinit var formations: Formations
    val field: Field = Field(formations)
    val players = field.formation.getPlayers()
    fun checkForNationality(nations: Nations): Int {
        var counter = 0
        players.forEach {
            if (it.nationality == nations) {
                counter++
            }
        }
        return counter
    }
    fun getNationCounters(){
        val nationsCounter = mutableMapOf<Nations, Int>()
        var counter = 0
        for (n in Nations.entries) {
            for (p in players) {
                if (p.nationality == n) {
                    counter++
                }
            }
            nationsCounter.put(n, counter)
            counter = 0
        }
    }
}