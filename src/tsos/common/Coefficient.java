package tsos.common;

public class Coefficient {
    public static final int bandNumber = 8;
    public static final int orderFilter = 51;
    // public static final double[][] coeffs = {
    // { 0.000021549886339826532016469839980743473,
    // 0.000061822132234743939257354261584964661,
    // 0.000145247803582541749629203353677553423,
    // 0.000295511104534996581899575218699283141,
    // 0.000545060573455452492160067112791921318,
    // 0.000933991961641607499645945100752442158,
    // 0.001509216829016751804104501388792414218,
    // 0.002322642866186613083007150848402488919,
    // 0.003428306384227769714606592899031056731,
    // 0.004878510725792093057073817163882267778,
    // 0.006719153074657784573131547034563482157,
    // 0.008984551754859244898643311216801521368,
    // 0.011692199823593076024597081641331897117,
    // 0.014837951618072596840502974657738377573,
    // 0.018392182164166839819507970332779223099,
    // 0.022297434749713553048255931798848905601,
    // 0.026467985654125284616933200254607072566,
    // 0.030791610694798868252952672719402471557,
    // 0.035133647313537935685801016916229855269,
    // 0.039343226647850275401463449043149012141,
    // 0.043261325643319463452041162554451148026,
    // 0.046730085270003926534165827888500643894,
    // 0.049602681929148982609145690503282821737,
    // 0.051752945705652461660939422927185660228,
    // 0.05308390486592256402031964057641744148,
    // 0.053534505647129582150967053166823461652,
    // 0.05308390486592256402031964057641744148,
    // 0.051752945705652461660939422927185660228,
    // 0.049602681929148982609145690503282821737,
    // 0.046730085270003926534165827888500643894,
    // 0.043261325643319463452041162554451148026,
    // 0.039343226647850275401463449043149012141,
    // 0.035133647313537935685801016916229855269,
    // 0.030791610694798868252952672719402471557,
    // 0.026467985654125284616933200254607072566,
    // 0.022297434749713553048255931798848905601,
    // 0.018392182164166839819507970332779223099,
    // 0.014837951618072596840502974657738377573,
    // 0.011692199823593076024597081641331897117,
    // 0.008984551754859244898643311216801521368,
    // 0.006719153074657784573131547034563482157,
    // 0.004878510725792093057073817163882267778,
    // 0.003428306384227769714606592899031056731,
    // 0.002322642866186613083007150848402488919,
    // 0.001509216829016751804104501388792414218,
    // 0.000933991961641607499645945100752442158,
    // 0.000545060573455452492160067112791921318,
    // 0.000295511104534996581899575218699283141,
    // 0.000145247803582541749629203353677553423,
    // 0.000061822132234743939257354261584964661,
    // 0.000021549886339826532016469839980743473 },
    // { 0.000018183425761456982748835373153717399,
    // 0.000053047202428988687351874009578978075,
    // 0.000126630691545652745294558982891430787,
    // 0.000261546575229731881849504215864499201,
    // 0.000489340996800440041804292068405857208,
    // 0.000849879410650676006197534739783350233,
    // 0.001390842746912066473993774273765211547,
    // 0.00216617897898596818706540290122575243,
    // 0.003233389600180822283370662972856734996,
    // 0.004649649927620830465457846258914287318,
    // 0.006466907642976293772718587860026673297,
    // 0.008726259822820868830572926810873468639,
    // 0.011452055042378473173614317204282997409,
    // 0.014646282391906944447823590849111496937,
    // 0.01828387318348019194291786959638557164,
    // 0.022309538007347046867367978961738117505,
    // 0.026636683227467039536406900879228487611,
    // 0.031148797961950022011867744708979444113,
    // 0.035703486232474331008024392986044404097,
    // 0.040139059987464170697890608607849571854,
    // 0.044283335253430769484772611122025409713,
    // 0.047964017998312923063419788149985834025,
    // 0.05101986059476466134343652925053902436,
    // 0.053311641789764899201919945426197955385,
    // 0.054731992112024445418239082528089056723,
    // 0.055213160552503956490788539213099284098,
    // 0.054731992112024445418239082528089056723,
    // 0.053311641789764899201919945426197955385,
    // 0.05101986059476466134343652925053902436,
    // 0.047964017998312923063419788149985834025,
    // 0.044283335253430769484772611122025409713,
    // 0.040139059987464170697890608607849571854,
    // 0.035703486232474331008024392986044404097,
    // 0.031148797961950022011867744708979444113,
    // 0.026636683227467039536406900879228487611,
    // 0.022309538007347046867367978961738117505,
    // 0.01828387318348019194291786959638557164,
    // 0.014646282391906944447823590849111496937,
    // 0.011452055042378473173614317204282997409,
    // 0.008726259822820868830572926810873468639,
    // 0.006466907642976293772718587860026673297,
    // 0.004649649927620830465457846258914287318,
    // 0.003233389600180822283370662972856734996,
    // 0.00216617897898596818706540290122575243,
    // 0.001390842746912066473993774273765211547,
    // 0.000849879410650676006197534739783350233,
    // 0.000489340996800440041804292068405857208,
    // 0.000261546575229731881849504215864499201,
    // 0.000126630691545652745294558982891430787,
    // 0.000053047202428988687351874009578978075,
    // 0.000018183425761456982748835373153717399 },
    // { 0.000000965391994091807649120448413249118,
    // 0.000007116836121061333911665732626650183,
    // 0.000026944582099743767650669792890205656,
    // 0.00007555259144550065914750641704600298,
    // 0.000177306654585001531544349862024034792,
    // 0.000368083505965899988529588249264179467,
    // 0.000696911131840892081323879381216102047,
    // 0.001226407697863065833845941376978316839,
    // 0.002031497686850468591818197339193829976,
    // 0.003196002443859327635244937937386566773,
    // 0.004806921449962068063066489287393778795,
    // 0.00694652468841016040163038880450585566,
    // 0.00968273125578647531064291342772776261,
    // 0.013058605326904976218216347660927567631,
    // 0.017082099322288834403194002220516267698,
    // 0.021717357675716437298563121771621808875,
    // 0.026878915753920380737884698874040623195,
    // 0.032429960482566473622956237932157819159,
    // 0.038185462843514941799760720186895923689,
    // 0.043920478806269092064695769295212812722,
    // 0.049383303832549518830319357221014797688,
    // 0.05431253711875273781917172755129286088,
    // 0.058456554844412422777821802810649387538,
    // 0.061593491924977532281371139788461732678,
    // 0.063549655585019196313290024136222200468,
    // 0.064214377730598237725700982991838827729,
    // 0.063549655585019196313290024136222200468,
    // 0.061593491924977532281371139788461732678,
    // 0.058456554844412422777821802810649387538,
    // 0.05431253711875273781917172755129286088,
    // 0.049383303832549518830319357221014797688,
    // 0.043920478806269092064695769295212812722,
    // 0.038185462843514941799760720186895923689,
    // 0.032429960482566473622956237932157819159,
    // 0.026878915753920380737884698874040623195,
    // 0.021717357675716437298563121771621808875,
    // 0.017082099322288834403194002220516267698,
    // 0.013058605326904976218216347660927567631,
    // 0.00968273125578647531064291342772776261,
    // 0.00694652468841016040163038880450585566,
    // 0.004806921449962068063066489287393778795,
    // 0.003196002443859327635244937937386566773,
    // 0.002031497686850468591818197339193829976,
    // 0.001226407697863065833845941376978316839,
    // 0.000696911131840892081323879381216102047,
    // 0.000368083505965899988529588249264179467,
    // 0.000177306654585001531544349862024034792,
    // 0.00007555259144550065914750641704600298,
    // 0.000026944582099743767650669792890205656,
    // 0.000007116836121061333911665732626650183,
    // 0.000000965391994091807649120448413249118 },
    // { -0.000029334997502112170850467262606109387,
    // -0.00008780423815886615140999943429633845,
    // -0.000211096090143562861154644116901124562,
    // -0.000431102419005719003555071600075621063,
    // -0.000782520597039418645476938074523332034,
    // -0.001292064480894139933547792864487746556,
    // -0.001965331341000458188067456788417075586,
    // -0.002771073051225937319830272542731108842,
    // -0.003625353012681440095094087538996063813,
    // -0.004379083966595473560723394967908461695,
    // -0.00481295265144322369915697024111977953,
    // -0.004643469686411545553628155147407596814,
    // -0.003542687109782742017893841790510123246,
    // -0.001172044661363134737327995615885356528,
    // 0.002771894438723238734967324603530869354,
    // 0.008504908639319517724142194481373735471,
    // 0.016103283386683736599920280241349246353,
    // 0.02546154469571998077426222550911916187,
    // 0.036268495547721449345779376471909927204,
    // 0.04800845341983167591237702254147734493,
    // 0.059991189151463064632707755663432180882,
    // 0.071409598052319819827538083245599409565,
    // 0.081419361314573945875849858566652983427,
    // 0.089230680951627117103441833023680374026,
    // 0.094199444921233596583753922004689229652,
    // 0.095904513521278891841070901591592701152,
    // 0.094199444921233596583753922004689229652,
    // 0.089230680951627117103441833023680374026,
    // 0.081419361314573945875849858566652983427,
    // 0.071409598052319819827538083245599409565,
    // 0.059991189151463064632707755663432180882,
    // 0.04800845341983167591237702254147734493,
    // 0.036268495547721449345779376471909927204,
    // 0.02546154469571998077426222550911916187,
    // 0.016103283386683736599920280241349246353,
    // 0.008504908639319517724142194481373735471,
    // 0.002771894438723238734967324603530869354,
    // -0.001172044661363134737327995615885356528,
    // -0.003542687109782742017893841790510123246,
    // -0.004643469686411545553628155147407596814,
    // -0.00481295265144322369915697024111977953,
    // -0.004379083966595473560723394967908461695,
    // -0.003625353012681440095094087538996063813,
    // -0.002771073051225937319830272542731108842,
    // -0.001965331341000458188067456788417075586,
    // -0.001292064480894139933547792864487746556,
    // -0.000782520597039418645476938074523332034,
    // -0.000431102419005719003555071600075621063,
    // -0.000211096090143562861154644116901124562,
    // -0.00008780423815886615140999943429633845,
    // -0.000029334997502112170850467262606109387 },
    // { 0.000008921577417274828290306466771486527,
    // 0.00003635387965523304308395821649035895,
    // 0.000107498937258725850776852617229906173,
    // 0.000249566885373181889494487162295399685,
    // 0.000478688662787280145606561010396262645,
    // 0.000769633604603974560282031447400186153,
    // 0.001016272861718711499612322057828350808,
    // 0.000994843945977167288391429522675935004,
    // 0.000350504833138599576711907923609601312,
    // -0.001369555995713657306836474880640253105,
    // -0.004619799470246668815498480853420915082,
    // -0.009697765991187805995066284481254115235,
    // -0.0165499877216093091436555084783321945,
    // -0.024595357234350079256302024077740497887,
    // -0.032634876102287165011706093764587421902,
    // -0.038912267898431149304450116233056178316,
    // -0.041360225584364411488547119688519160263,
    // -0.038015893174157912304256257129964069463,
    // -0.027529734275780797653210285602654039394,
    // -0.009643648269503930781088030244063702412,
    // 0.014503551648568322254839735307996306801,
    // 0.042360480639278497161370751200593076646,
    // 0.070288673151790451165688011769816512242,
    // 0.094189490734668299132259505768161034212,
    // 0.110303067243899391436379175956972176209,
    // 0.115990561721837526221179359708912670612,
    // 0.110303067243899391436379175956972176209,
    // 0.094189490734668299132259505768161034212,
    // 0.070288673151790451165688011769816512242,
    // 0.042360480639278497161370751200593076646,
    // 0.014503551648568322254839735307996306801,
    // -0.009643648269503930781088030244063702412,
    // -0.027529734275780797653210285602654039394,
    // -0.038015893174157912304256257129964069463,
    // -0.041360225584364411488547119688519160263,
    // -0.038912267898431149304450116233056178316,
    // -0.032634876102287165011706093764587421902,
    // -0.024595357234350079256302024077740497887,
    // -0.0165499877216093091436555084783321945,
    // -0.009697765991187805995066284481254115235,
    // -0.004619799470246668815498480853420915082,
    // -0.001369555995713657306836474880640253105,
    // 0.000350504833138599576711907923609601312,
    // 0.000994843945977167288391429522675935004,
    // 0.001016272861718711499612322057828350808,
    // 0.000769633604603974560282031447400186153,
    // 0.000478688662787280145606561010396262645,
    // 0.000249566885373181889494487162295399685,
    // 0.000107498937258725850776852617229906173,
    // 0.00003635387965523304308395821649035895,
    // 0.000008921577417274828290306466771486527 },
    // { 0.000003036851415264962212648726380681552,
    // -0.00001114938451246088425101651853132978,
    // -0.000066984769864302971201924785660253292,
    // -0.000171121995347577840907576929296851631,
    // -0.000265679119496581902376552974942569563,
    // -0.000227088711114890461247040054360013528,
    // 0.000032551398238131741915725447800156189,
    // 0.000397276737156441800066786207423774613,
    // 0.000495181663639279842810403398090102201,
    // -0.000019964630311106965629766585301752002,
    // -0.000872002901831822846250019676261899804,
    // -0.000708573637645311654037483251045159705,
    // 0.002490255040593040460061846630424042814,
    // 0.009791157417375080662669262210329179652,
    // 0.019168088097006749648265611085662385449,
    // 0.024583444879506036878646924037639109883,
    // 0.018007671058298764521499180091268499382,
    // -0.005564304995256436243977749001032861997,
    // -0.042606693708000742404351512959692627192,
    // -0.07915081624465776510835013368705403991,
    // -0.095389654145438929067069011580315418541,
    // -0.07582865759292553575754425310151418671,
    // -0.019686424289024746087095607549599662889,
    // 0.055258120100726983159322713845540420152,
    // 0.119110613298791412351107510403380729258,
    // 0.144140020342169272726806639184360392392,
    // 0.119110613298791412351107510403380729258,
    // 0.055258120100726983159322713845540420152,
    // -0.019686424289024746087095607549599662889,
    // -0.07582865759292553575754425310151418671,
    // -0.095389654145438929067069011580315418541,
    // -0.07915081624465776510835013368705403991,
    // -0.042606693708000742404351512959692627192,
    // -0.005564304995256436243977749001032861997,
    // 0.018007671058298764521499180091268499382,
    // 0.024583444879506036878646924037639109883,
    // 0.019168088097006749648265611085662385449,
    // 0.009791157417375080662669262210329179652,
    // 0.002490255040593040460061846630424042814,
    // -0.000708573637645311654037483251045159705,
    // -0.000872002901831822846250019676261899804,
    // -0.000019964630311106965629766585301752002,
    // 0.000495181663639279842810403398090102201,
    // 0.000397276737156441800066786207423774613,
    // 0.000032551398238131741915725447800156189,
    // -0.000227088711114890461247040054360013528,
    // -0.000265679119496581902376552974942569563,
    // -0.000171121995347577840907576929296851631,
    // -0.000066984769864302971201924785660253292,
    // -0.00001114938451246088425101651853132978,
    // 0.000003036851415264962212648726380681552 },
    // { 0.000002603230507724733814678506199635777,
    // -0.00000042650194834128597222094674522308,
    // -0.000002080043785885303485712555585096517,
    // 0.000103061603509532097723393195831675939,
    // 0.000224063441155210573687769914918987979,
    // -0.000155893377914750484638378713597717251,
    // -0.000870254924106819379749089282682916746,
    // -0.000549417515338020156535903115724295276,
    // 0.000532882641673013699237793083796077553,
    // -0.000034492675771865279304561474615908878,
    // -0.000378793527097685367270585299337426477,
    // 0.004552941470838876153459651163757371251,
    // 0.008358480928650942332058804140615393408,
    // -0.002481821428853746725612383627890267235,
    // -0.017872277392289363101562926772203354631,
    // -0.011237166087637393691034404241690936033,
    // 0.006573672349049058775960485689893175731,
    // -0.000220865911475664225506118643060915474,
    // -0.006705353949201115978939746753439976601,
    // 0.042365133542203912975221413717008545063,
    // 0.085283200773908121594679698773688869551,
    // -0.007824330476604144171681731734224740649,
    // -0.170670487773889684168793223761895205826,
    // -0.149434108536439874681533979128289502114,
    // 0.095523680989038767252807815566484350711,
    // 0.249834491168405337102598195997416041791,
    // 0.095523680989038767252807815566484350711,
    // -0.149434108536439874681533979128289502114,
    // -0.170670487773889684168793223761895205826,
    // -0.007824330476604144171681731734224740649,
    // 0.085283200773908121594679698773688869551,
    // 0.042365133542203912975221413717008545063,
    // -0.006705353949201115978939746753439976601,
    // -0.000220865911475664225506118643060915474,
    // 0.006573672349049058775960485689893175731,
    // -0.011237166087637393691034404241690936033,
    // -0.017872277392289363101562926772203354631,
    // -0.002481821428853746725612383627890267235,
    // 0.008358480928650942332058804140615393408,
    // 0.004552941470838876153459651163757371251,
    // -0.000378793527097685367270585299337426477,
    // -0.000034492675771865279304561474615908878,
    // 0.000532882641673013699237793083796077553,
    // -0.000549417515338020156535903115724295276,
    // -0.000870254924106819379749089282682916746,
    // -0.000155893377914750484638378713597717251,
    // 0.000224063441155210573687769914918987979,
    // 0.000103061603509532097723393195831675939,
    // -0.000002080043785885303485712555585096517,
    // -0.00000042650194834128597222094674522308,
    // 0.000002603230507724733814678506199635777 },
    // { -0.000004859890739309365460525495794552597,
    // 0.000005360432992173116373778828103180416,
    // 0.0000359036829835129576754711167030365,
    // -0.000025648957021512173965567191191716745,
    // -0.000148691633642158331854443709119095729,
    // 0.000081140918873026142291507434300967816,
    // 0.000458182923750717749009075951960312523,
    // -0.000201948766581839237637188699814316806,
    // -0.001170400267239567540511480103759822669,
    // 0.000424491834363398615193041507609450491,
    // 0.002613840365403078108003098734002378478,
    // -0.00078228196011041111011113935447269796,
    // -0.005272970742469624931547667046061178553,
    // 0.001292669078502794305363110538564797025,
    // 0.009842128129719974680145178069778921781,
    // -0.001943464675146624369775349983058276848,
    // -0.017369044970454893678235563925227324944,
    // 0.002684877343364349550070002692336856853,
    // 0.029722015241043495126227469427249161527,
    // -0.003431581868751614871476673940264845442,
    // -0.051338986844431201694849420391619787551,
    // 0.004076762781218608300282113532375660725,
    // 0.098237344430722656207777276904380414635,
    // -0.004515549495860038571592998124515361269,
    // -0.315604275093868291701681982885929755867,
    // 0.504670717329872009493385576206492260098,
    // -0.315604275093868291701681982885929755867,
    // -0.004515549495860038571592998124515361269,
    // 0.098237344430722656207777276904380414635,
    // 0.004076762781218608300282113532375660725,
    // -0.051338986844431201694849420391619787551,
    // -0.003431581868751614871476673940264845442,
    // 0.029722015241043495126227469427249161527,
    // 0.002684877343364349550070002692336856853,
    // -0.017369044970454893678235563925227324944,
    // -0.001943464675146624369775349983058276848,
    // 0.009842128129719974680145178069778921781,
    // 0.001292669078502794305363110538564797025,
    // -0.005272970742469624931547667046061178553,
    // -0.00078228196011041111011113935447269796,
    // 0.002613840365403078108003098734002378478,
    // 0.000424491834363398615193041507609450491,
    // -0.001170400267239567540511480103759822669,
    // -0.000201948766581839237637188699814316806,
    // 0.000458182923750717749009075951960312523,
    // 0.000081140918873026142291507434300967816,
    // -0.000148691633642158331854443709119095729,
    // -0.000025648957021512173965567191191716745,
    // 0.0000359036829835129576754711167030365,
    // 0.000005360432992173116373778828103180416,
    // -0.000004859890739309365460525495794552597 } };
    // public static final double[] coeffs = {
    // 0.000000965391994091807649120448413249118,
    // 0.000007116836121061333911665732626650183,
    // 0.000026944582099743767650669792890205656,
    // 0.00007555259144550065914750641704600298,
    // 0.000177306654585001531544349862024034792,
    // 0.000368083505965899988529588249264179467,
    // 0.000696911131840892081323879381216102047,
    // 0.001226407697863065833845941376978316839,
    // 0.002031497686850468591818197339193829976,
    // 0.003196002443859327635244937937386566773,
    // 0.004806921449962068063066489287393778795,
    // 0.00694652468841016040163038880450585566,
    // 0.00968273125578647531064291342772776261,
    // 0.013058605326904976218216347660927567631,
    // 0.017082099322288834403194002220516267698,
    // 0.021717357675716437298563121771621808875,
    // 0.026878915753920380737884698874040623195,
    // 0.032429960482566473622956237932157819159,
    // 0.038185462843514941799760720186895923689,
    // 0.043920478806269092064695769295212812722,
    // 0.049383303832549518830319357221014797688,
    // 0.05431253711875273781917172755129286088,
    // 0.058456554844412422777821802810649387538,
    // 0.061593491924977532281371139788461732678,
    // 0.063549655585019196313290024136222200468,
    // 0.064214377730598237725700982991838827729,
    // 0.063549655585019196313290024136222200468,
    // 0.061593491924977532281371139788461732678,
    // 0.058456554844412422777821802810649387538,
    // 0.05431253711875273781917172755129286088,
    // 0.049383303832549518830319357221014797688,
    // 0.043920478806269092064695769295212812722,
    // 0.038185462843514941799760720186895923689,
    // 0.032429960482566473622956237932157819159,
    // 0.026878915753920380737884698874040623195,
    // 0.021717357675716437298563121771621808875,
    // 0.017082099322288834403194002220516267698,
    // 0.013058605326904976218216347660927567631,
    // 0.00968273125578647531064291342772776261,
    // 0.00694652468841016040163038880450585566,
    // 0.004806921449962068063066489287393778795,
    // 0.003196002443859327635244937937386566773,
    // 0.002031497686850468591818197339193829976,
    // 0.001226407697863065833845941376978316839,
    // 0.000696911131840892081323879381216102047,
    // 0.000368083505965899988529588249264179467,
    // 0.000177306654585001531544349862024034792,
    // 0.00007555259144550065914750641704600298,
    // 0.000026944582099743767650669792890205656,
    // 0.000007116836121061333911665732626650183,
    // 0.000000965391994091807649120448413249118 };
    public static final double[] coeffs = { -0.000002958278059242758204253585796461579,
            -0.000005934785073624075109723421950214117, -0.000007149967140750604137030329437996201,
            0.000000801957793989794213279902884705663, 0.000032386068942455536036426760881923315,
            0.000112458348698732689191145950324823843, 0.000279405011462812292825919069372275771,
            0.000587596833651851994072268237090383991, 0.001108380373290011270542843035968871845,
            0.00192881493736499752024438070208134377, 0.003147507444027938024871948741179039644,
            0.004867211252191985804138596449774922803, 0.007184320619695627394007964028332935413,
            0.010175954416378332062498301979758252855, 0.013885894112441518957745678619630780304,
            0.018311115826174055587483024964967626147, 0.023390928007211233413675799397424270865,
            0.029000710320009108478256365515335346572, 0.034951902470917901866176435987654258497,
            0.040999227112607464218463348970544757321, 0.046855221919565218091641156661353306845,
            0.052211128608631633685188688787093269639, 0.056762201099877514220981566950285923667,
            0.060234717762819973974064424737662193365, 0.062411556272852150573093865659757284448,
            0.06315320450733416524080610088276444003, 0.062411556272852150573093865659757284448,
            0.060234717762819973974064424737662193365, 0.056762201099877514220981566950285923667,
            0.052211128608631633685188688787093269639, 0.046855221919565218091641156661353306845,
            0.040999227112607464218463348970544757321, 0.034951902470917901866176435987654258497,
            0.029000710320009108478256365515335346572, 0.023390928007211233413675799397424270865,
            0.018311115826174055587483024964967626147, 0.013885894112441518957745678619630780304,
            0.010175954416378332062498301979758252855, 0.007184320619695627394007964028332935413,
            0.004867211252191985804138596449774922803, 0.003147507444027938024871948741179039644,
            0.00192881493736499752024438070208134377, 0.001108380373290011270542843035968871845,
            0.000587596833651851994072268237090383991, 0.000279405011462812292825919069372275771,
            0.000112458348698732689191145950324823843, 0.000032386068942455536036426760881923315,
            0.000000801957793989794213279902884705663, -0.000007149967140750604137030329437996201,
            -0.000005934785073624075109723421950214117, -0.000002958278059242758204253585796461579

    };
}