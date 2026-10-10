object PlayerCollection {
    val playerCollection = hashMapOf<String, Player>(
        // Real Madrid
        "Mbappe" to Player(Nations.FRANCE, Leagues.LALIGA,LALIGA.REAL_MADRID,"Mbappe"),
        "Tchouameni" to Player(Nations.FRANCE, Leagues.LALIGA,LALIGA.REAL_MADRID,"Tchouameni"),
        "Bellingham" to Player(Nations.ENGLAND, Leagues.LALIGA,LALIGA.REAL_MADRID,"Bellingham"),
        "Vini_Jr" to Player(Nations.BRAZIL, Leagues.LALIGA,LALIGA.REAL_MADRID,"Vini Jr"),
        "Rodrygo" to Player(Nations.BRAZIL, Leagues.LALIGA,LALIGA.REAL_MADRID,"Rodrygo"),
        "Camavinga" to Player(Nations.FRANCE, Leagues.LALIGA,LALIGA.REAL_MADRID,"Camavinga"),
        "Carreras" to Player(Nations.SPAIN, Leagues.LALIGA,LALIGA.REAL_MADRID,"Carreras"),
        "Rüdiger" to Player(Nations.GERMANY, Leagues.LALIGA,LALIGA.REAL_MADRID,"Rüdiger"),
        "Dumfries" to Player(Nations.NETHERLANDS, Leagues.LALIGA,LALIGA.REAL_MADRID,"Dumfries"),
        "Asencio" to Player(Nations.SPAIN, Leagues.LALIGA,LALIGA.REAL_MADRID,"Asencio"),
        "Endrick" to Player(Nations.BRAZIL, Leagues.LALIGA,LALIGA.REAL_MADRID,"Endrick"),
        "Konate" to Player(Nations.FRANCE, Leagues.LALIGA,LALIGA.REAL_MADRID,"Konate"),
        "Cucurella" to Player(Nations.SPAIN, Leagues.LALIGA,LALIGA.REAL_MADRID,"Cucurella"),
        "Silva" to Player(Nations.PORTUGAL, Leagues.LALIGA,LALIGA.REAL_MADRID,"Silva"),
        "Alexander-Arnold" to Player(Nations.ENGLAND, Leagues.LALIGA,LALIGA.REAL_MADRID,"Alexander-Arnold"),
        "Mendy" to Player(Nations.FRANCE, Leagues.LALIGA,LALIGA.REAL_MADRID,"Mendy"),
        "Huijsen" to Player(Nations.SPAIN, Leagues.LALIGA,LALIGA.REAL_MADRID,"Huijsen"),
        "Espi" to Player(Nations.SPAIN, Leagues.LALIGA,LALIGA.REAL_MADRID,"Espi"),
        "Pedri" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.BARCELONA, "Pedri"),
        "Raphinha" to Player(Nations.BRAZIL, Leagues.LALIGA, LALIGA.BARCELONA, "Raphinha"),
        "De_Jong" to Player(Nations.NETHERLANDS, Leagues.LALIGA, LALIGA.BARCELONA, "De Jong"),
        "Joan_Garcia" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.BARCELONA, "Joan Garcia"),
        "Cubarsi" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.BARCELONA, "Cubarsi"),
        "Fermin" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.BARCELONA, "Fermin"),
        "Kounde" to Player(Nations.FRANCE, Leagues.LALIGA, LALIGA.BARCELONA, "Kounde"),
        "Eric_Garcia" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.BARCELONA, "Eric Garcia"),
        "Dani_Olmo" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.BARCELONA, "Dani Olmo"),
        "Joao_Cancelo" to Player(Nations.PORTUGAL, Leagues.LALIGA, LALIGA.BARCELONA, "Joao Cancelo"),
        "Gavi" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.BARCELONA, "Gavi"),
        "Balde" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.BARCELONA, "Balde"),
        "Gerard_Martin" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.BARCELONA, "Gerard Martin"),
        "Marc_Bernal" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.BARCELONA, "Marc Bernal"),

// ---------------- ATLETICO MADRID ----------------
        "Julian_Alvarez" to Player(Nations.ARGENTINA, Leagues.LALIGA, LALIGA.ATLETICO_MADRID, "Julian Alvarez"),
        "Marcos_Llorente" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.ATLETICO_MADRID, "Marcos Llorente"),
        "Alex_Baena" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.ATLETICO_MADRID, "Alex Baena"),
        "Giuliano_Simeone" to Player(Nations.ARGENTINA, Leagues.LALIGA, LALIGA.ATLETICO_MADRID, "Giuliano Simeone"),
        "Juan_Musso" to Player(Nations.ARGENTINA, Leagues.LALIGA, LALIGA.ATLETICO_MADRID, "Juan Musso"),
        "Koke" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.ATLETICO_MADRID, "Koke"),
        "Le_Normand" to Player(Nations.FRANCE, Leagues.LALIGA, LALIGA.ATLETICO_MADRID, "Le Normand"),
        "Pubill" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.ATLETICO_MADRID, "Pubill"),

// ---------------- ATHLETIC CLUB ----------------
        "Unai_Simon" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.ATHLETIC_BILBAO, "Unai Simon"),
        "Nico_Williams" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.ATHLETIC_BILBAO, "Nico Williams"),
        "Laporte" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.ATHLETIC_BILBAO, "Laporte"),
        "Oihan_Sancet" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.ATHLETIC_BILBAO, "Oihan Sancet"),
        "Dani_Vivian" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.ATHLETIC_BILBAO, "Dani Vivian"),
        "Yuri_Berchiche" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.ATHLETIC_BILBAO, "Yuri Berchiche"),
        "Jauregizar" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.ATHLETIC_BILBAO, "Jauregizar"),
        "Guruzeta" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.ATHLETIC_BILBAO, "Guruzeta"),

// ---------------- REAL BETIS ----------------
        "Isco" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.REAL_BETIS, "Isco"),
        "Fekir" to Player(Nations.FRANCE, Leagues.LALIGA, LALIGA.REAL_BETIS, "Fekir"),
        "Lo_Celso" to Player(Nations.ARGENTINA, Leagues.LALIGA, LALIGA.REAL_BETIS, "Lo Celso"),
        "Bartra" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.REAL_BETIS, "Bartra"),
        "Bellerin" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.REAL_BETIS, "Bellerin"),
        "Antony" to Player(Nations.BRAZIL, Leagues.LALIGA, LALIGA.REAL_BETIS, "Antony"),
        "Fornals" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.REAL_BETIS, "Fornals"),
        "Riquelme" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.REAL_BETIS, "Riquelme"),

// ---------------- OSASUNA ----------------
        "Aimar_Oroz" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.OSASUNA, "Aimar Oroz"),
        "Moncayola" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.OSASUNA, "Moncayola"),
        "Ruben_Garcia" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.OSASUNA, "Ruben Garcia"),
        "David_Garcia" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.OSASUNA, "David Garcia"),
        "Sergio_Herrera" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.OSASUNA, "Sergio Herrera"),

// ---------------- DEPORTIVO ALAVES ----------------
        "Carlos_Vicente" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.DEPORTIVO_ALAVES, "Carlos Vicente"),
        "Jon_Guridi" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.DEPORTIVO_ALAVES, "Jon Guridi"),
        "Antonio_Blanco" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.DEPORTIVO_ALAVES, "Antonio Blanco"),
        "Jonny_Otto" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.DEPORTIVO_ALAVES, "Jonny Otto"),

// ---------------- GETAFE ----------------
        "Domingos_Duarte" to Player(Nations.PORTUGAL, Leagues.LALIGA, LALIGA.GETAFE, "Domingos Duarte"),
        "Borja_Mayoral" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.GETAFE, "Borja Mayoral"),
        "Diego_Rico" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.GETAFE, "Diego Rico"),
        "Juan_Iglesias" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.GETAFE, "Juan Iglesias"),
        "David_Soria" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.GETAFE, "David Soria"),

// ---------------- GIRONA ----------------
        "Miguel_Gutierrez" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.GIRONA, "Miguel Gutierrez"),
        "Ivan_Martin" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.GIRONA, "Ivan Martin"),
        "Arnau_Martinez" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.GIRONA, "Arnau Martinez"),
        "Bryan_Gil" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.GIRONA, "Bryan Gil"),

// ---------------- RAYO VALLECANO ----------------
        "Isi_Palazon" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.RAYO_VALLECANO, "Isi Palazon"),
        "Oscar_Trejo" to Player(Nations.ARGENTINA, Leagues.LALIGA, LALIGA.RAYO_VALLECANO, "Oscar Trejo"),
        "Alvaro_Garcia" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.RAYO_VALLECANO, "Alvaro Garcia"),
        "Unai_Lopez" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.RAYO_VALLECANO, "Unai Lopez"),
        "Jorge_de_Frutos" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.RAYO_VALLECANO, "Jorge de Frutos"),

// ---------------- CELTA VIGO ----------------
        "Iago_Aspas" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.CELTA_VIGO, "Iago Aspas"),
        "Borja_Iglesias" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.CELTA_VIGO, "Borja Iglesias"),
        "Franco_Cervi" to Player(Nations.ARGENTINA, Leagues.LALIGA, LALIGA.CELTA_VIGO, "Franco Cervi"),
        "Mingueza" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.CELTA_VIGO, "Mingueza"),

// ---------------- ESPANYOL ----------------
        "Javi_Puado" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.ESPANYOL, "Javi Puado"),
        "Pere_Milla" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.ESPANYOL, "Pere Milla"),
        "Leandro_Cabrera" to Player(Nations.ARGENTINA, Leagues.LALIGA, LALIGA.ESPANYOL, "Leandro Cabrera"),

// ---------------- MALLORCA ----------------
        "Dani_Rodriguez" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.MALLORCA, "Dani Rodriguez"),
        "Manu_Morlanes" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.MALLORCA, "Manu Morlanes"),
        "Pablo_Maffeo" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.MALLORCA, "Pablo Maffeo"),

// ---------------- REAL SOCIEDAD ----------------
        "Oyarzabal" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.REAL_SOCIEDAD, "Oyarzabal"),
        "Barrenetxea" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.REAL_SOCIEDAD, "Barrenetxea"),
        "Odriozola" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.REAL_SOCIEDAD, "Odriozola"),
        "Sergio_Gomez" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.REAL_SOCIEDAD, "Sergio Gomez"),
        "Jon_Aramburu" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.REAL_SOCIEDAD, "Jon Aramburu"),

// ---------------- REAL VALLADOLID ----------------
        "Kenedy" to Player(Nations.BRAZIL, Leagues.LALIGA, LALIGA.REAL_VALLADOID, "Kenedy"),
        "Ivan_Sanchez" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.REAL_VALLADOID, "Ivan Sanchez"),

// ---------------- SEVILLA ----------------
        "Saul_Niguez" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.SEVILLA, "Saul Niguez"),
        "Juanlu_Sanchez" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.SEVILLA, "Juanlu Sanchez"),
        "Isaac_Romero" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.SEVILLA, "Isaac Romero"),
        "Marcao" to Player(Nations.BRAZIL, Leagues.LALIGA, LALIGA.SEVILLA, "Marcao"),

// ---------------- LAS PALMAS ----------------
        "Sandro_Ramirez" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.LAS_PALMAS, "Sandro Ramirez"),
        "Alberto_Moleiro" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.LAS_PALMAS, "Alberto Moleiro"),

// ---------------- VALENCIA ----------------
        "Jose_Gaya" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.VALENCIA, "Jose Gaya"),
        "Pepelu" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.VALENCIA, "Pepelu"),
        "Javi_Guerra" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.VALENCIA, "Javi Guerra"),
        "Hugo_Duro" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.VALENCIA, "Hugo Duro"),
        "Dimitri_Foulquier" to Player(Nations.FRANCE, Leagues.LALIGA, LALIGA.VALENCIA, "Dimitri Foulquier"),
        "Thierry_Correia" to Player(Nations.PORTUGAL, Leagues.LALIGA, LALIGA.VALENCIA, "Thierry Correia"),

// ---------------- VILLARREAL ----------------
        "Ayoze_Perez" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.VILLARREAL, "Ayoze Perez"),
        "Gerard_Moreno" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.VILLARREAL, "Gerard Moreno"),
        "Pedraza" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.VILLARREAL, "Pedraza"),
        "Dani_Parejo" to Player(Nations.SPAIN, Leagues.LALIGA, LALIGA.VILLARREAL, "Dani Parejo"),
        "Kambwala" to Player(Nations.FRANCE, Leagues.LALIGA, LALIGA.VILLARREAL, "Kambwala"),

        // ---------------- ARSENAL ----------------
        "Gabriel" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.ARSENAL, "Gabriel"),
        "Saliba" to Player(Nations.FRANCE, Leagues.PREMIER_LEAGUE, Premier_League.ARSENAL, "Saliba"),
        "David_Raya" to Player(Nations.SPAIN, Leagues.PREMIER_LEAGUE, Premier_League.ARSENAL, "David Raya"),
        "Declan_Rice" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.ARSENAL, "Declan Rice"),
        "Bukayo_Saka" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.ARSENAL, "Bukayo Saka"),
        "Zubimendi" to Player(Nations.SPAIN, Leagues.PREMIER_LEAGUE, Premier_League.ARSENAL, "Zubimendi"),
        "Martinelli" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.ARSENAL, "Martinelli"),
        "Havertz" to Player(Nations.GERMANY, Leagues.PREMIER_LEAGUE, Premier_League.ARSENAL, "Havertz"),
        "Calafiori" to Player(Nations.ITALIA, Leagues.PREMIER_LEAGUE, Premier_League.ARSENAL, "Calafiori"),
        "Timber" to Player(Nations.NETHERLANDS, Leagues.PREMIER_LEAGUE, Premier_League.ARSENAL, "Timber"),
        "Ben_White" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.ARSENAL, "Ben White"),
        "Gabriel_Jesus" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.ARSENAL, "Gabriel Jesus"),

// ---------------- LIVERPOOL ----------------
        "Van_Dijk" to Player(Nations.NETHERLANDS, Leagues.PREMIER_LEAGUE, Premier_League.LIVERPOOL, "Van Dijk"),
        "Alisson" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.LIVERPOOL, "Alisson"),
        "Wirtz" to Player(Nations.GERMANY, Leagues.PREMIER_LEAGUE, Premier_League.LIVERPOOL, "Wirtz"),
        "Gravenberch" to Player(Nations.NETHERLANDS, Leagues.PREMIER_LEAGUE, Premier_League.LIVERPOOL, "Gravenberch"),
        "Mac_Allister" to Player(Nations.ARGENTINA, Leagues.PREMIER_LEAGUE, Premier_League.LIVERPOOL, "Mac Allister"),
        "Gakpo" to Player(Nations.NETHERLANDS, Leagues.PREMIER_LEAGUE, Premier_League.LIVERPOOL, "Gakpo"),
        "Ekitike" to Player(Nations.FRANCE, Leagues.PREMIER_LEAGUE, Premier_League.LIVERPOOL, "Ekitike"),
        "Curtis_Jones" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.LIVERPOOL, "Curtis Jones"),
        "Frimpong" to Player(Nations.NETHERLANDS, Leagues.PREMIER_LEAGUE, Premier_League.LIVERPOOL, "Frimpong"),
        "Chiesa" to Player(Nations.ITALIA, Leagues.PREMIER_LEAGUE, Premier_League.LIVERPOOL, "Chiesa"),

// ---------------- MANCHESTER CITY ----------------
        "Rodri" to Player(Nations.SPAIN, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_CITY, "Rodri"),
        "Bernardo_Silva" to Player(Nations.PORTUGAL, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_CITY, "Bernardo Silva"),
        "Foden" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_CITY, "Foden"),
        "Savinho" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_CITY, "Savinho"),
        "Nico_Gonzalez" to Player(Nations.SPAIN, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_CITY, "Nico Gonzalez"),
        "Ederson" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_CITY, "Ederson"),
        "Reijnders" to Player(Nations.NETHERLANDS, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_CITY, "Reijnders"),
        "John_Stones" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_CITY, "John Stones"),
        "Rico_Lewis" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_CITY, "Rico Lewis"),
        "Matheus_Nunes" to Player(Nations.PORTUGAL, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_CITY, "Matheus Nunes"),
        "James_Trafford" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_CITY, "James Trafford"),

// ---------------- MANCHESTER UNITED ----------------
        "Bruno_Fernandes" to Player(Nations.PORTUGAL, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_UNITED, "Bruno Fernandes"),
        "Casemiro" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_UNITED, "Casemiro"),
        "Diogo_Dalot" to Player(Nations.PORTUGAL, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_UNITED, "Diogo Dalot"),
        "Leny_Yoro" to Player(Nations.FRANCE, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_UNITED, "Leny Yoro"),
        "De_Ligt" to Player(Nations.NETHERLANDS, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_UNITED, "De Ligt"),
        "Mason_Mount" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_UNITED, "Mason Mount"),
        "Harry_Maguire" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_UNITED, "Harry Maguire"),
        "Luke_Shaw" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_UNITED, "Luke Shaw"),
        "Matheus_Cunha" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_UNITED, "Matheus Cunha"),
        "Kobbie_Mainoo" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.MANCHESTER_UNITED, "Kobbie Mainoo"),

// ---------------- CHELSEA ----------------
        "Cole_Palmer" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.CHELSEA, "Cole Palmer"),
        "Enzo_Fernandez" to Player(Nations.ARGENTINA, Leagues.PREMIER_LEAGUE, Premier_League.CHELSEA, "Enzo Fernandez"),
        "Levi_Colwill" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.CHELSEA, "Levi Colwill"),
        "Reece_James" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.CHELSEA, "Reece James"),
        "Robert_Sanchez" to Player(Nations.SPAIN, Leagues.PREMIER_LEAGUE, Premier_League.CHELSEA, "Robert Sanchez"),
        "Trevoh_Chalobah" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.CHELSEA, "Trevoh Chalobah"),
        "Pedro_Neto" to Player(Nations.PORTUGAL, Leagues.PREMIER_LEAGUE, Premier_League.CHELSEA, "Pedro Neto"),
        "Joao_Pedro" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.CHELSEA, "Joao Pedro"),
        "Estevao" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.CHELSEA, "Estevao"),
        "Liam_Delap" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.CHELSEA, "Liam Delap"),
        "Wesley_Fofana" to Player(Nations.FRANCE, Leagues.PREMIER_LEAGUE, Premier_League.CHELSEA, "Wesley Fofana"),
        "Malo_Gusto" to Player(Nations.FRANCE, Leagues.PREMIER_LEAGUE, Premier_League.CHELSEA, "Malo Gusto"),

// ---------------- NEWCASTLE UNITED ----------------
        "Bruno_Guimaraes" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.NEWCASTLE_UNITED, "Bruno Guimaraes"),
        "Trippier" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.NEWCASTLE_UNITED, "Trippier"),
        "Sven_Botman" to Player(Nations.NETHERLANDS, Leagues.PREMIER_LEAGUE, Premier_League.NEWCASTLE_UNITED, "Sven Botman"),
        "Anthony_Gordon" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.NEWCASTLE_UNITED, "Anthony Gordon"),
        "Sandro_Tonali" to Player(Nations.ITALIA, Leagues.PREMIER_LEAGUE, Premier_League.NEWCASTLE_UNITED, "Sandro Tonali"),
        "Joelinton" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.NEWCASTLE_UNITED, "Joelinton"),
        "Nick_Pope" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.NEWCASTLE_UNITED, "Nick Pope"),
        "Dan_Burn" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.NEWCASTLE_UNITED, "Dan Burn"),
        "Lewis_Hall" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.NEWCASTLE_UNITED, "Lewis Hall"),
        "Tino_Livramento" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.NEWCASTLE_UNITED, "Tino Livramento"),
        "Nick_Woltemade" to Player(Nations.GERMANY, Leagues.PREMIER_LEAGUE, Premier_League.NEWCASTLE_UNITED, "Nick Woltemade"),

// ---------------- TOTTENHAM HOTSPUR ----------------
        "Maddison" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.TOTTENHAM_HOTSPUR, "Maddison"),
        "Solanke" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.TOTTENHAM_HOTSPUR, "Solanke"),
        "Van_de_Ven" to Player(Nations.NETHERLANDS, Leagues.PREMIER_LEAGUE, Premier_League.TOTTENHAM_HOTSPUR, "Van de Ven"),
        "Cristian_Romero" to Player(Nations.ARGENTINA, Leagues.PREMIER_LEAGUE, Premier_League.TOTTENHAM_HOTSPUR, "Cristian Romero"),
        "Pedro_Porro" to Player(Nations.SPAIN, Leagues.PREMIER_LEAGUE, Premier_League.TOTTENHAM_HOTSPUR, "Pedro Porro"),
        "Udogie" to Player(Nations.ITALIA, Leagues.PREMIER_LEAGUE, Premier_League.TOTTENHAM_HOTSPUR, "Udogie"),
        "Vicario" to Player(Nations.ITALIA, Leagues.PREMIER_LEAGUE, Premier_League.TOTTENHAM_HOTSPUR, "Vicario"),
        "Richarlison" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.TOTTENHAM_HOTSPUR, "Richarlison"),
        "Xavi_Simons" to Player(Nations.NETHERLANDS, Leagues.PREMIER_LEAGUE, Premier_League.TOTTENHAM_HOTSPUR, "Xavi Simons"),
        "Kolo_Muani" to Player(Nations.FRANCE, Leagues.PREMIER_LEAGUE, Premier_League.TOTTENHAM_HOTSPUR, "Kolo Muani"),
        "Joao_Palhinha" to Player(Nations.PORTUGAL, Leagues.PREMIER_LEAGUE, Premier_League.TOTTENHAM_HOTSPUR, "Joao Palhinha"),

// ---------------- ASTON VILLA ----------------
        "Emiliano_Martinez" to Player(Nations.ARGENTINA, Leagues.PREMIER_LEAGUE, Premier_League.ASTON_VILLA, "Emiliano Martinez"),
        "Ezri_Konsa" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.ASTON_VILLA, "Ezri Konsa"),
        "Ollie_Watkins" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.ASTON_VILLA, "Ollie Watkins"),
        "Morgan_Rogers" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.ASTON_VILLA, "Morgan Rogers"),
        "Boubacar_Kamara" to Player(Nations.FRANCE, Leagues.PREMIER_LEAGUE, Premier_League.ASTON_VILLA, "Boubacar Kamara"),
        "Pau_Torres" to Player(Nations.SPAIN, Leagues.PREMIER_LEAGUE, Premier_League.ASTON_VILLA, "Pau Torres"),
        "Ian_Maatsen" to Player(Nations.NETHERLANDS, Leagues.PREMIER_LEAGUE, Premier_League.ASTON_VILLA, "Ian Maatsen"),
        "Donyell_Malen" to Player(Nations.NETHERLANDS, Leagues.PREMIER_LEAGUE, Premier_League.ASTON_VILLA, "Donyell Malen"),
        "Marcus_Rashford" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.ASTON_VILLA, "Marcus Rashford"),

// ---------------- BRIGHTON & HOVE ALBION ----------------
        "Bart_Verbruggen" to Player(Nations.NETHERLANDS, Leagues.PREMIER_LEAGUE, Premier_League.BRIGHTON_HOVE_ALBION, "Bart Verbruggen"),
        "Lewis_Dunk" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.BRIGHTON_HOVE_ALBION, "Lewis Dunk"),
        "Van_Hecke" to Player(Nations.NETHERLANDS, Leagues.PREMIER_LEAGUE, Premier_League.BRIGHTON_HOVE_ALBION, "Van Hecke"),
        "Rutter" to Player(Nations.FRANCE, Leagues.PREMIER_LEAGUE, Premier_League.BRIGHTON_HOVE_ALBION, "Rutter"),
        "Danny_Welbeck" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.BRIGHTON_HOVE_ALBION, "Danny Welbeck"),
        "Brajan_Gruda" to Player(Nations.GERMANY, Leagues.PREMIER_LEAGUE, Premier_League.BRIGHTON_HOVE_ALBION, "Brajan Gruda"),
        "Solly_March" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.BRIGHTON_HOVE_ALBION, "Solly March"),

// ---------------- CRYSTAL PALACE ----------------
        "Mateta" to Player(Nations.FRANCE, Leagues.PREMIER_LEAGUE, Premier_League.CRYSTAL_PALACE, "Mateta"),
        "Marc_Guehi" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.CRYSTAL_PALACE, "Marc Guehi"),
        "Dean_Henderson" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.CRYSTAL_PALACE, "Dean Henderson"),
        "Tyrick_Mitchell" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.CRYSTAL_PALACE, "Tyrick Mitchell"),
        "Adam_Wharton" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.CRYSTAL_PALACE, "Adam Wharton"),
        "Maxence_Lacroix" to Player(Nations.FRANCE, Leagues.PREMIER_LEAGUE, Premier_League.CRYSTAL_PALACE, "Maxence Lacroix"),

// ---------------- BRENTFORD ----------------
        "Kevin_Schade" to Player(Nations.GERMANY, Leagues.PREMIER_LEAGUE, Premier_League.BRENTFORD, "Kevin Schade"),
        "Lewis_Potter" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.BRENTFORD, "Lewis Potter"),
        "Igor_Thiago" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.BRENTFORD, "Igor Thiago"),
        "Fabio_Carvalho" to Player(Nations.PORTUGAL, Leagues.PREMIER_LEAGUE, Premier_League.BRENTFORD, "Fabio Carvalho"),
        "Mark_Flekken" to Player(Nations.NETHERLANDS, Leagues.PREMIER_LEAGUE, Premier_League.BRENTFORD, "Mark Flekken"),

// ---------------- EVERTON ----------------
        "Pickford" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.EVERTON, "Pickford"),
        "Tarkowski" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.EVERTON, "Tarkowski"),
        "Dwight_McNeil" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.EVERTON, "Dwight McNeil"),
        "Jack_Grealish" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.EVERTON, "Jack Grealish"),
        "James_Garner" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.EVERTON, "James Garner"),
        "Merlin_Rohl" to Player(Nations.GERMANY, Leagues.PREMIER_LEAGUE, Premier_League.EVERTON, "Merlin Rohl"),
        "Carlos_Alcaraz" to Player(Nations.ARGENTINA, Leagues.PREMIER_LEAGUE, Premier_League.EVERTON, "Carlos Alcaraz"),

// ---------------- FULHAM ----------------
        "Bernd_Leno" to Player(Nations.GERMANY, Leagues.PREMIER_LEAGUE, Premier_League.FULHAM, "Bernd Leno"),
        "Andreas_Pereira" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.FULHAM, "Andreas Pereira"),
        "Rodrigo_Muniz" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.FULHAM, "Rodrigo Muniz"),
        "Emile_Smith_Rowe" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.FULHAM, "Emile Smith Rowe"),
        "Ryan_Sessegnon" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.FULHAM, "Ryan Sessegnon"),

// ---------------- BOURNEMOUTH ----------------
        "Evanilson" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.BOURNEMOUTH, "Evanilson"),
        "Alex_Scott" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.BOURNEMOUTH, "Alex Scott"),
        "Adam_Smith" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.BOURNEMOUTH, "Adam Smith"),
        "Marcos_Senesi" to Player(Nations.ARGENTINA, Leagues.PREMIER_LEAGUE, Premier_League.BOURNEMOUTH, "Marcos Senesi"),

// ---------------- SUNDERLAND ----------------
        "Habib_Diarra" to Player(Nations.FRANCE, Leagues.PREMIER_LEAGUE, Premier_League.SUNDERLAND, "Habib Diarra"),
        "Marc_Guiu" to Player(Nations.SPAIN, Leagues.PREMIER_LEAGUE, Premier_League.SUNDERLAND, "Marc Guiu"),
        "Enzo_Le_Fee" to Player(Nations.FRANCE, Leagues.PREMIER_LEAGUE, Premier_League.SUNDERLAND, "Enzo Le Fee"),
        "Nordi_Mukiele" to Player(Nations.FRANCE, Leagues.PREMIER_LEAGUE, Premier_League.SUNDERLAND, "Nordi Mukiele"),
        "Robin_Roefs" to Player(Nations.NETHERLANDS, Leagues.PREMIER_LEAGUE, Premier_League.SUNDERLAND, "Robin Roefs"),

// ---------------- LEEDS UNITED ----------------
        "Illan_Meslier" to Player(Nations.FRANCE, Leagues.PREMIER_LEAGUE, Premier_League.LEEDS_UNITED, "Illan Meslier"),
        "Pascal_Struijk" to Player(Nations.NETHERLANDS, Leagues.PREMIER_LEAGUE, Premier_League.LEEDS_UNITED, "Pascal Struijk"),
        "Jayden_Bogle" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.LEEDS_UNITED, "Jayden Bogle"),
        "Lukas_Nmecha" to Player(Nations.GERMANY, Leagues.PREMIER_LEAGUE, Premier_League.LEEDS_UNITED, "Lukas Nmecha"),
        "Anton_Stach" to Player(Nations.GERMANY, Leagues.PREMIER_LEAGUE, Premier_League.LEEDS_UNITED, "Anton Stach"),

// ---------------- NOTTINGHAM FOREST ----------------
        "Murillo" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.NOTTINGHAM_FOREST, "Murillo"),
        "Nicolas_Dominguez" to Player(Nations.ARGENTINA, Leagues.PREMIER_LEAGUE, Premier_League.NOTTINGHAM_FOREST, "Nicolas Dominguez"),
        "Gibbs_White" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.NOTTINGHAM_FOREST, "Gibbs White"),
        "Hudson_Odoi" to Player(Nations.ENGLAND, Leagues.PREMIER_LEAGUE, Premier_League.NOTTINGHAM_FOREST, "Hudson Odoi"),
        "Douglas_Luiz" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.NOTTINGHAM_FOREST, "Douglas Luiz"),
        "Igor_Jesus" to Player(Nations.BRAZIL, Leagues.PREMIER_LEAGUE, Premier_League.NOTTINGHAM_FOREST, "Igor Jesus"),

// ---------------- INTER MAILAND ----------------
        "Bastoni" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.INTER_MAILAND, "Bastoni"),
        "Barella" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.INTER_MAILAND, "Barella"),
        "Dimarco" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.INTER_MAILAND, "Dimarco"),
        "Lautaro_Martinez" to Player(Nations.ARGENTINA, Leagues.SERIE_A, Serie_A.INTER_MAILAND, "Lautaro Martinez"),
        "Marcus_Thuram" to Player(Nations.FRANCE, Leagues.SERIE_A, Serie_A.INTER_MAILAND, "Marcus Thuram"),
        "Pavard" to Player(Nations.FRANCE, Leagues.SERIE_A, Serie_A.INTER_MAILAND, "Pavard"),
        "Darmian" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.INTER_MAILAND, "Darmian"),
        "Frattesi" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.INTER_MAILAND, "Frattesi"),
        "Carlos_Augusto" to Player(Nations.BRAZIL, Leagues.SERIE_A, Serie_A.INTER_MAILAND, "Carlos Augusto"),
        "Bisseck" to Player(Nations.GERMANY, Leagues.SERIE_A, Serie_A.INTER_MAILAND, "Bisseck"),
        "Acerbi" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.INTER_MAILAND, "Acerbi"),

// ---------------- AC MAILAND ----------------
        "Maignan" to Player(Nations.FRANCE, Leagues.SERIE_A, Serie_A.AC_MAILAND, "Maignan"),
        "Rafael_Leao" to Player(Nations.PORTUGAL, Leagues.SERIE_A, Serie_A.AC_MAILAND, "Rafael Leao"),
        "Tomori" to Player(Nations.ENGLAND, Leagues.SERIE_A, Serie_A.AC_MAILAND, "Tomori"),
        "Rabiot" to Player(Nations.FRANCE, Leagues.SERIE_A, Serie_A.AC_MAILAND, "Rabiot"),
        "Ricci" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.AC_MAILAND, "Ricci"),
        "Loftus_Cheek" to Player(Nations.ENGLAND, Leagues.SERIE_A, Serie_A.AC_MAILAND, "Loftus-Cheek"),
        "Nkunku" to Player(Nations.FRANCE, Leagues.SERIE_A, Serie_A.AC_MAILAND, "Nkunku"),
        "Gabbia" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.AC_MAILAND, "Gabbia"),

// ---------------- JUVENTUS TURIN (geprüft) ----------------
        "Bremer" to Player(Nations.BRAZIL, Leagues.SERIE_A, Serie_A.JUVENTUS_TURIN, "Bremer"),
        "Locatelli" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.JUVENTUS_TURIN, "Locatelli"),
        "Kalulu" to Player(Nations.FRANCE, Leagues.SERIE_A, Serie_A.JUVENTUS_TURIN, "Kalulu"),
        "Gatti" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.JUVENTUS_TURIN, "Gatti"),
        "Cambiaso" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.JUVENTUS_TURIN, "Cambiaso"),
        "Di_Gregorio" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.JUVENTUS_TURIN, "Di Gregorio"),
        "Francisco_Conceicao" to Player(Nations.PORTUGAL, Leagues.SERIE_A, Serie_A.JUVENTUS_TURIN, "Francisco Conceicao"),
        "Khephren_Thuram" to Player(Nations.FRANCE, Leagues.SERIE_A, Serie_A.JUVENTUS_TURIN, "Khephren Thuram"),
        "Koopmeiners" to Player(Nations.NETHERLANDS, Leagues.SERIE_A, Serie_A.JUVENTUS_TURIN, "Koopmeiners"),
        "Lloyd_Kelly" to Player(Nations.ENGLAND, Leagues.SERIE_A, Serie_A.JUVENTUS_TURIN, "Lloyd Kelly"),
        "Miretti" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.JUVENTUS_TURIN, "Miretti"),

// ---------------- SSC NEAPEL ----------------
        "Di_Lorenzo" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.SSC_NEAPEL, "Di Lorenzo"),
        "Buongiorno" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.SSC_NEAPEL, "Buongiorno"),
        "Politano" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.SSC_NEAPEL, "Politano"),
        "Meret" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.SSC_NEAPEL, "Meret"),
        "David_Neres" to Player(Nations.BRAZIL, Leagues.SERIE_A, Serie_A.SSC_NEAPEL, "David Neres"),
        "Spinazzola" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.SSC_NEAPEL, "Spinazzola"),
        "Beukema" to Player(Nations.NETHERLANDS, Leagues.SERIE_A, Serie_A.SSC_NEAPEL, "Beukema"),
        "Noa_Lang" to Player(Nations.NETHERLANDS, Leagues.SERIE_A, Serie_A.SSC_NEAPEL, "Noa Lang"),
        "Lucca" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.SSC_NEAPEL, "Lucca"),
        "Juan_Jesus" to Player(Nations.BRAZIL, Leagues.SERIE_A, Serie_A.SSC_NEAPEL, "Juan Jesus"),

// ---------------- AS ROM ----------------
        "Dybala" to Player(Nations.ARGENTINA, Leagues.SERIE_A, Serie_A.AS_ROM, "Dybala"),
        "Pellegrini" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.AS_ROM, "Pellegrini"),
        "Mancini" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.AS_ROM, "Mancini"),
        "Cristante" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.AS_ROM, "Cristante"),
        "Kone" to Player(Nations.FRANCE, Leagues.SERIE_A, Serie_A.AS_ROM, "Kone"),
        "Soule" to Player(Nations.ARGENTINA, Leagues.SERIE_A, Serie_A.AS_ROM, "Soule"),
        "Hermoso" to Player(Nations.SPAIN, Leagues.SERIE_A, Serie_A.AS_ROM, "Hermoso"),
        "Wesley" to Player(Nations.BRAZIL, Leagues.SERIE_A, Serie_A.AS_ROM, "Wesley"),
        "Angelino" to Player(Nations.SPAIN, Leagues.SERIE_A, Serie_A.AS_ROM, "Angelino"),
        "Pisilli" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.AS_ROM, "Pisilli"),

// ---------------- ATALANTA ----------------
        "Scalvini" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.ATALANTA, "Scalvini"),
        "Carnesecchi" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.ATALANTA, "Carnesecchi"),
        "Zappacosta" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.ATALANTA, "Zappacosta"),
        "Ederson_Atalanta" to Player(Nations.BRAZIL, Leagues.SERIE_A, Serie_A.ATALANTA, "Ederson"),
        "De_Roon" to Player(Nations.NETHERLANDS, Leagues.SERIE_A, Serie_A.ATALANTA, "De Roon"),
        "Bellanova" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.ATALANTA, "Bellanova"),
        "Scamacca" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.ATALANTA, "Scamacca"),

// ---------------- BOLOGNA ----------------
        "Orsolini" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.BOLOGNA, "Orsolini"),
        "Santiago_Castro" to Player(Nations.ARGENTINA, Leagues.SERIE_A, Serie_A.BOLOGNA, "Santiago Castro"),
        "Juan_Miranda" to Player(Nations.SPAIN, Leagues.SERIE_A, Serie_A.BOLOGNA, "Juan Miranda"),
        "Fabbian" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.BOLOGNA, "Fabbian"),
        "Pobega" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.BOLOGNA, "Pobega"),
        "Immobile" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.BOLOGNA, "Immobile"),

// ---------------- SS LAZIO ----------------
        "Provedel" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.SS_LAZIO, "Provedel"),
        "Zaccagni" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.SS_LAZIO, "Zaccagni"),
        "Romagnoli" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.SS_LAZIO, "Romagnoli"),
        "Guendouzi" to Player(Nations.FRANCE, Leagues.SERIE_A, Serie_A.SS_LAZIO, "Guendouzi"),
        "Rovella" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.SS_LAZIO, "Rovella"),
        "Castellanos" to Player(Nations.ARGENTINA, Leagues.SERIE_A, Serie_A.SS_LAZIO, "Castellanos"),
        "Mario_Gila" to Player(Nations.SPAIN, Leagues.SERIE_A, Serie_A.SS_LAZIO, "Mario Gila"),
        "Nuno_Tavares" to Player(Nations.PORTUGAL, Leagues.SERIE_A, Serie_A.SS_LAZIO, "Nuno Tavares"),
        "Pedro" to Player(Nations.SPAIN, Leagues.SERIE_A, Serie_A.SS_LAZIO, "Pedro"),
        "Gigot" to Player(Nations.FRANCE, Leagues.SERIE_A, Serie_A.SS_LAZIO, "Gigot"),

// ---------------- FIORENTINA ----------------
        "De_Gea" to Player(Nations.SPAIN, Leagues.SERIE_A, Serie_A.FIORENTINA, "De Gea"),
        "Gosens" to Player(Nations.GERMANY, Leagues.SERIE_A, Serie_A.FIORENTINA, "Gosens"),
        "Kean" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.FIORENTINA, "Kean"),
        "Dodo" to Player(Nations.BRAZIL, Leagues.SERIE_A, Serie_A.FIORENTINA, "Dodo"),
        "Comuzzo" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.FIORENTINA, "Comuzzo"),
        "Fagioli" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.FIORENTINA, "Fagioli"),
        "Mandragora" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.FIORENTINA, "Mandragora"),
        "Ranieri" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.FIORENTINA, "Ranieri"),
        "Parisi" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.FIORENTINA, "Parisi"),

// ---------------- COMO ----------------
        "Nico_Paz" to Player(Nations.ARGENTINA, Leagues.SERIE_A, Serie_A.COMO, "Nico Paz"),
        "Caqueret" to Player(Nations.FRANCE, Leagues.SERIE_A, Serie_A.COMO, "Caqueret"),
        "Kempf" to Player(Nations.GERMANY, Leagues.SERIE_A, Serie_A.COMO, "Kempf"),
        "Jesus_Rodriguez" to Player(Nations.SPAIN, Leagues.SERIE_A, Serie_A.COMO, "Jesus Rodriguez"),
        "Sergi_Roberto" to Player(Nations.SPAIN, Leagues.SERIE_A, Serie_A.COMO, "Sergi Roberto"),
        "Perrone" to Player(Nations.ARGENTINA, Leagues.SERIE_A, Serie_A.COMO, "Perrone"),
        "Jean_Butez" to Player(Nations.FRANCE, Leagues.SERIE_A, Serie_A.COMO, "Jean Butez"),

// ---------------- FC TORINO ----------------
        "Casadei" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.FC_TORINO, "Casadei"),
        "Giovanni_Simeone" to Player(Nations.ARGENTINA, Leagues.SERIE_A, Serie_A.FC_TORINO, "Giovanni Simeone"),
        "Biraghi" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.FC_TORINO, "Biraghi"),

// ---------------- GENOA ----------------
        "Norton_Cuffy" to Player(Nations.ENGLAND, Leagues.SERIE_A, Serie_A.GENOA, "Norton-Cuffy"),
        "Messias" to Player(Nations.BRAZIL, Leagues.SERIE_A, Serie_A.GENOA, "Messias"),
        "Marcandalli" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.GENOA, "Marcandalli"),
        "Leali" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.GENOA, "Leali"),

// ---------------- PARMA CALCIO ----------------
        "Hernani" to Player(Nations.BRAZIL, Leagues.SERIE_A, Serie_A.PARMA_CALCIO, "Hernani"),
        "Bernabe" to Player(Nations.SPAIN, Leagues.SERIE_A, Serie_A.PARMA_CALCIO, "Bernabe"),
        "Valeri" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.PARMA_CALCIO, "Valeri"),
        "Pellegrino" to Player(Nations.ARGENTINA, Leagues.SERIE_A, Serie_A.PARMA_CALCIO, "Pellegrino"),
        "Delprato" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.PARMA_CALCIO, "Delprato"),
        "Cyprien" to Player(Nations.FRANCE, Leagues.SERIE_A, Serie_A.PARMA_CALCIO, "Cyprien"),

// ---------------- UDINESE CALCIO ----------------
        "Solet" to Player(Nations.FRANCE, Leagues.SERIE_A, Serie_A.UDINESE_CALCIO, "Solet"),
        "Zaniolo" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.UDINESE_CALCIO, "Zaniolo"),
        "Ekkelenkamp" to Player(Nations.NETHERLANDS, Leagues.SERIE_A, Serie_A.UDINESE_CALCIO, "Ekkelenkamp"),
        "Keinan_Davis" to Player(Nations.ENGLAND, Leagues.SERIE_A, Serie_A.UDINESE_CALCIO, "Keinan Davis"),

// ---------------- CAGLIARI CALCIO ----------------
        "Gaetano" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.CAGLIARI_CALCIO, "Gaetano"),
        "Luperto" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.CAGLIARI_CALCIO, "Luperto"),
        "Zappa" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.CAGLIARI_CALCIO, "Zappa"),
        "Palestra" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.CAGLIARI_CALCIO, "Palestra"),
        "Folorunsho" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.CAGLIARI_CALCIO, "Folorunsho"),
        "Belotti" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.CAGLIARI_CALCIO, "Belotti"),
        "Caprile" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.CAGLIARI_CALCIO, "Caprile"),

// ---------------- US LECCE ----------------
        "Falcone" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.US_LECCE, "Falcone"),
        "Gallo" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.US_LECCE, "Gallo"),
        "Pierotti" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.US_LECCE, "Pierotti"),
        "Baschirotto" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.US_LECCE, "Baschirotto"),
        "Tete_Morente" to Player(Nations.SPAIN, Leagues.SERIE_A, Serie_A.US_LECCE, "Tete Morente"),
        "Gendrey" to Player(Nations.FRANCE, Leagues.SERIE_A, Serie_A.US_LECCE, "Gendrey"),
        "Danilo_Veiga" to Player(Nations.PORTUGAL, Leagues.SERIE_A, Serie_A.US_LECCE, "Danilo Veiga"),

// ---------------- HELLAS VERONA ----------------
        "Montipo" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.HELLAS_VERONA, "Montipo"),
        "Charlys" to Player(Nations.BRAZIL, Leagues.SERIE_A, Serie_A.HELLAS_VERONA, "Charlys"),
        "Bella_Kotchap" to Player(Nations.GERMANY, Leagues.SERIE_A, Serie_A.HELLAS_VERONA, "Bella-Kotchap"),
        "Gagliardini" to Player(Nations.ITALIA, Leagues.SERIE_A, Serie_A.HELLAS_VERONA, "Gagliardini"),

        // ---------------- BAYERN MÜNCHEN (geprüft) ----------------
        "Harry_Kane" to Player(Nations.ENGLAND, Leagues.BUNDESLIGA, Bundesliga.BAYERN_MÜNCHEN, "Harry Kane"),
        "Olise" to Player(Nations.FRANCE, Leagues.BUNDESLIGA, Bundesliga.BAYERN_MÜNCHEN, "Olise"),
        "Kimmich" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.BAYERN_MÜNCHEN, "Kimmich"),
        "Upamecano" to Player(Nations.FRANCE, Leagues.BUNDESLIGA, Bundesliga.BAYERN_MÜNCHEN, "Upamecano"),
        "Tah" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.BAYERN_MÜNCHEN, "Tah"),
        "Musiala" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.BAYERN_MÜNCHEN, "Musiala"),
        "Neuer" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.BAYERN_MÜNCHEN, "Neuer"),
        "Goretzka" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.BAYERN_MÜNCHEN, "Goretzka"),
        "Gnabry" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.BAYERN_MÜNCHEN, "Gnabry"),
        "Coman" to Player(Nations.FRANCE, Leagues.BUNDESLIGA, Bundesliga.BAYERN_MÜNCHEN, "Coman"),
        "Guerreiro" to Player(Nations.PORTUGAL, Leagues.BUNDESLIGA, Bundesliga.BAYERN_MÜNCHEN, "Guerreiro"),

// ---------------- BORUSSIA DORTMUND (geprüft) ----------------
        "Schlotterbeck" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.BORUSSIA_DORTMUND, "Schlotterbeck"),
        "Adeyemi" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.BORUSSIA_DORTMUND, "Adeyemi"),
        "Nmecha" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.BORUSSIA_DORTMUND, "Nmecha"),
        "Brandt" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.BORUSSIA_DORTMUND, "Brandt"),
        "Emre_Can" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.BORUSSIA_DORTMUND, "Emre Can"),
        "Chukwuemeka" to Player(Nations.ENGLAND, Leagues.BUNDESLIGA, Bundesliga.BORUSSIA_DORTMUND, "Chukwuemeka"),
        "Beier" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.BORUSSIA_DORTMUND, "Beier"),
        "Anton" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.BORUSSIA_DORTMUND, "Anton"),

// ---------------- RB LEIPZIG (Stammspieler, nicht einzeln geprüft) ----------------
        "Lukeba" to Player(Nations.FRANCE, Leagues.BUNDESLIGA, Bundesliga.RB_LEIPZIG, "Lukeba"),
        "Raum" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.RB_LEIPZIG, "Raum"),
        "Ridle_Baku" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.RB_LEIPZIG, "Ridle Baku"),
        "Assan_Ouedraogo" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.RB_LEIPZIG, "Assan Ouedraogo"),

// ---------------- BAYER LEVERKUSEN (Stammspieler, nicht einzeln geprüft) ----------------
        "Grimaldo" to Player(Nations.SPAIN, Leagues.BUNDESLIGA, Bundesliga.BAYER_LEVERKUSEN, "Grimaldo"),
        "Palacios" to Player(Nations.ARGENTINA, Leagues.BUNDESLIGA, Bundesliga.BAYER_LEVERKUSEN, "Palacios"),
        "Aleix_Garcia" to Player(Nations.SPAIN, Leagues.BUNDESLIGA, Bundesliga.BAYER_LEVERKUSEN, "Aleix Garcia"),
        "Martin_Terrier" to Player(Nations.FRANCE, Leagues.BUNDESLIGA, Bundesliga.BAYER_LEVERKUSEN, "Martin Terrier"),
        "Jonas_Hofmann" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.BAYER_LEVERKUSEN, "Jonas Hofmann"),

// ---------------- EINTRACHT FRANKFURT (Stammspieler, nicht einzeln geprüft) ----------------
        "Jonathan_Burkardt" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.EINTRACHT_FRANKFURT, "Jonathan Burkardt"),
        "Can_Uzun" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.EINTRACHT_FRANKFURT, "Can Uzun"),
        "Nathaniel_Brown" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.EINTRACHT_FRANKFURT, "Nathaniel Brown"),
        "Robin_Koch" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.EINTRACHT_FRANKFURT, "Robin Koch"),
        "Ansgar_Knauff" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.EINTRACHT_FRANKFURT, "Ansgar Knauff"),

// ---------------- VFL WOLFSBURG (Stammspieler, nicht einzeln geprüft) ----------------
        "Maximilian_Arnold" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.VFL_WOLFSBURG, "Maximilian Arnold"),
        "Kilian_Fischer" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.VFL_WOLFSBURG, "Kilian Fischer"),
        "Yannick_Gerhardt" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.VFL_WOLFSBURG, "Yannick Gerhardt"),

// ---------------- BORUSSIA MÖNCHENGLADBACH (Stammspieler, nicht einzeln geprüft) ----------------
        "Robin_Hack" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.MÖNCHENGLADBACH, "Robin Hack"),
        "Florian_Neuhaus" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.MÖNCHENGLADBACH, "Florian Neuhaus"),
        "Julian_Weigl" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.MÖNCHENGLADBACH, "Julian Weigl"),
        "Tim_Kleindienst" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.MÖNCHENGLADBACH, "Tim Kleindienst"),
        "Rocco_Reitz" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.MÖNCHENGLADBACH, "Rocco Reitz"),

// ---------------- SC FREIBURG (Stammspieler, nicht einzeln geprüft) ----------------
        "Grifo" to Player(Nations.ITALIA, Leagues.BUNDESLIGA, Bundesliga.SC_FREIBURG, "Grifo"),
        "Ginter" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.SC_FREIBURG, "Ginter"),
        "Lucas_Holer" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.SC_FREIBURG, "Lucas Holer"),
        "Christian_Gunter" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.SC_FREIBURG, "Christian Gunter"),
        "Nicolas_Hofler" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.SC_FREIBURG, "Nicolas Hofler"),

// ---------------- FC UNION BERLIN (Stammspieler, nicht einzeln geprüft) ----------------
        "Rani_Khedira" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.FC_UNION_BERLIN, "Rani Khedira"),
        "Diogo_Leite" to Player(Nations.PORTUGAL, Leagues.BUNDESLIGA, Bundesliga.FC_UNION_BERLIN, "Diogo Leite"),
        "Doekhi" to Player(Nations.NETHERLANDS, Leagues.BUNDESLIGA, Bundesliga.FC_UNION_BERLIN, "Doekhi"),
        "Hollerbach" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.FC_UNION_BERLIN, "Hollerbach"),

// ---------------- FSV MAINZ 05 (Stammspieler, nicht einzeln geprüft) ----------------
        "Anthony_Caci" to Player(Nations.FRANCE, Leagues.BUNDESLIGA, Bundesliga.FSV_MAINZ, "Anthony Caci"),
        "Nadiem_Amiri" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.FSV_MAINZ, "Nadiem Amiri"),
        "Dominik_Kohr" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.FSV_MAINZ, "Dominik Kohr"),
        "Paul_Nebel" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.FSV_MAINZ, "Paul Nebel"),

// ---------------- TSG HOFFENHEIM (Stammspieler, nicht einzeln geprüft) ----------------
        "Finn_Ole_Becker" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.TSG_HOFFENHEIM, "Finn Ole Becker"),
        "Tom_Bischof" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.TSG_HOFFENHEIM, "Tom Bischof"),
        "Marius_Bulter" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.TSG_HOFFENHEIM, "Marius Bulter"),

// ---------------- WERDER BREMEN (Stammspieler, nicht einzeln geprüft) ----------------
        "Ducksch" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.WERDER_BREMEN, "Ducksch"),
        "Mitchell_Weiser" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.WERDER_BREMEN, "Mitchell Weiser"),
        "Njinmah" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.WERDER_BREMEN, "Njinmah"),
        "Anthony_Jung" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.WERDER_BREMEN, "Anthony Jung"),

// ---------------- FC AUGSBURG (Stammspieler, nicht einzeln geprüft) ----------------
        "Phillip_Tietz" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.FC_AUGSBURG, "Phillip Tietz"),
        "Claude_Maurice" to Player(Nations.FRANCE, Leagues.BUNDESLIGA, Bundesliga.FC_AUGSBURG, "Claude-Maurice"),

// ---------------- VFB STUTTGART (Stammspieler, nicht einzeln geprüft) ----------------
        "Undav" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.VFB_STUTTGART, "Undav"),
        "Fuhrich" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.VFB_STUTTGART, "Fuhrich"),
        "Leweling" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.VFB_STUTTGART, "Leweling"),
        "Angelo_Stiller" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.VFB_STUTTGART, "Angelo Stiller"),
        "Karazor" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.VFB_STUTTGART, "Karazor"),
        "Vagnoman" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.VFB_STUTTGART, "Vagnoman"),

// ---------------- 1. FC KÖLN (Stammspieler, nicht einzeln geprüft) ----------------
        "Linton_Maina" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.FC_KÖLN, "Linton Maina"),
        "Jan_Thielmann" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.FC_KÖLN, "Jan Thielmann"),
        "Said_El_Mala" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.FC_KÖLN, "Said El Mala"),
        "Timo_Hubers" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.FC_KÖLN, "Timo Hubers"),
        "Luca_Waldschmidt" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.FC_KÖLN, "Luca Waldschmidt"),

// ---------------- 1. FC HEIDENHEIM (Stammspieler, nicht einzeln geprüft) ----------------
        "Marvin_Pieringer" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.FC_HEIDENHEIM, "Marvin Pieringer"),
        "Jan_Niklas_Beste" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.FC_HEIDENHEIM, "Jan-Niklas Beste"),
        "Patrick_Mainka" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.FC_HEIDENHEIM, "Patrick Mainka"),
        "Adrian_Beck" to Player(Nations.GERMANY, Leagues.BUNDESLIGA, Bundesliga.FC_HEIDENHEIM, "Adrian Beck"),

        // ---------------- PARIS SAINT-GERMAIN ----------------
        "Dembele" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.PARIS_SAINT_GERMAIN, "Dembele"),
        "Vitinha" to Player(Nations.PORTUGAL, Leagues.LIGUE_1, Ligue_1.PARIS_SAINT_GERMAIN, "Vitinha"),
        "Nuno_Mendes" to Player(Nations.PORTUGAL, Leagues.LIGUE_1, Ligue_1.PARIS_SAINT_GERMAIN, "Nuno Mendes"),
        "Joao_Neves" to Player(Nations.PORTUGAL, Leagues.LIGUE_1, Ligue_1.PARIS_SAINT_GERMAIN, "Joao Neves"),
        "Fabian_Ruiz" to Player(Nations.SPAIN, Leagues.LIGUE_1, Ligue_1.PARIS_SAINT_GERMAIN, "Fabian Ruiz"),
        "Marquinhos" to Player(Nations.BRAZIL, Leagues.LIGUE_1, Ligue_1.PARIS_SAINT_GERMAIN, "Marquinhos"),
        "Barcola" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.PARIS_SAINT_GERMAIN, "Barcola"),
        "Zaire_Emery" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.PARIS_SAINT_GERMAIN, "Zaire-Emery"),
        "Doue" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.PARIS_SAINT_GERMAIN, "Doue"),
        "Lucas_Hernandez" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.PARIS_SAINT_GERMAIN, "Lucas Hernandez"),

// ---------------- OLYMPIQUE MARSEILLE ----------------
        "Mason_Greenwood" to Player(Nations.ENGLAND, Leagues.LIGUE_1, Ligue_1.OLYMPIQUE_MARSEILLE, "Mason Greenwood"),
        "Rulli" to Player(Nations.ARGENTINA, Leagues.LIGUE_1, Ligue_1.OLYMPIQUE_MARSEILLE, "Rulli"),
        "Balerdi" to Player(Nations.ARGENTINA, Leagues.LIGUE_1, Ligue_1.OLYMPIQUE_MARSEILLE, "Balerdi"),
        "Rongier" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.OLYMPIQUE_MARSEILLE, "Rongier"),
        "Quentin_Merlin" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.OLYMPIQUE_MARSEILLE, "Quentin Merlin"),
        "Facundo_Medina" to Player(Nations.ARGENTINA, Leagues.LIGUE_1, Ligue_1.OLYMPIQUE_MARSEILLE, "Facundo Medina"),
        "Angel_Gomes" to Player(Nations.ENGLAND, Leagues.LIGUE_1, Ligue_1.OLYMPIQUE_MARSEILLE, "Angel Gomes"),
        "Igor_Paixao" to Player(Nations.BRAZIL, Leagues.LIGUE_1, Ligue_1.OLYMPIQUE_MARSEILLE, "Igor Paixao"),

// ---------------- AS MONACO ----------------
        "Kehrer" to Player(Nations.GERMANY, Leagues.LIGUE_1, Ligue_1.AS_MONACO, "Kehrer"),
        "Vanderson" to Player(Nations.BRAZIL, Leagues.LIGUE_1, Ligue_1.AS_MONACO, "Vanderson"),
        "Eric_Dier" to Player(Nations.ENGLAND, Leagues.LIGUE_1, Ligue_1.AS_MONACO, "Eric Dier"),
        "Caio_Henrique" to Player(Nations.BRAZIL, Leagues.LIGUE_1, Ligue_1.AS_MONACO, "Caio Henrique"),
        "Akliouche" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.AS_MONACO, "Akliouche"),

// ---------------- LOSC LILLE ----------------
        "Benjamin_Andre" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.LOSC_LILLE, "Benjamin Andre"),
        "Alexsandro" to Player(Nations.BRAZIL, Leagues.LIGUE_1, Ligue_1.LOSC_LILLE, "Alexsandro"),
        "Bafode_Diakite" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.LOSC_LILLE, "Bafode Diakite"),

// ---------------- OLYMPIQUE LYON ----------------
        "Tolisso" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.OLYMPIQUE_LYON, "Tolisso"),
        "Lacazette" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.OLYMPIQUE_LYON, "Lacazette"),
        "Tagliafico" to Player(Nations.ARGENTINA, Leagues.LIGUE_1, Ligue_1.OLYMPIQUE_LYON, "Tagliafico"),
        "Abner" to Player(Nations.BRAZIL, Leagues.LIGUE_1, Ligue_1.OLYMPIQUE_LYON, "Abner"),

// ---------------- STADE RENNES ----------------
        "Ludovic_Blas" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.STADE_RENNES, "Ludovic Blas"),
        "Christopher_Wooh" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.STADE_RENNES, "Christopher Wooh"),
        "Lorenz_Assignon" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.STADE_RENNES, "Lorenz Assignon"),

// ---------------- RACING STRASSBURG ----------------
        "Emegha" to Player(Nations.NETHERLANDS, Leagues.LIGUE_1, Ligue_1.RACING_STRASSBURG, "Emegha"),
        "Guela_Doue" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.RACING_STRASSBURG, "Guela Doue"),
        "Habib_Diallo" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.RACING_STRASSBURG, "Habib Diallo"),
        "Sebastien_Guilbert" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.RACING_STRASSBURG, "Sebastien Guilbert"),

// ---------------- RC LENS ----------------
        "Facundo_Buonanotte" to Player(Nations.ARGENTINA, Leagues.LIGUE_1, Ligue_1.RC_LENS, "Facundo Buonanotte"),
        "Baidoo" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.RC_LENS, "Baidoo"),
        "Przemyslaw_Frankowski" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.RC_LENS, "Frankowski"),

// ---------------- FC TOULOUSE ----------------
        "Dallinga" to Player(Nations.NETHERLANDS, Leagues.LIGUE_1, Ligue_1.FC_TOULOUSE, "Dallinga"),
        "Spierings" to Player(Nations.NETHERLANDS, Leagues.LIGUE_1, Ligue_1.FC_TOULOUSE, "Spierings"),

// ---------------- OGC NIZZA ----------------
        "Clauss" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.OGC_NIZZA, "Clauss"),
        "Ndombele" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.OGC_NIZZA, "Ndombele"),
        "Morgan_Sanson" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.OGC_NIZZA, "Morgan Sanson"),
        "Melvin_Bard" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.OGC_NIZZA, "Melvin Bard"),
        "Sofiane_Diop" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.OGC_NIZZA, "Sofiane Diop"),

// ---------------- STADE BREST ----------------
        "Lees_Melou" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.STADE_BREST, "Lees-Melou"),
        "Mahdi_Camara" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.STADE_BREST, "Mahdi Camara"),
        "Bradley_Locko" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.STADE_BREST, "Bradley Locko"),
        "Del_Castillo" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.STADE_BREST, "Del Castillo"),
        "Le_Douaron" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.STADE_BREST, "Le Douaron"),

// ---------------- FC LORIENT (Kaderbreite unsicherer) ----------------
        "Darlin_Yongwa" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.FC_LORIENT, "Darlin Yongwa"),
        "Theo_Le_Bris" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.FC_LORIENT, "Theo Le Bris"),

// ---------------- PARIS FC (Kaderbreite unsicherer) ----------------
        "Marcus_Coco" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.PARIS_FC, "Marcus Coco"),
        "Ilan_Kebbal" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.PARIS_FC, "Ilan Kebbal"),

// ---------------- AJ AUXERRE (Kaderbreite unsicherer) ----------------
        "Lassine_Sinayoko" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.AJ_AUXERRE, "Lassine Sinayoko"),
        "Josuha_Guilavogui" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.AJ_AUXERRE, "Josuha Guilavogui"),

// ---------------- SCO ANGERS (Kaderbreite unsicherer) ----------------
        "Himad_Abdelli" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.SCO_ANGERS, "Himad Abdelli"),
        "Jimmy_Cabot" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.SCO_ANGERS, "Jimmy Cabot"),

// ---------------- LE HAVRE AC (Kaderbreite unsicherer) ----------------
        "Christopher_Operi" to Player(Nations.FRANCE, Leagues.LIGUE_1, Ligue_1.LE_HAVRE_AC, "Christopher Operi"),
    )
}