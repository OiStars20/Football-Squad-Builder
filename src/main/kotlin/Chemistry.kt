class Chemistry {
    lateinit var formations: Formations
    val field: Field = Field(formations,0)
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
    fun getLeagueCounters(){
        val leagueCounter = mutableMapOf<Leagues, Int>()
        var counter = 0
        for (l in Leagues.entries) {
            for (p in players) {
                if (p.league == l) {
                    counter++
                }
            }
            leagueCounter.put(l, counter)
            counter = 0
        }
    }
}