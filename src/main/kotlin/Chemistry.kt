class Chemistry {
    lateinit var formations: Formations
    val field: Field = Field(formations)
    val players = field.formation.getPlayers()
}